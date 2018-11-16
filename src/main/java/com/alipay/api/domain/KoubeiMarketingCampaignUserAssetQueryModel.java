package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户口碑优惠资产查询接口
 *
 * @author auto create
 * @since 1.0, 2018-03-21 15:19:49
 */
public class KoubeiMarketingCampaignUserAssetQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1559983563467389359L;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页显示数目(最大查询50)
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 查询范围:用户所有资产(USER_ALL_ASSET)，用户指定商户可用资产(USER_MERCHANT_ASSET),用户指定门店可用资产（USER_SHOP_ASSET）;指定USER_SHOP_ASSET必须传递shopid
	 */
	@ApiField("scope")
	private String scope;

	/**
	 * 门店id，如果查询范围是门店，门店id不能为空
	 */
	@ApiField("shop_id")
	private String shopId;

    /**
     * Gets page num.
     *
     * @return the page num
     */
    public Long getPageNum() {
		return this.pageNum;
	}

    /**
     * Sets page num.
     *
     * @param pageNum the page num
     */
    public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

    /**
     * Gets page size.
     *
     * @return the page size
     */
    public Long getPageSize() {
		return this.pageSize;
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
     * Gets scope.
     *
     * @return the scope
     */
    public String getScope() {
		return this.scope;
	}

    /**
     * Sets scope.
     *
     * @param scope the scope
     */
    public void setScope(String scope) {
		this.scope = scope;
	}

    /**
     * Gets shop id.
     *
     * @return the shop id
     */
    public String getShopId() {
		return this.shopId;
	}

    /**
     * Sets shop id.
     *
     * @param shopId the shop id
     */
    public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
