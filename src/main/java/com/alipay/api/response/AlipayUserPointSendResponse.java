package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.point.send response.
 *
 * @author auto create
 * @since 1.0, 2018-04-23 13:25:00
 */
public class AlipayUserPointSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 1425256824618871539L;

	/** 
	 * 实际给用户发放的积分数，由于单个用户有日限额，所以实际发放的积分数可能小于请求发放的积分数
	 */
	@ApiField("send_point")
	private Long sendPoint;

    /**
     * Sets send point.
     *
     * @param sendPoint the send point
     */
    public void setSendPoint(Long sendPoint) {
		this.sendPoint = sendPoint;
	}

    /**
     * Gets send point.
     *
     * @return the send point
     */
    public Long getSendPoint( ) {
		return this.sendPoint;
	}

}
