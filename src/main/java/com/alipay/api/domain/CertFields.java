package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 证件字段信息
 *
 * @author auto create
 * @since 1.0, 2018-04-20 09:30:36
 */
public class CertFields extends AlipayObject {

	private static final long serialVersionUID = 2494695174661647574L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 生日
	 */
	@ApiField("birth")
	private String birth;

	/**
	 * 证件号码
	 */
	@ApiField("certno")
	private String certno;

	/**
	 * 有效期
	 */
	@ApiField("expires")
	private String expires;

	/**
	 * 有效期结束日期
	 */
	@ApiField("expiresend")
	private String expiresend;

	/**
	 * 有效期开始时间
	 */
	@ApiField("expiresstart")
	private String expiresstart;

	/**
	 * 签发机关
	 */
	@ApiField("issuingauthority")
	private String issuingauthority;

	/**
	 * 名字
	 */
	@ApiField("name")
	private String name;

	/**
	 * 编号
	 */
	@ApiField("number")
	private String number;

	/**
	 * 民族
	 */
	@ApiField("race")
	private String race;

	/**
	 * 换证次数
	 */
	@ApiField("renewalnum")
	private String renewalnum;

	/**
	 * 性别
	 */
	@ApiField("sex")
	private String sex;

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
		return this.address;
	}

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
		this.address = address;
	}

    /**
     * Gets birth.
     *
     * @return the birth
     */
    public String getBirth() {
		return this.birth;
	}

    /**
     * Sets birth.
     *
     * @param birth the birth
     */
    public void setBirth(String birth) {
		this.birth = birth;
	}

    /**
     * Gets certno.
     *
     * @return the certno
     */
    public String getCertno() {
		return this.certno;
	}

    /**
     * Sets certno.
     *
     * @param certno the certno
     */
    public void setCertno(String certno) {
		this.certno = certno;
	}

    /**
     * Gets expires.
     *
     * @return the expires
     */
    public String getExpires() {
		return this.expires;
	}

    /**
     * Sets expires.
     *
     * @param expires the expires
     */
    public void setExpires(String expires) {
		this.expires = expires;
	}

    /**
     * Gets expiresend.
     *
     * @return the expiresend
     */
    public String getExpiresend() {
		return this.expiresend;
	}

    /**
     * Sets expiresend.
     *
     * @param expiresend the expiresend
     */
    public void setExpiresend(String expiresend) {
		this.expiresend = expiresend;
	}

    /**
     * Gets expiresstart.
     *
     * @return the expiresstart
     */
    public String getExpiresstart() {
		return this.expiresstart;
	}

    /**
     * Sets expiresstart.
     *
     * @param expiresstart the expiresstart
     */
    public void setExpiresstart(String expiresstart) {
		this.expiresstart = expiresstart;
	}

    /**
     * Gets issuingauthority.
     *
     * @return the issuingauthority
     */
    public String getIssuingauthority() {
		return this.issuingauthority;
	}

    /**
     * Sets issuingauthority.
     *
     * @param issuingauthority the issuingauthority
     */
    public void setIssuingauthority(String issuingauthority) {
		this.issuingauthority = issuingauthority;
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

    /**
     * Gets race.
     *
     * @return the race
     */
    public String getRace() {
		return this.race;
	}

    /**
     * Sets race.
     *
     * @param race the race
     */
    public void setRace(String race) {
		this.race = race;
	}

    /**
     * Gets renewalnum.
     *
     * @return the renewalnum
     */
    public String getRenewalnum() {
		return this.renewalnum;
	}

    /**
     * Sets renewalnum.
     *
     * @param renewalnum the renewalnum
     */
    public void setRenewalnum(String renewalnum) {
		this.renewalnum = renewalnum;
	}

    /**
     * Gets sex.
     *
     * @return the sex
     */
    public String getSex() {
		return this.sex;
	}

    /**
     * Sets sex.
     *
     * @param sex the sex
     */
    public void setSex(String sex) {
		this.sex = sex;
	}

}
