package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 指纹注册初始化
 *
 * @author auto create
 * @since 1.0, 2018-08-17 16:53:52
 */
public class AlipaySecurityProdFingerprintApplyInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 1123345111928237242L;

	/**
	 * IFAA标准中的校验类型，目前1为指纹
	 */
	@ApiField("auth_type")
	private String authType;

	/**
	 * IFAA协议的版本，目前为2.0
	 */
	@ApiField("ifaa_version")
	private String ifaaVersion;

	/**
	 * IFAA协议客户端静态信息，调用IFAA客户端SDK接口获取secData，透传至本参数
	 */
	@ApiField("sec_data")
	private String secData;

    /**
     * Gets auth type.
     *
     * @return the auth type
     */
    public String getAuthType() {
		return this.authType;
	}

    /**
     * Sets auth type.
     *
     * @param authType the auth type
     */
    public void setAuthType(String authType) {
		this.authType = authType;
	}

    /**
     * Gets ifaa version.
     *
     * @return the ifaa version
     */
    public String getIfaaVersion() {
		return this.ifaaVersion;
	}

    /**
     * Sets ifaa version.
     *
     * @param ifaaVersion the ifaa version
     */
    public void setIfaaVersion(String ifaaVersion) {
		this.ifaaVersion = ifaaVersion;
	}

    /**
     * Gets sec data.
     *
     * @return the sec data
     */
    public String getSecData() {
		return this.secData;
	}

    /**
     * Sets sec data.
     *
     * @param secData the sec data
     */
    public void setSecData(String secData) {
		this.secData = secData;
	}

}
