package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑零售生产厂商信息查询
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:17:39
 */
public class KoubeiRetailWmsProducerQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4535154894526435891L;

	/**
	 * 页码，分页参数，默认1。
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 页面大小，分页参数，默认20
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
