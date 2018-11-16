package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 组织部门标签
 *
 * @author auto create
 * @since 1.0, 2018-05-31 20:25:44
 */
public class DepartmentLabel extends AlipayObject {

	private static final long serialVersionUID = 4569958134167248322L;

	/**
	 * 部门标签码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 部门标签id
	 */
	@ApiField("label_id")
	private String labelId;

	/**
	 * 部门标签名称
	 */
	@ApiField("name")
	private String name;

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
     * Gets label id.
     *
     * @return the label id
     */
    public String getLabelId() {
		return this.labelId;
	}

    /**
     * Sets label id.
     *
     * @param labelId the label id
     */
    public void setLabelId(String labelId) {
		this.labelId = labelId;
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

}
