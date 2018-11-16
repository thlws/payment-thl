package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.entity.monitor.set response.
 *
 * @author auto create
 * @since 1.0, 2018-03-22 19:33:51
 */
public class ZhimaCreditEpEntityMonitorSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8881985948762473544L;

	/** 
	 * 添加成功返回true, 失败返回false
	 */
	@ApiField("biz_success")
	private Boolean bizSuccess;

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

}
