package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 返回给商户的子订单明细
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class OrderDetailResult extends AlipayObject {

	private static final long serialVersionUID = 2694542262494392921L;

	/**
	 * 应用唯一标识
	 */
	@ApiField("app_id")
	private String appId;

	/**
	 * 商户订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 公用回传参数，如果请求时传递了该参数，则返回给商户时会回传该参数。
	 */
	@ApiField("passback_params")
	private String passbackParams;

	/**
	 * 卖家支付宝用户ID。
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 订单标题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 交易状态，有以下几种取值：
1. TRADE_SUCCESS：付款成功
2. TRADE_FINISHED：交易完成
3. WAIT_BUYER_PAY：等待支付
4. TRADE_CLOSED：交易关闭
	 */
	@ApiField("trade_status")
	private String tradeStatus;

    /**
     * Gets app id.
     *
     * @return the app id
     */
    public String getAppId() {
		return this.appId;
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
     * Gets out trade no.
     *
     * @return the out trade no
     */
    public String getOutTradeNo() {
		return this.outTradeNo;
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
     * Gets passback params.
     *
     * @return the passback params
     */
    public String getPassbackParams() {
		return this.passbackParams;
	}

    /**
     * Sets passback params.
     *
     * @param passbackParams the passback params
     */
    public void setPassbackParams(String passbackParams) {
		this.passbackParams = passbackParams;
	}

    /**
     * Gets seller id.
     *
     * @return the seller id
     */
    public String getSellerId() {
		return this.sellerId;
	}

    /**
     * Sets seller id.
     *
     * @param sellerId the seller id
     */
    public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

    /**
     * Gets subject.
     *
     * @return the subject
     */
    public String getSubject() {
		return this.subject;
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
     * Gets total amount.
     *
     * @return the total amount
     */
    public String getTotalAmount() {
		return this.totalAmount;
	}

    /**
     * Sets total amount.
     *
     * @param totalAmount the total amount
     */
    public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

    /**
     * Gets trade no.
     *
     * @return the trade no
     */
    public String getTradeNo() {
		return this.tradeNo;
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
     * Gets trade status.
     *
     * @return the trade status
     */
    public String getTradeStatus() {
		return this.tradeStatus;
	}

    /**
     * Sets trade status.
     *
     * @param tradeStatus the trade status
     */
    public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

}
