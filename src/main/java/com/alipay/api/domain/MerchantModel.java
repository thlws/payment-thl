package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户信息
 *
 * @author auto create
 * @since 1.0, 2018-06-28 17:02:29
 */
public class MerchantModel extends AlipayObject {

	private static final long serialVersionUID = 7177525921766639592L;

	/**
	 * 商户别名
	 */
	@ApiField("alias_name")
	private String aliasName;

	/**
	 * 联系人姓名
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 联系人电话
	 */
	@ApiField("contact_number")
	private String contactNumber;

	/**
	 * 商户名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商户或者isv的pid
	 */
	@ApiField("pid")
	private String pid;

    /**
     * Gets alias name.
     *
     * @return the alias name
     */
    public String getAliasName() {
		return this.aliasName;
	}

    /**
     * Sets alias name.
     *
     * @param aliasName the alias name
     */
    public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

    /**
     * Gets contact name.
     *
     * @return the contact name
     */
    public String getContactName() {
		return this.contactName;
	}

    /**
     * Sets contact name.
     *
     * @param contactName the contact name
     */
    public void setContactName(String contactName) {
		this.contactName = contactName;
	}

    /**
     * Gets contact number.
     *
     * @return the contact number
     */
    public String getContactNumber() {
		return this.contactNumber;
	}

    /**
     * Sets contact number.
     *
     * @param contactNumber the contact number
     */
    public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
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
     * Gets pid.
     *
     * @return the pid
     */
    public String getPid() {
		return this.pid;
	}

    /**
     * Sets pid.
     *
     * @param pid the pid
     */
    public void setPid(String pid) {
		this.pid = pid;
	}

}
