package org.thlws.payment.wechat.core;

import cn.hutool.core.util.URLUtil;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.thlws.payment.wechat.api.WechatMpApi;
import org.thlws.payment.wechat.entity.request.mp.MpSendDataRequest;
import org.thlws.payment.wechat.entity.response.mp.*;
import org.thlws.utils.ConnUtil;
import org.thlws.utils.ThlwsBeanUtil;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * 微信公众号相关 Token、OpenId 获取等
 * MP名称对应公众号官方网站,https://mp.weixin.qq.com
 *
 * @author Hanley Tang | hanley@thlws.com
 * @version 1.0
 */
public class WechatMpCore implements WechatMpApi {

	private static final Log log = LogFactory.get();

	private static Pattern pattern = Pattern.compile("MicroMessenger/(\\d+).+");

    /***
     * 通过code换取网页授权access_token
     * access_token是调用授权关系接口的调用凭证，有效期为2个小时,频率限制:1万/分钟
     *
     * @param mapToken the map token
     * @return the oauth token response
     * @throws Exception the exception
     * @author HanleyTang
     */
    public static MpOauthTokenResponse obtainOauthAccessToken(Map<String, Object> mapToken) throws  Exception{

		MpOauthTokenResponse resp;
		String params = ThlwsBeanUtil.mapToParams(mapToken);
		StringBuilder sb = new StringBuilder(oauth2_access_token);
		sb.append("?").append(params);
		System.out.print(sb.toString());
		try {
			resp = ThlwsBeanUtil.jsonToBean(ConnUtil.connURL(sb.toString()), MpOauthTokenResponse.class);
		} catch (Exception e) {
			log.error(e);
			throw e;
		}
		return resp;
		
	}

    /**
     * 刷新access_token（如果需要）
     * 当access_token超时后，可以使用refresh_token进行刷新，access_token刷新结果有两种
     * 1. 若access_token已超时，那么进行refresh_token会获取一个新的access_token，新的超时时间；
     * 2. 若access_token未超时，那么进行refresh_token不会改变access_token，但超时时间会刷新，相当于续期access_token。
     * refresh_token拥有较长的有效期（30天），当refresh_token失效的后，需要用户重新授权。
     * 频率限制:5万/分钟
     *
     * @param mapToken the map token
     * @return the oauth token response
     * @throws Exception the exception
     * @author HanleyTang
     */
    public static MpOauthTokenResponse refreshOauthAccessToken(Map<String, Object> mapToken)throws  Exception{

		MpOauthTokenResponse resp;
		String params = ThlwsBeanUtil.mapToParams(mapToken);
		StringBuilder sb = new StringBuilder(oauth2_refresh_token);
		sb.append("?").append(params);
		try {
			resp = ThlwsBeanUtil.jsonToBean( ConnUtil.connURL(sb.toString()), MpOauthTokenResponse.class);
		} catch (Exception e) {
			log.error(e);
			throw e;
		}
		return resp;
		
	}


    /***
     * wechat URL链接生成，
     * scope取值为:snsapi_base[无需用户授权] 或 userinfo[需用户授权]
     * state 为自定义参数,非必须
     * redirect_uri 微信处理完成后，会直接转向至该地址
     * @param appId the app id
     * @param scope the scope
     * @param callback the callback
     * @param bizData the biz data
     * @return string string
     */
    public static  String generateWechatUrl(String appId, String scope, String callback, String bizData){

		StringBuilder sb = new StringBuilder();
		sb.append("https://open.weixin.qq.com/connect/oauth2/authorize?");
		sb.append("appid=").append(appId);
		sb.append("&redirect_uri=").append(URLUtil.encode(callback)).append("&response_type=code&");
		sb.append("scope=").append(scope);
		sb.append("&state=").append(bizData).append("#wechat_redirect");

		return  sb.toString();
	}


    /***
     * 获取微信用户个人信息
     * 所需参数：access_token、openid、lang[非必须]
     * lang 国家地区语言版本，zh_CN 简体，zh_TW 繁体，en 英语，默认为zh-CN
     * 频率限制:5万/分钟
     * @param userInfoMap the user info map
     * @return user info response
     * @throws Exception the exception
     */
    public static MpUserInfoResponse obtainUserInfo(Map<String, Object> userInfoMap)throws  Exception{

		MpUserInfoResponse resp;
		String params = ThlwsBeanUtil.mapToParams(userInfoMap);
		StringBuilder sb = new StringBuilder(sns_userinfo);
		sb.append("?").append(params);
		try {
			String json = ConnUtil.connURL(sb.toString());
			resp = ThlwsBeanUtil.jsonToBean(json, MpUserInfoResponse.class);
		} catch (Exception e) {
			log.error(e);
			throw e;
		}
		return resp;
	}


