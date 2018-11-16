package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.entity.monitor.upload response.
 *
 * @author auto create
 * @since 1.0, 2018-03-22 19:37:19
 */
public class ZhimaCreditEpEntityMonitorUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 4845472196585644266L;

	/** 
	 * 成功返回true,失败返回false
	 */
	@ApiField("biz_success")
	private Boolean bizSuccess;

	/** 
	 * 方案ID
	 */
	@ApiField("solution_id")
	private String solutionId;

    /**
     * Sets biz success.
     *
     * @param bizSuccess the biz success
     */
    public void setBizSuccess(Boolean bizSuccess) {
		this.bizSuccess = bizSuccess;
	}

    /**
     * Gets biz success.
     *
     * @return the biz success
     */
    public Boolean getBizSuccess( ) {
		return this.bizSuccess;
	}

    /**
     * Sets solution id.
     *
     * @param solutionId the solution id
     */
    public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}

    /**
     * Gets solution id.
     *
     * @return the solution id
     */
    public String getSolutionId( ) {
		return this.solutionId;
	}

}
