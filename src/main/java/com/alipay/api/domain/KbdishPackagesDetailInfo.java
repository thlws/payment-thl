package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品套餐组明细
 *
 * @author auto create
 * @since 1.0, 2018-09-11 15:26:51
 */
public class KbdishPackagesDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 4294882976795251946L;

	/**
	 * 明细菜品在套餐里的个数, 不填默认为1
	 */
	@ApiField("detail_count")
	private String detailCount;

	/**
	 * 是否追加可选 Y .N  明细是否追加可选
	 */
	@ApiField("detail_is_select")
	private String detailIsSelect;

	/**
	 * 明细菜品的会员价格单价
	 */
	@ApiField("detail_member_price")
	private String detailMemberPrice;

	/**
	 * 明细菜品在套餐里的售卖单价
	 */
	@ApiField("detail_sell_price")
	private String detailSellPrice;

	/**
	 * 套餐明细的skuId
	 */
	@ApiField("detail_sku_id")
	private String detailSkuId;

	/**
	 * 排序字段 必输 仅为数字 越小排在前面
	 */
	@ApiField("detail_sort")
	private String detailSort;

	/**
	 * 明细的类型，dish:单品 还是 group:项目
	 */
	@ApiField("detail_type")
	private String detailType;

	/**
	 * 套餐组id,如果类型是group 必须要填groupId
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 套餐的sku_code
	 */
	@ApiField("packages_sku_id")
	private String packagesSkuId;

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
     * Gets detail is select.
     *
     * @return the detail is select
     */
    public String getDetailIsSelect() {
		return this.detailIsSelect;
	}

    /**
     * Sets detail is select.
     *
     * @param detailIsSelect the detail is select
     */
    public void setDetailIsSelect(String detailIsSelect) {
		this.detailIsSelect = detailIsSelect;
	}

    /**
     * Gets detail member price.
     *
     * @return the detail member price
     */
    public String getDetailMemberPrice() {
		return this.detailMemberPrice;
	}

    /**
     * Sets detail member price.
     *
     * @param detailMemberPrice the detail member price
     */
    public void setDetailMemberPrice(String detailMemberPrice) {
		this.detailMemberPrice = detailMemberPrice;
	}

    /**
     * Gets detail sell price.
     *
     * @return the detail sell price
     */
    public String getDetailSellPrice() {
		return this.detailSellPrice;
	}

    /**
     * Sets detail sell price.
     *
     * @param detailSellPrice the detail sell price
     */
    public void setDetailSellPrice(String detailSellPrice) {
		this.detailSellPrice = detailSellPrice;
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
     * Gets detail type.
     *
     * @return the detail type
     */
    public String getDetailType() {
		return this.detailType;
	}

    /**
     * Sets detail type.
     *
     * @param detailType the detail type
     */
    public void setDetailType(String detailType) {
		this.detailType = detailType;
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

    /**
     * Gets packages sku id.
     *
     * @return the packages sku id
     */
    public String getPackagesSkuId() {
		return this.packagesSkuId;
	}

    /**
     * Sets packages sku id.
     *
     * @param packagesSkuId the packages sku id
     */
    public void setPackagesSkuId(String packagesSkuId) {
		this.packagesSkuId = packagesSkuId;
	}

}
