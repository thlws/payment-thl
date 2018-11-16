package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险干系人
 *
 * @author auto create
 * @since 1.0, 2018-06-28 20:24:40
 */
public class InsPerson extends AlipayObject {

	private static final long serialVersionUID = 3294597925867789415L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 生日
	 */
	@ApiField("birthday")
	private Date birthday;

	/**
	 * 投保参数;标准json格式
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 证件上名称;如果渠道账号字段没填则必填
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号码;如果渠道账号字段没填则必填
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型;如果渠道账号字段没填则必填 
100:居民身份证;102:护照;103:军官证;104:士兵证;105:港澳居民往来内地通行证;106:台湾同胞往来大陆通行证;109:警官证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 渠道账号对应的uid;如果证件类型字段没填则必填
	 */
	@ApiField("channel_user_id")
	private String channelUserId;

	/**
	 * 渠道账号来源;1:支付宝账号 2:淘宝账号;如果证件类型字段没填则必填
	 */
	@ApiField("channel_user_source")
	private String channelUserSource;

	/**
	 * 邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 性别;M:男 F:女
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 国籍
	 */
	@ApiField("nationality")
	private String nationality;

	/**
	 * 电话号码
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 张三
	 */
	@ApiField("pronounce_name")
	private String pronounceName;

	/**
	 * 支付宝会员ID;如果是投保人则必填
	 */
	@ApiField("user_id")
	private String userId;

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
     * Gets birthday.
     *
     * @return the birthday
     */
    public Date getBirthday() {
		return this.birthday;
	}

    /**
     * Sets birthday.
     *
     * @param birthday the birthday
     */
    public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

    /**
     * Gets biz data.
     *
     * @return the biz data
     */
    public String getBizData() {
		return this.bizData;
	}

    /**
     * Sets biz data.
     *
     * @param bizData the biz data
     */
    public void setBizData(String bizData) {
		this.bizData = bizData;
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
     * Gets channel user id.
     *
     * @return the channel user id
     */
    public String getChannelUserId() {
		return this.channelUserId;
	}

    /**
     * Sets channel user id.
     *
     * @param channelUserId the channel user id
     */
    public void setChannelUserId(String channelUserId) {
		this.channelUserId = channelUserId;
	}

    /**
     * Gets channel user source.
     *
     * @return the channel user source
     */
    public String getChannelUserSource() {
		return this.channelUserSource;
	}

    /**
     * Sets channel user source.
     *
     * @param channelUserSource the channel user source
     */
    public void setChannelUserSource(String channelUserSource) {
		this.channelUserSource = channelUserSource;
	}

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
		return this.email;
	}

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
		this.email = email;
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

    /**
     * Gets nationality.
     *
     * @return the nationality
     */
    public String getNationality() {
		return this.nationality;
	}

    /**
     * Sets nationality.
     *
     * @param nationality the nationality
     */
    public void setNationality(String nationality) {
		this.nationality = nationality;
	}

    /**
     * Gets phone.
     *
     * @return the phone
     */
    public String getPhone() {
		return this.phone;
	}

    /**
     * Sets phone.
     *
     * @param phone the phone
     */
    public void setPhone(String phone) {
		this.phone = phone;
	}

    /**
     * Gets pronounce name.
     *
     * @return the pronounce name
     */
    public String getPronounceName() {
		return this.pronounceName;
	}

    /**
     * Sets pronounce name.
     *
     * @param pronounceName the pronounce name
     */
    public void setPronounceName(String pronounceName) {
		this.pronounceName = pronounceName;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
