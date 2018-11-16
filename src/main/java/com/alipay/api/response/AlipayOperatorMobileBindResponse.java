package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.operator.mobile.bind response.
 *
 * @author auto create
 * @since 1.0, 2018-09-13 13:55:27
 */
public class AlipayOperatorMobileBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 1559391993598653225L;

	/** 
	 * 用户签约的支付宝账号对应的支付宝唯一用户号。
以2088开头的16位纯数字组成。
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 身份证号：显示前1位+*（实际位数）+后1位，如：5****************9
	 */
	@ApiField("certificate")
	private String certificate;

	/** 
	 * 用户手机号码
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/** 
	 * 绑定状态：
&#61548;	S表示绑定成功
&#61548;	F表示绑定失败
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 显示除姓名第一个字以外的其它部分
	 */
	@ApiField("user_name")
	private String userName;

    /**
     * Sets alipay user id.
     *
     * @param alipayUserId the alipay user id
     */
    public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

    /**
     * Gets alipay user id.
     *
     * @return the alipay user id
     */
    public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

    /**
     * Sets certificate.
     *
     * @param certificate the certificate
     */
    public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

    /**
     * Gets certificate.
     *
     * @return the certificate
     */
    public String getCertificate( ) {
		return this.certificate;
	}

    /**
     * Sets mobile no.
     *
     * @param mobileNo the mobile no
     */
    public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

    /**
     * Gets mobile no.
     *
     * @return the mobile no
     */
    public String getMobileNo( ) {
		return this.mobileNo;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus( ) {
		return this.status;
	}

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {
		this.userName = userName;
	}

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName( ) {
		return this.userName;
	}

}
