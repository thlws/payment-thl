package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料采购单获取接口
 *
 * @author auto create
 * @since 1.0, 2017-11-21 17:41:37
 */
public class KoubeiSalesKbassetStuffPurchaseorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4623542327144329232L;

	/**
	 * 每页大小：最小1，最大100
	 */
	@ApiField("page_size")
	private String pageSize;

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
