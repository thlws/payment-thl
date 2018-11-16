package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营业执照信息识别
 *
 * @author auto create
 * @since 1.0, 2018-05-14 23:14:36
 */
public class AlipayIserviceCognitiveOcrBusinesslicenseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8756741786438341699L;

	/**
	 * 营业执照图片base64加密后内容
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
