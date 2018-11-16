package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.renthouse.community.info.sync response.
 *
 * @author auto create
 * @since 1.0, 2017-12-22 17:21:14
 */
public class AlipayEcoRenthouseCommunityInfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1622889517664449461L;

	/** 
	 * 小区同步请求号
	 */
	@ApiField("comm_req_id")
	private String commReqId;

	/** 
	 * 小区同步状态
	 */
	@ApiField("status")
	private Long status;

    /**
     * Sets comm req id.
     *
     * @param commReqId the comm req id
     */
    public void setCommReqId(String commReqId) {
		this.commReqId = commReqId;
	}

    /**
     * Gets comm req id.
     *
     * @return the comm req id
     */
    public String getCommReqId( ) {
		return this.commReqId;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(Long status) {
		this.status = status;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public Long getStatus( ) {
		return this.status;
	}

}
