package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.point.receive.query response.
 *
 * @author auto create
 * @since 1.0, 2017-09-28 11:03:00
 */
public class AlipayInsAutoPointReceiveQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5694956985986312632L;

	/** 
	 * 本次可攒积分。
例如，攒油活动，返回本次可攒油量，单位ml
	 */
	@ApiField("save_amount")
	private Long saveAmount;

    /**
     * Sets save amount.
     *
     * @param saveAmount the save amount
     */
    public void setSaveAmount(Long saveAmount) {
		this.saveAmount = saveAmount;
	}

    /**
     * Gets save amount.
     *
     * @return the save amount
     */
    public Long getSaveAmount( ) {
		return this.saveAmount;
	}

}
