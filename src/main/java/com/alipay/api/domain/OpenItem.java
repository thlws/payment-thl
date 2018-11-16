package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云验收单品
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class OpenItem extends AlipayObject {

	private static final long serialVersionUID = 8256796658389422274L;

	/**
	 * 单品编号
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 单品检测状态
0，未检测
1，未通过
2，已通过
	 */
	@ApiField("item_status")
	private String itemStatus;

	/**
	 * 门店id
	 */
	@ApiField("store_id")
	private String storeId;

    /**
     * Gets item id.
     *
     * @return the item id
     */
    public String getItemId() {
		return this.itemId;
	}

    /**
     * Sets item id.
     *
     * @param itemId the item id
     */
    public void setItemId(String itemId) {
		this.itemId = itemId;
	}

    /**
     * Gets item status.
     *
     * @return the item status
     */
    public String getItemStatus() {
		return this.itemStatus;
	}

    /**
     * Sets item status.
     *
     * @param itemStatus the item status
     */
    public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

    /**
     * Gets store id.
     *
     * @return the store id
     */
    public String getStoreId() {
		return this.storeId;
	}

    /**
     * Sets store id.
     *
     * @param storeId the store id
     */
    public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
