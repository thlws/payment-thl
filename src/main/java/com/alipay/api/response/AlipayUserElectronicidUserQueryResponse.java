package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.electronicid.user.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-22 14:30:01
 */
public class AlipayUserElectronicidUserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4449749427648118843L;

	/** 
	 * 地址。用机构的AES加密后值。
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 出生年月日(yyyyMMdd)。用机构的AES加密后值。
	 */
	@ApiField("birthday")
	private String birthday;

	/** 
	 * 18位身份证号。用机构的AES加密后值。
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 性别(男，女)。用机构的AES加密后值。
	 */
	@ApiField("gender")
	private String gender;

	/** 
	 * 姓名。用机构的AES加密后值。
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 民族。用机构的AES加密后值。
	 */
	@ApiField("nation")
	private String nation;

	/** 
	 * 当前人脸照片。base64。用机构的AES加密后值。敏感生物特征默认不输出，如特需请提供相应书面政策法规内容由BD向法务审批。
	 */
	@ApiField("picture")
	private String picture;

	/** 
	 * 机构AES秘钥，用商家RSA秘钥加密后的字符串，即数字信封。
	 */
	@ApiField("secret_key")
	private String secretKey;

	/** 
	 * 签发机关。用机构的AES加密后值。
	 */
	@ApiField("sign_org")
	private String signOrg;

	/** 
	 * 有效期开始(yyyyMMdd)。用机构的AES加密后值。
	 */
	@ApiField("valid_begin_date")
	private String validBeginDate;

	/** 
	 * 有效期截止(yyyyMMdd)。用机构的AES加密后值。
	 */
	@ApiField("valid_end_date")
	private String validEndDate;

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
		this.address = address;
	}

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress( ) {
		return this.address;
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
     * Gets birthday.
     *
     * @return the birthday
     */
    public String getBirthday( ) {
		return this.birthday;
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
     * Gets cert no.
     *
     * @return the cert no
     */
    public String getCertNo( ) {
		return this.certNo;
	}

    /**
     * Sets gender.
     *
     * @param gender the gender
     */
    public void setGender(String gender) {
		this.gender = gender;
	}

    /**
     * Gets gender.
     *
     * @return the gender
     */
    public String getGender( ) {
		return this.gender;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName( ) {
		return this.name;
	}

    /**
     * Sets nation.
     *
     * @param nation the nation
     */
    public void setNation(String nation) {
		this.nation = nation;
	}

    /**
     * Gets nation.
     *
     * @return the nation
     */
    public String getNation( ) {
		return this.nation;
	}

    /**
     * Sets picture.
     *
     * @param picture the picture
     */
    public void setPicture(String picture) {
		this.picture = picture;
	}

    /**
     * Gets picture.
     *
     * @return the picture
     */
    public String getPicture( ) {
		return this.picture;
	}

    /**
     * Sets secret key.
     *
     * @param secretKey the secret key
     */
    public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

    /**
     * Gets secret key.
     *
     * @return the secret key
     */
    public String getSecretKey( ) {
		return this.secretKey;
	}

    /**
     * Sets sign org.
     *
     * @param signOrg the sign org
     */
    public void setSignOrg(String signOrg) {
		this.signOrg = signOrg;
	}

    /**
     * Gets sign org.
     *
     * @return the sign org
     */
    public String getSignOrg( ) {
		return this.signOrg;
	}

    /**
     * Sets valid begin date.
     *
     * @param validBeginDate the valid begin date
     */
    public void setValidBeginDate(String validBeginDate) {
		this.validBeginDate = validBeginDate;
	}

    /**
     * Gets valid begin date.
     *
     * @return the valid begin date
     */
    public String getValidBeginDate( ) {
		return this.validBeginDate;
	}

    /**
     * Sets valid end date.
     *
     * @param validEndDate the valid end date
     */
    public void setValidEndDate(String validEndDate) {
		this.validEndDate = validEndDate;
	}

    /**
     * Gets valid end date.
     *
     * @return the valid end date
     */
    public String getValidEndDate( ) {
		return this.validEndDate;
	}

}
