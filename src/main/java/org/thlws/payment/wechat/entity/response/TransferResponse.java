package org.thlws.payment.wechat.entity.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.thlws.payment.wechat.entity.WechatResponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author HanleyTang 2020/1/1
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class TransferResponse extends WechatResponse {

    /** 商户账号appid	*/
    @XmlElement(name="mch_appid")
    private String mchAppId;

    /** 商户账号	*/
    @XmlElement(name="mchid")
    private String mchId;

    /** 设备号*/
    @XmlElement(name="device_info")
    private String deviceInfo;

    /**随机字符串*/
    @XmlElement(name="nonce_str")
    private String nonceStr;

    /**商户订单号*/
    @XmlElement(name="partner_trade_no")
    private String partnerTradeNo;

    /**微信付款单号*/
    @XmlElement(name="payment_no")
    private String paymentNo;

    /**付款成功时间*/
    @XmlElement(name="payment_time")
    private String paymentTime;
}
