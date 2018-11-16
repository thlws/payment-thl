package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.prodmode.unionbank.query response.
 *
 * @author auto create
 * @since 1.0, 2018-04-26 13:56:50
 */
public class AlipayEbppProdmodeUnionbankQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7748521817232234638L;

	/** 
	 * 银联编号
	 */
	@ApiField("bank_code")
	private String bankCode;

	/** 
	 * 联行名称
	 */
	@ApiField("bank_name")
	private String bankName;

	/** 
	 * 支行名称
	 */
	@ApiField("branch_name")
	private String branchName;

	/** 
	 * 市区信息
	 */
	@ApiField("city")
	private String city;

	/** 
	 * 省名称
	 */
	@ApiField("prov")
	private String prov;

    /**
     * Sets bank code.
     *
     * @param bankCode the bank code
     */
    public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

    /**
     * Gets bank code.
     *
     * @return the bank code
     */
    public String getBankCode( ) {
		return this.bankCode;
	}

    /**
     * Sets bank name.
     *
     * @param bankName the bank name
     */
    public void setBankName(String bankName) {
		this.bankName = bankName;
	}

    /**
     * Gets bank name.
     *
     * @return the bank name
     */
    public String getBankName( ) {
		return this.bankName;
	}

    /**
     * Sets branch name.
     *
     * @param branchName the branch name
     */
    public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

    /**
     * Gets branch name.
     *
     * @return the branch name
     */
    public String getBranchName( ) {
		return this.branchName;
	}

    /**
     * Sets city.
     *
     * @param city the city
     */
    public void setCity(String city) {
		this.city = city;
	}

    /**
     * Gets city.
     *
     * @return the city
     */
    public String getCity( ) {
		return this.city;
	}

    /**
     * Sets prov.
     *
     * @param prov the prov
     */
    public void setProv(String prov) {
		this.prov = prov;
	}

    /**
     * Gets prov.
     *
     * @return the prov
     */
    public String getProv( ) {
		return this.prov;
	}

}
