package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 产品参与者关联信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class ProdIPRelationVO extends AlipayObject {

	private static final long serialVersionUID = 2126213389366547116L;

	/**
	 * 参与者别名
	 */
	@ApiField("ip_alias_name")
	private String ipAliasName;

	/**
	 * 参与者所属平台
	 */
	@ApiField("ip_belong_platform")
	private String ipBelongPlatform;

	/**
	 * 参与者编码
	 */
	@ApiField("ip_code")
	private String ipCode;

	/**
	 * 参与者名称
	 */
	@ApiField("ip_name")
	private String ipName;

	/**
	 * 参与者子类型
	 */
	@ApiField("ip_sub_type")
	private String ipSubType;

	/**
	 * 参与者类型
	 */
	@ApiField("ip_type")
	private String ipType;

	/**
	 * 产品编码
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 产品版本
	 */
	@ApiField("prod_version")
	private String prodVersion;

	/**
	 * 参与者平台Id
	 */
	@ApiField("role_id")
	private String roleId;

    /**
     * Gets ip alias name.
     *
     * @return the ip alias name
     */
    public String getIpAliasName() {
		return this.ipAliasName;
	}

    /**
     * Sets ip alias name.
     *
     * @param ipAliasName the ip alias name
     */
    public void setIpAliasName(String ipAliasName) {
		this.ipAliasName = ipAliasName;
	}

    /**
     * Gets ip belong platform.
     *
     * @return the ip belong platform
     */
    public String getIpBelongPlatform() {
		return this.ipBelongPlatform;
	}

    /**
     * Sets ip belong platform.
     *
     * @param ipBelongPlatform the ip belong platform
     */
    public void setIpBelongPlatform(String ipBelongPlatform) {
		this.ipBelongPlatform = ipBelongPlatform;
	}

    /**
     * Gets ip code.
     *
     * @return the ip code
     */
    public String getIpCode() {
		return this.ipCode;
	}

    /**
     * Sets ip code.
     *
     * @param ipCode the ip code
     */
    public void setIpCode(String ipCode) {
		this.ipCode = ipCode;
	}

    /**
     * Gets ip name.
     *
     * @return the ip name
     */
    public String getIpName() {
		return this.ipName;
	}

    /**
     * Sets ip name.
     *
     * @param ipName the ip name
     */
    public void setIpName(String ipName) {
		this.ipName = ipName;
	}

    /**
     * Gets ip sub type.
     *
     * @return the ip sub type
     */
    public String getIpSubType() {
		return this.ipSubType;
	}

    /**
     * Sets ip sub type.
     *
     * @param ipSubType the ip sub type
     */
    public void setIpSubType(String ipSubType) {
		this.ipSubType = ipSubType;
	}

    /**
     * Gets ip type.
     *
     * @return the ip type
     */
    public String getIpType() {
		return this.ipType;
	}

    /**
     * Sets ip type.
     *
     * @param ipType the ip type
     */
    public void setIpType(String ipType) {
		this.ipType = ipType;
	}

    /**
     * Gets prod code.
     *
     * @return the prod code
     */
    public String getProdCode() {
		return this.prodCode;
	}

    /**
     * Sets prod code.
     *
     * @param prodCode the prod code
     */
    public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

    /**
     * Gets prod version.
     *
     * @return the prod version
     */
    public String getProdVersion() {
		return this.prodVersion;
	}

    /**
     * Sets prod version.
     *
     * @param prodVersion the prod version
     */
    public void setProdVersion(String prodVersion) {
		this.prodVersion = prodVersion;
	}

    /**
     * Gets role id.
     *
     * @return the role id
     */
    public String getRoleId() {
		return this.roleId;
	}

    /**
     * Sets role id.
     *
     * @param roleId the role id
     */
    public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

}
