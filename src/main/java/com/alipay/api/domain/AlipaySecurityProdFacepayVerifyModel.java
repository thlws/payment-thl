package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸支付验证接口
 *
 * @author auto create
 * @since 1.0, 2017-03-04 14:23:39
 */
public class AlipaySecurityProdFacepayVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 5672685481133649632L;

	/**
	 * 用户输入的扫脸付邀请码
	 */
	@ApiField("check_code")
	private String checkCode;

	/**
	 * Base64编码的人脸图片。与ftoken参数二选一，当商户先前未调用人脸识别接口时使用此参数。
	 */
	@ApiField("face_image")
	private String faceImage;

	/**
	 * 商户调用人脸上传接口时获得的ftoken。与face_image参数二选一，当商户先前调用了人脸识别接口并获得了ftoken时使用此参数
	 */
	@ApiField("ftoken")
	private String ftoken;

	/**
	 * 商户门店编号
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 用户认证标识。传入完整的用户标识（例如用户输入的完整的11位用户手机号码,13800138000）或部分信息脱敏的用户标识（例如138****8000）。当热点人脸库命中成功时，可以使用部分信息脱敏的用户标识
	 */
	@ApiField("user_auth_id")
	private String userAuthId;

	/**
	 * 用户标识类型。目前支持手机号码，即mobile
	 */
	@ApiField("user_auth_type")
	private String userAuthType;

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
     * Gets ftoken.
     *
     * @return the ftoken
     */
    public String getFtoken() {
		return this.ftoken;
	}

    /**
     * Sets ftoken.
     *
     * @param ftoken the ftoken
     */
    public void setFtoken(String ftoken) {
		this.ftoken = ftoken;
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

    /**
     * Gets user auth id.
     *
     * @return the user auth id
     */
    public String getUserAuthId() {
		return this.userAuthId;
	}

    /**
     * Sets user auth id.
     *
     * @param userAuthId the user auth id
     */
    public void setUserAuthId(String userAuthId) {
		this.userAuthId = userAuthId;
	}

    /**
     * Gets user auth type.
     *
     * @return the user auth type
     */
    public String getUserAuthType() {
		return this.userAuthType;
	}

    /**
     * Sets user auth type.
     *
     * @param userAuthType the user auth type
     */
    public void setUserAuthType(String userAuthType) {
		this.userAuthType = userAuthType;
	}

}
