package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 登陆表单元素kv
 *
 * @author auto create
 * @since 1.0, 2017-11-02 20:44:05
 */
public class LoginForm extends AlipayObject {

	private static final long serialVersionUID = 8734987144346524161L;

	/**
	 * 图片验证码
	 */
	@ApiField("captcha")
	private String captcha;

	/**
	 * 身份证号
	 */
	@ApiField("id_card_no")
	private String idCardNo;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 手机号
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/**
	 * 查询密码
	 */
	@ApiField("query_password")
	private String queryPassword;

	/**
	 * 服务密码
	 */
	@ApiField("service_password")
	private String servicePassword;

	/**
	 * 短信验证码
	 */
	@ApiField("sms_code")
	private String smsCode;

	/**
	 * 吉林电信短信验证码
	 */
	@ApiField("sms_code_jldx")
	private String smsCodeJldx;

    /**
     * Gets captcha.
     *
     * @return the captcha
     */
    public String getCaptcha() {
		return this.captcha;
	}

    /**
     * Sets captcha.
     *
     * @param captcha the captcha
     */
    public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}

    /**
     * Gets id card no.
     *
     * @return the id card no
     */
    public String getIdCardNo() {
		return this.idCardNo;
	}

    /**
     * Sets id card no.
     *
     * @param idCardNo the id card no
     */
    public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
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
     * Gets phone no.
     *
     * @return the phone no
     */
    public String getPhoneNo() {
		return this.phoneNo;
	}

    /**
     * Sets phone no.
     *
     * @param phoneNo the phone no
     */
    public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

    /**
     * Gets query password.
     *
     * @return the query password
     */
    public String getQueryPassword() {
		return this.queryPassword;
	}

    /**
     * Sets query password.
     *
     * @param queryPassword the query password
     */
    public void setQueryPassword(String queryPassword) {
		this.queryPassword = queryPassword;
	}

    /**
     * Gets service password.
     *
     * @return the service password
     */
    public String getServicePassword() {
		return this.servicePassword;
	}

    /**
     * Sets service password.
     *
     * @param servicePassword the service password
     */
    public void setServicePassword(String servicePassword) {
		this.servicePassword = servicePassword;
	}

    /**
     * Gets sms code.
     *
     * @return the sms code
     */
    public String getSmsCode() {
		return this.smsCode;
	}

    /**
     * Sets sms code.
     *
     * @param smsCode the sms code
     */
    public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}

    /**
     * Gets sms code jldx.
     *
     * @return the sms code jldx
     */
    public String getSmsCodeJldx() {
		return this.smsCodeJldx;
	}

    /**
     * Sets sms code jldx.
     *
     * @param smsCodeJldx the sms code jldx
     */
    public void setSmsCodeJldx(String smsCodeJldx) {
		this.smsCodeJldx = smsCodeJldx;
	}

}
