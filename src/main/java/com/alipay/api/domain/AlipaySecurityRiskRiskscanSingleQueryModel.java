package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁金服信息安全平台风险扫描接口
 *
 * @author auto create
 * @since 1.0, 2018-03-19 21:01:13
 */
public class AlipaySecurityRiskRiskscanSingleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8861757593958523516L;

	/**
	 * 蚂蚁信息安全平台为接入方分配的业务key，必须正确
	 */
	@ApiField("app_key")
	private String appKey;

	/**
	 * 业务风险判断的具体参数，该参数是JsonString，Json中具体的key在接入信息安全平台时约定。
	 */
	@ApiField("event_data")
	private String eventData;

	/**
	 * 蚂蚁信息安全平台为接入方分配的业务类型，业务类型标识了具体识别的风险内容，例如：识别入职员工的风险，识别供应商的舞弊风险等。
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 蚂蚁信息安全平台为业务方分配的业务密钥，必须正确。
	 */
	@ApiField("secret_key")
	private String secretKey;

    /**
     * Gets app key.
     *
     * @return the app key
     */
    public String getAppKey() {
		return this.appKey;
	}

    /**
     * Sets app key.
     *
     * @param appKey the app key
     */
    public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

    /**
     * Gets event data.
     *
     * @return the event data
     */
    public String getEventData() {
		return this.eventData;
	}

    /**
     * Sets event data.
     *
     * @param eventData the event data
     */
    public void setEventData(String eventData) {
		this.eventData = eventData;
	}

    /**
     * Gets event type.
     *
     * @return the event type
     */
    public String getEventType() {
		return this.eventType;
	}

    /**
     * Sets event type.
     *
     * @param eventType the event type
     */
    public void setEventType(String eventType) {
		this.eventType = eventType;
	}

    /**
     * Gets secret key.
     *
     * @return the secret key
     */
    public String getSecretKey() {
		return this.secretKey;
	}

    /**
     * Sets secret key.
     *
     * @param secretKey the secret key
     */
    public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

}
