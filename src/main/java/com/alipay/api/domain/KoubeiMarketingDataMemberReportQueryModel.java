package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员报表批量查询接口
 *
 * @author auto create
 * @since 1.0, 2018-07-16 15:33:45
 */
public class KoubeiMarketingDataMemberReportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5581879337485257953L;

	/**
	 * 查询报表数据的业务日期，精确到天，格式为yyyymmdd，数据按天返回
	 */
	@ApiField("biz_date")
	private String bizDate;

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

}
