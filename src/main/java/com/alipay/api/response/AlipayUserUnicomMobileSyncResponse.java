package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.unicom.mobile.sync response.
 *
 * @author auto create
 * @since 1.0, 2017-11-29 23:15:30
 */
public class AlipayUserUnicomMobileSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6753598955834794732L;

	/** 
	 * 业务处理结果（成功: SUCCESS, 失败: FAIL, 重试: RETRY）
	 */
	@ApiField("mobile_sync_result")
	private String mobileSyncResult;

	/** 
	 * 回传的业务流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

    /**
     * Sets mobile sync result.
     *
     * @param mobileSyncResult the mobile sync result
     */
    public void setMobileSyncResult(String mobileSyncResult) {
		this.mobileSyncResult = mobileSyncResult;
	}

    /**
     * Gets mobile sync result.
     *
     * @return the mobile sync result
     */
    public String getMobileSyncResult( ) {
		return this.mobileSyncResult;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
