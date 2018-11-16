package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 优惠立减活动子时间段模型足戒用
 *
 * @author auto create
 * @since 1.0, 2017-03-03 16:47:49
 */
public class DateAreaModel extends AlipayObject {

	private static final long serialVersionUID = 2357716972453842683L;

	/**
	 * 开始时间
	 */
	@ApiField("begin_date")
	private String beginDate;

	/**
	 * 结束时间
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
