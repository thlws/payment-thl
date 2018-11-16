package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 身份核验服务对外开放接口
 *
 * @author auto create
 * @since 1.0, 2018-04-26 11:08:38
 */
public class AlipaySecurityRiskVerifyidentityInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 1815984218878262242L;

	/**
	 * 用户证件号，当前支持身份证号
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 用户姓名
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 用户证件类型，需传入英文枚举常量，当前支持：CERT(大陆身份证)
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 核验后回调业务url
	 */
	@ApiField("biz_callback_url")
	private String bizCallbackUrl;

	/**
	 * 接入业务方业务唯一性id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 附加业务信息，Json结构
	 */
	@ApiField("biz_params")
	private String bizParams;

	/**
	 * 核验服务名称，同时请求多种服务用“|”连接，SMS：短信，FACE：人脸
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 身份核验场景CODE，商务谈判基础上，由支付宝来分配。
	 */
	@ApiField("scene_code")
	private String sceneCode;

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
     * Gets biz callback url.
     *
     * @return the biz callback url
     */
    public String getBizCallbackUrl() {
		return this.bizCallbackUrl;
	}

    /**
     * Sets biz callback url.
     *
     * @param bizCallbackUrl the biz callback url
     */
    public void setBizCallbackUrl(String bizCallbackUrl) {
		this.bizCallbackUrl = bizCallbackUrl;
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
     * Gets product code.
     *
     * @return the product code
     */
    public String getProductCode() {
		return this.productCode;
	}

    /**
     * Sets product code.
     *
     * @param productCode the product code
     */
    public void setProductCode(String productCode) {
		this.productCode = productCode;
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

}
