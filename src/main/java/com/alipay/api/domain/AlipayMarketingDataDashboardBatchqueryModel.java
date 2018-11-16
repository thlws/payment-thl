package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询云数据实验室仪表盘列表
 *
 * @author auto create
 * @since 1.0, 2017-01-18 22:20:32
 */
public class AlipayMarketingDataDashboardBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6666539184526711126L;

	/**
	 * 当前页码
	 */
	@ApiField("page")
	private String page;

	/**
	 * 每页最大条数，最大每页30条
	 */
	@ApiField("size")
	private String size;

    /**
     * Gets page.
     *
     * @return the page
     */
    public String getPage() {
		return this.page;
	}

    /**
     * Sets page.
     *
     * @param page the page
     */
    public void setPage(String page) {
		this.page = page;
	}

    /**
     * Gets size.
     *
     * @return the size
     */
    public String getSize() {
		return this.size;
	}

    /**
     * Sets size.
     *
     * @param size the size
     */
    public void setSize(String size) {
		this.size = size;
	}

}
