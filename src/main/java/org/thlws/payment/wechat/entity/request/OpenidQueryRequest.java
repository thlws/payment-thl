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
 * Created by HanleyTang on 2018/11/4
 * 根据付款码查询 OpenId pojo
 *
 * @author Hanley[hanley @thlws.com]
 * @version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class OpenidQueryRequest {

    /**公众账号ID*/
    @XmlElement(name="appid")
    private String appId;

    /**商户号*/
    @XmlElement(name="mch_id")
    private String mchId;

    /**随机字符串-32个字符内*/
    @XmlElement(name="nonce_str")
    private final String nonceStr = ThlwsBeanUtil.getRandomString(32);

    /**
     * 条码或者二维码信息
     */
    @XmlElement(name="auth_code")
    private String authCode;

    @XmlElement(name="sub_mch_id")
    private String subMchId;

    @Override
    public String toString() {
        return JsonUtil.format(this);
    }

}


