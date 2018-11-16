package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直连代扣协议查询接口
 *
 * @author auto create
 * @since 1.0, 2018-01-02 20:27:24
 */
public class AlipayEbppPdeductSignQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4545688599565313724L;

	/**
	 * 支付宝代扣协议Id。若协议id不传递，则需要保证业务类型、子业务类型、出账机构、户号必传
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 户号，机构针对于每户的水、电都会有唯一的标识户号
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 业务类型。
JF：缴水、电、燃气、固话宽带、有线电视、交通罚款费用
WUYE：缴物业费
HK：信用卡还款
TX：手机充值
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 支付宝缴费系统中的出账机构ID
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 业务子类型。
WATER：缴水费
ELECTRIC：缴电费
GAS：缴燃气费
COMMUN：缴固话宽带
CATV：缴有线电视费
TRAFFIC：缴交通罚款
WUYE：缴物业费
HK：信用卡还款
CZ：手机充值
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

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
