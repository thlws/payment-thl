package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 贷款费用信息
 *
 * @author auto create
 * @since 1.0, 2017-05-19 11:45:39
 */
public class LoanChargeInfo extends AlipayObject {

	private static final long serialVersionUID = 7262867165615686214L;

	/**
	 * 费用编码
	 */
	@ApiField("charge_code")
	private String chargeCode;

	/**
	 * 费用名称
	 */
	@ApiField("charge_name")
	private String chargeName;

	/**
	 * 分段费率
	 */
	@ApiField("instal_chrg_rate")
	private InstallmentValue instalChrgRate;

    /**
     * Gets charge code.
     *
     * @return the charge code
     */
    public String getChargeCode() {
		return this.chargeCode;
	}

    /**
     * Sets charge code.
     *
     * @param chargeCode the charge code
     */
    public void setChargeCode(String chargeCode) {
		this.chargeCode = chargeCode;
	}

    /**
     * Gets charge name.
     *
     * @return the charge name
     */
    public String getChargeName() {
		return this.chargeName;
	}

    /**
     * Sets charge name.
     *
     * @param chargeName the charge name
     */
    public void setChargeName(String chargeName) {
		this.chargeName = chargeName;
	}

    /**
     * Gets instal chrg rate.
     *
     * @return the instal chrg rate
     */
    public InstallmentValue getInstalChrgRate() {
		return this.instalChrgRate;
	}

    /**
     * Sets instal chrg rate.
     *
     * @param instalChrgRate the instal chrg rate
     */
    public void setInstalChrgRate(InstallmentValue instalChrgRate) {
		this.instalChrgRate = instalChrgRate;
	}

}
