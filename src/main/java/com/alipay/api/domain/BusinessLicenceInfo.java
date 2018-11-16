package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营业执照信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:41
 */
public class BusinessLicenceInfo extends AlipayObject {

	private static final long serialVersionUID = 8388166683342175481L;

	/**
	 * 营业执照授权函图片，个体工商户如果使用总公司或其他公司的营业执照认证需上传该授权函图片
	 */
	@ApiField("business_license_auth_pic")
	private String businessLicenseAuthPic;

	/**
	 * 营业执照所在城市，使用国家行政区划代码，可参考http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/
	 */
	@ApiField("business_license_city")
	private String businessLicenseCity;

	/**
	 * 营业执照有效期，传入营业执照上营业期限到期日，格式为YYYY-MM-DD，如为长期则传入9999-12-31
	 */
	@ApiField("business_license_indate")
	private String businessLicenseIndate;

	/**
	 * 营业执照是否为三证合一，个体工商户可忽略该字段，企业级商户的营业执照如为三证合一的新营业执照则传true
	 */
	@ApiField("business_license_is_three_in_one")
	private Boolean businessLicenseIsThreeInOne;

	/**
	 * 营业执照号码
	 */
	@ApiField("business_license_no")
	private String businessLicenseNo;

	/**
	 * 营业执照图片
	 */
	@ApiField("business_license_pic")
	private String businessLicensePic;

	/**
	 * 营业执照所在地省份，使用国家行政区划代码，可参考http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/
	 */
	@ApiField("business_license_province")
	private String businessLicenseProvince;

	/**
	 * 营业执照上的企业经营范围
	 */
	@ApiField("business_scope")
	private String businessScope;

	/**
	 * 营业执照上的企业联系地址
	 */
	@ApiField("company_address")
	private String companyAddress;

	/**
	 * 营业执照上的企业名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 组织机构代码证号码，个体工商户忽略该字段，企业级商户如营业执照非三证合一需要传入该字段否则预校验会不通过
	 */
	@ApiField("org_code_certificate_no")
	private String orgCodeCertificateNo;

	/**
	 * 组织机构代码证图片，个体工商户忽略该字段，企业级商户如营业执照非三证合一需要传入该字段否则预校验会不通过
	 */
	@ApiField("org_code_certificate_pic")
	private String orgCodeCertificatePic;

    /**
     * Gets business license auth pic.
     *
     * @return the business license auth pic
     */
    public String getBusinessLicenseAuthPic() {
		return this.businessLicenseAuthPic;
	}

    /**
     * Sets business license auth pic.
     *
     * @param businessLicenseAuthPic the business license auth pic
     */
    public void setBusinessLicenseAuthPic(String businessLicenseAuthPic) {
		this.businessLicenseAuthPic = businessLicenseAuthPic;
	}

    /**
     * Gets business license city.
     *
     * @return the business license city
     */
    public String getBusinessLicenseCity() {
		return this.businessLicenseCity;
	}

    /**
     * Sets business license city.
     *
     * @param businessLicenseCity the business license city
     */
    public void setBusinessLicenseCity(String businessLicenseCity) {
		this.businessLicenseCity = businessLicenseCity;
	}

    /**
     * Gets business license indate.
     *
     * @return the business license indate
     */
    public String getBusinessLicenseIndate() {
		return this.businessLicenseIndate;
	}

    /**
     * Sets business license indate.
     *
     * @param businessLicenseIndate the business license indate
     */
    public void setBusinessLicenseIndate(String businessLicenseIndate) {
		this.businessLicenseIndate = businessLicenseIndate;
	}

    /**
     * Gets business license is three in one.
     *
     * @return the business license is three in one
     */
    public Boolean getBusinessLicenseIsThreeInOne() {
		return this.businessLicenseIsThreeInOne;
	}

    /**
     * Sets business license is three in one.
     *
     * @param businessLicenseIsThreeInOne the business license is three in one
     */
    public void setBusinessLicenseIsThreeInOne(Boolean businessLicenseIsThreeInOne) {
		this.businessLicenseIsThreeInOne = businessLicenseIsThreeInOne;
	}

    /**
     * Gets business license no.
     *
     * @return the business license no
     */
    public String getBusinessLicenseNo() {
		return this.businessLicenseNo;
	}

    /**
     * Sets business license no.
     *
     * @param businessLicenseNo the business license no
     */
    public void setBusinessLicenseNo(String businessLicenseNo) {
		this.businessLicenseNo = businessLicenseNo;
	}

    /**
     * Gets business license pic.
     *
     * @return the business license pic
     */
    public String getBusinessLicensePic() {
		return this.businessLicensePic;
	}

    /**
     * Sets business license pic.
     *
     * @param businessLicensePic the business license pic
     */
    public void setBusinessLicensePic(String businessLicensePic) {
		this.businessLicensePic = businessLicensePic;
	}

    /**
     * Gets business license province.
     *
     * @return the business license province
     */
    public String getBusinessLicenseProvince() {
		return this.businessLicenseProvince;
	}

    /**
     * Sets business license province.
     *
     * @param businessLicenseProvince the business license province
     */
    public void setBusinessLicenseProvince(String businessLicenseProvince) {
		this.businessLicenseProvince = businessLicenseProvince;
	}

    /**
     * Gets business scope.
     *
     * @return the business scope
     */
    public String getBusinessScope() {
		return this.businessScope;
	}

    /**
     * Sets business scope.
     *
     * @param businessScope the business scope
     */
    public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
	}

    /**
     * Gets company address.
     *
     * @return the company address
     */
    public String getCompanyAddress() {
		return this.companyAddress;
	}

    /**
     * Sets company address.
     *
     * @param companyAddress the company address
     */
    public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

    /**
     * Gets company name.
     *
     * @return the company name
     */
    public String getCompanyName() {
		return this.companyName;
	}

    /**
     * Sets company name.
     *
     * @param companyName the company name
     */
    public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

    /**
     * Gets org code certificate no.
     *
     * @return the org code certificate no
     */
    public String getOrgCodeCertificateNo() {
		return this.orgCodeCertificateNo;
	}

    /**
     * Sets org code certificate no.
     *
     * @param orgCodeCertificateNo the org code certificate no
     */
    public void setOrgCodeCertificateNo(String orgCodeCertificateNo) {
		this.orgCodeCertificateNo = orgCodeCertificateNo;
	}

    /**
     * Gets org code certificate pic.
     *
     * @return the org code certificate pic
     */
    public String getOrgCodeCertificatePic() {
		return this.orgCodeCertificatePic;
	}

    /**
     * Sets org code certificate pic.
     *
     * @param orgCodeCertificatePic the org code certificate pic
     */
    public void setOrgCodeCertificatePic(String orgCodeCertificatePic) {
		this.orgCodeCertificatePic = orgCodeCertificatePic;
	}

}
