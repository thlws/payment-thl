package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 询价接口
 *
 * @author auto create
 * @since 1.0, 2018-01-09 11:36:15
 */
public class AlipayInsAutoAutoinsprodEnquriyApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1627927426146474669L;

	/**
	 * 代理人身份信息
	 */
	@ApiField("agent")
	private InsPerson agent;

	/**
	 * 代理人userId
	 */
	@ApiField("agent_user_id")
	private String agentUserId;

	/**
	 * 投保人身份信息
	 */
	@ApiField("applicant")
	private InsPerson applicant;

	/**
	 * 车辆信息
	 */
	@ApiField("car")
	private Car car;

	/**
	 * 车主身份信息
	 */
	@ApiField("car_owner")
	private InsPerson carOwner;

	/**
	 * 投保城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 被保人身份信息
	 */
	@ApiField("insured")
	private InsPerson insured;

	/**
	 * 外部询价申请业务单号（幂等字段）
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

    /**
     * Gets agent.
     *
     * @return the agent
     */
    public InsPerson getAgent() {
		return this.agent;
	}

    /**
     * Sets agent.
     *
     * @param agent the agent
     */
    public void setAgent(InsPerson agent) {
		this.agent = agent;
	}

    /**
     * Gets agent user id.
     *
     * @return the agent user id
     */
    public String getAgentUserId() {
		return this.agentUserId;
	}

    /**
     * Sets agent user id.
     *
     * @param agentUserId the agent user id
     */
    public void setAgentUserId(String agentUserId) {
		this.agentUserId = agentUserId;
	}

    /**
     * Gets applicant.
     *
     * @return the applicant
     */
    public InsPerson getApplicant() {
		return this.applicant;
	}

    /**
     * Sets applicant.
     *
     * @param applicant the applicant
     */
    public void setApplicant(InsPerson applicant) {
		this.applicant = applicant;
	}

    /**
     * Gets car.
     *
     * @return the car
     */
    public Car getCar() {
		return this.car;
	}

    /**
     * Sets car.
     *
     * @param car the car
     */
    public void setCar(Car car) {
		this.car = car;
	}

    /**
     * Gets car owner.
     *
     * @return the car owner
     */
    public InsPerson getCarOwner() {
		return this.carOwner;
	}

    /**
     * Sets car owner.
     *
     * @param carOwner the car owner
     */
    public void setCarOwner(InsPerson carOwner) {
		this.carOwner = carOwner;
	}

    /**
     * Gets city code.
     *
     * @return the city code
     */
    public String getCityCode() {
		return this.cityCode;
	}

    /**
     * Sets city code.
     *
     * @param cityCode the city code
     */
    public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
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
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
