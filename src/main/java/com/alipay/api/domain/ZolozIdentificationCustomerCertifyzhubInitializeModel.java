package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸服务初始化(一体化)
 *
 * @author auto create
 * @since 1.0, 2018-09-10 12:13:30
 */
public class ZolozIdentificationCustomerCertifyzhubInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 5347758562997569948L;

	/**
	 * 设备token
	 */
	@ApiField("apdidtoken")
	private String apdidtoken;

	/**
	 * 应用名字
	 */
	@ApiField("appname")
	private String appname;

	/**
	 * 应用版本号
	 */
	@ApiField("appversion")
	private String appversion;

	/**
	 * 人脸sdk元信息
	 */
	@ApiField("biometainfo")
	private String biometainfo;

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
	 * 机型
	 */
	@ApiField("devicemodel")
	private String devicemodel;

	/**
	 * 设备类型
	 */
	@ApiField("devicetype")
	private String devicetype;

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
	 * 手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 操作系统版本号
	 */
	@ApiField("osversion")
	private String osversion;

	/**
	 * 商户的用户id
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets apdidtoken.
     *
     * @return the apdidtoken
     */
    public String getApdidtoken() {
		return this.apdidtoken;
	}

    /**
     * Sets apdidtoken.
     *
     * @param apdidtoken the apdidtoken
     */
    public void setApdidtoken(String apdidtoken) {
		this.apdidtoken = apdidtoken;
	}

    /**
     * Gets appname.
     *
     * @return the appname
     */
    public String getAppname() {
		return this.appname;
	}

    /**
     * Sets appname.
     *
     * @param appname the appname
     */
    public void setAppname(String appname) {
		this.appname = appname;
	}

    /**
     * Gets appversion.
     *
     * @return the appversion
     */
    public String getAppversion() {
		return this.appversion;
	}

    /**
     * Sets appversion.
     *
     * @param appversion the appversion
     */
    public void setAppversion(String appversion) {
		this.appversion = appversion;
	}

    /**
     * Gets biometainfo.
     *
     * @return the biometainfo
     */
    public String getBiometainfo() {
		return this.biometainfo;
	}

    /**
     * Sets biometainfo.
     *
     * @param biometainfo the biometainfo
     */
    public void setBiometainfo(String biometainfo) {
		this.biometainfo = biometainfo;
	}

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
     * Gets devicemodel.
     *
     * @return the devicemodel
     */
    public String getDevicemodel() {
		return this.devicemodel;
	}

    /**
     * Sets devicemodel.
     *
     * @param devicemodel the devicemodel
     */
    public void setDevicemodel(String devicemodel) {
		this.devicemodel = devicemodel;
	}

    /**
     * Gets devicetype.
     *
     * @return the devicetype
     */
    public String getDevicetype() {
		return this.devicetype;
	}

    /**
     * Sets devicetype.
     *
     * @param devicetype the devicetype
     */
    public void setDevicetype(String devicetype) {
		this.devicetype = devicetype;
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
     * Gets osversion.
     *
     * @return the osversion
     */
    public String getOsversion() {
		return this.osversion;
	}

    /**
     * Sets osversion.
     *
     * @param osversion the osversion
     */
    public void setOsversion(String osversion) {
		this.osversion = osversion;
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
