package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑智慧餐厅精准营销用户人群分组操作接口
 *
 * @author auto create
 * @since 1.0, 2018-04-04 15:13:40
 */
public class KoubeiCateringCrowdgroupConditionSetModel extends AlipayObject {

	private static final long serialVersionUID = 8791889278894391841L;

	/**
	 * 人群规则（创建，更新的时候必填）
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
	 * 针对用户分组的描述(创建和更新时必填)
	 */
	@ApiField("describe")
	private String describe;

	/**
	 * 智慧餐厅用户规则操作创建，删除，查询，更新枚举(CREATE("CREATE", "创建"),DELETE("DELETE", "删除"),RETRIEVE("RETRIEVE", "查询"), UPDATE("UPDATE", "修改"))
	 */
	@ApiField("operation")
	private String operation;

	/**
	 * 创建规则人的id号
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 智慧餐厅操作人类型，包括("MER", "外部商户")，("MER_OPERATOR", "外部操作员")，("PROVIDER", "外部服务商")，("PROVIDER_STAFF", "外部服务商员工")；不传时默认是MER
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

    /**
     * Gets condition entity list.
     *
     * @return the condition entity list
     */
    public List<ConditionItemPattern> getConditionModelList() {
		return this.conditionModelList;
	}

    /**
     * Sets condition entity list.
     *
     * @param conditionModelList the condition entity list
     */
    public void setConditionModelList(List<ConditionItemPattern> conditionModelList) {
		this.conditionModelList = conditionModelList;
	}

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
     * Gets operation.
     *
     * @return the operation
     */
    public String getOperation() {
		return this.operation;
	}

    /**
     * Sets operation.
     *
     * @param operation the operation
     */
    public void setOperation(String operation) {
		this.operation = operation;
	}

    /**
     * Gets operator id.
     *
     * @return the operator id
     */
    public String getOperatorId() {
		return this.operatorId;
	}

    /**
     * Sets operator id.
     *
     * @param operatorId the operator id
     */
    public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

    /**
     * Gets operator type.
     *
     * @return the operator type
     */
    public String getOperatorType() {
		return this.operatorType;
	}

    /**
     * Sets operator type.
     *
     * @param operatorType the operator type
     */
    public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

    /**
     * Gets shop id.
     *
     * @return the shop id
     */
    public String getShopId() {
		return this.shopId;
	}

    /**
     * Sets shop id.
     *
     * @param shopId the shop id
     */
    public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
