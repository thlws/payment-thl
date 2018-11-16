package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核身结果同步
 *
 * @author auto create
 * @since 1.0, 2018-04-23 15:07:57
 */
public class AlipaySecurityRiskReconfirmVerificatecallbackSendModel extends AlipayObject {

	private static final long serialVersionUID = 1375983232369531273L;

	/**
	 * 账号名
	 */
	@ApiField("account")
	private String account;

	/**
	 * 接入的应用编号
	 */
	@ApiField("app_code")
	private String appCode;

	/**
	 * 额外参数
	 */
	@ApiField("extend_param")
	private String extendParam;

	/**
	 * 风险识别流水id，为风险识别的标识，不敏感，无需脱敏
	 */
	@ApiField("identify_id")
	private String identifyId;

	/**
	 * 核身方式
	 */
	@ApiField("reauth_type")
	private String reauthType;

	/**
	 * 核身结果
	 */
	@ApiField("reconfirm_result")
	private Boolean reconfirmResult;

	/**
	 * 场景对应的编号
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 设备指纹id
	 */
	@ApiField("um_id")
	private String umId;

	/**
	 * 采集设备指纹对应的token
	 */
	@ApiField("um_id_token")
	private String umIdToken;

	/**
	 * 会员ID
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
     * Gets identify id.
     *
     * @return the identify id
     */
    public String getIdentifyId() {
		return this.identifyId;
	}

    /**
     * Sets identify id.
     *
     * @param identifyId the identify id
     */
    public void setIdentifyId(String identifyId) {
		this.identifyId = identifyId;
	}

    /**
     * Gets reauth type.
     *
     * @return the reauth type
     */
    public String getReauthType() {
		return this.reauthType;
	}

    /**
     * Sets reauth type.
     *
     * @param reauthType the reauth type
     */
    public void setReauthType(String reauthType) {
		this.reauthType = reauthType;
	}

    /**
     * Gets reconfirm result.
     *
     * @return the reconfirm result
     */
    public Boolean getReconfirmResult() {
		return this.reconfirmResult;
	}

    /**
     * Sets reconfirm result.
     *
     * @param reconfirmResult the reconfirm result
     */
    public void setReconfirmResult(Boolean reconfirmResult) {
		this.reconfirmResult = reconfirmResult;
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
