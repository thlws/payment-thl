package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.ocr.imageclassify.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-03 12:05:00
 */
public class AlipayIserviceCognitiveOcrImageclassifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5511742981322784932L;

	/** 
	 * 图像分类类型
	 */
	@ApiField("image_type")
	private String imageType;

    /**
     * Sets image type.
     *
     * @param imageType the image type
     */
    public void setImageType(String imageType) {
		this.imageType = imageType;
	}

    /**
     * Gets image type.
     *
     * @return the image type
     */
    public String getImageType( ) {
		return this.imageType;
	}

}
