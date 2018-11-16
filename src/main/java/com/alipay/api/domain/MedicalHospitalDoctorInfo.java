package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医生信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class MedicalHospitalDoctorInfo extends AlipayObject {

	private static final long serialVersionUID = 6491971748446155243L;

	/**
	 * 医生唯一标识，编码开发者生成并保证唯一
	 */
	@ApiField("code")
	private String code;

	/**
	 * 医生名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 性别
女性：F
男性：M
未知：U
	 */
	@ApiField("sex")
	private String sex;

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
     * Gets sex.
     *
     * @return the sex
     */
    public String getSex() {
		return this.sex;
	}

    /**
     * Sets sex.
     *
     * @param sex the sex
     */
    public void setSex(String sex) {
		this.sex = sex;
	}

}
