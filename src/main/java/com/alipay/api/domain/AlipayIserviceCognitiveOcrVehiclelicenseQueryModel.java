package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆行驶证信息识别
 *
 * @author auto create
 * @since 1.0, 2018-05-21 18:03:35
 */
public class AlipayIserviceCognitiveOcrVehiclelicenseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7619936537465622912L;

	/**
	 * 行驶证图片base64加密后内容，大小限制在1.5M
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
