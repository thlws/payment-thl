package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁档案人脸视图对象
 *
 * @author auto create
 * @since 1.0, 2018-03-27 17:44:19
 */
public class ArchiveFaceInfo extends AlipayObject {

	private static final long serialVersionUID = 1772186539638841744L;

	/**
	 * 人脸图片BASE64转换后字符串,大小限制为2M
	 */
	@ApiField("face_image")
	private String faceImage;

	/**
	 * 人脸图片类型,取值范围:
FACE 活体人脸图片
COMMERCIAL_PS_WITH_MASK 商业公安网带网纹人脸图片
RESIDENT 居民身份证图片
PS_RM_MASK_ENHANCED 公安网去网纹照片
HMT_PS 港澳台公安网
	 */
	@ApiField("type")
	private String type;

	/**
	 * 图片可用性.true表示可用,false表示不可用
	 */
	@ApiField("usable")
	private Boolean usable;

    /**
     * Gets face image.
     *
     * @return the face image
     */
    public String getFaceImage() {
		return this.faceImage;
	}

    /**
     * Sets face image.
     *
     * @param faceImage the face image
     */
    public void setFaceImage(String faceImage) {
		this.faceImage = faceImage;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
	}

    /**
     * Gets usable.
     *
     * @return the usable
     */
    public Boolean getUsable() {
		return this.usable;
	}

    /**
     * Sets usable.
     *
     * @param usable the usable
     */
    public void setUsable(Boolean usable) {
		this.usable = usable;
	}

}
