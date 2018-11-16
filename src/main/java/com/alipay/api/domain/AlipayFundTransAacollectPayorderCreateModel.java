package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建aa收款付款单据
 *
 * @author auto create
 * @since 1.0, 2018-07-20 12:10:18
 */
public class AlipayFundTransAacollectPayorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6529384493686481723L;

	/**
	 * 批次号，创建批次返回
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 创建批次返回的batchToken
	 */
	@ApiField("batch_token")
	private String batchToken;

	/**
	 * 调用方扩充参数，json格式map
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 支付金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 当前支付宝userId，即付款方支付宝用户uid
	 */
	@ApiField("payer_user_id")
	private String payerUserId;

	/**
	 * 进入付款来源，仅记录
    吱口令：shakeCode
    二维码：qrCode
    小程序：mini
    其他来源（包括正常流程）：null
	 */
	@ApiField("source")
	private String source;

    /**
     * Gets batch no.
     *
     * @return the batch no
     */
    public String getBatchNo() {
		return this.batchNo;
	}

    /**
     * Sets batch no.
     *
     * @param batchNo the batch no
     */
    public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

    /**
     * Gets batch token.
     *
     * @return the batch token
     */
    public String getBatchToken() {
		return this.batchToken;
	}

    /**
     * Sets batch token.
     *
     * @param batchToken the batch token
     */
    public void setBatchToken(String batchToken) {
		this.batchToken = batchToken;
	}

    /**
     * Gets ext param.
     *
     * @return the ext param
     */
    public String getExtParam() {
		return this.extParam;
	}

    /**
     * Sets ext param.
     *
     * @param extParam the ext param
     */
    public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

    /**
     * Gets pay amount.
     *
     * @return the pay amount
     */
    public String getPayAmount() {
		return this.payAmount;
	}

    /**
     * Sets pay amount.
     *
     * @param payAmount the pay amount
     */
    public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

    /**
     * Gets payer user id.
     *
     * @return the payer user id
     */
    public String getPayerUserId() {
		return this.payerUserId;
	}

    /**
     * Sets payer user id.
     *
     * @param payerUserId the payer user id
     */
    public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
	}

    /**
     * Gets source.
     *
     * @return the source
     */
    public String getSource() {
		return this.source;
	}

    /**
     * Sets source.
     *
     * @param source the source
     */
    public void setSource(String source) {
		this.source = source;
	}

}
