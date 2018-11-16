package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 证件宝审核
 *
 * @author auto create
 * @since 1.0, 2018-04-20 09:30:36
 */
public class ZolozIdentificationCustomerIdcardCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 6172424745362312335L;

	/**
	 * 业务唯一id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 当使用手填信息审核接口对营业执照进行审核时，填写该字段信息
	 */
	@ApiField("business_license_cert")
	private BusinessLicenseCertFileds businessLicenseCert;

	/**
	 * 当使用手填信息审核接口对身份证进行审核时，填写该字段信息
	 */
	@ApiField("cert")
	private CertFields cert;

	/**
	 * 上传证件图片信息
	 */
	@ApiField("idcard_img")
	private IdCardImg idcardImg;

	/**
	 * 用户uid
	 */
	@ApiField("operater_id")
	private String operaterId;

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
     * Gets business license cert.
     *
     * @return the business license cert
     */
    public BusinessLicenseCertFileds getBusinessLicenseCert() {
		return this.businessLicenseCert;
	}

    /**
     * Sets business license cert.
     *
     * @param businessLicenseCert the business license cert
     */
    public void setBusinessLicenseCert(BusinessLicenseCertFileds businessLicenseCert) {
		this.businessLicenseCert = businessLicenseCert;
	}

    /**
     * Gets cert.
     *
     * @return the cert
     */
    public CertFields getCert() {
		return this.cert;
	}

    /**
     * Sets cert.
     *
     * @param cert the cert
     */
    public void setCert(CertFields cert) {
		this.cert = cert;
	}

    /**
     * Gets idcard img.
     *
     * @return the idcard img
     */
    public IdCardImg getIdcardImg() {
		return this.idcardImg;
	}

    /**
     * Sets idcard img.
     *
     * @param idcardImg the idcard img
     */
    public void setIdcardImg(IdCardImg idcardImg) {
		this.idcardImg = idcardImg;
	}

    /**
     * Gets operater id.
     *
     * @return the operater id
     */
    public String getOperaterId() {
		return this.operaterId;
	}

    /**
     * Sets operater id.
     *
     * @param operaterId the operater id
     */
    public void setOperaterId(String operaterId) {
		this.operaterId = operaterId;
	}

}
