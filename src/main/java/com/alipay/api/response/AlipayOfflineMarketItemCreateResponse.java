package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.item.create response.
 *
 * @author auto create
 * @since 1.0, 2018-07-12 12:22:21
 */
public class AlipayOfflineMarketItemCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1231377817818183341L;

	/** 
	 * 口碑体系内部商品的唯一标识，后续的增删改查接口都使用该ID作为主键
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 支持英文字母和数字，由开发者自行定义（不允许重复），在商品notify消息中也会带有该参数，以此标明本次notify消息是对哪个请求的回应
	 */
	@ApiField("request_id")
	private String requestId;

    /**
     * Sets item id.
     *
     * @param itemId the item id
     */
    public void setItemId(String itemId) {
		this.itemId = itemId;
	}

    /**
     * Gets item id.
     *
     * @return the item id
     */
    public String getItemId( ) {
		return this.itemId;
	}

    /**
     * Sets request id.
     *
     * @param requestId the request id
     */
    public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

    /**
     * Gets request id.
     *
     * @return the request id
     */
    public String getRequestId( ) {
		return this.requestId;
	}

}
