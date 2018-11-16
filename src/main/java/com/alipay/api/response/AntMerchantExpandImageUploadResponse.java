package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.image.upload response.
 *
 * @author auto create
 * @since 1.0, 2018-05-23 11:30:21
 */
public class AntMerchantExpandImageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 4794389361157938665L;

	/** 
	 * 图片在sfs中的标识
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
