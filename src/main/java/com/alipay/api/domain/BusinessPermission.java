package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv权限信息
 *
 * @author auto create
 * @since 1.0, 2018-05-31 20:28:04
 */
public class BusinessPermission extends AlipayObject {

	private static final long serialVersionUID = 5272916637556531275L;

	/**
	 * 业务隔离字段
	 */
	@ApiField("domain")
	private String domain;

	/**
	 * 权限码名称
	 */
	@ApiField("permission_code")
	private String permissionCode;

	/**
	 * 权限码值
	 */
	@ApiField("source_permission_code")
	private String sourcePermissionCode;

    /**
     * Gets domain.
     *
     * @return the domain
     */
    public String getDomain() {
		return this.domain;
	}

    /**
     * Sets domain.
     *
     * @param domain the domain
     */
    public void setDomain(String domain) {
		this.domain = domain;
	}

    /**
     * Gets permission code.
     *
     * @return the permission code
     */
    public String getPermissionCode() {
		return this.permissionCode;
	}

    /**
     * Sets permission code.
     *
     * @param permissionCode the permission code
     */
    public void setPermissionCode(String permissionCode) {
		this.permissionCode = permissionCode;
	}

    /**
     * Gets source permission code.
     *
     * @return the source permission code
     */
    public String getSourcePermissionCode() {
		return this.sourcePermissionCode;
	}

    /**
     * Sets source permission code.
     *
     * @param sourcePermissionCode the source permission code
     */
    public void setSourcePermissionCode(String sourcePermissionCode) {
		this.sourcePermissionCode = sourcePermissionCode;
	}

}
