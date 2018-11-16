package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.credit.autofinance.loan.apply response.
 *
 * @author auto create
 * @since 1.0, 2017-11-23 15:50:15
 */
public class AlipayCreditAutofinanceLoanApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1459463525237684529L;

	/** 
	 * 汽车金融内部订单号
	 */
	@ApiField("applyno")
	private String applyno;

	/** 
	 * 是否需要引导认证
	 */
	@ApiField("needauth")
	private Boolean needauth;

	/** 
	 * 外部订单号
	 */
	@ApiField("outorderno")
	private String outorderno;

    /**
     * Sets applyno.
     *
     * @param applyno the applyno
     */
    public void setApplyno(String applyno) {
		this.applyno = applyno;
	}

    /**
     * Gets applyno.
     *
     * @return the applyno
     */
    public String getApplyno( ) {
		return this.applyno;
	}

    /**
     * Sets needauth.
     *
     * @param needauth the needauth
     */
    public void setNeedauth(Boolean needauth) {
		this.needauth = needauth;
	}

    /**
     * Gets needauth.
     *
     * @return the needauth
     */
    public Boolean getNeedauth( ) {
		return this.needauth;
	}

    /**
     * Sets outorderno.
     *
     * @param outorderno the outorderno
     */
    public void setOutorderno(String outorderno) {
		this.outorderno = outorderno;
	}

    /**
     * Gets outorderno.
     *
     * @return the outorderno
     */
    public String getOutorderno( ) {
		return this.outorderno;
	}

}
