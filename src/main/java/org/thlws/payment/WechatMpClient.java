package org.thlws.payment;

import cn.hutool.core.util.StrUtil;
import org.thlws.payment.wechat.api.WechatMpApi;
import org.thlws.payment.wechat.core.WechatMpCore;
import org.thlws.payment.wechat.entity.response.mp.*;

import java.util.Map;


/**
 * 微信公众号入口Class
 * MP名称对应公众号官方网站,https://mp.weixin.qq.com
 *
 * @author Hanley Tang | hanley@thlws.com
 * @version 1.0
 *  2018 /11/16
 */
public class WechatMpClient implements WechatMpApi {


    /***
     * {@link WechatMpCore#obtainOauthAccessToken}
     * @param mapToken the map token
     * @return the oauth token response
     * @throws Exception the exception
     * @author HanleyTang
     */
    public static OauthTokenResponse obtainOauthAccessToken(Map<String, Object> mapToken) throws  Exception{
		
		if (null == mapToken){
			throw new Exception("mapToken can not be null");
		}

		return WechatMpCore.obtainOauthAccessToken(mapToken);

	}

    /**
     * {@link WechatMpCore#refreshOauthAccessToken}
     *
     * @param mapToken the map token
     * @return the oauth token response
     * @throws Exception the exception
     * @author HanleyTang
     */
    public static OauthTokenResponse refreshOauthAccessToken(Map<String, Object> mapToken)throws  Exception{

		if (null == mapToken){
			throw new Exception("mapToken can not be null");
		}

		return WechatMpCore.refreshOauthAccessToken(mapToken);
		
	}


    /***
     * {@link WechatMpCore#generateWechatUrl}
     * @param appId the app id
     * @param scope the scope
     * @param callback the callback
     * @param bizData the biz data
     * @return string string
     * @throws Exception the exception
     */
    public static  String generateWechatUrl(String appId, String scope, String callback, String bizData) throws Exception {


		if (StrUtil.isEmpty(appId)
		|| StrUtil.isEmpty(scope)
		|| StrUtil.isEmpty(callback)
		|| StrUtil.isEmpty(bizData)){
			throw new Exception("appId,scope,callback,bizData both can not be null");
		}

		return WechatMpCore.generateWechatUrl(appId,scope,callback,bizData);
	}


    /***
     * {@link WechatMpCore#obtainUserInfo}
     * @param userInfoMap the user info map
     * @return user info response
     * @throws Exception the exception
     */
    public static UserInfoResponse obtainUserInfo(Map<String, Object> userInfoMap)throws  Exception{
		 
		if (null == userInfoMap){
			throw new Exception("mapToken can not be null");
		}

		return WechatMpCore.obtainUserInfo(userInfoMap);
		
	}


    /***
     * {@link WechatMpCore#isvalidOauthAccessToken}
     * @param mapToken the map token
     * @return boolean boolean
     * @throws Exception the exception
     * @author HanleyTang
     */
    public static boolean isvalidOauthAccessToken(Map<String, Object> mapToken)throws  Exception{

		if (null == mapToken){
			throw new Exception("mapToken can not be null");
		}

		return WechatMpCore.isvalidOauthAccessToken(mapToken);

	}


    /***
     * {@link WechatMpCore#obtainAccessToken}
     * @param appid the appid
     * @param secret the secret
     * @return token response
     * @throws Exception the exception
     */
    public static TokenResponse obtainAccessToken(String appid, String secret)throws  Exception{

		if (StrUtil.isEmpty(appid) || StrUtil.isEmpty(secret)){
			throw new Exception("appid,secret can not be null");
		}

		return WechatMpCore.obtainAccessToken(appid,secret);

	}


    /***
     * {@link WechatMpCore#obtainJsApiTicket}
     * @param token 普通token
     * @return js api ticket response
     * @throws Exception the exception
     */
    public static JsApiTicketResponse obtainJsApiTicket(String token)throws  Exception{


		if (StrUtil.isEmpty(token)){
			throw new Exception("token can not be null");
		}

		return WechatMpCore.obtainJsApiTicket(token);

	}


    /***
     * {@link WechatMpCore#obtainJsApiTicket}
     * @param appid the appid
     * @param secret the secret
     * @return js api ticket response
     * @throws Exception the exception
     */
    public static JsApiTicketResponse obtainJsApiTicket(String appid, String secret)throws  Exception{


		if (StrUtil.isEmpty(appid) || StrUtil.isEmpty(secret)){
			throw new Exception("appid,secret can not be null");
		}

		return WechatMpCore.obtainJsApiTicket(appid,secret);

	}


    /***
     * {@link WechatMpCore#obtainTemplateId}
     * @param access_token the access token
     * @param template_id_short the template id short
     * @return template response
     * @throws Exception the exception
     */
    public static TemplateResponse obtainTemplateId(String access_token, String template_id_short)throws  Exception{

		if (StrUtil.isEmpty(access_token) || StrUtil.isEmpty(template_id_short)){
			throw new Exception("access_token,template_id_short can not be null");
		}

		return WechatMpCore.obtainTemplateId(access_token,template_id_short);
	}


    /***
     * {@link WechatMpCore#setupIndustry}
     * @param access_token the access token
     * @param industry_id1 the industry id 1
     * @param industry_id2 the industry id 2
     * @return industry response
     * @throws Exception the exception
     */
    public static IndustryResponse setupIndustry(String access_token, String industry_id1, String industry_id2)throws  Exception{


		if (StrUtil.isEmpty(access_token)
				|| StrUtil.isEmpty(industry_id1)
				|| StrUtil.isEmpty(industry_id2)){
			throw new Exception("access_token,industry_id1,industry_id2 can not be null");
		}

		return WechatMpCore.setupIndustry(access_token,industry_id1,industry_id2);

	}

    /***
     * {@link WechatMpCore#sendMsgToUser}
     * @param access_token the access token
     * @param data json格式数据
     * @return send data response
     * @throws Exception the exception
     */
    public static SendDataResponse sendMsgToUser(String access_token, String data)throws  Exception{

		if (StrUtil.isEmpty(access_token)
				|| StrUtil.isEmpty(data)){
			throw new Exception("access_token,data can not be null");
		}

		return WechatMpCore.sendMsgToUser(access_token,data);

	}

}
