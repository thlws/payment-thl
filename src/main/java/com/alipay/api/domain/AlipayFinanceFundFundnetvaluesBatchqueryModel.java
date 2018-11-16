package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询基金在给定时间间隔内的净值数据
 *
 * @author auto create
 * @since 1.0, 2018-03-02 18:06:11
 */
public class AlipayFinanceFundFundnetvaluesBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2766424499936238317L;

	/**
	 * 结束日期，YYYYMMDD
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 基金代码
	 */
	@ApiField("fund_code")
	private String fundCode;

	/**
	 * 分页数，从 1 开始
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页条数
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 开始日期，YYYYMMDD
	 */
	@ApiField("start_date")
	private String startDate;

    /**
     * Gets end date.
     *
     * @return the end date
     */
    public String getEndDate() {
		return this.endDate;
	}

    /**
     * Sets end date.
     *
     * @param endDate the end date
     */
    public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

    /**
     * Gets fund code.
     *
     * @return the fund code
     */
    public String getFundCode() {
		return this.fundCode;
	}

    /**
     * Sets fund code.
     *
     * @param fundCode the fund code
     */
    public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}

    /**
     * Gets page num.
     *
     * @return the page num
     */
    public String getPageNum() {
		return this.pageNum;
	}

    /**
     * Sets page num.
     *
     * @param pageNum the page num
     */
    public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

    /**
     * Gets page size.
     *
     * @return the page size
     */
    public String getPageSize() {
		return this.pageSize;
	}

    /**
     * Sets page size.
     *
     * @param pageSize the page size
     */
    public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

    /**
     * Gets start date.
     *
     * @return the start date
     */
    public String getStartDate() {
		return this.startDate;
	}

    /**
     * Sets start date.
     *
     * @param startDate the start date
     */
    public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
