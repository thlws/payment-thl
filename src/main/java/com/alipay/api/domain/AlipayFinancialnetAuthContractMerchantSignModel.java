package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构商户签约服务
 *
 * @author auto create
 * @since 1.0, 2018-07-13 14:09:58
 */
public class AlipayFinancialnetAuthContractMerchantSignModel extends AlipayObject {

	private static final long serialVersionUID = 6119217844286173345L;

	/**
	 * 商家银行账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * json串格式的扩展字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 费率模型
	 */
	@ApiField("fee_value")
	private FeeValue feeValue;

	/**
	 * 机构ID
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 生效失效策略模型
	 */
	@ApiField("valid_strategy")
	private ValidStrategy validStrategy;

    /**
     * Gets account no.
     *
     * @return the account no
     */
    public String getAccountNo() {
		return this.accountNo;
	}

    /**
     * Sets account no.
     *
     * @param accountNo the account no
     */
    public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets fee value.
     *
     * @return the fee value
     */
    public FeeValue getFeeValue() {
		return this.feeValue;
	}

    /**
     * Sets fee value.
     *
     * @param feeValue the fee value
     */
    public void setFeeValue(FeeValue feeValue) {
		this.feeValue = feeValue;
	}

    /**
     * Gets inst id.
     *
     * @return the inst id
     */
    public String getInstId() {
		return this.instId;
	}

    /**
     * Sets inst id.
     *
     * @param instId the inst id
     */
    public void setInstId(String instId) {
		this.instId = instId;
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

    /**
     * Gets valid strategy.
     *
     * @return the valid strategy
     */
    public ValidStrategy getValidStrategy() {
		return this.validStrategy;
	}

    /**
     * Sets valid strategy.
     *
     * @param validStrategy the valid strategy
     */
    public void setValidStrategy(ValidStrategy validStrategy) {
		this.validStrategy = validStrategy;
	}

}
