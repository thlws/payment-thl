package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 专属领取人员
 *
 * @author auto create
 * @since 1.0, 2017-03-02 11:28:27
 */
public class KbAdvertPreserveCommissionClause extends AlipayObject {

	private static final long serialVersionUID = 2412999184528188617L;

	/**
	 * user_id：支付宝账户ID(2088开头)
logon_id：登陆账号
	 */
	@ApiField("claimer_id_type")
	private String claimerIdType;

	/**
	 * 认领人
	 */
	@ApiListField("claimers")
	@ApiField("string")
	private List<String> claimers;

    /**
     * Gets claimer id type.
     *
     * @return the claimer id type
     */
    public String getClaimerIdType() {
		return this.claimerIdType;
	}

    /**
     * Sets claimer id type.
     *
     * @param claimerIdType the claimer id type
     */
    public void setClaimerIdType(String claimerIdType) {
		this.claimerIdType = claimerIdType;
	}

    /**
     * Gets claimers.
     *
     * @return the claimers
     */
    public List<String> getClaimers() {
		return this.claimers;
	}

    /**
     * Sets claimers.
     *
     * @param claimers the claimers
     */
    public void setClaimers(List<String> claimers) {
		this.claimers = claimers;
	}

}
