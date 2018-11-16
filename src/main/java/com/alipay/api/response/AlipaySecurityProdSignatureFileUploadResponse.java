package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.signature.file.upload response.
 *
 * @author auto create
 * @since 1.0, 2017-12-20 15:24:53
 */
public class AlipaySecurityProdSignatureFileUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 7468387713381745553L;

	/** 
	 * 文件唯一标识，用于apply接口传入
	 */
	@ApiField("oss_file_id")
	private String ossFileId;

    /**
     * Sets oss file id.
     *
     * @param ossFileId the oss file id
     */
    public void setOssFileId(String ossFileId) {
		this.ossFileId = ossFileId;
	}

    /**
     * Gets oss file id.
     *
     * @return the oss file id
     */
    public String getOssFileId( ) {
		return this.ossFileId;
	}

}
