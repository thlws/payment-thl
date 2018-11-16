package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 现金活动列表查询
 *
 * @author auto create
 * @since 1.0, 2018-07-19 14:27:01
 */
public class AlipayMarketingCampaignCashListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4539591353192951965L;

	/**
	 * 要查询的活动状态,不填默认返回所有类型。
可填:
ALL:所有类型的活动
CREATED: 已创建未打款
PAID:已打款
READY:活动已开始
PAUSE:活动已暂停
CLOSED:活动已结束
SETTLE:活动已清算
	 */
	@ApiField("camp_status")
	private String campStatus;

	/**
	 * 分页查询时的页码，从1开始
	 */
	@ApiField("page_index")
	private String pageIndex;

	/**
	 * 分页查询时每页返回的列表大小,最大为50
	 */
	@ApiField("page_size")
	private String pageSize;

    /**
     * Gets camp status.
     *
     * @return the camp status
     */
    public String getCampStatus() {
		return this.campStatus;
	}

    /**
     * Sets camp status.
     *
     * @param campStatus the camp status
     */
    public void setCampStatus(String campStatus) {
		this.campStatus = campStatus;
	}

    /**
     * Gets page index.
     *
     * @return the page index
     */
    public String getPageIndex() {
		return this.pageIndex;
	}

    /**
     * Sets page index.
     *
     * @param pageIndex the page index
     */
    public void setPageIndex(String pageIndex) {
		this.pageIndex = pageIndex;
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

}
