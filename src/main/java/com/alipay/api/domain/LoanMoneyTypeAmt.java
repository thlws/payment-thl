package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 贷款分类金额
 *
 * @author auto create
 * @since 1.0, 2017-10-30 11:35:46
 */
public class LoanMoneyTypeAmt extends AlipayObject {

	private static final long serialVersionUID = 2292917511219437563L;

	/**
	 * 费用
	 */
	@ApiField("fee")
	private String fee;

	/**
	 * 正常利息金额
	 */
	@ApiField("intr")
	private String intr;

	/**
	 * 滞纳金
	 */
	@ApiField("ovd_fine")
	private String ovdFine;

	/**
	 * 逾期利息金额
	 */
	@ApiField("ovd_int")
	private String ovdInt;

	/**
	 * 逾期利息罚息
	 */
	@ApiField("ovd_int_pny")
	private String ovdIntPny;

	/**
	 * 逾期本金金额
	 */
	@ApiField("ovd_prin")
	private String ovdPrin;

	/**
	 * 逾期本金罚息
	 */
	@ApiField("ovd_prin_pny")
	private String ovdPrinPny;

	/**
	 * 正常本金金额
	 */
	@ApiField("prin")
	private String prin;

    /**
     * Gets fee.
     *
     * @return the fee
     */
    public String getFee() {
		return this.fee;
	}

    /**
     * Sets fee.
     *
     * @param fee the fee
     */
    public void setFee(String fee) {
		this.fee = fee;
	}

    /**
     * Gets intr.
     *
     * @return the intr
     */
    public String getIntr() {
		return this.intr;
	}

    /**
     * Sets intr.
     *
     * @param intr the intr
     */
    public void setIntr(String intr) {
		this.intr = intr;
	}

    /**
     * Gets ovd fine.
     *
     * @return the ovd fine
     */
    public String getOvdFine() {
		return this.ovdFine;
	}

    /**
     * Sets ovd fine.
     *
     * @param ovdFine the ovd fine
     */
    public void setOvdFine(String ovdFine) {
		this.ovdFine = ovdFine;
	}

    /**
     * Gets ovd int.
     *
     * @return the ovd int
     */
    public String getOvdInt() {
		return this.ovdInt;
	}

    /**
     * Sets ovd int.
     *
     * @param ovdInt the ovd int
     */
    public void setOvdInt(String ovdInt) {
		this.ovdInt = ovdInt;
	}

    /**
     * Gets ovd int pny.
     *
     * @return the ovd int pny
     */
    public String getOvdIntPny() {
		return this.ovdIntPny;
	}

    /**
     * Sets ovd int pny.
     *
     * @param ovdIntPny the ovd int pny
     */
    public void setOvdIntPny(String ovdIntPny) {
		this.ovdIntPny = ovdIntPny;
	}

    /**
     * Gets ovd prin.
     *
     * @return the ovd prin
     */
    public String getOvdPrin() {
		return this.ovdPrin;
	}

    /**
     * Sets ovd prin.
     *
     * @param ovdPrin the ovd prin
     */
    public void setOvdPrin(String ovdPrin) {
		this.ovdPrin = ovdPrin;
	}

    /**
     * Gets ovd prin pny.
     *
     * @return the ovd prin pny
     */
    public String getOvdPrinPny() {
		return this.ovdPrinPny;
	}

    /**
     * Sets ovd prin pny.
     *
     * @param ovdPrinPny the ovd prin pny
     */
    public void setOvdPrinPny(String ovdPrinPny) {
		this.ovdPrinPny = ovdPrinPny;
	}

    /**
     * Gets prin.
     *
     * @return the prin
     */
    public String getPrin() {
		return this.prin;
	}

    /**
     * Sets prin.
     *
     * @param prin the prin
     */
    public void setPrin(String prin) {
		this.prin = prin;
	}

}
