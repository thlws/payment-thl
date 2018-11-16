package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流程全局唯一ID
 *
 * @author auto create
 * @since 1.0, 2017-09-19 20:53:33
 */
public class BPOpenApiPUID extends AlipayObject {

	private static final long serialVersionUID = 5799262348199983566L;

	/**
	 * 系统名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 业务ID，对应业务单条记录的ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务类型。不要填写下划线、点等特殊符号
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 一般留空。如果一个biz_id可发起多个流程实例，则填写此值
	 */
	@ApiField("unique_key")
	private String uniqueKey;

    /**
     * Gets app name.
     *
     * @return the app name
     */
    public String getAppName() {
		return this.appName;
	}

    /**
     * Sets app name.
     *
     * @param appName the app name
     */
    public void setAppName(String appName) {
		this.appName = appName;
	}

    /**
     * Gets biz id.
     *
     * @return the biz id
     */
    public String getBizId() {
		return this.bizId;
	}

    /**
     * Sets biz id.
     *
     * @param bizId the biz id
     */
    public void setBizId(String bizId) {
		this.bizId = bizId;
	}

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType() {
		return this.bizType;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets unique key.
     *
     * @return the unique key
     */
    public String getUniqueKey() {
		return this.uniqueKey;
	}

    /**
     * Sets unique key.
     *
     * @param uniqueKey the unique key
     */
    public void setUniqueKey(String uniqueKey) {
		this.uniqueKey = uniqueKey;
	}

}
