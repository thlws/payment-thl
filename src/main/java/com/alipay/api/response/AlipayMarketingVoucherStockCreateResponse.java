package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.stock.create response.
 *
 * @author auto create
 * @since 1.0, 2018-02-02 14:47:38
 */
public class AlipayMarketingVoucherStockCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3239946627196885711L;

	/** 
	 * 本次重复导入数量
	 */
	@ApiField("duplicate_count")
	private Long duplicateCount;

	/** 
	 * 本次导入失败数量
	 */
	@ApiField("fail_count")
	private Long failCount;

	/** 
	 * 库存ID, 用于后续追加和查询库存
	 */
	@ApiField("stock_id")
	private String stockId;

	/** 
	 * 本次导入成功数量
	 */
	@ApiField("success_count")
	private Long successCount;

    /**
     * Sets duplicate count.
     *
     * @param duplicateCount the duplicate count
     */
    public void setDuplicateCount(Long duplicateCount) {
		this.duplicateCount = duplicateCount;
	}

    /**
     * Gets duplicate count.
     *
     * @return the duplicate count
     */
    public Long getDuplicateCount( ) {
		return this.duplicateCount;
	}

    /**
     * Sets fail count.
     *
     * @param failCount the fail count
     */
    public void setFailCount(Long failCount) {
		this.failCount = failCount;
	}

    /**
     * Gets fail count.
     *
     * @return the fail count
     */
    public Long getFailCount( ) {
		return this.failCount;
	}

    /**
     * Sets stock id.
     *
     * @param stockId the stock id
     */
    public void setStockId(String stockId) {
		this.stockId = stockId;
	}

    /**
     * Gets stock id.
     *
     * @return the stock id
     */
    public String getStockId( ) {
		return this.stockId;
	}

    /**
     * Sets success count.
     *
     * @param successCount the success count
     */
    public void setSuccessCount(Long successCount) {
		this.successCount = successCount;
	}

    /**
     * Gets success count.
     *
     * @return the success count
     */
    public Long getSuccessCount( ) {
		return this.successCount;
	}

}
