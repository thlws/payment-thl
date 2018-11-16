package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开发者配置意图数据
 *
 * @author auto create
 * @since 1.0, 2018-08-21 16:56:24
 */
public class AlipayOpenMiniSetintentiondataSetModel extends AlipayObject {

	private static final long serialVersionUID = 7364523337597796712L;

	/**
	 * 本次更新动作类型,put:新增或覆盖,remove:删除
	 */
	@ApiField("action")
	private String action;

	/**
	 * 当前批次的唯一编号,对应本批次上传的多条意图数据，开发者自定义
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 用于标识数据所属的服务类目
	 */
	@ApiField("category")
	private String category;

	/**
	 * 推送到服务库的数据列表,json array格式的字符串
	 */
	@ApiField("data")
	private String data;

    /**
     * Gets action.
     *
     * @return the action
     */
    public String getAction() {
		return this.action;
	}

    /**
     * Sets action.
     *
     * @param action the action
     */
    public void setAction(String action) {
		this.action = action;
	}

    /**
     * Gets batch no.
     *
     * @return the batch no
     */
    public String getBatchNo() {
		return this.batchNo;
	}

    /**
     * Sets batch no.
     *
     * @param batchNo the batch no
     */
    public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

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
     * Gets data.
     *
     * @return the data
     */
    public String getData() {
		return this.data;
	}

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(String data) {
		this.data = data;
	}

}
