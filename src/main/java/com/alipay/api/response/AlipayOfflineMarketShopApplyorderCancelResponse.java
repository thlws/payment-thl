package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.shop.applyorder.cancel response.
 *
 * @author auto create
 * @since 1.0, 2018-03-27 17:07:06
 */
public class AlipayOfflineMarketShopApplyorderCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 6431645534863424477L;

	/** 
	 * 申请撤销成功接口同步返回的支付宝申请流水号。
	 */
	@ApiField("apply_id")
	private String applyId;

    /**
     * Sets apply id.
     *
     * @param applyId the apply id
     */
    public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

    /**
     * Gets apply id.
     *
     * @return the apply id
     */
    public String getApplyId( ) {
		return this.applyId;
	}

}
