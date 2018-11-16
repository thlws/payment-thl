package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚁盾反黄牛服务
 *
 * @author auto create
 * @since 1.0, 2017-07-26 14:36:03
 */
public class SsdataDataserviceRiskAntiscalperQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1583599214318428657L;

	/**
	 * 行为发生时的Apdid值
	 */
	@ApiField("apdid")
	private String apdid;

	/**
	 * 行为发生时的IP值
	 */
	@ApiField("ip")
	private String ip;

	/**
	 * 调用服务的商户id ，如果是第三方服务商，需要将其实际的商户id透传过来，如果是普通商户传入自己的appid或不填
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 行为发生时的手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 风险场景码，不传该参数，则走默认的场景
	 */
	@ApiField("risk_code")
	private String riskCode;

	/**
	 * 业务场景，不传该参数，则走默认的业务场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 版本号
	 */
	@ApiField("sys_version")
	private String sysVersion;

	/**
	 * 行为发生时的UMID值
	 */
	@ApiField("umid")
	private String umid;

    /**
     * Gets apdid.
     *
     * @return the apdid
     */
    public String getApdid() {
		return this.apdid;
	}

    /**
     * Sets apdid.
     *
     * @param apdid the apdid
     */
    public void setApdid(String apdid) {
		this.apdid = apdid;
	}

    /**
     * Gets ip.
     *
     * @return the ip
     */
    public String getIp() {
		return this.ip;
	}

    /**
     * Sets ip.
     *
     * @param ip the ip
     */
    public void setIp(String ip) {
		this.ip = ip;
	}

    /**
     * Gets partner id.
     *
     * @return the partner id
     */
    public String getPartnerId() {
		return this.partnerId;
	}

    /**
     * Sets partner id.
     *
     * @param partnerId the partner id
     */
    public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

    /**
     * Gets phone.
     *
     * @return the phone
     */
    public String getPhone() {
		return this.phone;
	}

    /**
     * Sets phone.
     *
     * @param phone the phone
     */
    public void setPhone(String phone) {
		this.phone = phone;
	}

    /**
     * Gets risk code.
     *
     * @return the risk code
     */
    public String getRiskCode() {
		return this.riskCode;
	}

    /**
     * Sets risk code.
     *
     * @param riskCode the risk code
     */
    public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

    /**
     * Gets scene code.
     *
     * @return the scene code
     */
    public String getSceneCode() {
		return this.sceneCode;
	}

    /**
     * Sets scene code.
     *
     * @param sceneCode the scene code
     */
    public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

    /**
     * Gets sys version.
     *
     * @return the sys version
     */
    public String getSysVersion() {
		return this.sysVersion;
	}

    /**
     * Sets sys version.
     *
     * @param sysVersion the sys version
     */
    public void setSysVersion(String sysVersion) {
		this.sysVersion = sysVersion;
	}

    /**
     * Gets umid.
     *
     * @return the umid
     */
    public String getUmid() {
		return this.umid;
	}

    /**
     * Sets umid.
     *
     * @param umid the umid
     */
    public void setUmid(String umid) {
		this.umid = umid;
	}

}
