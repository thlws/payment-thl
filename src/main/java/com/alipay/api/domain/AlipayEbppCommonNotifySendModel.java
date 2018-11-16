package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部机构对用户的通知接口
 *
 * @author auto create
 * @since 1.0, 2018-04-26 13:55:47
 */
public class AlipayEbppCommonNotifySendModel extends AlipayObject {

	private static final long serialVersionUID = 3779917154273171938L;

	/**
	 * 水电燃等机构为用户分配的户号
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 业务类型的缩写：
JF-缴费
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 出账机构的缩写
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 特定通知类型可能需要提供扩展信息，用JSON字符串描述
	 */
	@ApiField("extend_data")
	private String extendData;

	/**
	 * 机构为用户发送通知的类型，需要与支付宝协商确定
	 */
	@ApiField("notify_type")
	private String notifyType;

	/**
	 * 子业务类型英文名称:
ELECTRIC-电力
GAS-燃气
WATER-水
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 支付宝用户id，可空，用于特定场景下向指定用户发送通知
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets bill key.
     *
     * @return the bill key
     */
    public String getBillKey() {
		return this.billKey;
	}

    /**
     * Sets bill key.
     *
     * @param billKey the bill key
     */
    public void setBillKey(String billKey) {
		this.billKey = billKey;
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
     * Gets charge inst.
     *
     * @return the charge inst
     */
    public String getChargeInst() {
		return this.chargeInst;
	}

    /**
     * Sets charge inst.
     *
     * @param chargeInst the charge inst
     */
    public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

    /**
     * Gets extend data.
     *
     * @return the extend data
     */
    public String getExtendData() {
		return this.extendData;
	}

    /**
     * Sets extend data.
     *
     * @param extendData the extend data
     */
    public void setExtendData(String extendData) {
		this.extendData = extendData;
	}

    /**
     * Gets notify type.
     *
     * @return the notify type
     */
    public String getNotifyType() {
		return this.notifyType;
	}

    /**
     * Sets notify type.
     *
     * @param notifyType the notify type
     */
    public void setNotifyType(String notifyType) {
		this.notifyType = notifyType;
	}

    /**
     * Gets sub biz type.
     *
     * @return the sub biz type
     */
    public String getSubBizType() {
		return this.subBizType;
	}

    /**
     * Sets sub biz type.
     *
     * @param subBizType the sub biz type
     */
    public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
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
