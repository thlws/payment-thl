package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授信申请用户认证
 *
 * @author auto create
 * @since 1.0, 2018-07-18 10:47:21
 */
public class AlipayPcreditLoanApplyUserCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 4797973343861812297L;

	/**
	 * 业务流水号，即用户授信申请的单号，每次授信申请由借呗平台生成的唯一编号，通知估值时给到机构
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 证件号码，当前只支持身份证号码，验证授信申请的用户证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型，和证件号cert_no配合使用，由平台定义，目前支持的证件类型有：
IDENTITY_CARD-身份证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 用户姓名，需要验证的授信申请人姓名
	 */
	@ApiField("user_name")
	private String userName;

    /**
     * Gets apply no.
     *
     * @return the apply no
     */
    public String getApplyNo() {
		return this.applyNo;
	}

    /**
     * Sets apply no.
     *
     * @param applyNo the apply no
     */
    public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
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

}
