package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.item.state response.
 *
 * @author auto create
 * @since 1.0, 2018-06-21 11:05:00
 */
public class KoubeiItemStateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2173384672852798582L;

	/** 
	 * 口碑体系内部商品的唯一标识
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 即入参中的request_id
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
