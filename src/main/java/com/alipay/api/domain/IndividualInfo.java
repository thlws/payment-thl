package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 个人信息，包含与商户有关联的个体，如联系人，董事，控股个人，等的姓名，地址，生日，国籍等信息。
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class IndividualInfo extends AlipayObject {

	private static final long serialVersionUID = 3187177814564468975L;

	/**
	 * 生日
	 */
	@ApiField("date_of_birth")
	private String dateOfBirth;

	/**
	 * 证件号码
	 */
	@ApiField("id_number")
	private String idNumber;

	/**
	 * 个人名字
	 */
	@ApiField("name")
	private String name;

	/**
	 * 国籍
	 */
	@ApiField("nationality")
	private String nationality;

	/**
	 * 个人居住地
	 */
	@ApiField("residential_address")
	private String residentialAddress;

	/**
	 * 该个体的类型
	 */
	@ApiField("type")
	private String type;

    /**
     * Gets date of birth.
     *
     * @return the date of birth
     */
    public String getDateOfBirth() {
		return this.dateOfBirth;
	}

    /**
     * Sets date of birth.
     *
     * @param dateOfBirth the date of birth
     */
    public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

    /**
     * Gets id number.
     *
     * @return the id number
     */
    public String getIdNumber() {
		return this.idNumber;
	}

    /**
     * Sets id number.
     *
     * @param idNumber the id number
     */
    public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
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
     * Gets nationality.
     *
     * @return the nationality
     */
    public String getNationality() {
		return this.nationality;
	}

    /**
     * Sets nationality.
     *
     * @param nationality the nationality
     */
    public void setNationality(String nationality) {
		this.nationality = nationality;
	}

    /**
     * Gets residential address.
     *
     * @return the residential address
     */
    public String getResidentialAddress() {
		return this.residentialAddress;
	}

    /**
     * Sets residential address.
     *
     * @param residentialAddress the residential address
     */
    public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
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

}
