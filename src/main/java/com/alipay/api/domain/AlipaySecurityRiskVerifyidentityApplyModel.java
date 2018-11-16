package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核身可用性查询接口
 *
 * @author auto create
 * @since 1.0, 2018-01-15 15:49:05
 */
public class AlipaySecurityRiskVerifyidentityApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3848958567392996299L;

	/**
	 * 用户帐号
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 用户姓名
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 帐号类型：ALIPAY_USERID,CERT
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 接入业务方业务唯一性id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务信息上下文，JSON结构
	 */
	@ApiField("biz_params")
	private String bizParams;

	/**
	 * 身份核验场景CODE，商务谈判基础上，由支付宝来分配。
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 待校验的核身产品集合
	 */
	@ApiField("validate_product_group")
	private String validateProductGroup;

    /**
     * Gets account id.
     *
     * @return the account id
     */
    public String getAccountId() {
		return this.accountId;
	}

    /**
     * Sets account id.
     *
     * @param accountId the account id
     */
    public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

    /**
     * Gets account name.
     *
     * @return the account name
     */
    public String getAccountName() {
		return this.accountName;
	}

    /**
     * Sets account name.
     *
     * @param accountName the account name
     */
    public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

    /**
     * Gets account type.
     *
     * @return the account type
     */
    public String getAccountType() {
		return this.accountType;
	}

    /**
     * Sets account type.
     *
     * @param accountType the account type
     */
    public void setAccountType(String accountType) {
		this.accountType = accountType;
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
     * Gets biz params.
     *
     * @return the biz params
     */
    public String getBizParams() {
		return this.bizParams;
	}

    /**
     * Sets biz params.
     *
     * @param bizParams the biz params
     */
    public void setBizParams(String bizParams) {
		this.bizParams = bizParams;
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
     * Gets validate product group.
     *
     * @return the validate product group
     */
    public String getValidateProductGroup() {
		return this.validateProductGroup;
	}

    /**
     * Sets validate product group.
     *
     * @param validateProductGroup the validate product group
     */
    public void setValidateProductGroup(String validateProductGroup) {
		this.validateProductGroup = validateProductGroup;
	}

}
