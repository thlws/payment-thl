package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户的贷款资质
 *
 * @author auto create
 * @since 1.0, 2017-11-17 11:57:56
 */
public class AlipayDataAiserviceJunengLoanQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6437181244882273777L;

	/**
	 * 额外的信息，以 json 字符串的方式组织
	 */
	@ApiField("extension_info")
	private String extensionInfo;

	/**
	 * 借款人身份证号的md5
	 */
	@ApiField("hashed_cert_no")
	private String hashedCertNo;

	/**
	 * 机构代码，区别调用的外部机构
	 */
	@ApiField("institution_uuid")
	private String institutionUuid;

	/**
	 * 单次请求的 uuid
	 */
	@ApiField("request_uuid")
	private String requestUuid;

	/**
	 * 用户属性，包含隐私保护数据和原始数据。
	 */
	@ApiField("user_feature")
	private String userFeature;

    /**
     * Gets extension info.
     *
     * @return the extension info
     */
    public String getExtensionInfo() {
		return this.extensionInfo;
	}

    /**
     * Sets extension info.
     *
     * @param extensionInfo the extension info
     */
    public void setExtensionInfo(String extensionInfo) {
		this.extensionInfo = extensionInfo;
	}

    /**
     * Gets hashed cert no.
     *
     * @return the hashed cert no
     */
    public String getHashedCertNo() {
		return this.hashedCertNo;
	}

    /**
     * Sets hashed cert no.
     *
     * @param hashedCertNo the hashed cert no
     */
    public void setHashedCertNo(String hashedCertNo) {
		this.hashedCertNo = hashedCertNo;
	}

    /**
     * Gets institution uuid.
     *
     * @return the institution uuid
     */
    public String getInstitutionUuid() {
		return this.institutionUuid;
	}

    /**
     * Sets institution uuid.
     *
     * @param institutionUuid the institution uuid
     */
    public void setInstitutionUuid(String institutionUuid) {
		this.institutionUuid = institutionUuid;
	}

    /**
     * Gets request uuid.
     *
     * @return the request uuid
     */
    public String getRequestUuid() {
		return this.requestUuid;
	}

    /**
     * Sets request uuid.
     *
     * @param requestUuid the request uuid
     */
    public void setRequestUuid(String requestUuid) {
		this.requestUuid = requestUuid;
	}

    /**
     * Gets user feature.
     *
     * @return the user feature
     */
    public String getUserFeature() {
		return this.userFeature;
	}

    /**
     * Sets user feature.
     *
     * @param userFeature the user feature
     */
    public void setUserFeature(String userFeature) {
		this.userFeature = userFeature;
	}

}
