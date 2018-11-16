package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用对外提供的支付宝实名认证账户数据结构
 *
 * @author auto create
 * @since 1.0, 2014-05-19 10:04:20
 */
public class AliTrustAlipayCert extends AlipayObject {

	private static final long serialVersionUID = 5798184926957486577L;

	/**
	 * 用户出生日期
	 */
	@ApiField("birthday")
	private Date birthday;

	/**
	 * 点击支付宝实名认证图标之后的跳转链接
	 */
	@ApiField("forward_url")
	private String forwardUrl;

	/**
	 * 用户性别(M/F)
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 支付宝实名认证图标的链接地址
	 */
	@ApiField("icon_url")
	private String iconUrl;

	/**
	 * 当账户为支付宝实名认证时,取值为"T";否则为"F".
	 */
	@ApiField("is_certified")
	private String isCertified;

	/**
	 * 用户姓名
	 */
	@ApiField("name")
	private String name;

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
     * Gets forward url.
     *
     * @return the forward url
     */
    public String getForwardUrl() {
		return this.forwardUrl;
	}

    /**
     * Sets forward url.
     *
     * @param forwardUrl the forward url
     */
    public void setForwardUrl(String forwardUrl) {
		this.forwardUrl = forwardUrl;
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
     * Gets icon url.
     *
     * @return the icon url
     */
    public String getIconUrl() {
		return this.iconUrl;
	}

    /**
     * Sets icon url.
     *
     * @param iconUrl the icon url
     */
    public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

    /**
     * Gets is certified.
     *
     * @return the is certified
     */
    public String getIsCertified() {
		return this.isCertified;
	}

    /**
     * Sets is certified.
     *
     * @param isCertified the is certified
     */
    public void setIsCertified(String isCertified) {
		this.isCertified = isCertified;
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

}
