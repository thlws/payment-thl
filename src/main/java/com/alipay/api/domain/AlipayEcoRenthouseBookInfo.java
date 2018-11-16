package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 定金信息
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:32:05
 */
public class AlipayEcoRenthouseBookInfo extends AlipayObject {

	private static final long serialVersionUID = 3183458486572476629L;

	/**
	 * 定金金额
	 */
	@ApiField("book_amount")
	private String bookAmount;

	/**
	 * 约定月租金额
	 */
	@ApiField("book_sale_amount")
	private String bookSaleAmount;

	/**
	 * 约定最晚签约日格式 YYYY-MM-dd
	 */
	@ApiField("latest_signing_date")
	private String latestSigningDate;

	/**
	 * 约定租约开始时间格式 YYYY-MM-dd
	 */
	@ApiField("lease_begin_date")
	private String leaseBeginDate;

	/**
	 * 约定租约开始结束格式 YYYY-MM-dd
	 */
	@ApiField("lease_end_date")
	private String leaseEndDate;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

    /**
     * Gets book amount.
     *
     * @return the book amount
     */
    public String getBookAmount() {
		return this.bookAmount;
	}

    /**
     * Sets book amount.
     *
     * @param bookAmount the book amount
     */
    public void setBookAmount(String bookAmount) {
		this.bookAmount = bookAmount;
	}

    /**
     * Gets book sale amount.
     *
     * @return the book sale amount
     */
    public String getBookSaleAmount() {
		return this.bookSaleAmount;
	}

    /**
     * Sets book sale amount.
     *
     * @param bookSaleAmount the book sale amount
     */
    public void setBookSaleAmount(String bookSaleAmount) {
		this.bookSaleAmount = bookSaleAmount;
	}

    /**
     * Gets latest signing date.
     *
     * @return the latest signing date
     */
    public String getLatestSigningDate() {
		return this.latestSigningDate;
	}

    /**
     * Sets latest signing date.
     *
     * @param latestSigningDate the latest signing date
     */
    public void setLatestSigningDate(String latestSigningDate) {
		this.latestSigningDate = latestSigningDate;
	}

    /**
     * Gets lease begin date.
     *
     * @return the lease begin date
     */
    public String getLeaseBeginDate() {
		return this.leaseBeginDate;
	}

    /**
     * Sets lease begin date.
     *
     * @param leaseBeginDate the lease begin date
     */
    public void setLeaseBeginDate(String leaseBeginDate) {
		this.leaseBeginDate = leaseBeginDate;
	}

    /**
     * Gets lease end date.
     *
     * @return the lease end date
     */
    public String getLeaseEndDate() {
		return this.leaseEndDate;
	}

    /**
     * Sets lease end date.
     *
     * @param leaseEndDate the lease end date
     */
    public void setLeaseEndDate(String leaseEndDate) {
		this.leaseEndDate = leaseEndDate;
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

}
