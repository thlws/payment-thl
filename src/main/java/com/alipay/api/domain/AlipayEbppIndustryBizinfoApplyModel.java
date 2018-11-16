package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公服行业通用业务办理
 *
 * @author auto create
 * @since 1.0, 2018-07-17 15:15:05
 */
public class AlipayEbppIndustryBizinfoApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6392947174477291995L;

	/**
	 * 业务能力码，标识业务场景
	 */
	@ApiField("ability_code")
	private String abilityCode;

	/**
	 * 业务账户号，例如水费单号，手机号，电费号，信用卡卡号。没有唯一性要求。
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 业务机构简称
	 */
	@ApiField("biz_inst")
	private String bizInst;

	/**
	 * 业务类型，公服业务：IND
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 外部申请流水号，支持幂等
	 */
	@ApiField("out_apply_no")
	private String outApplyNo;

	/**
	 * 请求上下文，json格式
	 */
	@ApiField("request_context")
	private String requestContext;

    /**
     * Gets ability code.
     *
     * @return the ability code
     */
    public String getAbilityCode() {
		return this.abilityCode;
	}

    /**
     * Sets ability code.
     *
     * @param abilityCode the ability code
     */
    public void setAbilityCode(String abilityCode) {
		this.abilityCode = abilityCode;
	}

    /**
     * Gets bill key.
     *
     * @return the bill key
     */
    public String getBillKey() {
		return this.billKey;
	}

    /**
     * Sets bill key.
     *
     * @param billKey the bill key
     */
    public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

    /**
     * Gets biz inst.
     *
     * @return the biz inst
     */
    public String getBizInst() {
		return this.bizInst;
	}

    /**
     * Sets biz inst.
     *
     * @param bizInst the biz inst
     */
    public void setBizInst(String bizInst) {
		this.bizInst = bizInst;
	}

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType() {
		return this.bizType;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets out apply no.
     *
     * @return the out apply no
     */
    public String getOutApplyNo() {
		return this.outApplyNo;
	}

    /**
     * Sets out apply no.
     *
     * @param outApplyNo the out apply no
     */
    public void setOutApplyNo(String outApplyNo) {
		this.outApplyNo = outApplyNo;
	}

    /**
     * Gets request context.
     *
     * @return the request context
     */
    public String getRequestContext() {
		return this.requestContext;
	}

    /**
     * Sets request context.
     *
     * @param requestContext the request context
     */
    public void setRequestContext(String requestContext) {
		this.requestContext = requestContext;
	}

}
