package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.zdatafront.datatransfered.fileupload response.
 *
 * @author auto create
 * @since 1.0, 2017-05-02 14:41:11
 */
public class AlipayZdatafrontDatatransferedFileuploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 2586139136388468125L;

	/** 
	 * 返回用户数据推送产生的结果数据，如picPath为文件上传后返回文件内部存储的位置信息
	 */
	@ApiField("result_data")
	private String resultData;

	/** 
	 * 数据上传结果，true/false
	 */
	@ApiField("success")
	private String success;

    /**
     * Sets result data.
     *
     * @param resultData the result data
     */
    public void setResultData(String resultData) {
		this.resultData = resultData;
	}

    /**
     * Gets result data.
     *
     * @return the result data
     */
    public String getResultData( ) {
		return this.resultData;
	}

    /**
     * Sets success.
     *
     * @param success the success
     */
    public void setSuccess(String success) {
		this.success = success;
	}

    /**
     * Gets success.
     *
     * @return the success
     */
    public String getSuccess( ) {
		return this.success;
	}

}
