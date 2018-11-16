package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 脱机交易黑名单列表
 *
 * @author auto create
 * @since 1.0, 2016-07-01 22:05:43
 */
public class AlipayCommerceTransportOfflinepayUserblacklistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5112437273264157129L;

	/**
	 * 用户黑名单分页ID，1开始
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/**
	 * 脱机交易用户黑名单分页页大小，最大页大小不超过1000
	 */
	@ApiField("page_size")
	private Long pageSize;

    /**
     * Gets page index.
     *
     * @return the page index
     */
    public Long getPageIndex() {
		return this.pageIndex;
	}

    /**
     * Sets page index.
     *
     * @param pageIndex the page index
     */
    public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
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

}
