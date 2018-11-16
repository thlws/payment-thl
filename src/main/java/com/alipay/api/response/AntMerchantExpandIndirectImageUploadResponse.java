package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.image.upload response.
 *
 * @author auto create
 * @since 1.0, 2018-08-17 15:55:00
 */
public class AntMerchantExpandIndirectImageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6175535371325782467L;

	/** 
	 * 图片在文件存储平台的标识
	 */
	@ApiField("image_id")
	private String imageId;

    /**
     * Sets image id.
     *
     * @param imageId the image id
     */
    public void setImageId(String imageId) {
		this.imageId = imageId;
	}

    /**
     * Gets image id.
     *
     * @return the image id
     */
    public String getImageId( ) {
		return this.imageId;
	}

}
