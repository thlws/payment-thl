package org.thlws.payment.wechat.entity.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * https://pay.weixin.qq.com/wiki/doc/api/tools/mch_pay.php?chapter=14_2
 * @author HanleyTang 2020/1/1
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class TransferRequest {

    /** 商户账号appid	*/
    @XmlElement(name="mch_appid",required = true)
    private String mchAppId;

    /** 商户账号	*/
    @XmlElement(name="mchid",required = true)
    private String mchId;

    /** 设备号*/
    @XmlElement(name="device_info")
    private String deviceInfo;

    /**随机字符串*/
    @XmlElement(name="nonce_str",required = true)
    private String nonceStr;

    /**签名*/
    @XmlElement(name="sign",required = true)
    private String sign;

    /**商户订单号*/
    @XmlElement(name="partner_trade_no",required = true)
    private String partnerTradeNo;

    /**用户openid*/
    @XmlElement(name="openid",required = true)
    private String openId;

    /**校验用户姓名选项
     * NO_CHECK：不校验真实姓名 ,FORCE_CHECK：强校验真实姓名*/
    @XmlElement(name="check_name",required = true)
    private String checkName;

    /**收款用户姓名*/
    @XmlElement(name="re_user_name")
    private String reUserName;

    /**金额,单位为分*/
    @XmlElement(name="amount",required = true)
    private String amount;

    /**企业付款备注,String(100)*/
    @XmlElement(name="desc",required = true)
    private String desc;

    /**该IP同在商户平台设置的IP白名单中的IP没有关联，该IP可传用户端或者服务端的IP*/
    @XmlElement(name="spbill_create_ip",required = true)
    private String spbillCreateIp;
}
