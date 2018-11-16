package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 贷记信息
 *
 * @author auto create
 * @since 1.0, 2018-05-18 22:32:29
 */
public class CardCreditInfo extends AlipayObject {

	private static final long serialVersionUID = 7386433386254677542L;

	/**
	 * 是否允许超扣
	 */
	@ApiField("allowoverpay")
	private String allowoverpay;

	/**
	 * 超扣额度
	 */
	@ApiField("creditquota")
	private String creditquota;

    /**
     * Gets allowoverpay.
     *
     * @return the allowoverpay
     */
    public String getAllowoverpay() {
		return this.allowoverpay;
	}

    /**
     * Sets allowoverpay.
     *
     * @param allowoverpay the allowoverpay
     */
    public void setAllowoverpay(String allowoverpay) {
		this.allowoverpay = allowoverpay;
	}

    /**
     * Gets creditquota.
     *
     * @return the creditquota
     */
    public String getCreditquota() {
		return this.creditquota;
	}

    /**
     * Sets creditquota.
     *
     * @param creditquota the creditquota
     */
    public void setCreditquota(String creditquota) {
		this.creditquota = creditquota;
	}

}
