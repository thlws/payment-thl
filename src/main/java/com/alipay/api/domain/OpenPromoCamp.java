package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开放活动接口活动
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class OpenPromoCamp extends AlipayObject {

	private static final long serialVersionUID = 2441891859186486177L;

	/**
	 * 简短活动名，默认和活动名称相同
	 */
	@ApiField("camp_alias")
	private String campAlias;

	/**
	 * 活动描述
	 */
	@ApiField("camp_desc")
	private String campDesc;

	/**
	 * 活动结束时间
	 */
	@ApiField("camp_end_time")
	private String campEndTime;

	/**
	 * 活动名称
	 */
	@ApiField("camp_name")
	private String campName;

	/**
	 * 活动开始时间
	 */
	@ApiField("camp_start_time")
	private String campStartTime;

	/**
	 * 活动类型，现在支持DRAW_PRIZE：表示领奖活动
	 */
	@ApiField("camp_type")
	private String campType;

    /**
     * Gets camp alias.
     *
     * @return the camp alias
     */
    public String getCampAlias() {
		return this.campAlias;
	}

    /**
     * Sets camp alias.
     *
     * @param campAlias the camp alias
     */
    public void setCampAlias(String campAlias) {
		this.campAlias = campAlias;
	}

    /**
     * Gets camp desc.
     *
     * @return the camp desc
     */
    public String getCampDesc() {
		return this.campDesc;
	}

    /**
     * Sets camp desc.
     *
     * @param campDesc the camp desc
     */
    public void setCampDesc(String campDesc) {
		this.campDesc = campDesc;
	}

    /**
     * Gets camp end time.
     *
     * @return the camp end time
     */
    public String getCampEndTime() {
		return this.campEndTime;
	}

    /**
     * Sets camp end time.
     *
     * @param campEndTime the camp end time
     */
    public void setCampEndTime(String campEndTime) {
		this.campEndTime = campEndTime;
	}

    /**
     * Gets camp name.
     *
     * @return the camp name
     */
    public String getCampName() {
		return this.campName;
	}

    /**
     * Sets camp name.
     *
     * @param campName the camp name
     */
    public void setCampName(String campName) {
		this.campName = campName;
	}

    /**
     * Gets camp start time.
     *
     * @return the camp start time
     */
    public String getCampStartTime() {
		return this.campStartTime;
	}

    /**
     * Sets camp start time.
     *
     * @param campStartTime the camp start time
     */
    public void setCampStartTime(String campStartTime) {
		this.campStartTime = campStartTime;
	}

    /**
     * Gets camp type.
     *
     * @return the camp type
     */
    public String getCampType() {
		return this.campType;
	}

    /**
     * Sets camp type.
     *
     * @param campType the camp type
     */
    public void setCampType(String campType) {
		this.campType = campType;
	}

}
