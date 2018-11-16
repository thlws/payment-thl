package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁档案人脸图片查询
 *
 * @author auto create
 * @since 1.0, 2018-03-27 17:44:19
 */
public class AlipayUserAntarchiveFaceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2382598542617119953L;

	/**
	 * 出生日期(RFC3339格式)，yyyy-MM-dd，可选.若证件类型为105(港澳居民往来内地通行证)或106(台湾居民往来内地通行证)时,cert_expire_date与birthday至少填写一项
	 */
	@ApiField("birthday")
	private String birthday;

	/**
	 * 证件过期日期(RFC3339格式)，yyyy-MM-dd，可选.若证件类型为105(港澳居民往来内地通行证)或106(台湾居民往来内地通行证)时,cert_expire_date与birthday至少填写一项
	 */
	@ApiField("cert_expire_date")
	private String certExpireDate;

	/**
	 * 证件上的姓名
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号.若证件类型为105(港澳居民往来内地通行证),需将换证次数拼接到证件号后,如H8746985300
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型,取值范围为:
100 居民身份证
102 护照
105 港澳居民往来内地通行证
106 台湾居民往来内地通行证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 性别,可选.取值范围:
1 男
2 女
	 */
	@ApiField("gender")
	private String gender;

    /**
     * Gets birthday.
     *
     * @return the birthday
     */
    public String getBirthday() {
		return this.birthday;
	}

    /**
     * Sets birthday.
     *
     * @param birthday the birthday
     */
    public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

    /**
     * Gets cert expire date.
     *
     * @return the cert expire date
     */
    public String getCertExpireDate() {
		return this.certExpireDate;
	}

    /**
     * Sets cert expire date.
     *
     * @param certExpireDate the cert expire date
     */
    public void setCertExpireDate(String certExpireDate) {
		this.certExpireDate = certExpireDate;
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
     * Gets gender.
     *
     * @return the gender
     */
    public String getGender() {
		return this.gender;
	}

    /**
     * Sets gender.
     *
     * @param gender the gender
     */
    public void setGender(String gender) {
		this.gender = gender;
	}

}