    /***
     * 检验授权凭证（access_token）是否有效
     * @param mapToken the map token
     * @return boolean boolean
     * @throws Exception the exception
     * @author HanleyTang
     */
    public static boolean isvalidOauthAccessToken(Map<String, Object> mapToken)throws  Exception{

		boolean flag = false;
		String params = ThlwsBeanUtil.mapToParams(mapToken);
		StringBuilder sb = new StringBuilder(sns_auth_token);
		sb.append("?").append(params);
		try {
			String result = ConnUtil.connURL(sb.toString());
			JsonObject jsonObject = new JsonParser().parse(result).getAsJsonObject();
			long wCode = jsonObject.get("errcode").getAsLong();
			if (wCode == 0){
				flag = true;
			}
		} catch (Exception e) {
			log.error(e);
			throw e;
		}
		return flag;
		
	}


    /***
     * access_token是公众号的全局唯一接口调用凭据，公众号调用各接口时都需使用access_token。
     * 开发者需要进行妥善保存。access_token的存储至少要保留512个字符空间。
     * access_token的有效期目前为2个小时，需定时刷新，重复获取将导致上次获取的access_token失效。
     *
     * 关于网页授权access_token和普通access_token的区别
     * 1、微信网页授权是通过OAuth2.0机制实现的，在用户授权给公众号后，公众号可以获取到一个
     * 网页授权特有的接口调用凭证（网页授权access_token），通过网页授权access_token可以进行授权后接口调用，如获取用户基本信息；
     * 2、其他微信接口，需要通过基础支持中的“获取access_token”接口来获取到的普通access_token调用。
     * @param appid the appid
     * @param secret the secret
     * @return token response
     * @throws Exception the exception
     */
    public static MpTokenResponse obtainAccessToken(String appid, String secret)throws  Exception{

		MpTokenResponse resp;
		try {
			StringBuilder sb = new StringBuilder();
			sb.append(cgibin_token).append("?");
			sb.append("grant_type=client_credential").append("&").append("appid=").append(appid).append("&").append("secret=").append(secret);
			String json = ConnUtil.connURL(sb.toString());
			resp = ThlwsBeanUtil.jsonToBean(json, MpTokenResponse.class);
		} catch (Exception e) {
			log.error(e);
			throw e;
		}

		return resp;
	}


    /***
     * 获取jsapi_ticket，jsapi_ticket是公众号用于调用微信JS接口的临时票据。正常情况下，jsapi_ticket
     * 的有效期为7200秒，通过access_token来获取。由于获取jsapi_ticket的api调用次数非常有限， 频繁刷新
     * jsapi_ticket会导致api调用受限，影响自身业务，开发者必须在自己的服务全局缓存jsapi_ticket 。
     * @param token 普通token
     * @return js api ticket response
     * @throws Exception the exception
     */
    public static MpJsApiTicketResponse obtainJsApiTicket(String token)throws  Exception{
		MpJsApiTicketResponse resp;
		try {

		/* String eg = "https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=giPthFJplKI1fux6WxFqelRdqAa317wlC4zWRsnUUHVse20nm2dYpL5w0h-HJGFiAoZ8Mk3aCr0f7rLRGRn2ifZjzyrg_cHKCbvrozdEeCGO617WESe8f1g1UCX2BzSfCWOjAJAWQI&type=jsapi"; */
			StringBuffer sb = new StringBuffer();
			sb.append(cgi_bin_ticket_getticket).append("?");
			sb.append("access_token=").append(token).append("&type=jsapi");
			String json = ConnUtil.connURL(sb.toString());
			resp = ThlwsBeanUtil.jsonToBean(json, MpJsApiTicketResponse.class);
		} catch (Exception e) {
			log.error(e);
			throw e;
		}
		return resp;
	}


    /***
     * 功能同上，但不建议使用,token需要中控服务器维护
     * @param appid the appid
     * @param secret the secret
     * @return js api ticket response
     * @throws Exception the exception
     */
    public static MpJsApiTicketResponse obtainJsApiTicket(String appid, String secret)throws  Exception{

		MpTokenResponse tokenResp = obtainAccessToken(appid,secret);
		String token = tokenResp.getAccess_token();
		MpJsApiTicketResponse resp = obtainJsApiTicket(token);
		return resp;
	}


