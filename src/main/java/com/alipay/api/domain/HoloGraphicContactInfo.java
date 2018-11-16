package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 全息信用2.0联系人信息
 *
 * @author auto create
 * @since 1.0, 2017-07-21 16:40:25
 */
public class HoloGraphicContactInfo extends AlipayObject {

	private static final long serialVersionUID = 8615191961313497717L;

	/**
	 * 主叫通话频次
	 */
	@ApiField("call_frequency")
	private Long callFrequency;

	/**
	 * 主叫通话时长
	 */
	@ApiField("call_time")
	private Long callTime;

	/**
	 * 被叫通话频次
	 */
	@ApiField("called_frequency")
	private Long calledFrequency;

	/**
	 * 被叫通话时长
	 */
	@ApiField("called_time")
	private Long calledTime;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 通话频次
	 */
	@ApiField("talk_frequency")
	private Long talkFrequency;

	/**
	 * 通话时长
	 */
	@ApiField("talk_time")
	private Long talkTime;

    /**
     * Gets call frequency.
     *
     * @return the call frequency
     */
    public Long getCallFrequency() {
		return this.callFrequency;
	}

    /**
     * Sets call frequency.
     *
     * @param callFrequency the call frequency
     */
    public void setCallFrequency(Long callFrequency) {
		this.callFrequency = callFrequency;
	}

    /**
     * Gets call time.
     *
     * @return the call time
     */
    public Long getCallTime() {
		return this.callTime;
	}

    /**
     * Sets call time.
     *
     * @param callTime the call time
     */
    public void setCallTime(Long callTime) {
		this.callTime = callTime;
	}

    /**
     * Gets called frequency.
     *
     * @return the called frequency
     */
    public Long getCalledFrequency() {
		return this.calledFrequency;
	}

    /**
     * Sets called frequency.
     *
     * @param calledFrequency the called frequency
     */
    public void setCalledFrequency(Long calledFrequency) {
		this.calledFrequency = calledFrequency;
	}

    /**
     * Gets called time.
     *
     * @return the called time
     */
    public Long getCalledTime() {
		return this.calledTime;
	}

    /**
     * Sets called time.
     *
     * @param calledTime the called time
     */
    public void setCalledTime(Long calledTime) {
		this.calledTime = calledTime;
	}

    /**
     * Gets mobile.
     *
     * @return the mobile
     */
    public String getMobile() {
		return this.mobile;
	}

    /**
     * Sets mobile.
     *
     * @param mobile the mobile
     */
    public void setMobile(String mobile) {
		this.mobile = mobile;
	}

    /**
     * Gets talk frequency.
     *
     * @return the talk frequency
     */
    public Long getTalkFrequency() {
		return this.talkFrequency;
	}

    /**
     * Sets talk frequency.
     *
     * @param talkFrequency the talk frequency
     */
    public void setTalkFrequency(Long talkFrequency) {
		this.talkFrequency = talkFrequency;
	}

    /**
     * Gets talk time.
     *
     * @return the talk time
     */
    public Long getTalkTime() {
		return this.talkTime;
	}

    /**
     * Sets talk time.
     *
     * @param talkTime the talk time
     */
    public void setTalkTime(Long talkTime) {
		this.talkTime = talkTime;
	}

}
