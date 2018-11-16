package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支用放款流水
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class LendingRecords extends AlipayObject {

	private static final long serialVersionUID = 1483863287497462153L;

	/**
	 * 放款时间，精确到天
	 */
	@ApiField("date")
	private Date date;

	/**
	 * 放款流水描述
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 放款额度，精确到小数点2位，单位（元）
	 */
	@ApiField("total_amount")
	private String totalAmount;

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
