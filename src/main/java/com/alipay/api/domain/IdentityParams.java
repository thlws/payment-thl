package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户实名信息参数
 *
 * @author auto create
 * @since 1.0, 2018-07-01 21:53:36
 */
public class IdentityParams extends AlipayObject {

	private static final long serialVersionUID = 5783696419378481286L;

	/**
	 * 用户身份证号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 用户实名信息hash值
	 */
	@ApiField("identity_hash")
	private String identityHash;

	/**
	 * 签约指定用户的uid，如用户登录的uid和指定的用户uid不一致则报错
	 */
	@ApiField("sign_user_id")
	private String signUserId;

	/**
	 * 用户姓名
	 */
	@ApiField("user_name")
	private String userName;

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
     * Gets identity hash.
     *
     * @return the identity hash
     */
    public String getIdentityHash() {
		return this.identityHash;
	}

    /**
     * Sets identity hash.
     *
     * @param identityHash the identity hash
     */
    public void setIdentityHash(String identityHash) {
		this.identityHash = identityHash;
	}

    /**
     * Gets sign user id.
     *
     * @return the sign user id
     */
    public String getSignUserId() {
		return this.signUserId;
	}

    /**
     * Sets sign user id.
     *
     * @param signUserId the sign user id
     */
    public void setSignUserId(String signUserId) {
		this.signUserId = signUserId;
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
