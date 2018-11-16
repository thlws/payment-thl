package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * （快捷投保）生成产品二维码
 *
 * @author auto create
 * @since 1.0, 2017-10-24 10:29:16
 */
public class AlipayInsCooperationProductQrcodeApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4892678228648932777L;

	/**
	 * 保险代理人在保险公司的惟一ID，数据来自保险公司内部管理系统
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 代理人姓名
	 */
	@ApiField("agent_name")
	private String agentName;

	/**
	 * 代理人手机号码
	 */
	@ApiField("agent_phone")
	private String agentPhone;

	/**
	 * 保险公司在蚂蚁保险平台的惟一ID，由蚂蚁保险平台分配。
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 产品编码，蚂蚁保险平台会为每个产品分配一个唯一的产品编码
	 */
	@ApiField("prod_code")
	private String prodCode;

    /**
     * Gets agent id.
     *
     * @return the agent id
     */
    public String getAgentId() {
		return this.agentId;
	}

    /**
     * Sets agent id.
     *
     * @param agentId the agent id
     */
    public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

    /**
     * Gets agent name.
     *
     * @return the agent name
     */
    public String getAgentName() {
		return this.agentName;
	}

    /**
     * Sets agent name.
     *
     * @param agentName the agent name
     */
    public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

    /**
     * Gets agent phone.
     *
     * @return the agent phone
     */
    public String getAgentPhone() {
		return this.agentPhone;
	}

    /**
     * Sets agent phone.
     *
     * @param agentPhone the agent phone
     */
    public void setAgentPhone(String agentPhone) {
		this.agentPhone = agentPhone;
	}

    /**
     * Gets inst id.
     *
     * @return the inst id
     */
    public String getInstId() {
		return this.instId;
	}

    /**
     * Sets inst id.
     *
     * @param instId the inst id
     */
    public void setInstId(String instId) {
		this.instId = instId;
	}

    /**
     * Gets prod code.
     *
     * @return the prod code
     */
    public String getProdCode() {
		return this.prodCode;
	}

    /**
     * Sets prod code.
     *
     * @param prodCode the prod code
     */
    public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

}
