package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业级商户法人信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class LegalRepresentativeInfo extends AlipayObject {

	private static final long serialVersionUID = 5573531675953744326L;

	/**
	 * 法人证件有效期，YYYY-MM-DD格式
	 */
	@ApiField("legal_representative_cert_indate")
	private String legalRepresentativeCertIndate;

	/**
	 * 法人证件号码
	 */
	@ApiField("legal_representative_cert_no")
	private String legalRepresentativeCertNo;

	/**
	 * 法人证件背面照片（如证件为身份证则上传身份证国徽面图片）
	 */
	@ApiField("legal_representative_cert_pic_back")
	private String legalRepresentativeCertPicBack;

	/**
	 * 法人证件正面照片（如证件为身份证则上传身份证头像面图片）
	 */
	@ApiField("legal_representative_cert_pic_front")
	private String legalRepresentativeCertPicFront;

	/**
	 * 法人证件类型，支持传入的类型为：RESIDENT(居民身份证)括号中为每种类型的释义，不需要将括号中的内容当参数内容传入。
	 */
	@ApiField("legal_representative_cert_type")
	private String legalRepresentativeCertType;

	/**
	 * 法人姓名
	 */
	@ApiField("legal_representative_name")
	private String legalRepresentativeName;

    /**
     * Gets legal representative cert indate.
     *
     * @return the legal representative cert indate
     */
    public String getLegalRepresentativeCertIndate() {
		return this.legalRepresentativeCertIndate;
	}

    /**
     * Sets legal representative cert indate.
     *
     * @param legalRepresentativeCertIndate the legal representative cert indate
     */
    public void setLegalRepresentativeCertIndate(String legalRepresentativeCertIndate) {
		this.legalRepresentativeCertIndate = legalRepresentativeCertIndate;
	}

    /**
     * Gets legal representative cert no.
     *
     * @return the legal representative cert no
     */
    public String getLegalRepresentativeCertNo() {
		return this.legalRepresentativeCertNo;
	}

    /**
     * Sets legal representative cert no.
     *
     * @param legalRepresentativeCertNo the legal representative cert no
     */
    public void setLegalRepresentativeCertNo(String legalRepresentativeCertNo) {
		this.legalRepresentativeCertNo = legalRepresentativeCertNo;
	}

    /**
     * Gets legal representative cert pic back.
     *
     * @return the legal representative cert pic back
     */
    public String getLegalRepresentativeCertPicBack() {
		return this.legalRepresentativeCertPicBack;
	}

    /**
     * Sets legal representative cert pic back.
     *
     * @param legalRepresentativeCertPicBack the legal representative cert pic back
     */
    public void setLegalRepresentativeCertPicBack(String legalRepresentativeCertPicBack) {
		this.legalRepresentativeCertPicBack = legalRepresentativeCertPicBack;
	}

    /**
     * Gets legal representative cert pic front.
     *
     * @return the legal representative cert pic front
     */
    public String getLegalRepresentativeCertPicFront() {
		return this.legalRepresentativeCertPicFront;
	}

    /**
     * Sets legal representative cert pic front.
     *
     * @param legalRepresentativeCertPicFront the legal representative cert pic front
     */
    public void setLegalRepresentativeCertPicFront(String legalRepresentativeCertPicFront) {
		this.legalRepresentativeCertPicFront = legalRepresentativeCertPicFront;
	}

    /**
     * Gets legal representative cert type.
     *
     * @return the legal representative cert type
     */
    public String getLegalRepresentativeCertType() {
		return this.legalRepresentativeCertType;
	}

    /**
     * Sets legal representative cert type.
     *
     * @param legalRepresentativeCertType the legal representative cert type
     */
    public void setLegalRepresentativeCertType(String legalRepresentativeCertType) {
		this.legalRepresentativeCertType = legalRepresentativeCertType;
	}

    /**
     * Gets legal representative name.
     *
     * @return the legal representative name
     */
    public String getLegalRepresentativeName() {
		return this.legalRepresentativeName;
	}

    /**
     * Sets legal representative name.
     *
     * @param legalRepresentativeName the legal representative name
     */
    public void setLegalRepresentativeName(String legalRepresentativeName) {
		this.legalRepresentativeName = legalRepresentativeName;
	}

}
