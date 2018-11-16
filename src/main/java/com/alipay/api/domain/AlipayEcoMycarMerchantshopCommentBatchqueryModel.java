package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询评论信息
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:28:11
 */
public class AlipayEcoMycarMerchantshopCommentBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8458761996234937715L;

	/**
	 * 当前页号（从1开始）
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页数量，每页不超过100条。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private Long shopId;

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
     * Gets shop id.
     *
     * @return the shop id
     */
    public Long getShopId() {
		return this.shopId;
	}

    /**
     * Sets shop id.
     *
     * @param shopId the shop id
     */
    public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

}
