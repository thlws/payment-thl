package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShopSummaryQueryResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.shop.summary.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-07-11 16:55:00
 */
public class AlipayOfflineMarketShopSummaryBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2584757936656287611L;

	/** 
	 * 当前页码
	 */
	@ApiField("current_page_no")
	private String currentPageNo;

	/** 
	 * 每页记录数
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 支付宝门店摘要信息列表
	 */
	@ApiListField("shop_summary_infos")
	@ApiField("shop_summary_query_response")
	private List<ShopSummaryQueryResponse> shopSummaryInfos;

	/** 
	 * 总记录数
	 */
	@ApiField("total_items")
	private String totalItems;

	/** 
	 * 总页码数目
	 */
	@ApiField("total_page_no")
	private String totalPageNo;

    /**
     * Sets current page no.
     *
     * @param currentPageNo the current page no
     */
    public void setCurrentPageNo(String currentPageNo) {
		this.currentPageNo = currentPageNo;
	}

    /**
     * Gets current page no.
     *
     * @return the current page no
     */
    public String getCurrentPageNo( ) {
		return this.currentPageNo;
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
     * Sets shop summary infos.
     *
     * @param shopSummaryInfos the shop summary infos
     */
    public void setShopSummaryInfos(List<ShopSummaryQueryResponse> shopSummaryInfos) {
		this.shopSummaryInfos = shopSummaryInfos;
	}

    /**
     * Gets shop summary infos.
     *
     * @return the shop summary infos
     */
    public List<ShopSummaryQueryResponse> getShopSummaryInfos( ) {
		return this.shopSummaryInfos;
	}

    /**
     * Sets total items.
     *
     * @param totalItems the total items
     */
    public void setTotalItems(String totalItems) {
		this.totalItems = totalItems;
	}

    /**
     * Gets total items.
     *
     * @return the total items
     */
    public String getTotalItems( ) {
		return this.totalItems;
	}

    /**
     * Sets total page no.
     *
     * @param totalPageNo the total page no
     */
    public void setTotalPageNo(String totalPageNo) {
		this.totalPageNo = totalPageNo;
	}

    /**
     * Gets total page no.
     *
     * @return the total page no
     */
    public String getTotalPageNo( ) {
		return this.totalPageNo;
	}

}
