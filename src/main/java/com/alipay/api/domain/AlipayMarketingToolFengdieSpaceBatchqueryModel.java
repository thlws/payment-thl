package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询空间列表
 *
 * @author auto create
 * @since 1.0, 2018-08-19 16:17:14
 */
public class AlipayMarketingToolFengdieSpaceBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2546572921259525715L;

	/**
	 * 当前页数，默认为1
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/**
	 * 每页记录数，不能超过50，默认为10
	 */
	@ApiField("page_size")
	private Long pageSize;

    /**
     * Gets page number.
     *
     * @return the page number
     */
    public Long getPageNumber() {
		return this.pageNumber;
	}

    /**
     * Sets page number.
     *
     * @param pageNumber the page number
     */
    public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
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
