package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 证照中心护照
 *
 * @author auto create
 * @since 1.0, 2017-05-25 14:02:44
 */
public class AlipayUserCertDocPassport extends AlipayObject {

	private static final long serialVersionUID = 6769361926363679826L;

	/**
	 * base64编码后的主页照片
	 */
	@ApiField("encoded_img")
	private String encodedImg;

	/**
	 * 失效日期
	 */
	@ApiField("expire_date")
	private String expireDate;

	/**
	 * 姓氏，拼音
	 */
	@ApiField("family_name")
	private String familyName;

	/**
	 * 名，拼音
	 */
	@ApiField("given_name")
	private String givenName;

	/**
	 * 证件号码
	 */
	@ApiField("number")
	private String number;

    /**
     * Gets encoded img.
     *
     * @return the encoded img
     */
    public String getEncodedImg() {
		return this.encodedImg;
	}

    /**
     * Sets encoded img.
     *
     * @param encodedImg the encoded img
     */
    public void setEncodedImg(String encodedImg) {
		this.encodedImg = encodedImg;
	}

    /**
     * Gets expire date.
     *
     * @return the expire date
     */
    public String getExpireDate() {
		return this.expireDate;
	}

    /**
     * Sets expire date.
     *
     * @param expireDate the expire date
     */
    public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

    /**
     * Gets family name.
     *
     * @return the family name
     */
    public String getFamilyName() {
		return this.familyName;
	}

    /**
     * Sets family name.
     *
     * @param familyName the family name
     */
    public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

    /**
     * Gets given name.
     *
     * @return the given name
     */
    public String getGivenName() {
		return this.givenName;
	}

    /**
     * Sets given name.
     *
     * @param givenName the given name
     */
    public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

    /**
     * Gets number.
     *
     * @return the number
     */
    public String getNumber() {
		return this.number;
	}

    /**
     * Sets number.
     *
     * @param number the number
     */
    public void setNumber(String number) {
		this.number = number;
	}

}
