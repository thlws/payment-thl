package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 指纹解注册
 *
 * @author auto create
 * @since 1.0, 2018-08-17 16:53:32
 */
public class AlipaySecurityProdFingerprintDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4561868811511986189L;

	/**
	 * IFAA协议的版本，目前为2.0
	 */
	@ApiField("ifaa_version")
	private String ifaaVersion;

	/**
	 * IFAA协议客户端静态信息，调用IFAA客户端SDK接口获取secData，透传至本参数。此参数是为了兼容IFAA1.0而设计的，接入方可根据是否需要接入IFAA1.0来决定是否要传(只接入IFAA2.0不需要传)
	 */
	@ApiField("sec_data")
	private String secData;

	/**
	 * IFAA标准中用于关联IFAA Server和业务方Server开通状态的token，此token为注册时保存的token，传入此token，用于生成服务端去注册信息。
	 */
	@ApiField("token")
	private String token;

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

    /**
     * Gets token.
     *
     * @return the token
     */
    public String getToken() {
		return this.token;
	}

    /**
     * Sets token.
     *
     * @param token the token
     */
    public void setToken(String token) {
		this.token = token;
	}

}
