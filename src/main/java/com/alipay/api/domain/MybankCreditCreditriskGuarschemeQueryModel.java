package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 担保方案查询
 *
 * @author auto create
 * @since 1.0, 2017-12-06 21:34:01
 */
public class MybankCreditCreditriskGuarschemeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6746323535189778366L;

	/**
	 * 担保方案查询类型，TYZBL：通用自保理业务场景
	 */
	@ApiField("bsn_type")
	private String bsnType;

	/**
	 * 销售产品码，特殊可选，某些场景是必填的
	 */
	@ApiField("sale_pd_code")
	private String salePdCode;

	/**
	 * 用户身份信息
	 */
	@ApiField("user")
	private Member user;

    /**
     * Gets bsn type.
     *
     * @return the bsn type
     */
    public String getBsnType() {
		return this.bsnType;
	}

    /**
     * Sets bsn type.
     *
     * @param bsnType the bsn type
     */
    public void setBsnType(String bsnType) {
		this.bsnType = bsnType;
	}

    /**
     * Gets sale pd code.
     *
     * @return the sale pd code
     */
    public String getSalePdCode() {
		return this.salePdCode;
	}

    /**
     * Sets sale pd code.
     *
     * @param salePdCode the sale pd code
     */
    public void setSalePdCode(String salePdCode) {
		this.salePdCode = salePdCode;
	}

    /**
     * Gets user.
     *
     * @return the user
     */
    public Member getUser() {
		return this.user;
	}

    /**
     * Sets user.
     *
     * @param user the user
     */
    public void setUser(Member user) {
		this.user = user;
	}

}
