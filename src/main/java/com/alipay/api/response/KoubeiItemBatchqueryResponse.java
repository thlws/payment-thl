package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemQueryResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.item.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-06-15 08:40:00
 */
public class KoubeiItemBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3579346719813477224L;

	/** 
	 * 当前页码
	 */
	@ApiField("current_page_no")
	private String currentPageNo;

	/** 
	 * 商品信息
	 */
	@ApiListField("item_infos")
	@ApiField("item_query_response")
	private List<ItemQueryResponse> itemInfos;

	/** 
	 * 每页记录数
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 总共商品数目
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
     * Sets item infos.
     *
     * @param itemInfos the item infos
     */
    public void setItemInfos(List<ItemQueryResponse> itemInfos) {
		this.itemInfos = itemInfos;
	}

    /**
     * Gets item infos.
     *
     * @return the item infos
     */
    public List<ItemQueryResponse> getItemInfos( ) {
		return this.itemInfos;
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
