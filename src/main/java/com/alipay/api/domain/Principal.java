package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约实体信息
 *
 * @author auto create
 * @since 1.0, 2017-10-26 15:12:24
 */
public class Principal extends AlipayObject {

	private static final long serialVersionUID = 7528564983569726876L;

	/**
	 * 用户身份证号。
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
'IDENTIFY' //个人认证-身份证类型
'BRNUMBER' //工商注册号
'USCC' //统一社会信用代码
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 签约主体类型
individual //个人/操作员
entreprise //企业
	 */
	@ApiField("signer_type")
	private String signerType;

	/**
	 * 签约主体名称
个人认证时例如：'张三'
企业认证时例如：'XX公司'
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 是否需要认证
'NEED'  //需要认证
'NONEED'  //不需要认证
	 */
	@ApiField("verify_type")
	private String verifyType;

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
     * Gets signer type.
     *
     * @return the signer type
     */
    public String getSignerType() {
		return this.signerType;
	}

    /**
     * Sets signer type.
     *
     * @param signerType the signer type
     */
    public void setSignerType(String signerType) {
		this.signerType = signerType;
	}

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName() {
		return this.userName;
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
     * Gets verify type.
     *
     * @return the verify type
     */
    public String getVerifyType() {
		return this.verifyType;
	}

    /**
     * Sets verify type.
     *
     * @param verifyType the verify type
     */
    public void setVerifyType(String verifyType) {
		this.verifyType = verifyType;
	}

}
