package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保险产品对应的险种;
 *
 * @author auto create
 * @since 1.0, 2017-09-22 16:53:23
 */
public class InsProdCoverage extends AlipayObject {

	private static final long serialVersionUID = 4854596411924165122L;

	/**
	 * 险种描述
	 */
	@ApiField("coverage_desc")
	private String coverageDesc;

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
	 * 是否定期险种
	 */
	@ApiField("is_fixed_period")
	private Boolean isFixedPeriod;

	/**
	 * 险种责任列表
	 */
	@ApiListField("liabilities")
	@ApiField("ins_liability")
	private List<InsLiability> liabilities;

	/**
	 * 可用的保障期限列表;约定“1D”代表一天，“1M”代表一个月,"1Y"代表一年
	 */
	@ApiListField("periods")
	@ApiField("string")
	private List<String> periods;

	/**
	 * 保额
	 */
	@ApiField("sum_insured")
	private InsSumInsured sumInsured;

    /**
     * Gets coverage desc.
     *
     * @return the coverage desc
     */
    public String getCoverageDesc() {
		return this.coverageDesc;
	}

    /**
     * Sets coverage desc.
     *
     * @param coverageDesc the coverage desc
     */
    public void setCoverageDesc(String coverageDesc) {
		this.coverageDesc = coverageDesc;
	}

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
     * Gets is fixed period.
     *
     * @return the is fixed period
     */
    public Boolean getIsFixedPeriod() {
		return this.isFixedPeriod;
	}

    /**
     * Sets is fixed period.
     *
     * @param isFixedPeriod the is fixed period
     */
    public void setIsFixedPeriod(Boolean isFixedPeriod) {
		this.isFixedPeriod = isFixedPeriod;
	}

    /**
     * Gets liabilities.
     *
     * @return the liabilities
     */
    public List<InsLiability> getLiabilities() {
		return this.liabilities;
	}

    /**
     * Sets liabilities.
     *
     * @param liabilities the liabilities
     */
    public void setLiabilities(List<InsLiability> liabilities) {
		this.liabilities = liabilities;
	}

    /**
     * Gets periods.
     *
     * @return the periods
     */
    public List<String> getPeriods() {
		return this.periods;
	}

    /**
     * Sets periods.
     *
     * @param periods the periods
     */
    public void setPeriods(List<String> periods) {
		this.periods = periods;
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
