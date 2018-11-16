package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 中再核保结果查询
 *
 * @author auto create
 * @since 1.0, 2018-01-22 10:27:48
 */
public class AlipayDataDataserviceChinaremodelQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5152346435195564265L;

	/**
	 * 体检记录id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 规则id
	 */
	@ApiField("rule_id")
	private String ruleId;

	/**
	 * 交易流水记录id
	 */
	@ApiField("trans_id")
	private String transId;

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
		return this.id;
	}

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
		this.id = id;
	}

    /**
     * Gets rule id.
     *
     * @return the rule id
     */
    public String getRuleId() {
		return this.ruleId;
	}

    /**
     * Sets rule id.
     *
     * @param ruleId the rule id
     */
    public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

    /**
     * Gets trans id.
     *
     * @return the trans id
     */
    public String getTransId() {
		return this.transId;
	}

    /**
     * Sets trans id.
     *
     * @param transId the trans id
     */
    public void setTransId(String transId) {
		this.transId = transId;
	}

}
