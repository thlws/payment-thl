package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserCrowdConditions;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.crowdgroup.condition.query response.
 *
 * @author auto create
 * @since 1.0, 2018-06-22 14:35:00
 */
public class KoubeiCateringCrowdgroupConditionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7115426823384285691L;

	/** 
	 * isv创建的用户规则分组描述
	 */
	@ApiListField("condition_list")
	@ApiField("user_crowd_conditions")
	private List<UserCrowdConditions> conditionList;

    /**
     * Sets condition list.
     *
     * @param conditionList the condition list
     */
    public void setConditionList(List<UserCrowdConditions> conditionList) {
		this.conditionList = conditionList;
	}

    /**
     * Gets condition list.
     *
     * @return the condition list
     */
    public List<UserCrowdConditions> getConditionList( ) {
		return this.conditionList;
	}

}
