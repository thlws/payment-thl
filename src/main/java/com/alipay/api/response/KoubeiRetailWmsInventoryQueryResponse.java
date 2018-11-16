package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Inventory;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.inventory.query response.
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:33:18
 */
public class KoubeiRetailWmsInventoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5485936624737998131L;

	/** 
	 * 返回货品库存列表
	 */
	@ApiListField("inventory_list")
	@ApiField("inventory")
	private List<Inventory> inventoryList;

	/** 
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 页面大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总记录数
	 */
	@ApiField("total_count")
	private Long totalCount;

    /**
     * Sets inventory list.
     *
     * @param inventoryList the inventory list
     */
    public void setInventoryList(List<Inventory> inventoryList) {
		this.inventoryList = inventoryList;
	}

    /**
     * Gets inventory list.
     *
     * @return the inventory list
     */
    public List<Inventory> getInventoryList( ) {
		return this.inventoryList;
	}

    /**
     * Sets page no.
     *
     * @param pageNo the page no
     */
    public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

    /**
     * Gets page no.
     *
     * @return the page no
     */
    public Long getPageNo( ) {
		return this.pageNo;
	}

    /**
     * Sets page size.
     *
     * @param pageSize the page size
     */
    public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

    /**
     * Gets page size.
     *
     * @return the page size
     */
    public Long getPageSize( ) {
		return this.pageSize;
	}

    /**
     * Sets total count.
     *
     * @param totalCount the total count
     */
    public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

    /**
     * Gets total count.
     *
     * @return the total count
     */
    public Long getTotalCount( ) {
		return this.totalCount;
	}

}
