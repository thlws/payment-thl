package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 为服务窗合作伙伴（如YunOS），提供操作服务窗菜单的功能
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:14
 */
public class AlipayOpenPublicPartnerMenuOperateModel extends AlipayObject {

	private static final long serialVersionUID = 8684465132324123838L;

	/**
	 * 行为参数
	 */
	@ApiField("action_param")
	private String actionParam;

	/**
	 * 行为类型(in，out，api)
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 协议号
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 服务窗id
	 */
	@ApiField("public_id")
	private String publicId;

	/**
	 * 第三方账号ID ,银行卡号/户号/手机号
	 */
	@ApiField("third_account_id")
	private String thirdAccountId;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets action param.
     *
     * @return the action param
     */
    public String getActionParam() {
		return this.actionParam;
	}

    /**
     * Sets action param.
     *
     * @param actionParam the action param
     */
    public void setActionParam(String actionParam) {
		this.actionParam = actionParam;
	}

    /**
     * Gets action type.
     *
     * @return the action type
     */
    public String getActionType() {
		return this.actionType;
	}

    /**
     * Sets action type.
     *
     * @param actionType the action type
     */
    public void setActionType(String actionType) {
		this.actionType = actionType;
	}

    /**
     * Gets agreement id.
     *
     * @return the agreement id
     */
    public String getAgreementId() {
		return this.agreementId;
	}

    /**
     * Sets agreement id.
     *
     * @param agreementId the agreement id
     */
    public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

    /**
     * Gets public id.
     *
     * @return the public id
     */
    public String getPublicId() {
		return this.publicId;
	}

    /**
     * Sets public id.
     *
     * @param publicId the public id
     */
    public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

    /**
     * Gets third account id.
     *
     * @return the third account id
     */
    public String getThirdAccountId() {
		return this.thirdAccountId;
	}

    /**
     * Sets third account id.
     *
     * @param thirdAccountId the third account id
     */
    public void setThirdAccountId(String thirdAccountId) {
		this.thirdAccountId = thirdAccountId;
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
