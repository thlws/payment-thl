package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投保申请信息
 *
 * @author auto create
 * @since 1.0, 2017-07-18 15:36:51
 */
public class InsApplication extends AlipayObject {

	private static final long serialVersionUID = 6112661775458117227L;

	/**
	 * 投保参数 ,每个产品特有的投保参数,如航空险的航班信息;标准json格式
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 份数
	 */
	@ApiField("copies")
	private Long copies;

	/**
	 * 失效时间
	 */
	@ApiField("effect_end_time")
	private Date effectEndTime;

	/**
	 * 生效时间
	 */
	@ApiField("effect_start_time")
	private Date effectStartTime;

	/**
	 * 保险标的
	 */
	@ApiField("ins_object")
	private InsObject insObject;

	/**
	 * 被保险人
	 */
	@ApiField("insured")
	private InsPerson insured;

	/**
	 * 险种保障期限,数字+"Y/M/D"结尾,非固定期限险种或多固定期限险种必填
	 */
	@ApiField("period")
	private String period;

	/**
	 * 保费
	 */
	@ApiField("premium")
	private Long premium;

	/**
	 * 保额
	 */
	@ApiField("sum_insured")
	private Long sumInsured;

    /**
     * Gets biz data.
     *
     * @return the biz data
     */
    public String getBizData() {
		return this.bizData;
	}

    /**
     * Sets biz data.
     *
     * @param bizData the biz data
     */
    public void setBizData(String bizData) {
		this.bizData = bizData;
	}

    /**
     * Gets copies.
     *
     * @return the copies
     */
    public Long getCopies() {
		return this.copies;
	}

    /**
     * Sets copies.
     *
     * @param copies the copies
     */
    public void setCopies(Long copies) {
		this.copies = copies;
	}

    /**
     * Gets effect end time.
     *
     * @return the effect end time
     */
    public Date getEffectEndTime() {
		return this.effectEndTime;
	}

    /**
     * Sets effect end time.
     *
     * @param effectEndTime the effect end time
     */
    public void setEffectEndTime(Date effectEndTime) {
		this.effectEndTime = effectEndTime;
	}

    /**
     * Gets effect start time.
     *
     * @return the effect start time
     */
    public Date getEffectStartTime() {
		return this.effectStartTime;
	}

    /**
     * Sets effect start time.
     *
     * @param effectStartTime the effect start time
     */
    public void setEffectStartTime(Date effectStartTime) {
		this.effectStartTime = effectStartTime;
	}

    /**
     * Gets ins object.
     *
     * @return the ins object
     */
    public InsObject getInsObject() {
		return this.insObject;
	}

    /**
     * Sets ins object.
     *
     * @param insObject the ins object
     */
    public void setInsObject(InsObject insObject) {
		this.insObject = insObject;
	}

    /**
     * Gets insured.
     *
     * @return the insured
     */
    public InsPerson getInsured() {
		return this.insured;
	}

    /**
     * Sets insured.
     *
     * @param insured the insured
     */
    public void setInsured(InsPerson insured) {
		this.insured = insured;
	}

    /**
     * Gets period.
     *
     * @return the period
     */
    public String getPeriod() {
		return this.period;
	}

    /**
     * Sets period.
     *
     * @param period the period
     */
    public void setPeriod(String period) {
		this.period = period;
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
