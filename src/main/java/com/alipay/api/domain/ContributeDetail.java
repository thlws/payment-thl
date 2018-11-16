package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出资方明细
 *
 * @author auto create
 * @since 1.0, 2017-10-31 18:26:14
 */
public class ContributeDetail extends AlipayObject {

	private static final long serialVersionUID = 8188889439868661174L;

	/**
	 * 出资方金额
	 */
	@ApiField("contribute_amount")
	private String contributeAmount;

	/**
	 * 出资方类型，如品牌商出资、支付宝平台出资等
	 */
	@ApiField("contribute_type")
	private String contributeType;

    /**
     * Gets contribute amount.
     *
     * @return the contribute amount
     */
    public String getContributeAmount() {
		return this.contributeAmount;
	}

    /**
     * Sets contribute amount.
     *
     * @param contributeAmount the contribute amount
     */
    public void setContributeAmount(String contributeAmount) {
		this.contributeAmount = contributeAmount;
	}

    /**
     * Gets contribute type.
     *
     * @return the contribute type
     */
    public String getContributeType() {
		return this.contributeType;
	}

    /**
     * Sets contribute type.
     *
     * @param contributeType the contribute type
     */
    public void setContributeType(String contributeType) {
		this.contributeType = contributeType;
	}

}
