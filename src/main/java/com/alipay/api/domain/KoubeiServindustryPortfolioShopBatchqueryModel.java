package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询作品集信息
 *
 * @author auto create
 * @since 1.0, 2017-12-28 13:57:13
 */
public class KoubeiServindustryPortfolioShopBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5362984427395233272L;

	/**
	 * 插件id
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/**
	 * 当前页码；页码必须大于等于1；最大值：100
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 分页大小;默认值：20；最大值：100
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

    /**
     * Gets commodity id.
     *
     * @return the commodity id
     */
    public String getCommodityId() {
		return this.commodityId;
	}

    /**
     * Sets commodity id.
     *
     * @param commodityId the commodity id
     */
    public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

    /**
     * Gets page no.
     *
     * @return the page no
     */
    public Long getPageNo() {
		return this.pageNo;
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
