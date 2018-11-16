package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ConditionItemPattern;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.crowdgroup.condition.set response.
 *
 * @author auto create
 * @since 1.0, 2018-06-22 14:29:19
 */
public class KoubeiCateringCrowdgroupConditionSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8721487444652814956L;

	/** 
	 * 创建成功返回isv创建的分组规则列表
	 */
	@ApiListField("condition_model_list")
	@ApiField("condition_item_pattern")
	private List<ConditionItemPattern> conditionModelList;

	/** 
	 * isv创建的用户分组id
	 */
	@ApiField("crowd_group_id")
	private String crowdGroupId;

	/** 
	 * 创建状态: success fail
	 */
	@ApiField("status")
	private String status;

    /**
     * Sets condition entity list.
     *
     * @param conditionModelList the condition entity list
     */
    public void setConditionModelList(List<ConditionItemPattern> conditionModelList) {
		this.conditionModelList = conditionModelList;
	}

    /**
     * Gets condition entity list.
     *
     * @return the condition entity list
     */
    public List<ConditionItemPattern> getConditionModelList( ) {
		return this.conditionModelList;
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
     * Gets crowd group id.
     *
     * @return the crowd group id
     */
    public String getCrowdGroupId( ) {
		return this.crowdGroupId;
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
