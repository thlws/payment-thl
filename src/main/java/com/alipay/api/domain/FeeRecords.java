package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 费用记录
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class FeeRecords extends AlipayObject {

	private static final long serialVersionUID = 2148511345651823544L;

	/**
	 * 费用余额，单位为元，小数点保留2位
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 交易时间
	 */
	@ApiField("date")
	private Date date;

	/**
	 * 费用交易流水备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 费用交易额度
	 */
	@ApiField("total_amount")
	private String totalAmount;

    /**
     * Gets balance.
     *
     * @return the balance
     */
    public String getBalance() {
		return this.balance;
	}

    /**
     * Sets balance.
     *
     * @param balance the balance
     */
    public void setBalance(String balance) {
		this.balance = balance;
	}

    /**
     * Gets date.
     *
     * @return the date
     */
    public Date getDate() {
		return this.date;
	}

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(Date date) {
		this.date = date;
	}

    /**
     * Gets remark.
     *
     * @return the remark
     */
    public String getRemark() {
		return this.remark;
	}

    /**
     * Sets remark.
     *
     * @param remark the remark
     */
    public void setRemark(String remark) {
		this.remark = remark;
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

}
