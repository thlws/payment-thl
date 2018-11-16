package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务订单明细实施项单项取消
 *
 * @author auto create
 * @since 1.0, 2018-07-06 14:51:53
 */
public class AlipayOpenServicemarketOrderItemCancelModel extends AlipayObject {

	private static final long serialVersionUID = 8493838188364871684L;

	/**
	 * 当前门店区域不支持实施
	 */
	@ApiField("cancel_reason")
	private String cancelReason;

	/**
	 * 订购服务订单ID
	 */
	@ApiField("commodity_order_id")
	private String commodityOrderId;

	/**
	 * 商家订购服务选择的某一小程序的APPID，如果该订单为蚂蚁服务市场发布的小程序插件服务所产生的订单，则此字段必填
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 商家订购服务选择的某一门店的ID，如果该订单为口碑服务市场发布的服务所产生的订单，则此字段必填
	 */
	@ApiField("shop_id")
	private String shopId;

    /**
     * Gets cancel reason.
     *
     * @return the cancel reason
     */
    public String getCancelReason() {
		return this.cancelReason;
	}

    /**
     * Sets cancel reason.
     *
     * @param cancelReason the cancel reason
     */
    public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

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
     * Gets mini app id.
     *
     * @return the mini app id
     */
    public String getMiniAppId() {
		return this.miniAppId;
	}

    /**
     * Sets mini app id.
     *
     * @param miniAppId the mini app id
     */
    public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

    /**
     * Gets shop id.
     *
     * @return the shop id
     */
    public String getShopId() {
		return this.shopId;
	}

    /**
     * Sets shop id.
     *
     * @param shopId the shop id
     */
    public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
