package org.thlws.payment.wechat.entity.response;

import org.thlws.payment.wechat.entity.WechatResponse;
import org.thlws.utils.JsonUtil;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by HanleyTang on 2018/11/4
 * 根据付款码查询 OpenId pojo 结果对象
 *
 * @author Hanley[hanley @thlws.com]
 * @version 1.0
 */
@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class OpenidQueryResponse extends WechatResponse {


    /**公众账号ID*/
    @XmlElement(name="appid")
    private String appId         ;

    /**商户号*/
    @XmlElement(name="mch_id")
    private String mchId        ;

    /**随机字符串-32个字符内*/
    @XmlElement(name="nonce_str")
    private String nonceStr     ;

    /**签名*/
    @XmlElement(name="sign")
    private String sign          ;

    @XmlElement(name="openid")
    private String openId        ;

    @Override
    public String toString() {
        return JsonUtil.format(this);
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }
}
