package org.thlws.payment;

import cn.hutool.core.lang.Assert;
import org.thlws.payment.wechat.api.WechatMiniApi;
import org.thlws.payment.wechat.core.WechatMiniCore;
import org.thlws.payment.wechat.core.WechatMpCore;
import org.thlws.payment.wechat.entity.request.mini.Code2SessionRequest;
import org.thlws.payment.wechat.entity.request.mini.MiniSendDataRequest;
import org.thlws.payment.wechat.entity.response.mini.Code2SessionResponse;
import org.thlws.payment.wechat.entity.response.mini.MiniSendDataResponse;
import org.thlws.payment.wechat.entity.response.mp.MpTokenResponse;

import java.util.Objects;


/**
 * 微信公众号入口Class
 * MP名称对应公众号官方网站,https://mp.weixin.qq.com
 *
 * @author Hanley Tang | hanley@thlws.com
 * @version 1.0
 *  2018 /11/16
 */
public class WechatMiniClient implements WechatMiniApi {

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
	 * 发送数据至于用户公微信所关注的微信公账号
	 * https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/subscribe-message/subscribeMessage.send.html
     * {@link WechatMiniCore#sendMsgToUser}
     * @param access_token the access token
     * @param request json格式数据,是 {@link MiniSendDataRequest} JSON
     * @return send data response
     * @throws Exception the exception
     */
    public static MiniSendDataResponse sendMsgToUser(String access_token, MiniSendDataRequest request)throws  Exception{

		Assert.notEmpty(access_token, "access_token can not be null");
		Objects.requireNonNull(request,"data can not be null");
		return WechatMiniCore.sendMsgToUser(access_token,request);

	}


	/***
	 * 小程序通过code换取openId
	 * {@link WechatMiniCore#code2Session}
	 * @param request the map token
	 * @return the oauth token response
	 * @throws Exception the exception
	 * @author HanleyTang
	 */
	public static Code2SessionResponse code2Session(Code2SessionRequest request) throws  Exception{
		Objects.requireNonNull(request, "request can not be null");
		return WechatMiniCore.code2Session(request);
	}

}
