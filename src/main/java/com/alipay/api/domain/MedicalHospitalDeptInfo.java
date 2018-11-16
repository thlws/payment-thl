package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医院科室信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class MedicalHospitalDeptInfo extends AlipayObject {

	private static final long serialVersionUID = 6128619478695791158L;

	/**
	 * 科室唯一标识，编码开发者生成并保证唯一
	 */
	@ApiField("code")
	private String code;

	/**
	 * 科室位置
	 */
	@ApiField("location")
	private String location;

	/**
	 * 科室名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 父科室名称 如果是顶层科室可空 目的定位科室级联关系
	 */
	@ApiField("parent_name")
	private String parentName;

	/**
	 * 父科室唯一标识
如果是顶层科室可空
目的定位科室级联关系
	 */
	@ApiField("partner_code")
	private String partnerCode;

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
		return this.code;
	}

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
		this.code = code;
	}

    /**
     * Gets location.
     *
     * @return the location
     */
    public String getLocation() {
		return this.location;
	}

    /**
     * Sets location.
     *
     * @param location the location
     */
    public void setLocation(String location) {
		this.location = location;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets parent name.
     *
     * @return the parent name
     */
    public String getParentName() {
		return this.parentName;
	}

    /**
     * Sets parent name.
     *
     * @param parentName the parent name
     */
    public void setParentName(String parentName) {
		this.parentName = parentName;
	}

    /**
     * Gets partner code.
     *
     * @return the partner code
     */
    public String getPartnerCode() {
		return this.partnerCode;
	}

    /**
     * Sets partner code.
     *
     * @param partnerCode the partner code
     */
    public void setPartnerCode(String partnerCode) {
		this.partnerCode = partnerCode;
	}

}
