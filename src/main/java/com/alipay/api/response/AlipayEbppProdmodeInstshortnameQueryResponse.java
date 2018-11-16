package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.prodmode.instshortname.query response.
 *
 * @author auto create
 * @since 1.0, 2018-04-26 13:56:59
 */
public class AlipayEbppProdmodeInstshortnameQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2551867539474498666L;

	/** 
	 * 出账机构中文名称
	 */
	@ApiField("chargeinst_cn_name")
	private String chargeinstCnName;

	/** 
	 * 出账机构英文名称
	 */
	@ApiField("chargeinst_en_name")
	private String chargeinstEnName;

    /**
     * Sets chargeinst cn name.
     *
     * @param chargeinstCnName the chargeinst cn name
     */
    public void setChargeinstCnName(String chargeinstCnName) {
		this.chargeinstCnName = chargeinstCnName;
	}

    /**
     * Gets chargeinst cn name.
     *
     * @return the chargeinst cn name
     */
    public String getChargeinstCnName( ) {
		return this.chargeinstCnName;
	}

    /**
     * Sets chargeinst en name.
     *
     * @param chargeinstEnName the chargeinst en name
     */
    public void setChargeinstEnName(String chargeinstEnName) {
		this.chargeinstEnName = chargeinstEnName;
	}

    /**
     * Gets chargeinst en name.
     *
     * @return the chargeinst en name
     */
    public String getChargeinstEnName( ) {
		return this.chargeinstEnName;
	}

}
