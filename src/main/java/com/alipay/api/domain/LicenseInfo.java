package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务者的证书信息
 *
 * @author auto create
 * @since 1.0, 2017-01-16 11:50:40
 */
public class LicenseInfo extends AlipayObject {

	private static final long serialVersionUID = 1196122223835541295L;

	/**
	 * 证书的认证机构
	 */
	@ApiField("agency")
	private String agency;

	/**
	 * 证照过期时间，格式：yyyy-MM-dd
	 */
	@ApiField("gmt_expire")
	private String gmtExpire;

	/**
	 * 证照的起始时间：证件生效的开始时间，格式：yyyy-MM-dd
	 */
	@ApiField("gmt_start")
	private String gmtStart;

	/**
	 * 证书id
	 */
	@ApiField("license_id")
	private String licenseId;

	/**
	 * 证照名称，当type为OTHER时，必填
	 */
	@ApiField("license_name")
	private String licenseName;

	/**
	 * 证书照片的url
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * 技能或者能力的认证结果，如“高级”
	 */
	@ApiField("result")
	private String result;

	/**
	 * 服务者的证书编号，由证书机构颁发的证书编号
	 */
	@ApiField("sequence")
	private String sequence;

	/**
	 * 证照类型，允许以下值：
TOUR_GUIDE：导游证
LEGAL：法律职业资格证书
COUNSELOR：心理咨询师
DRIVER_TRAIN：机动车驾驶员培训许可证
CHEF：厨师证
TEACHER：教师资格证
LIFE_SAVING：救生证
FINANCIAL_PLANNER：理财规划师
FINANCIAL_MANAGEMENT：金融理财师
BANK：银行从业资格
SECURITIES：证券从业资格
INSURANCE：保险从业资格
FUTURES：期货从业资格
FUND：基金从业资格
SPECIAL：特种经营许可证
POLICE_REGISTER：公安备案登记证明
LOCKS_REPAIR：锁具修理服务卡（公安印章）
HEALTH：健康证
BEAUTY：美容相关证件
MASSAGE：按摩师职业证书
TRANSPORT：道路运输证
DRIVING：驾驶证
TRANSPORT_PERMIT：道路运输经营许可
OTHER：其他
	 */
	@ApiField("type")
	private String type;

    /**
     * Gets agency.
     *
     * @return the agency
     */
    public String getAgency() {
		return this.agency;
	}

    /**
     * Sets agency.
     *
     * @param agency the agency
     */
    public void setAgency(String agency) {
		this.agency = agency;
	}

    /**
     * Gets gmt expire.
     *
     * @return the gmt expire
     */
    public String getGmtExpire() {
		return this.gmtExpire;
	}

    /**
     * Sets gmt expire.
     *
     * @param gmtExpire the gmt expire
     */
    public void setGmtExpire(String gmtExpire) {
		this.gmtExpire = gmtExpire;
	}

    /**
     * Gets gmt start.
     *
     * @return the gmt start
     */
    public String getGmtStart() {
		return this.gmtStart;
	}

    /**
     * Sets gmt start.
     *
     * @param gmtStart the gmt start
     */
    public void setGmtStart(String gmtStart) {
		this.gmtStart = gmtStart;
	}

    /**
     * Gets license id.
     *
     * @return the license id
     */
    public String getLicenseId() {
		return this.licenseId;
	}

    /**
     * Sets license id.
     *
     * @param licenseId the license id
     */
    public void setLicenseId(String licenseId) {
		this.licenseId = licenseId;
	}

    /**
     * Gets license name.
     *
     * @return the license name
     */
    public String getLicenseName() {
		return this.licenseName;
	}

    /**
     * Sets license name.
     *
     * @param licenseName the license name
     */
    public void setLicenseName(String licenseName) {
		this.licenseName = licenseName;
	}

    /**
     * Gets pic url.
     *
     * @return the pic url
     */
    public String getPicUrl() {
		return this.picUrl;
	}

    /**
     * Sets pic url.
     *
     * @param picUrl the pic url
     */
    public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

    /**
     * Gets result.
     *
     * @return the result
     */
    public String getResult() {
		return this.result;
	}

    /**
     * Sets result.
     *
     * @param result the result
     */
    public void setResult(String result) {
		this.result = result;
	}

    /**
     * Gets sequence.
     *
     * @return the sequence
     */
    public String getSequence() {
		return this.sequence;
	}

    /**
     * Sets sequence.
     *
     * @param sequence the sequence
     */
    public void setSequence(String sequence) {
		this.sequence = sequence;
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

}
