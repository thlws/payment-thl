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

/**
 * 关闭订单参数对象 <br>
 *
 * @author HanleyTang
 * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=9_3">关闭订单参数详情</a>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class CloseOrderRequest {

    /**公众账号ID*/
    @XmlElement(name="appid")
    private String appId;

    /**商户号*/
    @XmlElement(name="mch_id")
    private String mchId;

    /**子商户号*/
    @XmlElement(name="sub_mch_id")
    private String subMchId;

    /**商户订单号 32个字符内*/
    @XmlElement(name="out_trade_no")
    private String outTradeNo;

    /**随机字符串*/
    @XmlElement(name="nonce_str")
    private final String nonceStr = ThlwsBeanUtil.getRandomString(32);

    /**签名*/
    @XmlElement(name="sign")
    private String sign;

    /**子公众账号ID*/
    @XmlElement(name="sub_appid")
    private String subAppId;

    @Override
    public String toString() {
        return JsonUtil.format(this);
    }

}
