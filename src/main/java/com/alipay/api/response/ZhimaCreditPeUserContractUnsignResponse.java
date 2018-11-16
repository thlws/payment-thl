package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.user.contract.unsign response.
 *
 * @author auto create
 * @since 1.0, 2018-09-11 17:05:01
 */
public class ZhimaCreditPeUserContractUnsignResponse extends AlipayResponse {

	private static final long serialVersionUID = 2296389155256361269L;

	/** 
	 * 解约时间，格式：yyyy-MM-dd hh:mm:ss
	 */
	@ApiField("operate_time")
	private String operateTime;

	/** 
	 * 服务签约号，解约成功后，接口返回
	 */
	@ApiField("sign_id")
	private String signId;

    /**
     * Sets operate time.
     *
     * @param operateTime the operate time
     */
    public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}

    /**
     * Gets operate time.
     *
     * @return the operate time
     */
    public String getOperateTime( ) {
		return this.operateTime;
	}

    /**
     * Sets sign id.
     *
     * @param signId the sign id
     */
    public void setSignId(String signId) {
		this.signId = signId;
	}

    /**
     * Gets sign id.
     *
     * @return the sign id
     */
    public String getSignId( ) {
		return this.signId;
	}

}
