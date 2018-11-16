package org.thlws.payment.bestpay.entity.request;

/**
 * 撤销参数对象
 * Created by HanleyTang on 2018/1/5
 *
 * @author Hanley[hanley @thlws.com]
 * @version 1.0
 */
public class OrderReverseRequest {

	/**商户号	(必填)	length=30*/
	private String merchantId;

	/**子商户号	length=30*/
	private String subMerchantId;

	/**商户调用密码（必填），商户执行时需填入相应密码 ，又称：交易key*/
	private String merchantPwd;

	/**原扣款成功的订单号(必填) */
	private String oldOrderNo;

	/**原扣款成功的请求支付流水号(必填)*/
	private String oldOrderReqNo;

	/**退款流水号(必填)*/
	private String refundReqNo;

	/**退款请求日期(必填),格式 yyyyMMDD*/
	private String refundReqDate;

	/**退款交易金额(必填),单位为分，必须等于原订单金额*/
	private String transAmt;

	/**渠道(必填),默认05*/
	private String channel = "05";

	/**Mac校验域,无需调用者设值,依赖库会自动设置*/
	private String mac;

	/**
	 * Gets merchant id.
	 *
	 * @return the merchant id
	 */
	public String getMerchantId() {
		return merchantId;
	}

	/**
	 * Gets sub merchant id.
	 *
	 * @return the sub merchant id
	 */
	public String getSubMerchantId() {
		return subMerchantId;
	}

	/**
	 * Gets merchant pwd.
	 *
	 * @return the merchant pwd
	 */
	public String getMerchantPwd() {
		return merchantPwd;
	}

	/**
	 * Gets old order no.
	 *
	 * @return the old order no
	 */
	public String getOldOrderNo() {
		return oldOrderNo;
	}

	/**
	 * Gets old order req no.
	 *
	 * @return the old order req no
	 */
	public String getOldOrderReqNo() {
		return oldOrderReqNo;
	}

	/**
	 * Gets refund req no.
	 *
	 * @return the refund req no
	 */
	public String getRefundReqNo() {
		return refundReqNo;
	}

	/**
	 * Gets refund req date.
	 *
	 * @return the refund req date
	 */
	public String getRefundReqDate() {
		return refundReqDate;
	}

	/**
	 * Gets trans amt.
	 *
	 * @return the trans amt
	 */
	public String getTransAmt() {
		return transAmt;
	}

	/**
	 * Gets channel.
	 *
	 * @return the channel
	 */
	public String getChannel() {
		return channel;
	}

	/**
	 * Gets mac.
	 *
	 * @return the mac
	 */
	public String getMac() {
		return mac;
	}

	/**
	 * Sets merchant id.
	 *
	 * @param merchantId the merchant id
	 */
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	/**
	 * Sets sub merchant id.
	 *
	 * @param subMerchantId the sub merchant id
	 */
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

	/**
	 * Sets merchant pwd.
	 *
	 * @param merchantPwd the merchant pwd
	 */
	public void setMerchantPwd(String merchantPwd) {
		this.merchantPwd = merchantPwd;
	}

	/**
	 * Sets old order no.
	 *
	 * @param oldOrderNo the old order no
	 */
	public void setOldOrderNo(String oldOrderNo) {
		this.oldOrderNo = oldOrderNo;
	}

	/**
	 * Sets old order req no.
	 *
	 * @param oldOrderReqNo the old order req no
	 */
	public void setOldOrderReqNo(String oldOrderReqNo) {
		this.oldOrderReqNo = oldOrderReqNo;
	}

	/**
	 * Sets refund req no.
	 *
	 * @param refundReqNo the refund req no
	 */
	public void setRefundReqNo(String refundReqNo) {
		this.refundReqNo = refundReqNo;
	}

	/**
	 * Sets refund req date.
	 *
	 * @param refundReqDate the refund req date
	 */
	public void setRefundReqDate(String refundReqDate) {
		this.refundReqDate = refundReqDate;
	}

	/**
	 * Sets trans amt.
	 *
	 * @param transAmt the trans amt
	 */
	public void setTransAmt(String transAmt) {
		this.transAmt = transAmt;
	}

	/**
	 * Sets channel.
	 *
	 * @param channel the channel
	 */
	public void setChannel(String channel) {
		this.channel = channel;
	}

	/**
	 * Sets mac.
	 *
	 * @param mac the mac
	 */
	public void setMac(String mac) {
		this.mac = mac;
	}
	
	
}
