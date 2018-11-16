package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报价申请接口
 *
 * @author auto create
 * @since 1.0, 2018-01-09 11:32:37
 */
public class AlipayInsAutoAutoinsprodQuoteApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5579322226916652744L;

	/**
	 * 商业险产品信息
	 */
	@ApiField("business_product")
	private InsProduct businessProduct;

	/**
	 * 用户录入验证码,当需要图片验证码时必传
	 */
	@ApiField("check_code")
	private String checkCode;

	/**
	 * 验证码对应id	当需要图片验证码时必传
	 */
	@ApiField("check_code_id")
	private String checkCodeId;

	/**
	 * 验证类型	0-不需要、1-江苏验证码、2-中保信验证码
	 */
	@ApiField("check_type")
	private String checkType;

	/**
	 * 机构编码	当微调报价时必传，当需要图片验证码时必传
	 */
	@ApiField("company_id")
	private String companyId;

	/**
	 * 车险询价申请号
	 */
	@ApiField("enquiry_biz_id")
	private String enquiryBizId;

	/**
	 * 交强险产品信息
	 */
	@ApiField("force_product")
	private InsProduct forceProduct;

	/**
	 * 报价类型	1-微调，0-套餐
	 */
	@ApiField("quote_type")
	private String quoteType;

    /**
     * Gets business product.
     *
     * @return the business product
     */
    public InsProduct getBusinessProduct() {
		return this.businessProduct;
	}

    /**
     * Sets business product.
     *
     * @param businessProduct the business product
     */
    public void setBusinessProduct(InsProduct businessProduct) {
		this.businessProduct = businessProduct;
	}

    /**
     * Gets check code.
     *
     * @return the check code
     */
    public String getCheckCode() {
		return this.checkCode;
	}

    /**
     * Sets check code.
     *
     * @param checkCode the check code
     */
    public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}

    /**
     * Gets check code id.
     *
     * @return the check code id
     */
    public String getCheckCodeId() {
		return this.checkCodeId;
	}

    /**
     * Sets check code id.
     *
     * @param checkCodeId the check code id
     */
    public void setCheckCodeId(String checkCodeId) {
		this.checkCodeId = checkCodeId;
	}

    /**
     * Gets check type.
     *
     * @return the check type
     */
    public String getCheckType() {
		return this.checkType;
	}

    /**
     * Sets check type.
     *
     * @param checkType the check type
     */
    public void setCheckType(String checkType) {
		this.checkType = checkType;
	}

    /**
     * Gets company id.
     *
     * @return the company id
     */
    public String getCompanyId() {
		return this.companyId;
	}

    /**
     * Sets company id.
     *
     * @param companyId the company id
     */
    public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

    /**
     * Gets enquiry biz id.
     *
     * @return the enquiry biz id
     */
    public String getEnquiryBizId() {
		return this.enquiryBizId;
	}

    /**
     * Sets enquiry biz id.
     *
     * @param enquiryBizId the enquiry biz id
     */
    public void setEnquiryBizId(String enquiryBizId) {
		this.enquiryBizId = enquiryBizId;
	}

    /**
     * Gets force product.
     *
     * @return the force product
     */
    public InsProduct getForceProduct() {
		return this.forceProduct;
	}

    /**
     * Sets force product.
     *
     * @param forceProduct the force product
     */
    public void setForceProduct(InsProduct forceProduct) {
		this.forceProduct = forceProduct;
	}

    /**
     * Gets quote type.
     *
     * @return the quote type
     */
    public String getQuoteType() {
		return this.quoteType;
	}

    /**
     * Sets quote type.
     *
     * @param quoteType the quote type
     */
    public void setQuoteType(String quoteType) {
		this.quoteType = quoteType;
	}

}
