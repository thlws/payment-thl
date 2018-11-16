package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定义数据报表列表分页查询接口
 *
 * @author auto create
 * @since 1.0, 2018-07-26 14:04:05
 */
public class KoubeiMarketingDataCustomreportBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7615779885538766971L;

	/**
	 * 当前页号，默认为1
	 */
	@ApiField("page_no")
	private String pageNo;

	/**
	 * 每页条目数，默认为20,最大为30
	 */
	@ApiField("page_size")
	private String pageSize;

    /**
     * Gets page no.
     *
     * @return the page no
     */
    public String getPageNo() {
		return this.pageNo;
	}

    /**
     * Sets page no.
     *
     * @param pageNo the page no
     */
    public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
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
