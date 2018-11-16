package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 险种
 *
 * @author auto create
 * @since 1.0, 2017-07-18 15:36:58
 */
public class InsCoverage extends AlipayObject {

	private static final long serialVersionUID = 4224526654863932587L;

	/**
	 * 险种名称
	 */
	@ApiField("coverage_name")
	private String coverageName;

	/**
	 * 险种编号
	 */
	@ApiField("coverage_no")
	private String coverageNo;

	/**
	 * 险种失效时间
	 */
	@ApiField("effect_end_time")
	private String effectEndTime;

	/**
	 * 险种生效时间
	 */
	@ApiField("effect_start_time")
	private String effectStartTime;

	/**
	 * 不计免赔;0：默认不投保;
1：默认投保。
	 */
	@ApiField("iop")
	private Long iop;

	/**
	 * 不计免赔的保费
	 */
	@ApiField("iop_premium")
	private Long iopPremium;

	/**
	 * 保费;单位分
	 */
	@ApiField("premium")
	private Long premium;

	/**
	 * 保额;单位分
	 */
	@ApiField("sum_insured")
	private Long sumInsured;

    /**
     * Gets coverage name.
     *
     * @return the coverage name
     */
    public String getCoverageName() {
		return this.coverageName;
	}

    /**
     * Sets coverage name.
     *
     * @param coverageName the coverage name
     */
    public void setCoverageName(String coverageName) {
		this.coverageName = coverageName;
	}

    /**
     * Gets coverage no.
     *
     * @return the coverage no
     */
    public String getCoverageNo() {
		return this.coverageNo;
	}

    /**
     * Sets coverage no.
     *
     * @param coverageNo the coverage no
     */
    public void setCoverageNo(String coverageNo) {
		this.coverageNo = coverageNo;
	}

    /**
     * Gets effect end time.
     *
     * @return the effect end time
     */
    public String getEffectEndTime() {
		return this.effectEndTime;
	}

    /**
     * Sets effect end time.
     *
     * @param effectEndTime the effect end time
     */
    public void setEffectEndTime(String effectEndTime) {
		this.effectEndTime = effectEndTime;
	}

    /**
     * Gets effect start time.
     *
     * @return the effect start time
     */
    public String getEffectStartTime() {
		return this.effectStartTime;
	}

    /**
     * Sets effect start time.
     *
     * @param effectStartTime the effect start time
     */
    public void setEffectStartTime(String effectStartTime) {
		this.effectStartTime = effectStartTime;
	}

    /**
     * Gets iop.
     *
     * @return the iop
     */
    public Long getIop() {
		return this.iop;
	}

    /**
     * Sets iop.
     *
     * @param iop the iop
     */
    public void setIop(Long iop) {
		this.iop = iop;
	}

    /**
     * Gets iop premium.
     *
     * @return the iop premium
     */
    public Long getIopPremium() {
		return this.iopPremium;
	}

    /**
     * Sets iop premium.
     *
     * @param iopPremium the iop premium
     */
    public void setIopPremium(Long iopPremium) {
		this.iopPremium = iopPremium;
	}

    /**
     * Gets premium.
     *
     * @return the premium
     */
    public Long getPremium() {
		return this.premium;
	}

    /**
     * Sets premium.
     *
     * @param premium the premium
     */
    public void setPremium(Long premium) {
		this.premium = premium;
	}

    /**
     * Gets sum insured.
     *
     * @return the sum insured
     */
    public Long getSumInsured() {
		return this.sumInsured;
	}

    /**
     * Sets sum insured.
     *
     * @param sumInsured the sum insured
     */
    public void setSumInsured(Long sumInsured) {
		this.sumInsured = sumInsured;
	}

}
