package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 险种责任
 *
 * @author auto create
 * @since 1.0, 2017-10-27 10:20:32
 */
public class InsLiability extends AlipayObject {

	private static final long serialVersionUID = 7245891835474734421L;

	/**
	 * 保额
	 */
	@ApiField("coverage")
	private String coverage;

	/**
	 * 是否可以编辑,0-可选; 1-不可选,不支持; 2-必选,目前不打开
	 */
	@ApiField("disabled")
	private String disabled;

	/**
	 * 不计免赔 0，1，2
	 */
	@ApiField("iop")
	private String iop;

	/**
	 * 不计免赔保费
	 */
	@ApiField("iop_premium")
	private String iopPremium;

	/**
	 * 责任描述
	 */
	@ApiField("liability_desc")
	private String liabilityDesc;

	/**
	 * 责任名称
	 */
	@ApiField("liability_name")
	private String liabilityName;

	/**
	 * 责任编码
	 */
	@ApiField("liability_no")
	private String liabilityNo;

	/**
	 * 责任保费
	 */
	@ApiField("liability_premium")
	private String liabilityPremium;

	/**
	 * options
	 */
	@ApiListField("options")
	@ApiField("ins_option")
	private List<InsOption> options;

	/**
	 * 责任保费
	 */
	@ApiField("premium")
	private String premium;

	/**
	 * 保额
	 */
	@ApiField("sum_insured")
	private InsSumInsured sumInsured;

    /**
     * Gets coverage.
     *
     * @return the coverage
     */
    public String getCoverage() {
		return this.coverage;
	}

    /**
     * Sets coverage.
     *
     * @param coverage the coverage
     */
    public void setCoverage(String coverage) {
		this.coverage = coverage;
	}

    /**
     * Gets disabled.
     *
     * @return the disabled
     */
    public String getDisabled() {
		return this.disabled;
	}

    /**
     * Sets disabled.
     *
     * @param disabled the disabled
     */
    public void setDisabled(String disabled) {
		this.disabled = disabled;
	}

    /**
     * Gets iop.
     *
     * @return the iop
     */
    public String getIop() {
		return this.iop;
	}

    /**
     * Sets iop.
     *
     * @param iop the iop
     */
    public void setIop(String iop) {
		this.iop = iop;
	}

    /**
     * Gets iop premium.
     *
     * @return the iop premium
     */
    public String getIopPremium() {
		return this.iopPremium;
	}

    /**
     * Sets iop premium.
     *
     * @param iopPremium the iop premium
     */
    public void setIopPremium(String iopPremium) {
		this.iopPremium = iopPremium;
	}

    /**
     * Gets liability desc.
     *
     * @return the liability desc
     */
    public String getLiabilityDesc() {
		return this.liabilityDesc;
	}

    /**
     * Sets liability desc.
     *
     * @param liabilityDesc the liability desc
     */
    public void setLiabilityDesc(String liabilityDesc) {
		this.liabilityDesc = liabilityDesc;
	}

    /**
     * Gets liability name.
     *
     * @return the liability name
     */
    public String getLiabilityName() {
		return this.liabilityName;
	}

    /**
     * Sets liability name.
     *
     * @param liabilityName the liability name
     */
    public void setLiabilityName(String liabilityName) {
		this.liabilityName = liabilityName;
	}

    /**
     * Gets liability no.
     *
     * @return the liability no
     */
    public String getLiabilityNo() {
		return this.liabilityNo;
	}

    /**
     * Sets liability no.
     *
     * @param liabilityNo the liability no
     */
    public void setLiabilityNo(String liabilityNo) {
		this.liabilityNo = liabilityNo;
	}

    /**
     * Gets liability premium.
     *
     * @return the liability premium
     */
    public String getLiabilityPremium() {
		return this.liabilityPremium;
	}

    /**
     * Sets liability premium.
     *
     * @param liabilityPremium the liability premium
     */
    public void setLiabilityPremium(String liabilityPremium) {
		this.liabilityPremium = liabilityPremium;
	}

    /**
     * Gets options.
     *
     * @return the options
     */
    public List<InsOption> getOptions() {
		return this.options;
	}

    /**
     * Sets options.
     *
     * @param options the options
     */
    public void setOptions(List<InsOption> options) {
		this.options = options;
	}

    /**
     * Gets premium.
     *
     * @return the premium
     */
    public String getPremium() {
		return this.premium;
	}

    /**
     * Sets premium.
     *
     * @param premium the premium
     */
    public void setPremium(String premium) {
		this.premium = premium;
	}

    /**
     * Gets sum insured.
     *
     * @return the sum insured
     */
    public InsSumInsured getSumInsured() {
		return this.sumInsured;
	}

    /**
     * Sets sum insured.
     *
     * @param sumInsured the sum insured
     */
    public void setSumInsured(InsSumInsured sumInsured) {
		this.sumInsured = sumInsured;
	}

}
