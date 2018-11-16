package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道查询接口
 *
 * @author auto create
 * @since 1.0, 2017-03-03 10:41:12
 */
public class KoubeiAdvertCommissionChannelBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3716311367887862663L;

	/**
	 * 页码
	 */
	@ApiField("page_index")
	private String pageIndex;

	/**
	 * 每页数量
	 */
	@ApiField("page_size")
	private String pageSize;

    /**
     * Gets page index.
     *
     * @return the page index
     */
    public String getPageIndex() {
		return this.pageIndex;
	}

    /**
     * Sets page index.
     *
     * @param pageIndex the page index
     */
    public void setPageIndex(String pageIndex) {
		this.pageIndex = pageIndex;
	}

    /**
     * Gets page size.
     *
     * @return the page size
     */
    public String getPageSize() {
		return this.pageSize;
	}

    /**
     * Sets page size.
     *
     * @param pageSize the page size
     */
    public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

}
