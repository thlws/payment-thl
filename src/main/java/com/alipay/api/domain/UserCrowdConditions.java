package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 智慧餐厅用户规则集合
 *
 * @author auto create
 * @since 1.0, 2018-04-03 21:31:17
 */
public class UserCrowdConditions extends AlipayObject {

	private static final long serialVersionUID = 2646246927116866487L;

	/**
	 * 最爱这家店的人
	 */
	@ApiField("crowd_group_id")
	private String crowdGroupId;

	/**
	 * 用户群组描述
	 */
	@ApiField("describe")
	private String describe;

	/**
	 * 命中用户规则集合
	 */
	@ApiListField("hit_crowd_conditons")
	@ApiField("condition_item_pattern")
	private List<ConditionItemPattern> hitCrowdConditons;

    /**
     * Gets crowd group id.
     *
     * @return the crowd group id
     */
    public String getCrowdGroupId() {
		return this.crowdGroupId;
	}

    /**
     * Sets crowd group id.
     *
     * @param crowdGroupId the crowd group id
     */
    public void setCrowdGroupId(String crowdGroupId) {
		this.crowdGroupId = crowdGroupId;
	}

    /**
     * Gets describe.
     *
     * @return the describe
     */
    public String getDescribe() {
		return this.describe;
	}

    /**
     * Sets describe.
     *
     * @param describe the describe
     */
    public void setDescribe(String describe) {
		this.describe = describe;
	}

    /**
     * Gets hit crowd conditons.
     *
     * @return the hit crowd conditons
     */
    public List<ConditionItemPattern> getHitCrowdConditons() {
		return this.hitCrowdConditons;
	}

    /**
     * Sets hit crowd conditons.
     *
     * @param hitCrowdConditons the hit crowd conditons
     */
    public void setHitCrowdConditons(List<ConditionItemPattern> hitCrowdConditons) {
		this.hitCrowdConditons = hitCrowdConditons;
	}

}
