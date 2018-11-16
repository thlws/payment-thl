package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸注册初始化
 *
 * @author auto create
 * @since 1.0, 2018-04-03 16:46:27
 */
public class ZolozIdentificationCustomerEnrollcertifyInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 1779413551667175171L;

	/**
	 * 商户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务场景名字
	 */
	@ApiField("biz_scene_name")
	private String bizSceneName;

	/**
	 * 实人信息：证件名字
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 实人信息：证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 实人信息：证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 0：匿名注册  1：匿名认证   2：实名认证
	 */
	@ApiField("face_type")
	private Long faceType;

	/**
	 * 人脸引导页是否显示
	 */
	@ApiField("has_welcome_page")
	private Boolean hasWelcomePage;

	/**
	 * metainfo环境参数
	 */
	@ApiField("metainfo")
	private String metainfo;

	/**
	 * 手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 商户的用户id
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets biz id.
     *
     * @return the biz id
     */
    public String getBizId() {
		return this.bizId;
	}

    /**
     * Sets biz id.
     *
     * @param bizId the biz id
     */
    public void setBizId(String bizId) {
		this.bizId = bizId;
	}

    /**
     * Gets biz scene name.
     *
     * @return the biz scene name
     */
    public String getBizSceneName() {
		return this.bizSceneName;
	}

    /**
     * Sets biz scene name.
     *
     * @param bizSceneName the biz scene name
     */
    public void setBizSceneName(String bizSceneName) {
		this.bizSceneName = bizSceneName;
	}

    /**
     * Gets cert name.
     *
     * @return the cert name
     */
    public String getCertName() {
		return this.certName;
	}

    /**
     * Sets cert name.
     *
     * @param certName the cert name
     */
    public void setCertName(String certName) {
		this.certName = certName;
	}

    /**
     * Gets cert no.
     *
     * @return the cert no
     */
    public String getCertNo() {
		return this.certNo;
	}

    /**
     * Sets cert no.
     *
     * @param certNo the cert no
     */
    public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

    /**
     * Gets cert type.
     *
     * @return the cert type
     */
    public String getCertType() {
		return this.certType;
	}

    /**
     * Sets cert type.
     *
     * @param certType the cert type
     */
    public void setCertType(String certType) {
		this.certType = certType;
	}

    /**
     * Gets face type.
     *
     * @return the face type
     */
    public Long getFaceType() {
		return this.faceType;
	}

    /**
     * Sets face type.
     *
     * @param faceType the face type
     */
    public void setFaceType(Long faceType) {
		this.faceType = faceType;
	}

    /**
     * Gets has welcome page.
     *
     * @return the has welcome page
     */
    public Boolean getHasWelcomePage() {
		return this.hasWelcomePage;
	}

    /**
     * Sets has welcome page.
     *
     * @param hasWelcomePage the has welcome page
     */
    public void setHasWelcomePage(Boolean hasWelcomePage) {
		this.hasWelcomePage = hasWelcomePage;
	}

    /**
     * Gets metainfo.
     *
     * @return the metainfo
     */
    public String getMetainfo() {
		return this.metainfo;
	}

    /**
     * Sets metainfo.
     *
     * @param metainfo the metainfo
     */
    public void setMetainfo(String metainfo) {
		this.metainfo = metainfo;
	}

    /**
     * Gets mobile.
     *
     * @return the mobile
     */
    public String getMobile() {
		return this.mobile;
	}

    /**
     * Sets mobile.
     *
     * @param mobile the mobile
     */
    public void setMobile(String mobile) {
		this.mobile = mobile;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
