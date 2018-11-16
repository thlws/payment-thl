package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 固定金额
 *
 * @author auto create
 * @since 1.0, 2017-03-02 11:28:27
 */
public class KbAdvertQuotaCommissionClause extends AlipayObject {

	private static final long serialVersionUID = 3623319769882341657L;

	/**
	 * 固定金额
	 */
	@ApiField("quota_amount")
	private String quotaAmount;

    /**
     * Gets quota amount.
     *
     * @return the quota amount
     */
    public String getQuotaAmount() {
		return this.quotaAmount;
	}

    /**
     * Sets quota amount.
     *
     * @param quotaAmount the quota amount
     */
    public void setQuotaAmount(String quotaAmount) {
		this.quotaAmount = quotaAmount;
	}

}
