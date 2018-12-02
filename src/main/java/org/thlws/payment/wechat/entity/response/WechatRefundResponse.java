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
	 * <pre>
	 * 应结订单金额等于订单金额 减 免充值代金券金额，应结订单金额小于等于订单金额
	 * </pre>
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
     * Gets out refund no.
     *
     * @return the out refund no
     */
    public String getOutRefundNo() {
		return outRefundNo;
	}

    /**
     * Sets out refund no.
     *
     * @param outRefundNo the out refund no
     */
    public void setOutRefundNo(String outRefundNo) {
		this.outRefundNo = outRefundNo;
	}

    /**
     * Gets refund id.
     *
     * @return the refund id
     */
    public String getRefundId() {
		return refundId;
	}

    /**
     * Sets refund id.
     *
     * @param refundId the refund id
     */
    public void setRefundId(String refundId) {
		this.refundId = refundId;
	}

    /**
     * Gets refund channel.
     *
     * @return the refund channel
     */
    public String getRefundChannel() {
		return refundChannel;
	}

    /**
     * Sets refund channel.
     *
     * @param refundChannel the refund channel
     */
    public void setRefundChannel(String refundChannel) {
		this.refundChannel = refundChannel;
	}

    /**
     * Gets refund fee.
     *
     * @return the refund fee
     */
    public String getRefundFee() {
		return refundFee;
	}

    /**
     * Sets refund fee.
     *
     * @param refundFee the refund fee
     */
    public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}

    /**
     * Gets settlement fefund fee.
     *
     * @return the settlement fefund fee
     */
    public String getSettlementFefundFee() {
		return settlementFefundFee;
	}

    /**
     * Sets settlement fefund fee.
     *
     * @param settlementFefundFee the settlement fefund fee
     */
    public void setSettlementFefundFee(String settlementFefundFee) {
		this.settlementFefundFee = settlementFefundFee;
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
     * Gets cash refund fee.
     *
     * @return the cash refund fee
     */
    public String getCashRefundFee() {
		return cashRefundFee;
	}

    /**
     * Sets cash refund fee.
     *
     * @param cashRefundFee the cash refund fee
     */
    public void setCashRefundFee(String cashRefundFee) {
		this.cashRefundFee = cashRefundFee;
	}

    /**
     * Gets coupon fefund fee.
     *
     * @return the coupon fefund fee
     */
    public String getCouponFefundFee() {
		return couponFefundFee;
	}

    /**
     * Sets coupon fefund fee.
     *
     * @param couponFefundFee the coupon fefund fee
     */
    public void setCouponFefundFee(String couponFefundFee) {
		this.couponFefundFee = couponFefundFee;
	}

    /**
     * Gets coupon refund count.
     *
     * @return the coupon refund count
     */
    public String getCoupon_refund_count() {
		return coupon_refund_count;
	}

    /**
     * Sets coupon refund count.
     *
     * @param coupon_refund_count the coupon refund count
     */
    public void setCoupon_refund_count(String coupon_refund_count) {
		this.coupon_refund_count = coupon_refund_count;
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
     * Gets coupon type 0.
     *
     * @return the coupon type 0
     */
    public String getCouponType0() {
		return couponType0;
	}

    /**
     * Sets coupon type 0.
     *
     * @param couponType0 the coupon type 0
     */
    public void setCouponType0(String couponType0) {
		this.couponType0 = couponType0;
	}

    /**
     * Gets coupon type 1.
     *
     * @return the coupon type 1
     */
    public String getCouponType1() {
		return couponType1;
	}

    /**
     * Sets coupon type 1.
     *
     * @param couponType1 the coupon type 1
     */
    public void setCouponType1(String couponType1) {
		this.couponType1 = couponType1;
	}

    /**
     * Gets coupon type 2.
     *
     * @return the coupon type 2
     */
    public String getCouponType2() {
		return couponType2;
	}

    /**
     * Sets coupon type 2.
     *
     * @param couponType2 the coupon type 2
     */
    public void setCouponType2(String couponType2) {
		this.couponType2 = couponType2;
	}

    /**
     * Gets coupon refund id 0.
     *
     * @return the coupon refund id 0
     */
    public String getCouponRefundId0() {
		return couponRefundId0;
	}

    /**
     * Sets coupon refund id 0.
     *
     * @param couponRefundId0 the coupon refund id 0
     */
    public void setCouponRefundId0(String couponRefundId0) {
		this.couponRefundId0 = couponRefundId0;
	}

    /**
     * Gets coupon refund id 1.
     *
     * @return the coupon refund id 1
     */
    public String getCouponRefundId1() {
		return couponRefundId1;
	}

    /**
     * Sets coupon refund id 1.
     *
     * @param couponRefundId1 the coupon refund id 1
     */
    public void setCouponRefundId1(String couponRefundId1) {
		this.couponRefundId1 = couponRefundId1;
	}

    /**
     * Gets coupon refund id 2.
     *
     * @return the coupon refund id 2
     */
    public String getCouponRefundId2() {
		return couponRefundId2;
	}

    /**
     * Sets coupon refund id 2.
     *
     * @param couponRefundId2 the coupon refund id 2
     */
    public void setCouponRefundId2(String couponRefundId2) {
		this.couponRefundId2 = couponRefundId2;
	}

    /**
     * Gets coupon refund fee 0.
     *
     * @return the coupon refund fee 0
     */
    public String getCouponRefundFee0() {
		return couponRefundFee0;
	}

    /**
     * Sets coupon refund fee 0.
     *
     * @param couponRefundFee0 the coupon refund fee 0
     */
    public void setCouponRefundFee0(String couponRefundFee0) {
		this.couponRefundFee0 = couponRefundFee0;
	}

    /**
     * Gets coupon refund fee 1.
     *
     * @return the coupon refund fee 1
     */
    public String getCouponRefundFee1() {
		return couponRefundFee1;
	}

    /**
     * Sets coupon refund fee 1.
     *
     * @param couponRefundFee1 the coupon refund fee 1
     */
    public void setCouponRefundFee1(String couponRefundFee1) {
		this.couponRefundFee1 = couponRefundFee1;
	}

    /**
     * Gets coupon refund fee 2.
     *
     * @return the coupon refund fee 2
     */
    public String getCouponRefundFee2() {
		return couponRefundFee2;
	}

    /**
     * Sets coupon refund fee 2.
     *
     * @param couponRefundFee2 the coupon refund fee 2
     */
    public void setCouponRefundFee2(String couponRefundFee2) {
		this.couponRefundFee2 = couponRefundFee2;
	}

	@Override
	public String toString() {
		return JsonUtil.format(this);
	}
}
