package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.pass.shop.bind response.
 *
 * @author auto create
 * @since 1.0, 2018-03-13 18:04:28
 */
public class AlipayMarketingPassShopBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 2665851666254859931L;

	/** 
	 * 本次调用绑定的门店数量
	 */
	@ApiField("binded")
	private Long binded;

	/** 
	 * 绑定门店数的总计
	 */
	@ApiField("total_binded")
	private Long totalBinded;

    /**
     * Sets binded.
     *
     * @param binded the binded
     */
    public void setBinded(Long binded) {
		this.binded = binded;
	}

    /**
     * Gets binded.
     *
     * @return the binded
     */
    public Long getBinded( ) {
		return this.binded;
	}

    /**
     * Sets total binded.
     *
     * @param totalBinded the total binded
     */
    public void setTotalBinded(Long totalBinded) {
		this.totalBinded = totalBinded;
	}

    /**
     * Gets total binded.
     *
     * @return the total binded
     */
    public Long getTotalBinded( ) {
		return this.totalBinded;
	}

}
