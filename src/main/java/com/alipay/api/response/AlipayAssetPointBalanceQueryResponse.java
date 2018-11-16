package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.point.balance.query response.
 *
 * @author auto create
 * @since 1.0, 2017-04-14 19:00:47
 */
public class AlipayAssetPointBalanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4472477566732195763L;

	/** 
	 * 用户的集分宝余额
	 */
	@ApiField("point_amount")
	private Long pointAmount;

    /**
     * Sets point amount.
     *
     * @param pointAmount the point amount
     */
    public void setPointAmount(Long pointAmount) {
		this.pointAmount = pointAmount;
	}

    /**
     * Gets point amount.
     *
     * @return the point amount
     */
    public Long getPointAmount( ) {
		return this.pointAmount;
	}

}
