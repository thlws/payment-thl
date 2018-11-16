package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸支付图片上传接口
 *
 * @author auto create
 * @since 1.0, 2017-03-04 12:55:28
 */
public class AlipaySecurityProdFacepayUploadModel extends AlipayObject {

	private static final long serialVersionUID = 3616469987446722264L;

	/**
	 * 用户输入的邀请码
	 */
	@ApiField("check_code")
	private String checkCode;

	/**
	 * Base64编码的人脸图片
	 */
	@ApiField("face_image")
	private String faceImage;

	/**
	 * 商户门店编号
	 */
	@ApiField("store_id")
	private String storeId;

    /**
     * Gets check code.
     *
     * @return the check code
     */
    public String getCheckCode() {
		return this.checkCode;
	}

    /**
     * Sets check code.
     *
     * @param checkCode the check code
     */
    public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}

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
     * Gets store id.
     *
     * @return the store id
     */
    public String getStoreId() {
		return this.storeId;
	}

    /**
     * Sets store id.
     *
     * @param storeId the store id
     */
    public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
