package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.metainfo.sync response.
 *
 * @author auto create
 * @since 1.0, 2017-08-11 16:11:08
 */
public class SsdataDataserviceMetainfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4882354791347921442L;

	/** 
	 * 是否同步成功
	 */
	@ApiField("is_sync_success")
	private Boolean isSyncSuccess;

	/** 
	 * 返回同步成功或者失败的信息
	 */
	@ApiField("sync_result")
	private String syncResult;

    /**
     * Sets is sync success.
     *
     * @param isSyncSuccess the is sync success
     */
    public void setIsSyncSuccess(Boolean isSyncSuccess) {
		this.isSyncSuccess = isSyncSuccess;
	}

    /**
     * Gets is sync success.
     *
     * @return the is sync success
     */
    public Boolean getIsSyncSuccess( ) {
		return this.isSyncSuccess;
	}

    /**
     * Sets sync result.
     *
     * @param syncResult the sync result
     */
    public void setSyncResult(String syncResult) {
		this.syncResult = syncResult;
	}

    /**
     * Gets sync result.
     *
     * @return the sync result
     */
    public String getSyncResult( ) {
		return this.syncResult;
	}

}
