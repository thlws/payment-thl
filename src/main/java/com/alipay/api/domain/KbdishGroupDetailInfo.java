package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 组明细
 *
 * @author auto create
 * @since 1.0, 2018-09-14 15:09:11
 */
public class KbdishGroupDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 5775721979158614824L;

	/**
	 * 组下明细的加价单价 例如加2元 加3元
	 */
	@ApiField("add_price")
	private String addPrice;

	/**
	 * 明细菜品在套餐里的个数,
	 */
	@ApiField("detail_count")
	private String detailCount;

	/**
	 * 菜品id
	 */
	@ApiField("detail_dish_id")
	private String detailDishId;

	/**
	 * 组下面的菜品是否默认 Y/N
	 */
	@ApiField("detail_is_default")
	private String detailIsDefault;

	/**
	 * 分组下包含的明细菜品的dish_code
	 */
	@ApiField("detail_sku_id")
	private String detailSkuId;

	/**
	 * 排序字典
	 */
	@ApiField("detail_sort")
	private String detailSort;

	/**
	 * 组id
	 */
	@ApiField("group_id")
	private String groupId;

    /**
     * Gets add price.
     *
     * @return the add price
     */
    public String getAddPrice() {
		return this.addPrice;
	}

    /**
     * Sets add price.
     *
     * @param addPrice the add price
     */
    public void setAddPrice(String addPrice) {
		this.addPrice = addPrice;
	}

    /**
     * Gets detail count.
     *
     * @return the detail count
     */
    public String getDetailCount() {
		return this.detailCount;
	}

    /**
     * Sets detail count.
     *
     * @param detailCount the detail count
     */
    public void setDetailCount(String detailCount) {
		this.detailCount = detailCount;
	}

    /**
     * Gets detail dish id.
     *
     * @return the detail dish id
     */
    public String getDetailDishId() {
		return this.detailDishId;
	}

    /**
     * Sets detail dish id.
     *
     * @param detailDishId the detail dish id
     */
    public void setDetailDishId(String detailDishId) {
		this.detailDishId = detailDishId;
	}

    /**
     * Gets detail is default.
     *
     * @return the detail is default
     */
    public String getDetailIsDefault() {
		return this.detailIsDefault;
	}

    /**
     * Sets detail is default.
     *
     * @param detailIsDefault the detail is default
     */
    public void setDetailIsDefault(String detailIsDefault) {
		this.detailIsDefault = detailIsDefault;
	}

    /**
     * Gets detail sku id.
     *
     * @return the detail sku id
     */
    public String getDetailSkuId() {
		return this.detailSkuId;
	}

    /**
     * Sets detail sku id.
     *
     * @param detailSkuId the detail sku id
     */
    public void setDetailSkuId(String detailSkuId) {
		this.detailSkuId = detailSkuId;
	}

    /**
     * Gets detail sort.
     *
     * @return the detail sort
     */
    public String getDetailSort() {
		return this.detailSort;
	}

    /**
     * Sets detail sort.
     *
     * @param detailSort the detail sort
     */
    public void setDetailSort(String detailSort) {
		this.detailSort = detailSort;
	}

    /**
     * Gets group id.
     *
     * @return the group id
     */
    public String getGroupId() {
		return this.groupId;
	}

    /**
     * Sets group id.
     *
     * @param groupId the group id
     */
    public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

}
