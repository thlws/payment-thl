package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代理人实名认证接口
 *
 * @author auto create
 * @since 1.0, 2017-12-13 11:31:13
 */
public class AlipayInsAutoAutoinsprodUserCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 5312656935744374343L;

	/**
	 * 代理人姓名
	 */
	@ApiField("agent_id_card_name")
	private String agentIdCardName;

	/**
	 * 代理人身份证号
	 */
	@ApiField("agent_id_card_no")
	private String agentIdCardNo;

	/**
	 * 代理人用户唯一标识
	 */
	@ApiField("agent_user_id")
	private String agentUserId;

    /**
     * Gets agent id card name.
     *
     * @return the agent id card name
     */
    public String getAgentIdCardName() {
		return this.agentIdCardName;
	}

    /**
     * Sets agent id card name.
     *
     * @param agentIdCardName the agent id card name
     */
    public void setAgentIdCardName(String agentIdCardName) {
		this.agentIdCardName = agentIdCardName;
	}

    /**
     * Gets agent id card no.
     *
     * @return the agent id card no
     */
    public String getAgentIdCardNo() {
		return this.agentIdCardNo;
	}

    /**
     * Sets agent id card no.
     *
     * @param agentIdCardNo the agent id card no
     */
    public void setAgentIdCardNo(String agentIdCardNo) {
		this.agentIdCardNo = agentIdCardNo;
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

}
