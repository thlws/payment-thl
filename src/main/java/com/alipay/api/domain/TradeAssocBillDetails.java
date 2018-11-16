package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易关联的账单信息
 *
 * @author auto create
 * @since 1.0, 2017-09-08 11:37:41
 */
public class TradeAssocBillDetails extends AlipayObject {

	private static final long serialVersionUID = 6413885993482846421L;

	/**
	 * 明细条目所归属的账期
	 */
	@ApiField("acct_period")
	private String acctPeriod;

	/**
	 * 缴费明细项金额
	 */
	@ApiField("bill_entry_amount")
	private String billEntryAmount;

	/**
	 * 用于标识该笔缴费对应的缴费明细项外部编号；如果是预存缴费，则为外部户号
	 */
	@ApiField("bill_entry_id")
	private String billEntryId;

	/**
	 * 缴费明细项类型
	 */
	@ApiField("cost_type")
	private String costType;

    /**
     * Gets acct period.
     *
     * @return the acct period
     */
    public String getAcctPeriod() {
		return this.acctPeriod;
	}

    /**
     * Sets acct period.
     *
     * @param acctPeriod the acct period
     */
    public void setAcctPeriod(String acctPeriod) {
		this.acctPeriod = acctPeriod;
	}

    /**
     * Gets bill entry amount.
     *
     * @return the bill entry amount
     */
    public String getBillEntryAmount() {
		return this.billEntryAmount;
	}

    /**
     * Sets bill entry amount.
     *
     * @param billEntryAmount the bill entry amount
     */
    public void setBillEntryAmount(String billEntryAmount) {
		this.billEntryAmount = billEntryAmount;
	}

    /**
     * Gets bill entry id.
     *
     * @return the bill entry id
     */
    public String getBillEntryId() {
		return this.billEntryId;
	}

    /**
     * Sets bill entry id.
     *
     * @param billEntryId the bill entry id
     */
    public void setBillEntryId(String billEntryId) {
		this.billEntryId = billEntryId;
	}

    /**
     * Gets cost type.
     *
     * @return the cost type
     */
    public String getCostType() {
		return this.costType;
	}

    /**
     * Sets cost type.
     *
     * @param costType the cost type
     */
    public void setCostType(String costType) {
		this.costType = costType;
	}

}
