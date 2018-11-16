package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.shop.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-08-02 12:21:39
 */
public class AlipayOfflineMarketShopBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2751449453352286831L;

	/** 
	 * 当前页码
	 */
	@ApiField("current_pageno")
	private String currentPageno;

	/** 
	 * 门店列表ID，逗号分隔
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	/** 
	 * 总页码数目
	 */
	@ApiField("total_pageno")
	private String totalPageno;

    /**
     * Sets current pageno.
     *
     * @param currentPageno the current pageno
     */
    public void setCurrentPageno(String currentPageno) {
		this.currentPageno = currentPageno;
	}

    /**
     * Gets current pageno.
     *
     * @return the current pageno
     */
    public String getCurrentPageno( ) {
		return this.currentPageno;
	}

    /**
     * Sets shop ids.
     *
     * @param shopIds the shop ids
     */
    public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

    /**
     * Gets shop ids.
     *
     * @return the shop ids
     */
    public List<String> getShopIds( ) {
		return this.shopIds;
	}

    /**
     * Sets total pageno.
     *
     * @param totalPageno the total pageno
     */
    public void setTotalPageno(String totalPageno) {
		this.totalPageno = totalPageno;
	}

    /**
     * Gets total pageno.
     *
     * @return the total pageno
     */
    public String getTotalPageno( ) {
		return this.totalPageno;
	}

}
