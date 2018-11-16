package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 后台运营操作风险识别
 *
 * @author auto create
 * @since 1.0, 2018-05-04 10:38:08
 */
public class AlipaySecurityRiskReconfirmRiskidentifyCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 7418929223719789861L;

	/**
	 * 登录对应的账号名
	 */
	@ApiField("account")
	private String account;

	/**
	 * 接入的应用编号
	 */
	@ApiField("app_code")
	private String appCode;

	/**
	 * 用户所属公司
	 */
	@ApiField("company")
	private String company;

	/**
	 * 额外参数
	 */
	@ApiField("extend_param")
	private String extendParam;

	/**
	 * 具体场景对应的code
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 用户关联的租户id list
	 */
	@ApiField("tenant_id_list")
	private String tenantIdList;

	/**
	 * 设备指纹id
	 */
	@ApiField("um_id")
	private String umId;

	/**
	 * 采集设备指纹信息对应的token
	 */
	@ApiField("um_id_token")
	private String umIdToken;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets account.
     *
     * @return the account
     */
    public String getAccount() {
		return this.account;
	}

    /**
     * Sets account.
     *
     * @param account the account
     */
    public void setAccount(String account) {
		this.account = account;
	}

    /**
     * Gets app code.
     *
     * @return the app code
     */
    public String getAppCode() {
		return this.appCode;
	}

    /**
     * Sets app code.
     *
     * @param appCode the app code
     */
    public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

    /**
     * Gets company.
     *
     * @return the company
     */
    public String getCompany() {
		return this.company;
	}

    /**
     * Sets company.
     *
     * @param company the company
     */
    public void setCompany(String company) {
		this.company = company;
	}

    /**
     * Gets extend param.
     *
     * @return the extend param
     */
    public String getExtendParam() {
		return this.extendParam;
	}

    /**
     * Sets extend param.
     *
     * @param extendParam the extend param
     */
    public void setExtendParam(String extendParam) {
		this.extendParam = extendParam;
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
     * Gets tenant id list.
     *
     * @return the tenant id list
     */
    public String getTenantIdList() {
		return this.tenantIdList;
	}

    /**
     * Sets tenant id list.
     *
     * @param tenantIdList the tenant id list
     */
    public void setTenantIdList(String tenantIdList) {
		this.tenantIdList = tenantIdList;
	}

    /**
     * Gets um id.
     *
     * @return the um id
     */
    public String getUmId() {
		return this.umId;
	}

    /**
     * Sets um id.
     *
     * @param umId the um id
     */
    public void setUmId(String umId) {
		this.umId = umId;
	}

    /**
     * Gets um id token.
     *
     * @return the um id token
     */
    public String getUmIdToken() {
		return this.umIdToken;
	}

    /**
     * Sets um id token.
     *
     * @param umIdToken the um id token
     */
    public void setUmIdToken(String umIdToken) {
		this.umIdToken = umIdToken;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
