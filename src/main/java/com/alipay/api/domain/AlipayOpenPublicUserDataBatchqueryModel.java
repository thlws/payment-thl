package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户分析数据查询接口
 *
 * @author auto create
 * @since 1.0, 2017-12-06 11:29:09
 */
public class AlipayOpenPublicUserDataBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1627385374172355353L;

	/**
	 * 开始日期
	 */
	@ApiField("begin_date")
	private String beginDate;

	/**
	 * 结束日期，开始日期/结束日期时间跨度最大30天
	 */
	@ApiField("end_date")
	private String endDate;

    /**
     * Gets begin date.
     *
     * @return the begin date
     */
    public String getBeginDate() {
		return this.beginDate;
	}

    /**
     * Sets begin date.
     *
     * @param beginDate the begin date
     */
    public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

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

}
