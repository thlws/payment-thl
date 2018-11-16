package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票授权关系解约
 *
 * @author auto create
 * @since 1.0, 2018-07-20 14:18:25
 */
public class AlipayEbppInvoiceAuthUnsignModel extends AlipayObject {

	private static final long serialVersionUID = 3423855961791757299L;

	/**
	 * 发票授权类型，可选值：INVOICE_AUTO_SYNC（发票自动回传）
	 */
	@ApiField("authorization_type")
	private String authorizationType;

	/**
	 * 开票商户品牌简称，与商户入驻时的品牌简称保持一致。
	 */
	@ApiField("m_short_name")
	private String mShortName;

	/**
	 * 支付宝用户userId
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets authorization type.
     *
     * @return the authorization type
     */
    public String getAuthorizationType() {
		return this.authorizationType;
	}

    /**
     * Sets authorization type.
     *
     * @param authorizationType the authorization type
     */
    public void setAuthorizationType(String authorizationType) {
		this.authorizationType = authorizationType;
	}

    /**
     * Gets short name.
     *
     * @return the short name
     */
    public String getmShortName() {
		return this.mShortName;
	}

    /**
     * Sets short name.
     *
     * @param mShortName the m short name
     */
    public void setmShortName(String mShortName) {
		this.mShortName = mShortName;
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
