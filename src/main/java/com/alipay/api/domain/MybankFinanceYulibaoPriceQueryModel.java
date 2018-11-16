package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询余利宝行情信息（七日年化收益率、万份收益金额）
 *
 * @author auto create
 * @since 1.0, 2016-11-18 16:08:17
 */
public class MybankFinanceYulibaoPriceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5268731788917193231L;

	/**
	 * 查询行情的截止日期，必须是格式为yyyyMMdd的日期字符串且日期要大于等于start_date，时间最大跨度为30天，如start_date为20160808，则end_date最大值为20160906
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 基金代码，必填。目前默认填001529，代表余利宝。
	 */
	@ApiField("fund_code")
	private String fundCode;

	/**
	 * 查询行情的开始日期，必须是格式为yyyyMMdd的日期字符串，如20160808
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
