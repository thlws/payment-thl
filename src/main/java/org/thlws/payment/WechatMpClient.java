package org.thlws.payment;

import cn.hutool.core.lang.Assert;
import cn.hutool.core.util.StrUtil;
import org.thlws.payment.wechat.core.WechatMpCore;
import org.thlws.payment.wechat.entity.extra.AuthorizeType;
import org.thlws.payment.wechat.entity.request.mp.*;
import org.thlws.payment.wechat.entity.response.mp.*;
import org.thlws.utils.ThlwsBeanUtil;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.Objects;


/**
 * 微信公众号入口Class
 * MP名称对应公众号官方网站,https://mp.weixin.qq.com
 *
 * @author Hanley Tang | hanley@thlws.com
 * @version 1.0
 *  2018 /11/16
 */
public class WechatMpClient  {


    /***
	 * 通过code换取网页授权access_token
     * {@link WechatMpCore#obtainOauthAccessToken}
     * @param mapToken the map token
     * @return the oauth token response
     * @throws Exception the exception
     * @author HanleyTang
     */
    public static MpOauthTokenResponse obtainOauthAccessToken(Map<String, Object> mapToken) throws  Exception{

		Objects.requireNonNull(mapToken, "mapToken can not be null");
		return WechatMpCore.obtainOauthAccessToken(mapToken);

	}


	/**
	 * 通过code换取网页授权access_token
	 * {@link WechatMpCore#obtainOauthAccessToken}
	 * @param request the request
	 * @return the mp oauth token response
	 * @throws Exception the exception
	 */
	public static MpOauthTokenResponse obtainOauthAccessToken(MpObtainOauthTokenRequest request) throws  Exception{

		Objects.requireNonNull(request, "request can not be null");
		return WechatMpCore.obtainOauthAccessToken(ThlwsBeanUtil.objectToMap(request));

	}

    /**
	 * 刷新access_token（如果需要）
     * {@link WechatMpCore#refreshOauthAccessToken}
     *
     * @param mapToken the map token
     * @return the oauth token response
     * @throws Exception the exception
     * @author HanleyTang
     */
    public static MpOauthTokenResponse refreshOauthAccessToken(Map<String, Object> mapToken)throws  Exception{

		Objects.requireNonNull(mapToken, "mapToken can not be null");

		return WechatMpCore.refreshOauthAccessToken(mapToken);

	}


	/**
	 * 刷新access_token（如果需要）
	 * {@link WechatMpCore#refreshOauthAccessToken}
	 * @param request the request
	 * @return the mp oauth token response
	 * @throws Exception the exception
	 */
	public static MpOauthTokenResponse refreshOauthAccessToken(MpRefreshOauthTokenRequest request)throws  Exception{

		Objects.requireNonNull(request, "request can not be null");
		return WechatMpCore.refreshOauthAccessToken(ThlwsBeanUtil.objectToMap(request));
	}


    /***
	 * 微信公众号 URL链接生成，
     * {@link WechatMpCore#generateWechatUrl}
     * @param appId the app id
     * @param scope the scope
     * @param callback the callback
     * @param bizData the biz data
     * @return string string
     * @throws Exception the exception
     */
    public static  String generateWechatUrl(String appId, AuthorizeType scope, String callback, String bizData) throws Exception {


		if (StrUtil.isEmpty(appId)
		|| StrUtil.isEmpty(scope.value)
		|| StrUtil.isEmpty(callback)
		|| StrUtil.isEmpty(bizData)){
			throw new Exception("appId,scope,callback,bizData both can not be null");
		}

		return WechatMpCore.generateWechatUrl(appId,scope.value,callback,bizData);
	}


    /***
	 * 获取微信用户个人信息
     * {@link WechatMpCore#obtainUserInfo}
     * @param userInfoMap the user info map
     * @return user info response
     * @throws Exception the exception
     */
    public static MpUserInfoResponse obtainUserInfo(Map<String, Object> userInfoMap)throws  Exception{
		 
		Objects.requireNonNull(userInfoMap, "mapToken can not be null");
		return WechatMpCore.obtainUserInfo(userInfoMap);
		
	}


	/**
	 * 获取微信用户个人信息
	 * {@link WechatMpCore#obtainUserInfo}
	 * @param request the request
	 * @return the mp user info response
	 * @throws Exception the exception
	 */
	public static MpUserInfoResponse obtainUserInfo(MpUserInfoRequest request)throws  Exception{

		Objects.requireNonNull(request, "request can not be null");
		return WechatMpCore.obtainUserInfo(ThlwsBeanUtil.objectToMap(request));

	}


    /***
	 * 检验授权凭证（access_token）是否有效
     * {@link WechatMpCore#isvalidOauthAccessToken}
     * @param mapToken the map token
     * @return boolean boolean
     * @throws Exception the exception
     * @author HanleyTang
     */
    public static boolean isvalidOauthAccessToken(Map<String, Object> mapToken)throws  Exception{

		Objects.requireNonNull(mapToken, "mapToken can not be null");
		return WechatMpCore.isvalidOauthAccessToken(mapToken);

	}


