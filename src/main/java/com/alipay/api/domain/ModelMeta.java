package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 模型列表信息
 *
 * @author auto create
 * @since 1.0, 2017-04-27 14:36:19
 */
public class ModelMeta extends AlipayObject {

	private static final long serialVersionUID = 3733772512938632724L;

	/**
	 * 模型描述
	 */
	@ApiField("model_desc")
	private String modelDesc;

	/**
	 * 模型名称
	 */
	@ApiField("model_name")
	private String modelName;

	/**
	 * 模型唯一查询标识符
	 */
	@ApiField("model_uk")
	private String modelUk;

	/**
	 * 查询参数
	 */
	@ApiListField("query_key")
	@ApiField("string")
	private List<String> queryKey;

    /**
     * Gets entity desc.
     *
     * @return the entity desc
     */
    public String getModelDesc() {
		return this.modelDesc;
	}

    /**
     * Sets entity desc.
     *
     * @param modelDesc the entity desc
     */
    public void setModelDesc(String modelDesc) {
		this.modelDesc = modelDesc;
	}

    /**
     * Gets entity name.
     *
     * @return the entity name
     */
    public String getModelName() {
		return this.modelName;
	}

    /**
     * Sets entity name.
     *
     * @param modelName the entity name
     */
    public void setModelName(String modelName) {
		this.modelName = modelName;
	}

    /**
     * Gets entity uk.
     *
     * @return the entity uk
     */
    public String getModelUk() {
		return this.modelUk;
	}

    /**
     * Sets entity uk.
     *
     * @param modelUk the entity uk
     */
    public void setModelUk(String modelUk) {
		this.modelUk = modelUk;
	}

    /**
     * Gets query key.
     *
     * @return the query key
     */
    public List<String> getQueryKey() {
		return this.queryKey;
	}

    /**
     * Sets query key.
     *
     * @param queryKey the query key
     */
    public void setQueryKey(List<String> queryKey) {
		this.queryKey = queryKey;
	}

}
