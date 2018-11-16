package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡模板批量查询
 *
 * @author auto create
 * @since 1.0, 2018-07-16 15:34:04
 */
public class AlipayMarketingCardTemplateBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1485768969631685172L;

	/**
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页大小，默认20条，最大支持20条
	 */
	@ApiField("page_size")
	private Long pageSize;

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

}
