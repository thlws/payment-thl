package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 调查的数据项详情
 *
 * @author auto create
 * @since 1.0, 2017-08-07 10:17:08
 */
public class InvestigCategoryData extends AlipayObject {

	private static final long serialVersionUID = 6262591871513513517L;

	/**
	 * 数据项
	 */
	@ApiField("category")
	private String category;

	/**
	 * 采集的数据的版本号。
	 */
	@ApiField("data_version")
	private String dataVersion;

	/**
	 * 实体code
	 */
	@ApiField("entity_code")
	private String entityCode;

	/**
	 * 实体名
	 */
	@ApiField("entity_name")
	private String entityName;

	/**
	 * 实体类别
	 */
	@ApiField("entity_type")
	private String entityType;

	/**
	 * 征信模型结果,以JSON格式输出，包括征信评分creditScore、不准入原因refuseReasons、模型标识码modelIdCode三个字段
	 */
	@ApiField("model_result_object")
	private String modelResultObject;

	/**
	 * 采集状态
	 */
	@ApiField("state")
	private String state;

    /**
     * Gets category.
     *
     * @return the category
     */
    public String getCategory() {
		return this.category;
	}

    /**
     * Sets category.
     *
     * @param category the category
     */
    public void setCategory(String category) {
		this.category = category;
	}

    /**
     * Gets data version.
     *
     * @return the data version
     */
    public String getDataVersion() {
		return this.dataVersion;
	}

    /**
     * Sets data version.
     *
     * @param dataVersion the data version
     */
    public void setDataVersion(String dataVersion) {
		this.dataVersion = dataVersion;
	}

    /**
     * Gets entity code.
     *
     * @return the entity code
     */
    public String getEntityCode() {
		return this.entityCode;
	}

    /**
     * Sets entity code.
     *
     * @param entityCode the entity code
     */
    public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}

    /**
     * Gets entity name.
     *
     * @return the entity name
     */
    public String getEntityName() {
		return this.entityName;
	}

    /**
     * Sets entity name.
     *
     * @param entityName the entity name
     */
    public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

    /**
     * Gets entity type.
     *
     * @return the entity type
     */
    public String getEntityType() {
		return this.entityType;
	}

    /**
     * Sets entity type.
     *
     * @param entityType the entity type
     */
    public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

    /**
     * Gets entity result object.
     *
     * @return the entity result object
     */
    public String getModelResultObject() {
		return this.modelResultObject;
	}

    /**
     * Sets entity result object.
     *
     * @param modelResultObject the entity result object
     */
    public void setModelResultObject(String modelResultObject) {
		this.modelResultObject = modelResultObject;
	}

    /**
     * Gets state.
     *
     * @return the state
     */
    public String getState() {
		return this.state;
	}

    /**
     * Sets state.
     *
     * @param state the state
     */
    public void setState(String state) {
		this.state = state;
	}

}
