package org.thlws.payment.wechat.entity.request;

import org.thlws.utils.JsonUtil;
import org.thlws.utils.ThlwsBeanUtil;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 关闭订单参数对象 <br>
 *
 * @see <a href="https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=9_3">关闭订单参数详情</a>
 */
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

    /**
     * Gets app id.
     *
     * @return the app id
     */
    public String getAppId() {
        return appId;
    }

    /**
     * Sets app id.
     *
     * @param appId the app id
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * Gets mch id.
     *
     * @return the mch id
     */
    public String getMchId() {
        return mchId;
    }

    /**
     * Sets mch id.
     *
     * @param mchId the mch id
     */
    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    /**
     * Gets sub mch id.
     *
     * @return the sub mch id
     */
    public String getSubMchId() {
        return subMchId;
    }

    /**
     * Sets sub mch id.
     *
     * @param subMchId the sub mch id
     */
    public void setSubMchId(String subMchId) {
        this.subMchId = subMchId;
    }

    /**
     * Gets out trade no.
     *
     * @return the out trade no
     */
    public String getOutTradeNo() {
        return outTradeNo;
    }

    /**
     * Sets out trade no.
     *
     * @param outTradeNo the out trade no
     */
    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    /**
     * Gets sign.
     *
     * @return the sign
     */
    public String getSign() {
        return sign;
    }

    /**
     * Sets sign.
     *
     * @param sign the sign
     */
    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * Gets sub app id.
     *
     * @return the sub app id
     */
    public String getSubAppId() {
        return subAppId;
    }

    /**
     * Sets sub app id.
     *
     * @param subAppId the sub app id
     */
    public void setSubAppId(String subAppId) {
        this.subAppId = subAppId;
    }

    @Override
    public String toString() {
        return JsonUtil.format(this);
    }

}
