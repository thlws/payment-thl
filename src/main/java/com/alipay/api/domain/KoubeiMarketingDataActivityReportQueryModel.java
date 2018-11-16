package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑商户营销报表查询
 *
 * @author auto create
 * @since 1.0, 2016-05-30 22:29:14
 */
public class KoubeiMarketingDataActivityReportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2717452442225323327L;

	/**
	 * 查询报表数据的业务日期列表，精确到天，格式为yyyymmdd，支持列表格式，数据按天返回
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

    /**
     * Gets biz date.
     *
     * @return the biz date
     */
    public String getBizDate() {
		return this.bizDate;
	}

    /**
     * Sets biz date.
     *
     * @param bizDate the biz date
     */
    public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

    /**
     * Gets camp id.
     *
     * @return the camp id
     */
    public String getCampId() {
		return this.campId;
	}

    /**
     * Sets camp id.
     *
     * @param campId the camp id
     */
    public void setCampId(String campId) {
		this.campId = campId;
	}

}
