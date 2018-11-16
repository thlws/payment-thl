package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于服务商回查服务市场订单明细信息
 *
 * @author auto create
 * @since 1.0, 2018-07-06 14:47:25
 */
public class AlipayOpenServicemarketOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6317329862323711414L;

	/**
	 * 商户订单ID号
	 */
	@ApiField("commodity_order_id")
	private String commodityOrderId;

	/**
	 * 从第几页开始查询
	 */
	@ApiField("start_page")
	private String startPage;

    /**
     * Gets commodity order id.
     *
     * @return the commodity order id
     */
    public String getCommodityOrderId() {
		return this.commodityOrderId;
	}

    /**
     * Sets commodity order id.
     *
     * @param commodityOrderId the commodity order id
     */
    public void setCommodityOrderId(String commodityOrderId) {
		this.commodityOrderId = commodityOrderId;
	}

    /**
     * Gets start page.
     *
     * @return the start page
     */
    public String getStartPage() {
		return this.startPage;
	}

    /**
     * Sets start page.
     *
     * @param startPage the start page
     */
    public void setStartPage(String startPage) {
		this.startPage = startPage;
	}

}
