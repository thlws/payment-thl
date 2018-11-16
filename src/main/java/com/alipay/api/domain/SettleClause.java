package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结算条款信息
 *
 * @author auto create
 * @since 1.0, 2018-07-06 14:43:35
 */
public class SettleClause extends AlipayObject {

	private static final long serialVersionUID = 7822554192239732614L;

	/**
	 * 结算金额，单位为元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 结算币种，支持人民币：CNY
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 结算账户id。当结算账户id类型是cardSerialNo时，本参数为用户在支付宝绑定的卡编号；当结算账户id类型是userId时，本参数为用户的支付宝账号对应的支付宝唯一用户号；当结算账户id类型是loginName时，本参数为用户的支付宝登录号
	 */
	@ApiField("settle_account_id")
	private String settleAccountId;

	/**
	 * 结算账户id类型。
当settle_account_type 为bankCard时，本参数为cardSerialNo，表示结算账户id是银行卡编号;
当settle_account_type 为alipayBalance时，本参数为userId或者loginName，其中userId表示结算账户id是支付宝唯一用户号，loginName表示结算账户id是支付宝登录号
	 */
	@ApiField("settle_account_id_type")
	private String settleAccountIdType;

	/**
	 * 结算账户类型。

bankCard: 结算账户为银行卡；
alipayBalance: 结算账户为支付宝余额户
	 */
	@ApiField("settle_account_type")
	private String settleAccountType;

	/**
	 * 结算主体账号。
当结算主体类型为SecondMerchant，本参数为二级商户的SecondMerchantID
	 */
	@ApiField("settle_entity_id")
	private String settleEntityId;

	/**
	 * 结算主体类型。
SecondMerchant：结算主体为二级商户
	 */
	@ApiField("settle_entity_type")
	private String settleEntityType;

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public String getAmount() {
		return this.amount;
	}

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(String amount) {
		this.amount = amount;
	}

    /**
     * Gets currency.
     *
     * @return the currency
     */
    public String getCurrency() {
		return this.currency;
	}

    /**
     * Sets currency.
     *
     * @param currency the currency
     */
    public void setCurrency(String currency) {
		this.currency = currency;
	}

    /**
     * Gets settle account id.
     *
     * @return the settle account id
     */
    public String getSettleAccountId() {
		return this.settleAccountId;
	}

    /**
     * Sets settle account id.
     *
     * @param settleAccountId the settle account id
     */
    public void setSettleAccountId(String settleAccountId) {
		this.settleAccountId = settleAccountId;
	}

    /**
     * Gets settle account id type.
     *
     * @return the settle account id type
     */
    public String getSettleAccountIdType() {
		return this.settleAccountIdType;
	}

    /**
     * Sets settle account id type.
     *
     * @param settleAccountIdType the settle account id type
     */
    public void setSettleAccountIdType(String settleAccountIdType) {
		this.settleAccountIdType = settleAccountIdType;
	}

    /**
     * Gets settle account type.
     *
     * @return the settle account type
     */
    public String getSettleAccountType() {
		return this.settleAccountType;
	}

    /**
     * Sets settle account type.
     *
     * @param settleAccountType the settle account type
     */
    public void setSettleAccountType(String settleAccountType) {
		this.settleAccountType = settleAccountType;
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

}
