package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 更新卡积分
 *
 * @author auto create
 * @since 1.0, 2016-11-15 18:49:47
 */
public class KoubeiMarketingToolPointsUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 8181626597639456124L;

	/**
	 * 活动集点帐户ID, 开发者通过查询集点活动详情获取
	 */
	@ApiField("activity_account")
	private String activityAccount;

	/**
	 * 业务流水号，集点交易类型为
DEPOSIT, 传入支付交易号;
CANCEL／COMMIT, 传入冻结集点的集点流水号;
CONSUME／FREEZE, 不允许传入biz_no;
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 交易备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 外部流水号, 由开发者提供, 用于控制业务幂等
	 */
	@ApiField("req_id")
	private String reqId;

	/**
	 * 门店ID，集点交易类型为DEPOSIT时填写
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 集点交易数量，必须为正整数字符串
	 */
	@ApiField("trans_amount")
	private String transAmount;

	/**
	 * 集点交易类型，目前支持:
DEPOSIT，增加集点
FREEZE，冻结集点
COMMIT，提交冻结集点
CANCEL，取消冻结集点
CONSUME, 消费集点
	 */
	@ApiField("trans_type")
	private String transType;

	/**
	 * 用户ID, 开发者通过用户信息授权产品获取
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets activity account.
     *
     * @return the activity account
     */
    public String getActivityAccount() {
		return this.activityAccount;
	}

    /**
     * Sets activity account.
     *
     * @param activityAccount the activity account
     */
    public void setActivityAccount(String activityAccount) {
		this.activityAccount = activityAccount;
	}

    /**
     * Gets biz no.
     *
     * @return the biz no
     */
    public String getBizNo() {
		return this.bizNo;
	}

    /**
     * Sets biz no.
     *
     * @param bizNo the biz no
     */
    public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
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
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo() {
		return this.memo;
	}

    /**
     * Sets memo.
     *
     * @param memo the memo
     */
    public void setMemo(String memo) {
		this.memo = memo;
	}

    /**
     * Gets req id.
     *
     * @return the req id
     */
    public String getReqId() {
		return this.reqId;
	}

    /**
     * Sets req id.
     *
     * @param reqId the req id
     */
    public void setReqId(String reqId) {
		this.reqId = reqId;
	}

    /**
     * Gets shop id.
     *
     * @return the shop id
     */
    public String getShopId() {
		return this.shopId;
	}

    /**
     * Sets shop id.
     *
     * @param shopId the shop id
     */
    public void setShopId(String shopId) {
		this.shopId = shopId;
	}

    /**
     * Gets trans amount.
     *
     * @return the trans amount
     */
    public String getTransAmount() {
		return this.transAmount;
	}

    /**
     * Sets trans amount.
     *
     * @param transAmount the trans amount
     */
    public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}

    /**
     * Gets trans type.
     *
     * @return the trans type
     */
    public String getTransType() {
		return this.transType;
	}

    /**
     * Sets trans type.
     *
     * @param transType the trans type
     */
    public void setTransType(String transType) {
		this.transType = transType;
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
