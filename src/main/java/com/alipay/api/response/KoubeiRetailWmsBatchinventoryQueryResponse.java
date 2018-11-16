package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Inventory;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.batchinventory.query response.
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:34:08
 */
public class KoubeiRetailWmsBatchinventoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5148134963789927286L;

	/** 
	 * 库存信息列表
	 */
	@ApiListField("inventory_list")
	@ApiField("inventory")
	private List<Inventory> inventoryList;

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

}
