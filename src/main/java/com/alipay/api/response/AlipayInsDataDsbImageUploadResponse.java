package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.data.dsb.image.upload response.
 *
 * @author auto create
 * @since 1.0, 2017-11-10 14:37:15
 */
public class AlipayInsDataDsbImageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 4722541354368822752L;

	/** 
	 * 图像文件在oss存储上的路径
	 */
	@ApiField("image_path")
	private String imagePath;

    /**
     * Sets image path.
     *
     * @param imagePath the image path
     */
    public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

    /**
     * Gets image path.
     *
     * @return the image path
     */
    public String getImagePath( ) {
		return this.imagePath;
	}

}
