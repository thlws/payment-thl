package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 证照中心身份证
 *
 * @author auto create
 * @since 1.0, 2017-05-25 14:02:44
 */
public class AlipayUserCertDocIDCard extends AlipayObject {

	private static final long serialVersionUID = 4865279757717826943L;

	/**
	 * 身份证国徽页照片BASE64编码
	 */
	@ApiField("encoded_img_emblem")
	private String encodedImgEmblem;

	/**
	 * 头像页照片BASE64编码
	 */
	@ApiField("encoded_img_identity")
	private String encodedImgIdentity;

	/**
	 * 有效期至
	 */
	@ApiField("expire_date")
	private String expireDate;

	/**
	 * 身份证姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 身份证号码
	 */
	@ApiField("number")
	private String number;

    /**
     * Gets encoded img emblem.
     *
     * @return the encoded img emblem
     */
    public String getEncodedImgEmblem() {
		return this.encodedImgEmblem;
	}

    /**
     * Sets encoded img emblem.
     *
     * @param encodedImgEmblem the encoded img emblem
     */
    public void setEncodedImgEmblem(String encodedImgEmblem) {
		this.encodedImgEmblem = encodedImgEmblem;
	}

    /**
     * Gets encoded img identity.
     *
     * @return the encoded img identity
     */
    public String getEncodedImgIdentity() {
		return this.encodedImgIdentity;
	}

    /**
     * Sets encoded img identity.
     *
     * @param encodedImgIdentity the encoded img identity
     */
    public void setEncodedImgIdentity(String encodedImgIdentity) {
		this.encodedImgIdentity = encodedImgIdentity;
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
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
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
