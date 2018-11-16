package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备公钥密钥查询服务
 *
 * @author auto create
 * @since 1.0, 2018-08-02 19:27:48
 */
public class AlipaySecurityProdIfaaDevicepubkeyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4598379539885181753L;

	/**
	 * 用于协商ECDH的publickey，base6编码
	 */
	@ApiField("ecdh_publickey")
	private String ecdhPublickey;

	/**
	 * 已返回记录的最大ID，初次请求输入0
	 */
	@ApiField("max_id")
	private String maxId;

	/**
	 * 安全设备的ID。
	 */
	@ApiField("security_device_id")
	private String securityDeviceId;

	/**
	 * 安全设备类型，SGX或者加密机
	 */
	@ApiField("security_schema")
	private String securitySchema;

    /**
     * Gets ecdh publickey.
     *
     * @return the ecdh publickey
     */
    public String getEcdhPublickey() {
		return this.ecdhPublickey;
	}

    /**
     * Sets ecdh publickey.
     *
     * @param ecdhPublickey the ecdh publickey
     */
    public void setEcdhPublickey(String ecdhPublickey) {
		this.ecdhPublickey = ecdhPublickey;
	}

    /**
     * Gets max id.
     *
     * @return the max id
     */
    public String getMaxId() {
		return this.maxId;
	}

    /**
     * Sets max id.
     *
     * @param maxId the max id
     */
    public void setMaxId(String maxId) {
		this.maxId = maxId;
	}

    /**
     * Gets security device id.
     *
     * @return the security device id
     */
    public String getSecurityDeviceId() {
		return this.securityDeviceId;
	}

    /**
     * Sets security device id.
     *
     * @param securityDeviceId the security device id
     */
    public void setSecurityDeviceId(String securityDeviceId) {
		this.securityDeviceId = securityDeviceId;
	}

    /**
     * Gets security schema.
     *
     * @return the security schema
     */
    public String getSecuritySchema() {
		return this.securitySchema;
	}

    /**
     * Sets security schema.
     *
     * @param securitySchema the security schema
     */
    public void setSecuritySchema(String securitySchema) {
		this.securitySchema = securitySchema;
	}

}
