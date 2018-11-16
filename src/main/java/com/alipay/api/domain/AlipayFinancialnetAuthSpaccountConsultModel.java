package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构专户查询是否用户已开户
 *
 * @author auto create
 * @since 1.0, 2018-01-17 17:13:28
 */
public class AlipayFinancialnetAuthSpaccountConsultModel extends AlipayObject {

	private static final long serialVersionUID = 2549721327395853867L;

	/**
	 * 业务标识ID
	 */
	@ApiField("biz_identity")
	private String bizIdentity;

	/**
	 * 签约产品ID
	 */
	@ApiField("sign_product_id")
	private String signProductId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets biz identity.
     *
     * @return the biz identity
     */
    public String getBizIdentity() {
		return this.bizIdentity;
	}

    /**
     * Sets biz identity.
     *
     * @param bizIdentity the biz identity
     */
    public void setBizIdentity(String bizIdentity) {
		this.bizIdentity = bizIdentity;
	}

    /**
     * Gets sign product id.
     *
     * @return the sign product id
     */
    public String getSignProductId() {
		return this.signProductId;
	}

    /**
     * Sets sign product id.
     *
     * @param signProductId the sign product id
     */
    public void setSignProductId(String signProductId) {
		this.signProductId = signProductId;
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
