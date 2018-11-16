package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerversion.preview.upload response.
 *
 * @author auto create
 * @since 1.0, 2018-02-26 16:16:43
 */
public class AlipayOpenMiniInnerversionPreviewUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 2324219795894462334L;

	/** 
	 * 构建好的包地址
	 */
	@ApiField("build_package_url")
	private String buildPackageUrl;

    /**
     * Sets build package url.
     *
     * @param buildPackageUrl the build package url
     */
    public void setBuildPackageUrl(String buildPackageUrl) {
		this.buildPackageUrl = buildPackageUrl;
	}

    /**
     * Gets build package url.
     *
     * @return the build package url
     */
    public String getBuildPackageUrl( ) {
		return this.buildPackageUrl;
	}

}
