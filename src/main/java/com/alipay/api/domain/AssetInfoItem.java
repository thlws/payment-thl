package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料信息
 *
 * @author auto create
 * @since 1.0, 2018-09-18 09:09:30
 */
public class AssetInfoItem extends AlipayObject {

	private static final long serialVersionUID = 8176385817677653118L;

	/**
	 * 配送或者生产指令id.
	 */
	@ApiField("assign_item_id")
	private String assignItemId;

	/**
	 * 由供应商自定义的分批反馈批次号，用于保持幂等，此值不传则需要按整批反馈.(由字母,数字,下划线组成)
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 物流公司code
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 物流单号
	 */
	@ApiField("logistics_no")
	private String logisticsNo;

	/**
	 * 机具序列号
	 */
	@ApiField("sub_type")
	private String subType;

	/**
	 * 生产资料, 配送资料
	 */
	@ApiField("type")
	private String type;

	/**
	 * 格式按照type约定的类型传入, 约定参见物料平台openAPI文档.
	 */
	@ApiField("value")
	private String value;

    /**
     * Gets assign item id.
     *
     * @return the assign item id
     */
    public String getAssignItemId() {
		return this.assignItemId;
	}

    /**
     * Sets assign item id.
     *
     * @param assignItemId the assign item id
     */
    public void setAssignItemId(String assignItemId) {
		this.assignItemId = assignItemId;
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
     * Gets logistics code.
     *
     * @return the logistics code
     */
    public String getLogisticsCode() {
		return this.logisticsCode;
	}

    /**
     * Sets logistics code.
     *
     * @param logisticsCode the logistics code
     */
    public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

    /**
     * Gets logistics no.
     *
     * @return the logistics no
     */
    public String getLogisticsNo() {
		return this.logisticsNo;
	}

    /**
     * Sets logistics no.
     *
     * @param logisticsNo the logistics no
     */
    public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
	}

    /**
     * Gets sub type.
     *
     * @return the sub type
     */
    public String getSubType() {
		return this.subType;
	}

    /**
     * Sets sub type.
     *
     * @param subType the sub type
     */
    public void setSubType(String subType) {
		this.subType = subType;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
	}

    /**
     * Gets value.
     *
     * @return the value
     */
    public String getValue() {
		return this.value;
	}

    /**
     * Sets value.
     *
     * @param value the value
     */
    public void setValue(String value) {
		this.value = value;
	}

}
