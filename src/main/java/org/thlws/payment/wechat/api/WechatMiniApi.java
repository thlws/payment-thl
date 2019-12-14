package org.thlws.payment.wechat.api;

/**
 * 小程序API
 * @author HanleyTang 2019/12/14
 */
public interface WechatMiniApi {


    String cgiBinToken = "https://api.weixin.qq.com/cgi-bin/token";

    /***
     * 小程序 登录凭证校验 URL
     */
    String code2session = "https://api.weixin.qq.com/sns/jscode2session?";

    /**
     * 小程序订阅消息通知
     */
    String miniSendDataSubscribe = "https://api.weixin.qq.com/cgi-bin/message/subscribe/send";

}
