package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.maintain.shop.create response.
 *
 * @author auto create
 * @since 1.0, 2017-07-13 14:23:36
 */
public class AlipayEcoMycarMaintainShopCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6342441198974629893L;

	/** 
	 * 车主平台创建的门店编号
	 */
	@ApiField("shop_id")
	private Long shopId;

    /**
     * Sets shop id.
     *
     * @param shopId the shop id
     */
    public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

    /**
     * Gets shop id.
     *
     * @return the shop id
     */
    public Long getShopId( ) {
		return this.shopId;
	}

}
