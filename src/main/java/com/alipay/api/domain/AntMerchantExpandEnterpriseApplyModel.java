package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户入驻接口
 *
 * @author auto create
 * @since 1.0, 2016-09-26 13:19:59
 */
public class AntMerchantExpandEnterpriseApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1477184361692632129L;

	/**
	 * 企业基础信息
	 */
	@ApiField("base_info")
	private BaseInfo baseInfo;

	/**
	 * 企业对公账户信息
	 */
	@ApiField("business_bank_account_info")
	private BusinessBankAccountInfo businessBankAccountInfo;

	/**
	 * 企业营业执照信息
	 */
	@ApiField("business_license_info")
	private BusinessLicenceInfo businessLicenseInfo;

	/**
	 * 企业级商户法人信息
	 */
	@ApiField("legal_representative_info")
	private LegalRepresentativeInfo legalRepresentativeInfo;

	/**
	 * 支付宝登录别名,必须是邮箱地址。入驻申请结果会通知到该邮箱地址或手机号码。如填入的是已有的企业版支付宝账号则后续认证与签约基于该账号进行，如填入的邮箱地址没有对应的支付宝账号则用该邮箱地址创建一个企业版支付宝账户，如填入的是已有的非企业版支付宝账号则预校验失败。
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 外部入驻申请单据号，需保证在开发者端不重复
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 企业的门店信息，签约当面付时必选
	 */
	@ApiField("shop_info")
	private ShopInfo shopInfo;

    /**
     * Gets base info.
     *
     * @return the base info
     */
    public BaseInfo getBaseInfo() {
		return this.baseInfo;
	}

    /**
     * Sets base info.
     *
     * @param baseInfo the base info
     */
    public void setBaseInfo(BaseInfo baseInfo) {
		this.baseInfo = baseInfo;
	}

    /**
     * Gets business bank account info.
     *
     * @return the business bank account info
     */
    public BusinessBankAccountInfo getBusinessBankAccountInfo() {
		return this.businessBankAccountInfo;
	}

    /**
     * Sets business bank account info.
     *
     * @param businessBankAccountInfo the business bank account info
     */
    public void setBusinessBankAccountInfo(BusinessBankAccountInfo businessBankAccountInfo) {
		this.businessBankAccountInfo = businessBankAccountInfo;
	}

    /**
     * Gets business license info.
     *
     * @return the business license info
     */
    public BusinessLicenceInfo getBusinessLicenseInfo() {
		return this.businessLicenseInfo;
	}

    /**
     * Sets business license info.
     *
     * @param businessLicenseInfo the business license info
     */
    public void setBusinessLicenseInfo(BusinessLicenceInfo businessLicenseInfo) {
		this.businessLicenseInfo = businessLicenseInfo;
	}

    /**
     * Gets legal representative info.
     *
     * @return the legal representative info
     */
    public LegalRepresentativeInfo getLegalRepresentativeInfo() {
		return this.legalRepresentativeInfo;
	}

    /**
     * Sets legal representative info.
     *
     * @param legalRepresentativeInfo the legal representative info
     */
    public void setLegalRepresentativeInfo(LegalRepresentativeInfo legalRepresentativeInfo) {
		this.legalRepresentativeInfo = legalRepresentativeInfo;
	}

    /**
     * Gets login id.
     *
     * @return the login id
     */
    public String getLoginId() {
		return this.loginId;
	}

    /**
     * Sets login id.
     *
     * @param loginId the login id
     */
    public void setLoginId(String loginId) {
		this.loginId = loginId;
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
     * Gets shop info.
     *
     * @return the shop info
     */
    public ShopInfo getShopInfo() {
		return this.shopInfo;
	}

    /**
     * Sets shop info.
     *
     * @param shopInfo the shop info
     */
    public void setShopInfo(ShopInfo shopInfo) {
		this.shopInfo = shopInfo;
	}

}
