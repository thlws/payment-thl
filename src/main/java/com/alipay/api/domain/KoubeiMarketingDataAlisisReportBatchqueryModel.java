package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报表列表查询接口
 *
 * @author auto create
 * @since 1.0, 2018-05-03 09:40:58
 */
public class KoubeiMarketingDataAlisisReportBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2574739888245679334L;

	/**
	 * 当前页码
	 */
	@ApiField("page")
	private String page;

	/**
	 * 每页最大条数，最大为30
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
