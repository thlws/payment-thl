package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.gift.stock.upload response.
 *
 * @author auto create
 * @since 1.0, 2018-09-10 17:26:18
 */
public class AlipaySocialGiftStockUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 4445663489988892276L;

	/** 
	 * 重复条数
	 */
	@ApiField("duplicate_count")
	private Long duplicateCount;

	/** 
	 * 失败条数
	 */
	@ApiField("fail_count")
	private Long failCount;

	/** 
	 * 成功条数
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
