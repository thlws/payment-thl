package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.UnfreezeOrderDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.micropay.order.unfreeze response.
 *
 * @author auto create
 * @since 1.0, 2016-06-06 17:54:23
 */
public class AlipayMicropayOrderUnfreezeResponse extends AlipayResponse {

	private static final long serialVersionUID = 6797124319467941677L;

	/** 
	 * 冻结订单详情结果
	 */
	@ApiField("unfreeze_order_detail")
	private UnfreezeOrderDetail unfreezeOrderDetail;

    /**
     * Sets unfreeze order detail.
     *
     * @param unfreezeOrderDetail the unfreeze order detail
     */
    public void setUnfreezeOrderDetail(UnfreezeOrderDetail unfreezeOrderDetail) {
		this.unfreezeOrderDetail = unfreezeOrderDetail;
	}

    /**
     * Gets unfreeze order detail.
     *
     * @return the unfreeze order detail
     */
    public UnfreezeOrderDetail getUnfreezeOrderDetail( ) {
		return this.unfreezeOrderDetail;
	}

}
