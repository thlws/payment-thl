package org.thlws.payment.wechat.core;

import cn.hutool.http.HttpUtil;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import org.thlws.payment.wechat.api.WechatMiniApi;
import org.thlws.payment.wechat.entity.request.mini.Code2SessionRequest;
import org.thlws.payment.wechat.entity.request.mini.MiniSendDataRequest;
import org.thlws.payment.wechat.entity.response.mini.Code2SessionResponse;
import org.thlws.payment.wechat.entity.response.mini.MiniSendDataResponse;
import org.thlws.utils.ConnUtil;
import org.thlws.utils.ThlwsBeanUtil;


/**
 * 微信小程序相关
 *
 * @author Hanley Tang | hanley@thlws.com
 * @version 1.0
 */
public class WechatMiniCore implements WechatMiniApi {

	private static final Log log = LogFactory.get();

    /***
     * 发送小程序通知
     * @param accessToken the access token
     * @param data json格式数据，这里是JSON数据，是的{@link MiniSendDataRequest} JSON格式
     * @return send data ponse
     * @throws Exception the exception
     */
    public static MiniSendDataResponse sendMsgToUser(String accessToken, MiniSendDataRequest data)throws  Exception{

		MiniSendDataResponse response;

		try {
			StringBuilder sb = new StringBuilder();
			sb.append(miniSendDataSubscribe);
			sb.append("?access_token=");
			sb.append(accessToken);
			String result = ConnUtil.connRemoteWithJson(ThlwsBeanUtil.beanToJson(data), sb.toString());
			response = ThlwsBeanUtil.jsonToBean(result, MiniSendDataResponse.class);
			log.debug("send data result:{}",result);
		}catch (Exception e){
			log.error(e);
			throw e;
		}

		return response;
	}


	/**
	 * 小程序SessionKey，OpenId获取
	 *
	 * @param request the request
	 * @return the code 2 session response
	 */
	public static Code2SessionResponse code2Session(Code2SessionRequest request) {

		String sb = code2session + "appid=" + request.getAppId() + "&secret=" + request.getSecret() +
				"&js_code=" + request.getJsCode() + "&grant_type=authorization_code";
		String json = HttpUtil.get(sb);
		return ThlwsBeanUtil.jsonToBean(json, Code2SessionResponse.class);

	}



}
