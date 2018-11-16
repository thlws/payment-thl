package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.user.point.receive response.
 *
 * @author auto create
 * @since 1.0, 2017-09-28 11:02:58
 */
public class AlipayInsAutoUserPointReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 2687197257641249525L;

	/** 
	 * 本次成功积攒的积分量
如攒油活动，则是本次积攒油量，单位ml
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
