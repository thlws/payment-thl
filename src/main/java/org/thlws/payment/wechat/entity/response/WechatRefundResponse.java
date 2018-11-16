package org.thlws.payment.wechat.entity.response;

import org.thlws.payment.wechat.entity.WechatResponse;
import org.thlws.utils.JsonUtil;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/***
 * 微信退款返回对象
 * @author Hanley | hanley@thlws.com
 * @version 1.0
 */

@XmlRootElement(name="xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class WechatRefundResponse extends WechatResponse {


	/**公众账号ID*/
	@XmlElement(name="appid")
	private String appId                ;

	/**商户号*/
	@XmlElement(name="mch_id")
	private String mchId               ;

	/***/
	@XmlElement(name="device_info")
	private String deviceInfo          ;

	/**随机字符串*/
	@XmlElement(name="nonce_str")
	private String nonceStr            ;

	/**签名*/
	@XmlElement(name="sign")
	private String sign                 ;

	/**微信订单号*/
	@XmlElement(name="transaction_id")
	private String transactionId       ;

	/**商户订单号*/
	@XmlElement(name="out_trade_no")
	private String outTradeNo         ;

	/**商户退款单号*/
	@XmlElement(name="out_refund_no")
	private String outRefundNo        ;

	/**微信退款单号*/
	@XmlElement(name="refund_id")
	private String refundId            ;

	/**文档返回参数列表中无该参数，但DEMO示例存在,暂时保留 FIXME*/
	@XmlElement(name="refund_channel")
	private String refundChannel       ;

	/**申请退款金额*/
	@XmlElement(name="refund_fee")
	private String refundFee           ;

	/**退款金额*/
	@XmlElement(name="settlement_refund_fee")
	private String settlementFefundFee;

	/**订单金额*/
	@XmlElement(name="total_fee")
	private String totalFee            ;

	/**
	 * 应结订单金额<br>
	 * 应结订单金额=订单金额-免充值代金券金额，应结订单金额<=订单金额
	 * */
	@XmlElement(name="settlement_total_fee")
	private String settlementTotalFee ;

	/**订单金额货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY*/
	@XmlElement(name="fee_type")
	private String feeType             ;

	/**现金支付金额*/
	@XmlElement(name="cash_fee")
	private String cashFee             ;

	/**现金退款金额*/
	@XmlElement(name="cash_refund_fee")
	private String cashRefundFee      ;

	/**代金券退款总金额*/
	@XmlElement(name="coupon_refund_fee")
	private String couponFefundFee	;

	/**退款代金券使用数量*/
	@XmlElement(name="couponFefundCount")
	private String coupon_refund_count	;

	/**子商户公众账号ID*/
	@XmlElement(name="sub_appid")
	private String subAppId;

	/**子商户号*/
	@XmlElement(name="sub_mch_id")
	private String subMchId;

	/**代金券类型-0*/
	@XmlElement(name="coupon_type_0")
	private String couponType0;

	/**代金券类型-1*/
	@XmlElement(name="coupon_type_1")
	private String couponType1;

	/**代金券类型-2*/
	@XmlElement(name="coupon_type_2")
	private String couponType2;

	/**退款代金券ID-0*/
	@XmlElement(name="coupon_refund_id_0")
	private String couponRefundId0;

	/**退款代金券ID-1*/
	@XmlElement(name="coupon_refund_id_1")
	private String couponRefundId1;

	/**退款代金券ID-2*/
	@XmlElement(name="coupon_refund_id_2")
	private String couponRefundId2;

	/**单个代金券退款金额-0*/
	@XmlElement(name="coupon_refund_fee_0")
	private String couponRefundFee0;

	/**单个代金券退款金额-1*/
	@XmlElement(name="coupon_refund_fee_1")
	private String couponRefundFee1;

	/**单个代金券退款金额-2*/
	@XmlElement(name="coupon_refund_fee_2")
	private String couponRefundFee2;

	/**
	 * Instantiates a new Wechat refund response.
	 */
	public WechatRefundResponse(){}

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

	public String getDeviceInfo() {
		return deviceInfo;
	}

	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
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

	public String getOutRefundNo() {
		return outRefundNo;
	}

	public void setOutRefundNo(String outRefundNo) {
		this.outRefundNo = outRefundNo;
	}

	public String getRefundId() {
		return refundId;
	}

	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}

	public String getRefundChannel() {
		return refundChannel;
	}

	public void setRefundChannel(String refundChannel) {
		this.refundChannel = refundChannel;
	}

	public String getRefundFee() {
		return refundFee;
	}

	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}

	public String getSettlementFefundFee() {
		return settlementFefundFee;
	}

	public void setSettlementFefundFee(String settlementFefundFee) {
		this.settlementFefundFee = settlementFefundFee;
	}

	public String getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

	public String getSettlementTotalFee() {
		return settlementTotalFee;
	}

	public void setSettlementTotalFee(String settlementTotalFee) {
		this.settlementTotalFee = settlementTotalFee;
	}

	public String getFeeType() {
		return feeType;
	}

	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	public String getCashFee() {
		return cashFee;
	}

	public void setCashFee(String cashFee) {
		this.cashFee = cashFee;
	}

	public String getCashRefundFee() {
		return cashRefundFee;
	}

	public void setCashRefundFee(String cashRefundFee) {
		this.cashRefundFee = cashRefundFee;
	}

	public String getCouponFefundFee() {
		return couponFefundFee;
	}

	public void setCouponFefundFee(String couponFefundFee) {
		this.couponFefundFee = couponFefundFee;
	}

	public String getCoupon_refund_count() {
		return coupon_refund_count;
	}

	public void setCoupon_refund_count(String coupon_refund_count) {
		this.coupon_refund_count = coupon_refund_count;
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

	public String getCouponType0() {
		return couponType0;
	}

	public void setCouponType0(String couponType0) {
		this.couponType0 = couponType0;
	}

	public String getCouponType1() {
		return couponType1;
	}

	public void setCouponType1(String couponType1) {
		this.couponType1 = couponType1;
	}

	public String getCouponType2() {
		return couponType2;
	}

	public void setCouponType2(String couponType2) {
		this.couponType2 = couponType2;
	}

	public String getCouponRefundId0() {
		return couponRefundId0;
	}

	public void setCouponRefundId0(String couponRefundId0) {
		this.couponRefundId0 = couponRefundId0;
	}

	public String getCouponRefundId1() {
		return couponRefundId1;
	}

	public void setCouponRefundId1(String couponRefundId1) {
		this.couponRefundId1 = couponRefundId1;
	}

	public String getCouponRefundId2() {
		return couponRefundId2;
	}

	public void setCouponRefundId2(String couponRefundId2) {
		this.couponRefundId2 = couponRefundId2;
	}

	public String getCouponRefundFee0() {
		return couponRefundFee0;
	}

	public void setCouponRefundFee0(String couponRefundFee0) {
		this.couponRefundFee0 = couponRefundFee0;
	}

	public String getCouponRefundFee1() {
		return couponRefundFee1;
	}

	public void setCouponRefundFee1(String couponRefundFee1) {
		this.couponRefundFee1 = couponRefundFee1;
	}

	public String getCouponRefundFee2() {
		return couponRefundFee2;
	}

	public void setCouponRefundFee2(String couponRefundFee2) {
		this.couponRefundFee2 = couponRefundFee2;
	}

	@Override
	public String toString() {
		return JsonUtil.format(this);
	}
}
