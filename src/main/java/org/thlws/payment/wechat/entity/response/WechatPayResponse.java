package org.thlws.payment.wechat.entity.response;

import org.thlws.payment.wechat.entity.WechatResponse;
import org.thlws.utils.JsonUtil;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 微信刷卡支付返回对象
 *
 * @author Hanley | hanley@thlws.com
 * @version 1.0
 */
@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class WechatPayResponse extends WechatResponse {

	/**公众账号ID	*/
	@XmlElement(name="appid")
	private String appId      ;

	/**商户号	*/
	@XmlElement(name="mch_id")
	private String mchId     ;

	/**随机字符串	*/
	@XmlElement(name="nonce_str")
	private String nonceStr  ;

	/**签名*/
	@XmlElement(name="sign")
	private String sign       ;

	/**交易类型,MICROPAY(即扫码支付)*/
	@XmlElement(name="trade_type")
	private String tradeType ;

	/**用户标识*/
	@XmlElement(name="openid")
	private String openId;

	/**是否关注公众账号*/
	@XmlElement(name="is_subscribe")
	private String isSubscribe;

	/**付款银行*/
	@XmlElement(name="bank_type")
	private String bankType;

	/**符合ISO 4217标准的三位字母代码，默认人民币：CNY*/
	@XmlElement(name="fee_type")
	private String feeType;

	/**订单总金额*/
	@XmlElement(name="total_fee")
	private String totalFee;

	/**现金支付币种*/
	@XmlElement(name="cash_fee_type")
	private String cashFeeType;

	/**现金支付金额*/
	@XmlElement(name="cash_fee")
	private String cashFee;

	/**微信支付订单号*/
	@XmlElement(name="transaction_id")
	private String transactionId;

	/**商户订单号*/
	@XmlElement(name="out_trade_no")
	private String  outTradeNo;

	/**商家数据包*/
	@XmlElement(name="attach")
	private String attach;

	/**支付完成时间*/
	@XmlElement(name="time_end")
	private String timeEnd;

	/**设备号	*/
	@XmlElement(name="device_info")
	private String deviceInfo;



	/** 代金券金额,“代金券”金额小于等于订单金额，订单金额 减 “代金券”金额等于现金支付金额*/
	@XmlElement(name="coupon_fee")
	private String couponFee;

	/**子商户公众账号ID*/
	@XmlElement(name="sub_appid")
	private String subAppId		;

	/**子商户号*/
	@XmlElement(name="sub_mch_id")
	private String subMchId		;

	/**用户子标识*/
	@XmlElement(name="sub_openid")
	private String subOpenId		;

	/**是否关注子公众账号*/
	@XmlElement(name="sub_is_subscribe")
	private String subIsSubscribe	;

	/**
	 * 应结订单金额
	 * 当订单使用了免充值型优惠券后返回该参数，应结订单金额等于订单金额 减 免充值优惠券金额
	 * */
	@XmlElement(name="settlement_total_fee")
	private String settlementTotalFee;


    /**
     * Instantiates a new Wechat pay response.
     */
    public WechatPayResponse() {
	}



	@Override
	public String toString() {
		return JsonUtil.format(this);
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
     * Gets open id.
     *
     * @return the open id
     */
    public String getOpenId() {
		return openId;
	}

    /**
     * Sets open id.
     *
     * @param openId the open id
     */
    public void setOpenId(String openId) {
		this.openId = openId;
	}

    /**
     * Gets is subscribe.
     *
     * @return the is subscribe
     */
    public String getIsSubscribe() {
		return isSubscribe;
	}

    /**
     * Sets is subscribe.
     *
     * @param isSubscribe the is subscribe
     */
    public void setIsSubscribe(String isSubscribe) {
		this.isSubscribe = isSubscribe;
	}

    /**
     * Gets bank type.
     *
     * @return the bank type
     */
    public String getBankType() {
		return bankType;
	}

    /**
     * Sets bank type.
     *
     * @param bankType the bank type
     */
    public void setBankType(String bankType) {
		this.bankType = bankType;
	}

    /**
     * Gets fee type.
     *
     * @return the fee type
     */
    public String getFeeType() {
		return feeType;
	}

    /**
     * Sets fee type.
     *
     * @param feeType the fee type
     */
    public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

    /**
     * Gets total fee.
     *
     * @return the total fee
     */
    public String getTotalFee() {
		return totalFee;
	}

    /**
     * Sets total fee.
     *
     * @param totalFee the total fee
     */
    public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

    /**
     * Gets cash fee type.
     *
     * @return the cash fee type
     */
    public String getCashFeeType() {
		return cashFeeType;
	}

    /**
     * Sets cash fee type.
     *
     * @param cashFeeType the cash fee type
     */
    public void setCashFeeType(String cashFeeType) {
		this.cashFeeType = cashFeeType;
	}

    /**
     * Gets cash fee.
     *
     * @return the cash fee
     */
    public String getCashFee() {
		return cashFee;
	}

    /**
     * Sets cash fee.
     *
     * @param cashFee the cash fee
     */
    public void setCashFee(String cashFee) {
		this.cashFee = cashFee;
	}

    /**
     * Gets transaction id.
     *
     * @return the transaction id
     */
    public String getTransactionId() {
		return transactionId;
	}

    /**
     * Sets transaction id.
     *
     * @param transactionId the transaction id
     */
    public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
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
     * Gets attach.
     *
     * @return the attach
     */
    public String getAttach() {
		return attach;
	}

    /**
     * Sets attach.
     *
     * @param attach the attach
     */
    public void setAttach(String attach) {
		this.attach = attach;
	}

    /**
     * Gets time end.
     *
     * @return the time end
     */
    public String getTimeEnd() {
		return timeEnd;
	}

    /**
     * Sets time end.
     *
     * @param timeEnd the time end
     */
    public void setTimeEnd(String timeEnd) {
		this.timeEnd = timeEnd;
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
     * Gets coupon fee.
     *
     * @return the coupon fee
     */
    public String getCouponFee() {
		return couponFee;
	}

    /**
     * Sets coupon fee.
     *
     * @param couponFee the coupon fee
     */
    public void setCouponFee(String couponFee) {
		this.couponFee = couponFee;
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

    /**
     * Gets sub open id.
     *
     * @return the sub open id
     */
    public String getSubOpenId() {
		return subOpenId;
	}

    /**
     * Sets sub open id.
     *
     * @param subOpenId the sub open id
     */
    public void setSubOpenId(String subOpenId) {
		this.subOpenId = subOpenId;
	}

    /**
     * Gets sub is subscribe.
     *
     * @return the sub is subscribe
     */
    public String getSubIsSubscribe() {
		return subIsSubscribe;
	}

    /**
     * Sets sub is subscribe.
     *
     * @param subIsSubscribe the sub is subscribe
     */
    public void setSubIsSubscribe(String subIsSubscribe) {
		this.subIsSubscribe = subIsSubscribe;
	}

    /**
     * Gets settlement total fee.
     *
     * @return the settlement total fee
     */
    public String getSettlementTotalFee() {
		return settlementTotalFee;
	}

    /**
     * Sets settlement total fee.
     *
     * @param settlementTotalFee the settlement total fee
     */
    public void setSettlementTotalFee(String settlementTotalFee) {
		this.settlementTotalFee = settlementTotalFee;
	}
}
