package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CashCampaignInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.cash.list.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-19 14:27:01
 */
public class AlipayMarketingCampaignCashListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8671984273977443815L;

	/** 
	 * 活动列表
	 */
	@ApiListField("camp_list")
	@ApiField("cash_campaign_info")
	private List<CashCampaignInfo> campList;

	/** 
	 * 分页的页码,起始从1开始
	 */
	@ApiField("page_index")
	private String pageIndex;

	/** 
	 * 分页每页大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 活动总个数
	 */
	@ApiField("total_size")
	private String totalSize;

    /**
     * Sets camp list.
     *
     * @param campList the camp list
     */
    public void setCampList(List<CashCampaignInfo> campList) {
		this.campList = campList;
	}

    /**
     * Gets camp list.
     *
     * @return the camp list
     */
    public List<CashCampaignInfo> getCampList( ) {
		return this.campList;
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
     * Gets page index.
     *
     * @return the page index
     */
    public String getPageIndex( ) {
		return this.pageIndex;
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
     * Gets page size.
     *
     * @return the page size
     */
    public String getPageSize( ) {
		return this.pageSize;
	}

    /**
     * Sets total size.
     *
     * @param totalSize the total size
     */
    public void setTotalSize(String totalSize) {
		this.totalSize = totalSize;
	}

    /**
     * Gets total size.
     *
     * @return the total size
     */
    public String getTotalSize( ) {
		return this.totalSize;
	}

}
