package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 外部商户标准发卡并充值
 *
 * @author auto create
 * @since 1.0, 2018-05-18 22:32:20
 */
public class AlipayAssetVoucherprodChargeSendModel extends AlipayObject {

	private static final long serialVersionUID = 1761942473729246882L;

	/**
	 * 卡资金总金额，单位元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 资产总面额，单位元
	 */
	@ApiField("asset_amount")
	private String assetAmount;

	/**
	 * 资产详情
	 */
	@ApiListField("asset_details")
	@ApiField("vcp_asset_detail")
	private List<VcpAssetDetail> assetDetails;

	/**
	 * 资产id
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 资产id类型 模板/资产id实例 ASSET_INSTANCE(实例)/ASSET_TEMPLATE(模板)
	 */
	@ApiField("asset_id_type")
	private String assetIdType;

	/**
	 * 资产平台类型卡/券
	 */
	@ApiField("asset_type")
	private String assetType;

	/**
	 * 业务发生时间
	 */
	@ApiField("biz_dt")
	private Date bizDt;

	/**
	 * 扩展信息
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 资金流场景
	 */
	@ApiField("fund_scence")
	private String fundScence;

	/**
	 * 比如某种业务标准外部订单号,比如交易外部订单号，代表商户端自己订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 用户userId
	 */
	@ApiField("publisher_user_id")
	private String publisherUserId;

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public String getAmount() {
		return this.amount;
	}

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(String amount) {
		this.amount = amount;
	}

    /**
     * Gets asset amount.
     *
     * @return the asset amount
     */
    public String getAssetAmount() {
		return this.assetAmount;
	}

    /**
     * Sets asset amount.
     *
     * @param assetAmount the asset amount
     */
    public void setAssetAmount(String assetAmount) {
		this.assetAmount = assetAmount;
	}

    /**
     * Gets asset details.
     *
     * @return the asset details
     */
    public List<VcpAssetDetail> getAssetDetails() {
		return this.assetDetails;
	}

    /**
     * Sets asset details.
     *
     * @param assetDetails the asset details
     */
    public void setAssetDetails(List<VcpAssetDetail> assetDetails) {
		this.assetDetails = assetDetails;
	}

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
     * Gets asset type.
     *
     * @return the asset type
     */
    public String getAssetType() {
		return this.assetType;
	}

    /**
     * Sets asset type.
     *
     * @param assetType the asset type
     */
    public void setAssetType(String assetType) {
		this.assetType = assetType;
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
     * Gets publisher user id.
     *
     * @return the publisher user id
     */
    public String getPublisherUserId() {
		return this.publisherUserId;
	}

    /**
     * Sets publisher user id.
     *
     * @param publisherUserId the publisher user id
     */
    public void setPublisherUserId(String publisherUserId) {
		this.publisherUserId = publisherUserId;
	}

}