	/**
	 * 检验授权凭证（access_token）是否有效
	 * {@link WechatMpCore#isvalidOauthAccessToken}
	 * @param request the request
	 * @return the boolean
	 * @throws Exception the exception
	 */
	public static boolean isvalidOauthAccessToken(MpValidOauthTokenRequest request)throws  Exception{

		Objects.requireNonNull(request, "request can not be null");
		return WechatMpCore.isvalidOauthAccessToken(ThlwsBeanUtil.objectToMap(request));

	}


    /***
	 * access_token是公众号的全局唯一接口调用凭据，公众号调用各接口时都需使用access_token。
	 * 开发者需要进行妥善保存。access_token的存储至少要保留512个字符空间。
	 * access_token的有效期目前为2个小时，需定时刷新，重复获取将导致上次获取的access_token失效。
     * {@link WechatMpCore#obtainAccessToken}
     * @param appid the appid
     * @param secret the secret
     * @return token response
     * @throws Exception the exception
     */
    public static MpTokenResponse obtainAccessToken(String appid, String secret)throws  Exception{

		Assert.notEmpty(appid, "appid can not be null");
		Assert.notEmpty(secret, "secret can not be null");

		return WechatMpCore.obtainAccessToken(appid,secret);

	}


    /***
	 * 获取jsapi_ticket
     * {@link WechatMpCore#obtainJsApiTicket}
     * @param token 普通token
     * @return js api ticket response
     * @throws Exception the exception
     */
    public static MpJsApiTicketResponse obtainJsApiTicket(String token)throws  Exception{


		Assert.notEmpty(token, "token can not be null");

		return WechatMpCore.obtainJsApiTicket(token);

	}


    /***
	 * 功能同上，但不建议使用,token需要中控服务器维护,建立存储于Redis
     * {@link WechatMpCore#obtainJsApiTicket}
     * @param appid the appid
     * @param secret the secret
     * @return js api ticket response
     * @throws Exception the exception
     */
    public static MpJsApiTicketResponse obtainJsApiTicket(String appid, String secret)throws  Exception{


		Assert.notEmpty(appid, "appid can not be null");
		Assert.notEmpty(secret, "secret can not be null");

		return WechatMpCore.obtainJsApiTicket(appid,secret);

	}


    /***
	 * 获取微信消息模板ID
     * {@link WechatMpCore#obtainTemplateId}
     * @param access_token the access token
     * @param template_id_short the template id short
     * @return template response
     * @throws Exception the exception
     */
    public static MpTemplateResponse obtainTemplateId(String access_token, String template_id_short)throws  Exception{

		Assert.notEmpty(access_token, "access_token can not be null");
		Assert.notEmpty(template_id_short, "template_id_short can not be null");
		return WechatMpCore.obtainTemplateId(access_token,template_id_short);
	}


    /***
	 * 设置行业属性
     * {@link WechatMpCore#setupIndustry}
     * @param accessToken the access token
     * @param industryId1 the industry id 1
     * @param industryId2 the industry id 2
     * @return industry response
     * @throws Exception the exception
     */
    public static MpSetIndustryResponse setupIndustry(String accessToken, String industryId1, String industryId2)throws  Exception{

		Assert.notEmpty(accessToken, "accessToken can not be null");
		Assert.notEmpty(industryId1, "industryId1 can not be null");
		Assert.notEmpty(industryId2, "industryId2 can not be null");

		return WechatMpCore.setupIndustry(accessToken,industryId1,industryId2);

	}

	/***
	 * 获取行业属性
	 * {@link WechatMpCore#getIndustry}
	 * @param accessToken the access token
	 * @return industry
	 * @throws Exception the exception
	 */
	public static MpGetIndustryResponse getIndustry(String accessToken)throws  Exception{

		Assert.notEmpty(accessToken, "accessToken can not be null");
		return WechatMpCore.getIndustry(accessToken);
	}

    /***
	 * 发送数据至于用户公微信所关注的微信公账号
     * {@link WechatMpCore#sendMsgToUser}
     * @param accessToken the access token
     * @param request 数据格式 {@link org.thlws.payment.wechat.entity.request.mp.MpSendDataRequest} JSON
     * @return send data response
     * @throws Exception the exception
     */
    public static MpSendDataResponse sendMsgToUser(String accessToken, MpSendDataRequest request)throws  Exception{

		Assert.notEmpty(accessToken, "accessToken can not be null");
		Objects.requireNonNull(request,"data can not be null");

		return WechatMpCore.sendMsgToUser(accessToken,request);

	}


	/**
	 *
	 * 验证请求是否来自微信
	 * {@link WechatMpCore#isFromWechat}
	 *
	 * @param request the request
	 * @return the boolean
	 */
	public static boolean isFromWechat(HttpServletRequest request) {
		return WechatMpCore.isFromWechat(request);
	}

}
