package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 外部商户标准卡退款
 *
 * @author auto create
 * @since 1.0, 2018-05-18 22:32:06
 */
public class AlipayAssetCardReturnRefundModel extends AlipayObject {

	private static final long serialVersionUID = 1529153941794352711L;

	/**
	 * 资产id
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 资产id类型
	 */
	@ApiField("asset_id_type")
	private String assetIdType;

	/**
	 * 业务发生时间
	 */
	@ApiField("biz_dt")
	private Date bizDt;

	/**
	 * 业务来源
	 */
	@ApiField("biz_from")
	private String bizFrom;

	/**
	 * 扩展信息
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 退卡资金场景
	 */
	@ApiField("fund_scence")
	private String fundScence;

	/**
	 * 是否销卡，true为销卡，false不销卡，只退余额
	 */
	@ApiField("is_cancel")
	private String isCancel;

	/**
	 * 操作人id
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 比如某种业务标准外部订单号,比如交易外部订单号，代表商户端自己订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 订单明细
	 */
	@ApiListField("recharge_details")
	@ApiField("recharge_detail")
	private List<RechargeDetail> rechargeDetails;

	/**
	 * 退卡真实资金，单位元，包含手续费
	 */
	@ApiField("return_amount")
	private String returnAmount;

	/**
	 * 退卡面额，单位元，包含手续费
	 */
	@ApiField("return_asset_amount")
	private String returnAssetAmount;

	/**
	 * 退卡手续费真实资金，单位元，没有放0
	 */
	@ApiField("return_fee_amount")
	private String returnFeeAmount;

	/**
	 * 退卡手续费面额，单位元，没有放0
	 */
	@ApiField("return_fee_asset_amount")
	private String returnFeeAssetAmount;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets asset id.
     *
     * @return the asset id
     */
    public String getAssetId() {
		return this.assetId;
	}

    /**
     * Sets asset id.
     *
     * @param assetId the asset id
     */
    public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

    /**
     * Gets asset id type.
     *
     * @return the asset id type
     */
    public String getAssetIdType() {
		return this.assetIdType;
	}

    /**
     * Sets asset id type.
     *
     * @param assetIdType the asset id type
     */
    public void setAssetIdType(String assetIdType) {
		this.assetIdType = assetIdType;
	}

    /**
     * Gets biz dt.
     *
     * @return the biz dt
     */
    public Date getBizDt() {
		return this.bizDt;
	}

    /**
     * Sets biz dt.
     *
     * @param bizDt the biz dt
     */
    public void setBizDt(Date bizDt) {
		this.bizDt = bizDt;
	}

    /**
     * Gets biz from.
     *
     * @return the biz from
     */
    public String getBizFrom() {
		return this.bizFrom;
	}

    /**
     * Sets biz from.
     *
     * @param bizFrom the biz from
     */
    public void setBizFrom(String bizFrom) {
		this.bizFrom = bizFrom;
	}

    /**
     * Gets extend info.
     *
     * @return the extend info
     */
    public String getExtendInfo() {
		return this.extendInfo;
	}

    /**
     * Sets extend info.
     *
     * @param extendInfo the extend info
     */
    public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

    /**
     * Gets fund scence.
     *
     * @return the fund scence
     */
    public String getFundScence() {
		return this.fundScence;
	}

    /**
     * Sets fund scence.
     *
     * @param fundScence the fund scence
     */
    public void setFundScence(String fundScence) {
		this.fundScence = fundScence;
	}

    /**
     * Gets is cancel.
     *
     * @return the is cancel
     */
    public String getIsCancel() {
		return this.isCancel;
	}

    /**
     * Sets is cancel.
     *
     * @param isCancel the is cancel
     */
    public void setIsCancel(String isCancel) {
		this.isCancel = isCancel;
	}

    /**
     * Gets operator.
     *
     * @return the operator
     */
    public String getOperator() {
		return this.operator;
	}

    /**
     * Sets operator.
     *
     * @param operator the operator
     */
    public void setOperator(String operator) {
		this.operator = operator;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets recharge details.
     *
     * @return the recharge details
     */
    public List<RechargeDetail> getRechargeDetails() {
		return this.rechargeDetails;
	}

    /**
     * Sets recharge details.
     *
     * @param rechargeDetails the recharge details
     */
    public void setRechargeDetails(List<RechargeDetail> rechargeDetails) {
		this.rechargeDetails = rechargeDetails;
	}

    /**
     * Gets return amount.
     *
     * @return the return amount
     */
    public String getReturnAmount() {
		return this.returnAmount;
	}

    /**
     * Sets return amount.
     *
     * @param returnAmount the return amount
     */
    public void setReturnAmount(String returnAmount) {
		this.returnAmount = returnAmount;
	}

    /**
     * Gets return asset amount.
     *
     * @return the return asset amount
     */
    public String getReturnAssetAmount() {
		return this.returnAssetAmount;
	}

    /**
     * Sets return asset amount.
     *
     * @param returnAssetAmount the return asset amount
     */
    public void setReturnAssetAmount(String returnAssetAmount) {
		this.returnAssetAmount = returnAssetAmount;
	}

    /**
     * Gets return fee amount.
     *
     * @return the return fee amount
     */
    public String getReturnFeeAmount() {
		return this.returnFeeAmount;
	}

    /**
     * Sets return fee amount.
     *
     * @param returnFeeAmount the return fee amount
     */
    public void setReturnFeeAmount(String returnFeeAmount) {
		this.returnFeeAmount = returnFeeAmount;
	}

    /**
     * Gets return fee asset amount.
     *
     * @return the return fee asset amount
     */
    public String getReturnFeeAssetAmount() {
		return this.returnFeeAssetAmount;
	}

    /**
     * Sets return fee asset amount.
     *
     * @param returnFeeAssetAmount the return fee asset amount
     */
    public void setReturnFeeAssetAmount(String returnFeeAssetAmount) {
		this.returnFeeAssetAmount = returnFeeAssetAmount;
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
