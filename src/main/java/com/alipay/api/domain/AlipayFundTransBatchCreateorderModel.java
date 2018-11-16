package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 如果有创建AA收款，江湖救急等业务场景的话，创建批次后，可以调用此接口创建付款单
 *
 * @author auto create
 * @since 1.0, 2017-02-13 17:30:37
 */
public class AlipayFundTransBatchCreateorderModel extends AlipayObject {

	private static final long serialVersionUID = 4481615275834125193L;

	/**
	 * 批次编号：创建批次时生成的批次号；表示这笔付款是这个批次下面的一条明细
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 必须是map<String,String>的json串，长度限制为100
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 金额，单位为元
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 收款方userId
	 */
	@ApiField("payee_id")
	private String payeeId;

	/**
	 * 付款方userId
	 */
	@ApiField("payer_id")
	private String payerId;

	/**
	 * token；创建批次时和批次编号一起下发的token串
	 */
	@ApiField("token")
	private String token;

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
     * Gets payee id.
     *
     * @return the payee id
     */
    public String getPayeeId() {
		return this.payeeId;
	}

    /**
     * Sets payee id.
     *
     * @param payeeId the payee id
     */
    public void setPayeeId(String payeeId) {
		this.payeeId = payeeId;
	}

    /**
     * Gets payer id.
     *
     * @return the payer id
     */
    public String getPayerId() {
		return this.payerId;
	}

    /**
     * Sets payer id.
     *
     * @param payerId the payer id
     */
    public void setPayerId(String payerId) {
		this.payerId = payerId;
	}

    /**
     * Gets token.
     *
     * @return the token
     */
    public String getToken() {
		return this.token;
	}

    /**
     * Sets token.
     *
     * @param token the token
     */
    public void setToken(String token) {
		this.token = token;
	}

}
