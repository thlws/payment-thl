package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.activity.signup.create response.
 *
 * @author auto create
 * @since 1.0, 2018-09-01 09:21:08
 */
public class AntMerchantExpandActivitySignupCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8593318632931422198L;

	/** 
	 * 接口返回描述：e.g.报名失败:没有报名资格/报名成功/报名确认
	 */
	@ApiField("desc")
	private String desc;

	/** 
	 * 支付宝商户id
	 */
	@ApiField("pid")
	private String pid;

	/** 
	 * 报名接口状态，SUCCESS成功，FAIL失败
	 */
	@ApiField("status")
	private String status;

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String desc) {
		this.desc = desc;
	}

    /**
     * Gets desc.
     *
     * @return the desc
     */
    public String getDesc( ) {
		return this.desc;
	}

    /**
     * Sets pid.
     *
     * @param pid the pid
     */
    public void setPid(String pid) {
		this.pid = pid;
	}

    /**
     * Gets pid.
     *
     * @return the pid
     */
    public String getPid( ) {
		return this.pid;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus( ) {
		return this.status;
	}

}
