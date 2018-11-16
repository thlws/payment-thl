package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车牌识别
 *
 * @author auto create
 * @since 1.0, 2018-05-09 12:20:04
 */
public class AlipayIserviceCognitiveOcrVehicleplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2753948397459319233L;

	/**
	 * 车牌图片base64加密后内容
	 */
	@ApiField("image_content")
	private String imageContent;

    /**
     * Gets image content.
     *
     * @return the image content
     */
    public String getImageContent() {
		return this.imageContent;
	}

    /**
     * Sets image content.
     *
     * @param imageContent the image content
     */
    public void setImageContent(String imageContent) {
		this.imageContent = imageContent;
	}

}
