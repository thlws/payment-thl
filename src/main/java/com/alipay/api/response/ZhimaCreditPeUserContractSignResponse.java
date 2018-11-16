package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.user.contract.sign response.
 *
 * @author auto create
 * @since 1.0, 2018-09-05 11:36:05
 */
public class ZhimaCreditPeUserContractSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 4854198142546757717L;

	/** 
	 * 签约时间，格式：yyyy-MM-dd hh:mm:ss
	 */
	@ApiField("operate_time")
	private String operateTime;

	/** 
	 * 服务签约号，签约成功后，接口返回
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
