package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.trade.order.query response.
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:26:29
 */
public class AlipayEcoMycarTradeOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2343538887248323335L;

	/** 
	 * 车主平台交易号，交易订单唯一标记。与车主业务平台订单号相同。
	 */
	@ApiField("biz_trade_no")
	private String bizTradeNo;

	/** 
	 * 买家支付宝Uid
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/** 
	 * 买家支付宝账号
	 */
	@ApiField("buyer_logon_id")
	private String buyerLogonId;

	/** 
	 * 交易关闭时间，格式'yyyy-MM-dd HH:mm:ss'
	 */
	@ApiField("gmt_closed")
	private String gmtClosed;

	/** 
	 * 交易订单创建时间，格式'yyyy-MM-dd HH:mm:ss'
	 */
	@ApiField("gmt_created")
	private String gmtCreated;

	/** 
	 * 支付时间，格式'yyyy-MM-dd HH:mm:ss'
	 */
	@ApiField("gmt_payment")
	private String gmtPayment;

	/** 
	 * 支付成功时间，格式'yyyy-MM-dd HH:mm:ss'
	 */
	@ApiField("gmt_payment_success")
	private String gmtPaymentSuccess;

	/** 
	 * 退款时间。该笔交易有退款操作时该字段才有值。格式：'yyyy-MM-dd HH:mm:ss'
	 */
	@ApiField("gmt_refund")
	private String gmtRefund;

	/** 
	 * 退款成功时间。笔交易有退款操作时该字段才有值。格式：'yyyy-MM-dd HH:mm:ss'
	 */
	@ApiField("gmt_refund_success")
	private String gmtRefundSuccess;

	/** 
	 * 交易订单最后更改时间，格式'yyyy-MM-dd HH:mm:ss'
	 */
	@ApiField("gmt_updated")
	private String gmtUpdated;

	/** 
	 * 外部订单号
	 */
	@ApiField("out_biz_trade_no")
	private String outBizTradeNo;

	/** 
	 * 已退回金额，单位元，精确到小数点后两位。笔交易有退款操作时该字段才有值。
	 */
	@ApiField("send_back_fee")
	private String sendBackFee;

	/** 
	 * 车主平台门店编号
	 */
	@ApiField("shop_id")
	private Long shopId;

	/** 
	 * 订单主题，商品的标题/交易标题/订单标题/订单关键字等。
	 */
	@ApiField("subject")
	private String subject;

	/** 
	 * 订单摘要信息，对一笔交易的具体描述，由车主业务系统组织。 车主平台订单列表透出内容。
	 */
	@ApiField("summary")
	private String summary;

	/** 
	 * 交易金额，单位元， 精确到小数点后两位。
	 */
	@ApiField("total_fee")
	private String totalFee;

	/** 
	 * 支付宝交易号。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 车主平台交易状态
0：创建；1：支付成功；2：支付失败；3：支付完成；4：支付中；5：交易关闭；6：转为退款；8：退款成功；7：退款失败；9：交易完结
	 */
	@ApiField("trade_status")
	private Long tradeStatus;

	/** 
	 * 订单类型，1：洗车，2：保养，3:洗车，4:4s店。
	 */
	@ApiField("trade_type")
	private Long tradeType;

    /**
     * Sets biz trade no.
     *
     * @param bizTradeNo the biz trade no
     */
    public void setBizTradeNo(String bizTradeNo) {
		this.bizTradeNo = bizTradeNo;
	}

    /**
     * Gets biz trade no.
     *
     * @return the biz trade no
     */
    public String getBizTradeNo( ) {
		return this.bizTradeNo;
	}

    /**
     * Sets buyer id.
     *
     * @param buyerId the buyer id
     */
    public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

    /**
     * Gets buyer id.
     *
     * @return the buyer id
     */
    public String getBuyerId( ) {
		return this.buyerId;
	}

    /**
     * Sets buyer logon id.
     *
     * @param buyerLogonId the buyer logon id
     */
    public void setBuyerLogonId(String buyerLogonId) {
		this.buyerLogonId = buyerLogonId;
	}

    /**
     * Gets buyer logon id.
     *
     * @return the buyer logon id
     */
    public String getBuyerLogonId( ) {
		return this.buyerLogonId;
	}

    /**
     * Sets gmt closed.
     *
     * @param gmtClosed the gmt closed
     */
    public void setGmtClosed(String gmtClosed) {
		this.gmtClosed = gmtClosed;
	}

    /**
     * Gets gmt closed.
     *
     * @return the gmt closed
     */
    public String getGmtClosed( ) {
		return this.gmtClosed;
	}

    /**
     * Sets gmt created.
     *
     * @param gmtCreated the gmt created
     */
    public void setGmtCreated(String gmtCreated) {
		this.gmtCreated = gmtCreated;
	}

    /**
     * Gets gmt created.
     *
     * @return the gmt created
     */
    public String getGmtCreated( ) {
		return this.gmtCreated;
	}

    /**
     * Sets gmt payment.
     *
     * @param gmtPayment the gmt payment
     */
    public void setGmtPayment(String gmtPayment) {
		this.gmtPayment = gmtPayment;
	}

    /**
     * Gets gmt payment.
     *
     * @return the gmt payment
     */
    public String getGmtPayment( ) {
		return this.gmtPayment;
	}

    /**
     * Sets gmt payment success.
     *
     * @param gmtPaymentSuccess the gmt payment success
     */
    public void setGmtPaymentSuccess(String gmtPaymentSuccess) {
		this.gmtPaymentSuccess = gmtPaymentSuccess;
	}

    /**
     * Gets gmt payment success.
     *
     * @return the gmt payment success
     */
    public String getGmtPaymentSuccess( ) {
		return this.gmtPaymentSuccess;
	}

    /**
     * Sets gmt refund.
     *
     * @param gmtRefund the gmt refund
     */
    public void setGmtRefund(String gmtRefund) {
		this.gmtRefund = gmtRefund;
	}

    /**
     * Gets gmt refund.
     *
     * @return the gmt refund
     */
    public String getGmtRefund( ) {
		return this.gmtRefund;
	}

    /**
     * Sets gmt refund success.
     *
     * @param gmtRefundSuccess the gmt refund success
     */
    public void setGmtRefundSuccess(String gmtRefundSuccess) {
		this.gmtRefundSuccess = gmtRefundSuccess;
	}

    /**
     * Gets gmt refund success.
     *
     * @return the gmt refund success
     */
    public String getGmtRefundSuccess( ) {
		return this.gmtRefundSuccess;
	}

    /**
     * Sets gmt updated.
     *
     * @param gmtUpdated the gmt updated
     */
    public void setGmtUpdated(String gmtUpdated) {
		this.gmtUpdated = gmtUpdated;
	}

    /**
     * Gets gmt updated.
     *
     * @return the gmt updated
     */
    public String getGmtUpdated( ) {
		return this.gmtUpdated;
	}

    /**
     * Sets out biz trade no.
     *
     * @param outBizTradeNo the out biz trade no
     */
    public void setOutBizTradeNo(String outBizTradeNo) {
		this.outBizTradeNo = outBizTradeNo;
	}

    /**
     * Gets out biz trade no.
     *
     * @return the out biz trade no
     */
    public String getOutBizTradeNo( ) {
		return this.outBizTradeNo;
	}

    /**
     * Sets send back fee.
     *
     * @param sendBackFee the send back fee
     */
    public void setSendBackFee(String sendBackFee) {
		this.sendBackFee = sendBackFee;
	}

    /**
     * Gets send back fee.
     *
     * @return the send back fee
     */
    public String getSendBackFee( ) {
		return this.sendBackFee;
	}

    /**
     * Sets shop id.
     *
     * @param shopId the shop id
     */
    public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

    /**
     * Gets shop id.
     *
     * @return the shop id
     */
    public Long getShopId( ) {
		return this.shopId;
	}

    /**
     * Sets subject.
     *
     * @param subject the subject
     */
    public void setSubject(String subject) {
		this.subject = subject;
	}

    /**
     * Gets subject.
     *
     * @return the subject
     */
    public String getSubject( ) {
		return this.subject;
	}

    /**
     * Sets summary.
     *
     * @param summary the summary
     */
    public void setSummary(String summary) {
		this.summary = summary;
	}

    /**
     * Gets summary.
     *
     * @return the summary
     */
    public String getSummary( ) {
		return this.summary;
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
     * Gets total fee.
     *
     * @return the total fee
     */
    public String getTotalFee( ) {
		return this.totalFee;
	}

    /**
     * Sets trade no.
     *
     * @param tradeNo the trade no
     */
    public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

    /**
     * Gets trade no.
     *
     * @return the trade no
     */
    public String getTradeNo( ) {
		return this.tradeNo;
	}

    /**
     * Sets trade status.
     *
     * @param tradeStatus the trade status
     */
    public void setTradeStatus(Long tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

    /**
     * Gets trade status.
     *
     * @return the trade status
     */
    public Long getTradeStatus( ) {
		return this.tradeStatus;
	}

    /**
     * Sets trade type.
     *
     * @param tradeType the trade type
     */
    public void setTradeType(Long tradeType) {
		this.tradeType = tradeType;
	}

    /**
     * Gets trade type.
     *
     * @return the trade type
     */
    public Long getTradeType( ) {
		return this.tradeType;
	}

}
