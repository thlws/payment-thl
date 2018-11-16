package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 定损宝图像定损结果详情对象
 *
 * @author auto create
 * @since 1.0, 2017-08-07 17:31:25
 */
public class InsDataDsbEstimateResultDetail extends AlipayObject {

	private static final long serialVersionUID = 6146221719921311662L;

	/**
	 * 受损程度
	 */
	@ApiField("damage_degree")
	private String damageDegree;

	/**
	 * 受损程度中文描述
	 */
	@ApiField("damage_degree_desc")
	private String damageDegreeDesc;

	/**
	 * 受损类型
	 */
	@ApiField("damage_type")
	private String damageType;

	/**
	 * 受损类型中文描述
	 */
	@ApiField("damage_type_desc")
	private String damageTypeDesc;

	/**
	 * 工时项目代码
	 */
	@ApiField("hourly_code")
	private String hourlyCode;

	/**
	 * 工时费
	 */
	@ApiField("hourly_wage")
	private String hourlyWage;

	/**
	 * 配件OE码
	 */
	@ApiField("oe_code")
	private String oeCode;

	/**
	 * 是否旧件回收，true或false
	 */
	@ApiField("old_recycle")
	private Boolean oldRecycle;

	/**
	 * 配件费用
	 */
	@ApiField("parts_cost")
	private String partsCost;

	/**
	 * 零件管理费，单位：元
	 */
	@ApiField("parts_manage_fee")
	private String partsManageFee;

	/**
	 * 配件名称
	 */
	@ApiField("parts_name")
	private String partsName;

	/**
	 * 残值扣除，单位：元
	 */
	@ApiField("remain_value")
	private String remainValue;

	/**
	 * 维修方案
	 */
	@ApiField("repair_type")
	private String repairType;

	/**
	 * 维修方案中文描述
	 */
	@ApiField("repair_type_desc")
	private String repairTypeDesc;

    /**
     * Gets damage degree.
     *
     * @return the damage degree
     */
    public String getDamageDegree() {
		return this.damageDegree;
	}

    /**
     * Sets damage degree.
     *
     * @param damageDegree the damage degree
     */
    public void setDamageDegree(String damageDegree) {
		this.damageDegree = damageDegree;
	}

    /**
     * Gets damage degree desc.
     *
     * @return the damage degree desc
     */
    public String getDamageDegreeDesc() {
		return this.damageDegreeDesc;
	}

    /**
     * Sets damage degree desc.
     *
     * @param damageDegreeDesc the damage degree desc
     */
    public void setDamageDegreeDesc(String damageDegreeDesc) {
		this.damageDegreeDesc = damageDegreeDesc;
	}

    /**
     * Gets damage type.
     *
     * @return the damage type
     */
    public String getDamageType() {
		return this.damageType;
	}

    /**
     * Sets damage type.
     *
     * @param damageType the damage type
     */
    public void setDamageType(String damageType) {
		this.damageType = damageType;
	}

    /**
     * Gets damage type desc.
     *
     * @return the damage type desc
     */
    public String getDamageTypeDesc() {
		return this.damageTypeDesc;
	}

    /**
     * Sets damage type desc.
     *
     * @param damageTypeDesc the damage type desc
     */
    public void setDamageTypeDesc(String damageTypeDesc) {
		this.damageTypeDesc = damageTypeDesc;
	}

    /**
     * Gets hourly code.
     *
     * @return the hourly code
     */
    public String getHourlyCode() {
		return this.hourlyCode;
	}

    /**
     * Sets hourly code.
     *
     * @param hourlyCode the hourly code
     */
    public void setHourlyCode(String hourlyCode) {
		this.hourlyCode = hourlyCode;
	}

    /**
     * Gets hourly wage.
     *
     * @return the hourly wage
     */
    public String getHourlyWage() {
		return this.hourlyWage;
	}

    /**
     * Sets hourly wage.
     *
     * @param hourlyWage the hourly wage
     */
    public void setHourlyWage(String hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

    /**
     * Gets oe code.
     *
     * @return the oe code
     */
    public String getOeCode() {
		return this.oeCode;
	}

    /**
     * Sets oe code.
     *
     * @param oeCode the oe code
     */
    public void setOeCode(String oeCode) {
		this.oeCode = oeCode;
	}

    /**
     * Gets old recycle.
     *
     * @return the old recycle
     */
    public Boolean getOldRecycle() {
		return this.oldRecycle;
	}

    /**
     * Sets old recycle.
     *
     * @param oldRecycle the old recycle
     */
    public void setOldRecycle(Boolean oldRecycle) {
		this.oldRecycle = oldRecycle;
	}

    /**
     * Gets parts cost.
     *
     * @return the parts cost
     */
    public String getPartsCost() {
		return this.partsCost;
	}

    /**
     * Sets parts cost.
     *
     * @param partsCost the parts cost
     */
    public void setPartsCost(String partsCost) {
		this.partsCost = partsCost;
	}

    /**
     * Gets parts manage fee.
     *
     * @return the parts manage fee
     */
    public String getPartsManageFee() {
		return this.partsManageFee;
	}

    /**
     * Sets parts manage fee.
     *
     * @param partsManageFee the parts manage fee
     */
    public void setPartsManageFee(String partsManageFee) {
		this.partsManageFee = partsManageFee;
	}

    /**
     * Gets parts name.
     *
     * @return the parts name
     */
    public String getPartsName() {
		return this.partsName;
	}

    /**
     * Sets parts name.
     *
     * @param partsName the parts name
     */
    public void setPartsName(String partsName) {
		this.partsName = partsName;
	}

    /**
     * Gets remain value.
     *
     * @return the remain value
     */
    public String getRemainValue() {
		return this.remainValue;
	}

    /**
     * Sets remain value.
     *
     * @param remainValue the remain value
     */
    public void setRemainValue(String remainValue) {
		this.remainValue = remainValue;
	}

    /**
     * Gets repair type.
     *
     * @return the repair type
     */
    public String getRepairType() {
		return this.repairType;
	}

    /**
     * Sets repair type.
     *
     * @param repairType the repair type
     */
    public void setRepairType(String repairType) {
		this.repairType = repairType;
	}

    /**
     * Gets repair type desc.
     *
     * @return the repair type desc
     */
    public String getRepairTypeDesc() {
		return this.repairTypeDesc;
	}

    /**
     * Sets repair type desc.
     *
     * @param repairTypeDesc the repair type desc
     */
    public void setRepairTypeDesc(String repairTypeDesc) {
		this.repairTypeDesc = repairTypeDesc;
	}

}
