package org.thlws.payment.wechat.entity.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.thlws.utils.JsonUtil;
import org.thlws.utils.ThlwsBeanUtil;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/***
 * Created by HanleyTang on 2017/10/19.
 * 微信撤销订单参数对象
 * @author Hanley | hanley@thlws.com
 * @version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class WechatReverseRequest {

    /**公众账号ID*/
    @XmlElement(name="appid")
    private String appId;

    /**商户号*/
    @XmlElement(name="mch_id")
    private String mchId;

    /**微信订单号,transaction_id、out_trade_no二选一*/
    @XmlElement(name="transaction_id")
    private String transactionId;

    /**商户订单号 ,transaction_id、out_trade_no二选一*/
    @XmlElement(name="out_trade_no")
    private String outTradeNo;

    /**随机字符串 小于等于 32*/
    @XmlElement(name="nonce_str")
    private final String nonceStr = ThlwsBeanUtil.getRandomString(32);

    /**签名*/
    @XmlElement(name="sign")
    private String sign;

    /**子商户公众账号ID*/
    @XmlElement(name="sub_appid")
    private String subAppId;

    /**子商户号*/
    @XmlElement(name="sub_mch_id")
    private String subMchId;


    @Override
    public String toString() {
        return JsonUtil.format(this);
    }


}
