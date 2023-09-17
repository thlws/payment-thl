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

/***
 * 微信撤销订单返回对象
 * @author Hanley | hanley@thlws.com
 * @version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class WechatReverseResponse extends WechatResponse {

    /**公众账号ID*/
    @XmlElement(name="appid")
    private String appId           ;

    /**商户号*/
    @XmlElement(name="mch_id")
    private String mchId          ;

    /**子商户公众账号ID*/
    @XmlElement(name="sub_appid")
    private String subAppId       ;

    /**子商户号*/
    @XmlElement(name="sub_mch_id")
    private String subMchId      ;

    /**随机字符串*/
    @XmlElement(name="nonce_str")
    private String nonceStr       ;

    /**签名*/
    @XmlElement(name="sign")
    private String sign            ;

    /**是否重调,是否需要继续调用撤销，Y-需要，N-不需要*/
    @XmlElement(name="recall")
    private String reCall;

}
