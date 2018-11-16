package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InventoryRecord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.inventoryrecord.query response.
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:33:32
 */
public class KoubeiRetailWmsInventoryrecordQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6391498118191999672L;

	/** 
	 * 库存变更记录
	 */
	@ApiListField("inventory_record_list")
	@ApiField("inventory_record")
	private List<InventoryRecord> inventoryRecordList;

	/** 
	 * 页码
	 */
	@ApiField("page_no")
	private String pageNo;

	/** 
	 * 页码大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 总记录数
	 */
	@ApiField("total_count")
	private String totalCount;

    /**
     * Sets inventory record list.
     *
     * @param inventoryRecordList the inventory record list
     */
    public void setInventoryRecordList(List<InventoryRecord> inventoryRecordList) {
		this.inventoryRecordList = inventoryRecordList;
	}

    /**
     * Gets inventory record list.
     *
     * @return the inventory record list
     */
    public List<InventoryRecord> getInventoryRecordList( ) {
		return this.inventoryRecordList;
	}

    /**
     * Sets page no.
     *
     * @param pageNo the page no
     */
    public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

    /**
     * Gets page no.
     *
     * @return the page no
     */
    public String getPageNo( ) {
		return this.pageNo;
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
     * Sets total count.
     *
     * @param totalCount the total count
     */
    public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

    /**
     * Gets total count.
     *
     * @return the total count
     */
    public String getTotalCount( ) {
		return this.totalCount;
	}

}
