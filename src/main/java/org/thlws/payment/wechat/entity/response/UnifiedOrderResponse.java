package org.thlws.payment.wechat.entity.response;

import org.thlws.payment.wechat.entity.WechatResponse;
import org.thlws.utils.JsonUtil;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/***
 * 微信统一下单结果对象
 * @author Hanley | hanley@thlws.com
 * @version 1.0
 */
@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class UnifiedOrderResponse  extends WechatResponse {

	/**公众账号ID*/
	@XmlElement(name="appid")
	private String appId           ;

	/**商户号*/
	@XmlElement(name="mch_id")
	private String mchId          ;

	/**随机字符串*/
	@XmlElement(name="nonce_str")
	private String nonceStr       ;

	/**签名*/
	@XmlElement(name="sign")
	private String sign            ;

	/**预支付交易会话标识*/
	@XmlElement(name="prepay_id")
	private String prepayId       ;

	/**交易类型 JSAPI，NATIVE，APP*/
	@XmlElement(name="trade_type")
	private String tradeType      ;

	/**设备号	*/
	@XmlElement(name="device_info")
	private String deviceInfo;

	/**二维码链接,trade_type为NATIVE是有返回，可将该参数值生成二维码展示出来进行扫码支付*/
	@XmlElement(name="code_url")
    private String codeUrl;

	/**子商户公众账号ID*/
	@XmlElement(name="sub_appid")
	private String subAppId;

	/**子商户号	*/
	@XmlElement(name="sub_mch_id")
	private String subMchId ;

	/**h5支付时调用支付地址*/
	@XmlElement(name="mweb_url")
	private String mwebUrl ;

	@Override
	public String toString() {
		return JsonUtil.format(this);
	}

    /**
     * Instantiates a new Unified order response.
     */
    public UnifiedOrderResponse() {
	}


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
     * Gets nonce str.
     *
     * @return the nonce str
     */
    public String getNonceStr() {
		return nonceStr;
	}

    /**
     * Sets nonce str.
     *
     * @param nonceStr the nonce str
     */
    public void setNonceStr(String nonceStr) {
		this.nonceStr = nonceStr;
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
     * Gets prepay id.
     *
     * @return the prepay id
     */
    public String getPrepayId() {
		return prepayId;
	}

    /**
     * Sets prepay id.
     *
     * @param prepayId the prepay id
     */
    public void setPrepayId(String prepayId) {
		this.prepayId = prepayId;
	}

    /**
     * Gets trade type.
     *
     * @return the trade type
     */
    public String getTradeType() {
		return tradeType;
	}

    /**
     * Sets trade type.
     *
     * @param tradeType the trade type
     */
    public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

    /**
     * Gets device info.
     *
     * @return the device info
     */
    public String getDeviceInfo() {
		return deviceInfo;
	}

    /**
     * Sets device info.
     *
     * @param deviceInfo the device info
     */
    public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

    /**
     * Gets code url.
     *
     * @return the code url
     */
    public String getCodeUrl() {
		return codeUrl;
	}

    /**
     * Sets code url.
     *
     * @param codeUrl the code url
     */
    public void setCodeUrl(String codeUrl) {
		this.codeUrl = codeUrl;
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

	public String getMwebUrl() {
		return mwebUrl;
	}

	public void setMwebUrl(String mwebUrl) {
		this.mwebUrl = mwebUrl;
	}
}
