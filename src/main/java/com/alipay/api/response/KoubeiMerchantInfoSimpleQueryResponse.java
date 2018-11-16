package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.info.simple.query response.
 *
 * @author auto create
 * @since 1.0, 2018-03-23 13:54:19
 */
public class KoubeiMerchantInfoSimpleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5811768286695462674L;

	/** 
	 * 操作员登录账号前缀，例如cc123@alitest.com#001
	 */
	@ApiField("operator_prefix")
	private String operatorPrefix;

	/** 
	 * 商户id，2088121509924973
	 */
	@ApiField("partner_id")
	private String partnerId;

	/** 
	 * 用户名
	 */
	@ApiField("user_name")
	private String userName;

    /**
     * Sets operator prefix.
     *
     * @param operatorPrefix the operator prefix
     */
    public void setOperatorPrefix(String operatorPrefix) {
		this.operatorPrefix = operatorPrefix;
	}

    /**
     * Gets operator prefix.
     *
     * @return the operator prefix
     */
    public String getOperatorPrefix( ) {
		return this.operatorPrefix;
	}

    /**
     * Sets partner id.
     *
     * @param partnerId the partner id
     */
    public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

    /**
     * Gets partner id.
     *
     * @return the partner id
     */
    public String getPartnerId( ) {
		return this.partnerId;
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
