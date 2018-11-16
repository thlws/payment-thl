package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部商户券码券查询
 *
 * @author auto create
 * @since 1.0, 2018-02-02 14:45:45
 */
public class AlipayMarketingVoucherStockQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1669994286524442478L;

	/**
	 * 库存ID, 库存创建接口返回
	 */
	@ApiField("stock_id")
	private String stockId;

    /**
     * Gets stock id.
     *
     * @return the stock id
     */
    public String getStockId() {
		return this.stockId;
	}

    /**
     * Sets stock id.
     *
     * @param stockId the stock id
     */
    public void setStockId(String stockId) {
		this.stockId = stockId;
	}

}
