package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.stock.query response.
 *
 * @author auto create
 * @since 1.0, 2018-02-02 14:46:25
 */
public class AlipayMarketingVoucherStockQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1543134637119625273L;

	/** 
	 * 剩余可用库存数量
	 */
	@ApiField("available_count")
	private Long availableCount;

	/** 
	 * 库存总量
	 */
	@ApiField("total_count")
	private Long totalCount;

    /**
     * Sets available count.
     *
     * @param availableCount the available count
     */
    public void setAvailableCount(Long availableCount) {
		this.availableCount = availableCount;
	}

    /**
     * Gets available count.
     *
     * @return the available count
     */
    public Long getAvailableCount( ) {
		return this.availableCount;
	}

    /**
     * Sets total count.
     *
     * @param totalCount the total count
     */
    public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

    /**
     * Gets total count.
     *
     * @return the total count
     */
    public Long getTotalCount( ) {
		return this.totalCount;
	}

}
