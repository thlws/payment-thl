package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营商渠道类型
 *
 * @author auto create
 * @since 1.0, 2017-10-27 09:36:37
 */
public class OperatorChannelInfo extends AlipayObject {

	private static final long serialVersionUID = 5328758739742278472L;

	/**
	 * 渠道编码
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 渠道描述
	 */
	@ApiField("item_desc")
	private String itemDesc;

	/**
	 * 渠道名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 渠道是否可用
	 */
	@ApiField("item_status")
	private String itemStatus;

    /**
     * Gets item code.
     *
     * @return the item code
     */
    public String getItemCode() {
		return this.itemCode;
	}

    /**
     * Sets item code.
     *
     * @param itemCode the item code
     */
    public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

    /**
     * Gets item desc.
     *
     * @return the item desc
     */
    public String getItemDesc() {
		return this.itemDesc;
	}

    /**
     * Sets item desc.
     *
     * @param itemDesc the item desc
     */
    public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

    /**
     * Gets item name.
     *
     * @return the item name
     */
    public String getItemName() {
		return this.itemName;
	}

    /**
     * Sets item name.
     *
     * @param itemName the item name
     */
    public void setItemName(String itemName) {
		this.itemName = itemName;
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

}
