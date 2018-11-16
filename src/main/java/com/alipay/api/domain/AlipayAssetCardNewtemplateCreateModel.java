package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 外部商户标准卡模板创建
 *
 * @author auto create
 * @since 1.0, 2018-05-18 22:32:29
 */
public class AlipayAssetCardNewtemplateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7431715356177111685L;

	/**
	 * 账户模式：借记/贷记/借贷合一账户模式
	 */
	@ApiField("account_model")
	private String accountModel;

	/**
	 * 按照资金产品维度定义的资产类型
	 */
	@ApiField("assets_code")
	private String assetsCode;

	/**
	 * 业务来源
	 */
	@ApiField("biz_from")
	private String bizFrom;

	/**
	 * 资金信息列表[{"fundType":"HUA_BEI"}]
	 */
	@ApiListField("card_fund_infos")
	@ApiField("card_fund_info")
	private List<CardFundInfo> cardFundInfos;

	/**
	 * 卡模式：单卡/多卡模式
	 */
	@ApiField("card_model")
	private String cardModel;

	/**
	 * 卡名称
	 */
	@ApiField("card_name")
	private String cardName;

	/**
	 * 创建人userId
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 贷记信息{"allowOverPay":false,"creditQuota":"0"}
	 */
	@ApiField("credit_info")
	private CardCreditInfo creditInfo;

	/**
	 * 扩展信息
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 操作人userId
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 比如某种业务标准外部订单号,比如交易外部订单号，代表商户端自己订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户和支付宝交互时，用于代表支付宝分配给商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 卡账户生命周期类型：长期卡/月卡
	 */
	@ApiField("period_type")
	private String periodType;

	/**
	 * 按照业务资产维度定义的产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 模板结算商户id，后续商户资金流入的指定账户
	 */
	@ApiField("settle_user_id")
	private String settleUserId;

    /**
     * Gets account entity.
     *
     * @return the account entity
     */
    public String getAccountModel() {
		return this.accountModel;
	}

    /**
     * Sets account entity.
     *
     * @param accountModel the account entity
     */
    public void setAccountModel(String accountModel) {
		this.accountModel = accountModel;
	}

    /**
     * Gets assets code.
     *
     * @return the assets code
     */
    public String getAssetsCode() {
		return this.assetsCode;
	}

    /**
     * Sets assets code.
     *
     * @param assetsCode the assets code
     */
    public void setAssetsCode(String assetsCode) {
		this.assetsCode = assetsCode;
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
     * Gets card fund infos.
     *
     * @return the card fund infos
     */
    public List<CardFundInfo> getCardFundInfos() {
		return this.cardFundInfos;
	}

    /**
     * Sets card fund infos.
     *
     * @param cardFundInfos the card fund infos
     */
    public void setCardFundInfos(List<CardFundInfo> cardFundInfos) {
		this.cardFundInfos = cardFundInfos;
	}

    /**
     * Gets card entity.
     *
     * @return the card entity
     */
    public String getCardModel() {
		return this.cardModel;
	}

    /**
     * Sets card entity.
     *
     * @param cardModel the card entity
     */
    public void setCardModel(String cardModel) {
		this.cardModel = cardModel;
	}

    /**
     * Gets card name.
     *
     * @return the card name
     */
    public String getCardName() {
		return this.cardName;
	}

    /**
     * Sets card name.
     *
     * @param cardName the card name
     */
    public void setCardName(String cardName) {
		this.cardName = cardName;
	}

    /**
     * Gets creator.
     *
     * @return the creator
     */
    public String getCreator() {
		return this.creator;
	}

    /**
     * Sets creator.
     *
     * @param creator the creator
     */
    public void setCreator(String creator) {
		this.creator = creator;
	}

    /**
     * Gets credit info.
     *
     * @return the credit info
     */
    public CardCreditInfo getCreditInfo() {
		return this.creditInfo;
	}

    /**
     * Sets credit info.
     *
     * @param creditInfo the credit info
     */
    public void setCreditInfo(CardCreditInfo creditInfo) {
		this.creditInfo = creditInfo;
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
     * Gets partner id.
     *
     * @return the partner id
     */
    public String getPartnerId() {
		return this.partnerId;
	}

    /**
     * Sets partner id.
     *
     * @param partnerId the partner id
     */
    public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

    /**
     * Gets period type.
     *
     * @return the period type
     */
    public String getPeriodType() {
		return this.periodType;
	}

    /**
     * Sets period type.
     *
     * @param periodType the period type
     */
    public void setPeriodType(String periodType) {
		this.periodType = periodType;
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
     * Gets settle user id.
     *
     * @return the settle user id
     */
    public String getSettleUserId() {
		return this.settleUserId;
	}

    /**
     * Sets settle user id.
     *
     * @param settleUserId the settle user id
     */
    public void setSettleUserId(String settleUserId) {
		this.settleUserId = settleUserId;
	}

}
