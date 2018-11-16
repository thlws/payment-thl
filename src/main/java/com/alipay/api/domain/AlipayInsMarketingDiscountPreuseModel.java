package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保险营销优惠预核销
 *
 * @author auto create
 * @since 1.0, 2017-07-19 16:56:59
 */
public class AlipayInsMarketingDiscountPreuseModel extends AlipayObject {

	private static final long serialVersionUID = 1524745714848497147L;

	/**
	 * 保险营销账号Id
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 保险营销账号类型
	 */
	@ApiField("account_type")
	private Long accountType;

	/**
	 * 保险营销业务类型
	 */
	@ApiField("business_type")
	private Long businessType;

	/**
	 * 优惠决策因子
	 */
	@ApiListField("factors")
	@ApiField("ins_mkt_factor_d_t_o")
	private List<InsMktFactorDTO> factors;

	/**
	 * 营销市场列表
	 */
	@ApiListField("market_types")
	@ApiField("number")
	private List<Long> marketTypes;

	/**
	 * 权益活动列表
	 */
	@ApiListField("mkt_coupon_campaigns")
	@ApiField("ins_mkt_coupon_cmpgn_base_d_t_o")
	private List<InsMktCouponCmpgnBaseDTO> mktCouponCampaigns;

	/**
	 * 用户选择的权益列表
	 */
	@ApiListField("mkt_coupons")
	@ApiField("ins_mkt_coupon_base_d_t_o")
	private List<InsMktCouponBaseDTO> mktCoupons;

	/**
	 * 营销标的列表
	 */
	@ApiListField("mkt_objects")
	@ApiField("ins_mkt_object_d_t_o")
	private List<InsMktObjectDTO> mktObjects;

	/**
	 * 请求流水id
	 */
	@ApiField("request_id")
	private String requestId;

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
     * Gets account type.
     *
     * @return the account type
     */
    public Long getAccountType() {
		return this.accountType;
	}

    /**
     * Sets account type.
     *
     * @param accountType the account type
     */
    public void setAccountType(Long accountType) {
		this.accountType = accountType;
	}

    /**
     * Gets business type.
     *
     * @return the business type
     */
    public Long getBusinessType() {
		return this.businessType;
	}

    /**
     * Sets business type.
     *
     * @param businessType the business type
     */
    public void setBusinessType(Long businessType) {
		this.businessType = businessType;
	}

    /**
     * Gets factors.
     *
     * @return the factors
     */
    public List<InsMktFactorDTO> getFactors() {
		return this.factors;
	}

    /**
     * Sets factors.
     *
     * @param factors the factors
     */
    public void setFactors(List<InsMktFactorDTO> factors) {
		this.factors = factors;
	}

    /**
     * Gets market types.
     *
     * @return the market types
     */
    public List<Long> getMarketTypes() {
		return this.marketTypes;
	}

    /**
     * Sets market types.
     *
     * @param marketTypes the market types
     */
    public void setMarketTypes(List<Long> marketTypes) {
		this.marketTypes = marketTypes;
	}

    /**
     * Gets mkt coupon campaigns.
     *
     * @return the mkt coupon campaigns
     */
    public List<InsMktCouponCmpgnBaseDTO> getMktCouponCampaigns() {
		return this.mktCouponCampaigns;
	}

    /**
     * Sets mkt coupon campaigns.
     *
     * @param mktCouponCampaigns the mkt coupon campaigns
     */
    public void setMktCouponCampaigns(List<InsMktCouponCmpgnBaseDTO> mktCouponCampaigns) {
		this.mktCouponCampaigns = mktCouponCampaigns;
	}

    /**
     * Gets mkt coupons.
     *
     * @return the mkt coupons
     */
    public List<InsMktCouponBaseDTO> getMktCoupons() {
		return this.mktCoupons;
	}

    /**
     * Sets mkt coupons.
     *
     * @param mktCoupons the mkt coupons
     */
    public void setMktCoupons(List<InsMktCouponBaseDTO> mktCoupons) {
		this.mktCoupons = mktCoupons;
	}

    /**
     * Gets mkt objects.
     *
     * @return the mkt objects
     */
    public List<InsMktObjectDTO> getMktObjects() {
		return this.mktObjects;
	}

    /**
     * Sets mkt objects.
     *
     * @param mktObjects the mkt objects
     */
    public void setMktObjects(List<InsMktObjectDTO> mktObjects) {
		this.mktObjects = mktObjects;
	}

    /**
     * Gets request id.
     *
     * @return the request id
     */
    public String getRequestId() {
		return this.requestId;
	}

    /**
     * Sets request id.
     *
     * @param requestId the request id
     */
    public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
