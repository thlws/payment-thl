package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.product.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2017-04-14 11:43:44
 */
public class AlipayOfflineMarketProductBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6583979941825891749L;

	/** 
	 * 当前页码
	 */
	@ApiField("current_pageno")
	private Long currentPageno;

	/** 
	 * 商品列表ID，逗号分隔
	 */
	@ApiListField("item_ids")
	@ApiField("string")
	private List<String> itemIds;

	/** 
	 * 总页码数
	 */
	@ApiField("total_pageno")
	private Long totalPageno;

    /**
     * Sets current pageno.
     *
     * @param currentPageno the current pageno
     */
    public void setCurrentPageno(Long currentPageno) {
		this.currentPageno = currentPageno;
	}

    /**
     * Gets current pageno.
     *
     * @return the current pageno
     */
    public Long getCurrentPageno( ) {
		return this.currentPageno;
	}

    /**
     * Sets item ids.
     *
     * @param itemIds the item ids
     */
    public void setItemIds(List<String> itemIds) {
		this.itemIds = itemIds;
	}

    /**
     * Gets item ids.
     *
     * @return the item ids
     */
    public List<String> getItemIds( ) {
		return this.itemIds;
	}

    /**
     * Sets total pageno.
     *
     * @param totalPageno the total pageno
     */
    public void setTotalPageno(Long totalPageno) {
		this.totalPageno = totalPageno;
	}

    /**
     * Gets total pageno.
     *
     * @return the total pageno
     */
    public Long getTotalPageno( ) {
		return this.totalPageno;
	}

}