    /***
     * 获取微信消息模板ID{根据微信template_id_short得到,实际动作是调用API往 ‘我的模板’ 中添加了模板}
     * @param accessToken the access token
     * @param templateIdShort the template id short
     * @return template response
     * @throws Exception the exception
     */
    public static MpTemplateResponse obtainTemplateId(String accessToken, String templateIdShort)throws  Exception{

		MpTemplateResponse response;

		try{
			StringBuilder sb = new StringBuilder();
			sb.append(cgibin_add_template);
			sb.append("?access_token=");
			sb.append(accessToken);

			HashMap<String,String> mapData = new HashMap<String,String>();
			mapData.put("template_id_short", templateIdShort);

			String result = ConnUtil.connRemoteWithJson(ThlwsBeanUtil.beanToJson(mapData),sb.toString());
			response = ThlwsBeanUtil.jsonToBean(result, MpTemplateResponse.class);

		}catch (Exception e){
			log.error(e);
			throw e;
		}

		return response;
	}


    /***
     * 设置行业属性
     * @param accessToken the access token
     * @param industryId1 the industry id 1
     * @param industryId2 the industry id 2
     * @return industry response
     * @throws Exception the exception
     */
    public static MpSetIndustryResponse setupIndustry(String accessToken, String industryId1, String industryId2)throws  Exception{

		MpSetIndustryResponse response;

		try {
			StringBuffer sb = new StringBuffer();
			sb.append(cgibin_set_industry);
			sb.append("?access_token=");
			sb.append(accessToken);

			HashMap<String,String> mapData = new HashMap<String,String>();
			mapData.put("industry_id1", industryId1);
			mapData.put("industry_id2", industryId2);
			String result = ConnUtil.connRemoteWithJson(ThlwsBeanUtil.beanToJson(mapData),sb.toString());
			log.debug("setupIndustry result={}",result);
			response = ThlwsBeanUtil.jsonToBean(result, MpSetIndustryResponse.class);
		}catch (Exception e){
			log.error(e);
			throw e;
		}

		return response;
	}


	/**
	 * 获取行业属性.
	 *
	 * @param accessToken the access token
	 * @return the industry
	 * @throws Exception the exception
	 */
	public static MpGetIndustryResponse getIndustry(String accessToken)throws  Exception{

		MpGetIndustryResponse response;

		try {
			StringBuffer sb = new StringBuffer();
			sb.append(cgibin_get_industry);
			sb.append("?access_token=");
			sb.append(accessToken);
			String result = ConnUtil.connURL(sb.toString());

			log.debug("getupIndustry result={}",result);
			response = ThlwsBeanUtil.jsonToBean(result, MpGetIndustryResponse.class);
		}catch (Exception e){
			log.error(e);
			throw e;
		}

		return response;
	}



    /***
     * 发送数据至于用户公微信所关注的微信公账号
     * @param accessToken the access token
     * @param data 数据，{@link org.thlws.payment.wechat.entity.request.mp.MpSendDataRequest} JSON格式
     * @return send data response
     * @throws Exception the exception
     */
    public static MpSendDataResponse sendMsgToUser(String accessToken, MpSendDataRequest data)throws  Exception{

		MpSendDataResponse response;

		try {
			StringBuffer sb = new StringBuffer();
			sb.append(cgibin_send_data);
			sb.append("?access_token=");
			sb.append(accessToken);
			String result = ConnUtil.connRemoteWithJson(ThlwsBeanUtil.beanToJson(data), sb.toString());
			response = ThlwsBeanUtil.jsonToBean(result, MpSendDataResponse.class);
			log.debug("send data result:{}",result);
		}catch (Exception e){
			log.error(e);
			throw e;
		}

		return response;
	}



	/***
	 * 发送数据至于用户公微信所关注的微信公账号
	 * @param accessToken the access token
	 * @param data json格式数据，这里是JSON数据，是的{@link org.thlws.payment.wechat.entity.request.mp.MpSendDataRequest} JSON格式
	 * @return send data response
	 * @throws Exception the exception
	 */
	public static MpSendDataResponse sendMsgToUser(String accessToken, String data)throws  Exception{

		MpSendDataResponse response;

		try {
			String sb = cgibin_send_data +
					"?access_token=" +
					accessToken;
			String result = ConnUtil.connRemoteWithJson(data, sb);
			response = ThlwsBeanUtil.jsonToBean(result, MpSendDataResponse.class);
			log.debug("send data result:{}",result);
		}catch (Exception e){
			log.error(e);
			throw e;
		}

		return response;
	}



	/**
	 * 验证请求是否来自微信
	 *
	 * @param request the request
	 * @return the boolean
	 */
	public static boolean isFromWechat(HttpServletRequest request) {

		String userAgent = request.getHeader("User-Agent");
		if (StringUtils.isNotBlank(userAgent)) {
			Matcher m = pattern.matcher(userAgent);
			if (m.find()) {
				String version = m.group(1);
				if (null != version && NumberUtils.toInt(version) >= 5) {
					return true;
				}
			}
		}
		return false;
	}





}
