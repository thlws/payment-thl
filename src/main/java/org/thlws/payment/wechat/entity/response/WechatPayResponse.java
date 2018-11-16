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



	/**代金券金额,“代金券”金额<=订单金额，订单金额-“代金券”金额=现金支付金额*/
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
	 * 当订单使用了免充值型优惠券后返回该参数，应结订单金额=订单金额-免充值优惠券金额
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

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getIsSubscribe() {
		return isSubscribe;
	}

	public void setIsSubscribe(String isSubscribe) {
		this.isSubscribe = isSubscribe;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	public String getFeeType() {
		return feeType;
	}

	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	public String getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

	public String getCashFeeType() {
		return cashFeeType;
	}

	public void setCashFeeType(String cashFeeType) {
		this.cashFeeType = cashFeeType;
	}

	public String getCashFee() {
		return cashFee;
	}

	public void setCashFee(String cashFee) {
		this.cashFee = cashFee;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getAttach() {
		return attach;
	}

	public void setAttach(String attach) {
		this.attach = attach;
	}

	public String getTimeEnd() {
		return timeEnd;
	}

	public void setTimeEnd(String timeEnd) {
		this.timeEnd = timeEnd;
	}

	public String getDeviceInfo() {
		return deviceInfo;
	}

	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public String getCouponFee() {
		return couponFee;
	}

	public void setCouponFee(String couponFee) {
		this.couponFee = couponFee;
	}

	public String getSubAppId() {
		return subAppId;
	}

	public void setSubAppId(String subAppId) {
		this.subAppId = subAppId;
	}

	public String getSubMchId() {
		return subMchId;
	}

	public void setSubMchId(String subMchId) {
		this.subMchId = subMchId;
	}

	public String getSubOpenId() {
		return subOpenId;
	}

	public void setSubOpenId(String subOpenId) {
		this.subOpenId = subOpenId;
	}

	public String getSubIsSubscribe() {
		return subIsSubscribe;
	}

	public void setSubIsSubscribe(String subIsSubscribe) {
		this.subIsSubscribe = subIsSubscribe;
	}

	public String getSettlementTotalFee() {
		return settlementTotalFee;
	}

	public void setSettlementTotalFee(String settlementTotalFee) {
		this.settlementTotalFee = settlementTotalFee;
	}
}
