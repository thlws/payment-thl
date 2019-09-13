package org.thlws.payment;

import org.thlws.payment.wechat.api.WechatMpApi;
import org.thlws.payment.wechat.core.WechatMpCore;
import org.thlws.payment.wechat.entity.request.mini.Code2SessionRequest;
import org.thlws.payment.wechat.entity.response.mini.Code2SessionResponse;

import java.util.Objects;


/**
 * 微信小程序入口Class
 * https://developers.weixin.qq.com/miniprogram
 *
 * @author Hanley Tang | hanley@thlws.com
 * @version 1.0
 *  2019 /09/13
 */
public class WechatMiniClient implements WechatMpApi {


    /***
	 * 通过code换取网页授权access_token
     * {@link WechatMpCore#obtainOauthAccessToken}
     * @param request the map token
     * @return the oauth token response
     * @throws Exception the exception
     * @author HanleyTang
     */
    public static Code2SessionResponse code2Session(Code2SessionRequest request) throws  Exception{
		
		if (Objects.isNull(request)){
			throw new Exception("request can not be null");
		}

		//GET https://api.weixin.qq.com/sns/jscode2session?appid=APPID&secret=SECRET&js_code=JSCODE&grant_type=authorization_code

		StringBuilder sb = new StringBuilder(code2session);
		sb.append("appid=").append(request.getAppId()).append("&secret=").append(request.getSecret())
				.append("&js_code=").append(request.getJsCode()).append("&grant_type=authorization_code");

		return WechatMpCore.code2Session(sb.toString());

	}


}
