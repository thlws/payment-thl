package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结算详细信息
 *
 * @author auto create
 * @since 1.0, 2018-08-23 12:34:39
 */
public class SettleDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 7255756741257637519L;

	/**
	 * 结算的金额，单位为元。目前必须和交易金额相同
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 结算主体标识。当结算主体类型为SecondMerchant时，为二级商户的SecondMerchantID；当结算主体类型为Store时，为门店的外标。
	 */
	@ApiField("settle_entity_id")
	private String settleEntityId;

	/**
	 * 结算主体类型。
二级商户:SecondMerchant;商户或者直连商户门店:Store
	 */
	@ApiField("settle_entity_type")
	private String settleEntityType;

	/**
	 * 结算汇总维度，按照这个维度汇总成批次结算，由商户指定。

目前需要和结算收款方账户类型为cardSerialNo配合使用
	 */
	@ApiField("summary_dimension")
	private String summaryDimension;

	/**
	 * 结算收款方。当结算收款方类型是cardSerialNo时，本参数为用户在支付宝绑定的卡编号；结算收款方类型是userId时，本参数为用户的支付宝账号对应的支付宝唯一用户号，以2088开头的纯16位数字；当结算收款方类型是loginName时，本参数为用户的支付宝登录号
	 */
	@ApiField("trans_in")
	private String transIn;

	/**
	 * 结算收款方的账户类型。

cardSerialNo：结算收款方的银行卡编号;

userId：表示是支付宝账号对应的支付宝唯一用户号;
loginName：表示是支付宝登录号；
	 */
	@ApiField("trans_in_type")
	private String transInType;

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public Long getAmount() {
		return this.amount;
	}

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(Long amount) {
		this.amount = amount;
	}

    /**
     * Gets settle entity id.
     *
     * @return the settle entity id
     */
    public String getSettleEntityId() {
		return this.settleEntityId;
	}

    /**
     * Sets settle entity id.
     *
     * @param settleEntityId the settle entity id
     */
    public void setSettleEntityId(String settleEntityId) {
		this.settleEntityId = settleEntityId;
	}

    /**
     * Gets settle entity type.
     *
     * @return the settle entity type
     */
    public String getSettleEntityType() {
		return this.settleEntityType;
	}

    /**
     * Sets settle entity type.
     *
     * @param settleEntityType the settle entity type
     */
    public void setSettleEntityType(String settleEntityType) {
		this.settleEntityType = settleEntityType;
	}

    /**
     * Gets summary dimension.
     *
     * @return the summary dimension
     */
    public String getSummaryDimension() {
		return this.summaryDimension;
	}

    /**
     * Sets summary dimension.
     *
     * @param summaryDimension the summary dimension
     */
    public void setSummaryDimension(String summaryDimension) {
		this.summaryDimension = summaryDimension;
	}

    /**
     * Gets trans in.
     *
     * @return the trans in
     */
    public String getTransIn() {
		return this.transIn;
	}

    /**
     * Sets trans in.
     *
     * @param transIn the trans in
     */
    public void setTransIn(String transIn) {
		this.transIn = transIn;
	}

    /**
     * Gets trans in type.
     *
     * @return the trans in type
     */
    public String getTransInType() {
		return this.transInType;
	}

    /**
     * Sets trans in type.
     *
     * @param transInType the trans in type
     */
    public void setTransInType(String transInType) {
		this.transInType = transInType;
	}

}
