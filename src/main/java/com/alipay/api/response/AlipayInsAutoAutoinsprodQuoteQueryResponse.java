package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsProduct;
import com.alipay.api.domain.Car;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.autoinsprod.quote.query response.
 *
 * @author auto create
 * @since 1.0, 2018-01-09 12:03:04
 */
public class AlipayInsAutoAutoinsprodQuoteQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2127961858149773267L;

	/** 
	 * 商业险保费
	 */
	@ApiField("business_premium")
	private String businessPremium;

	/** 
	 * 商业险产品信息
	 */
	@ApiField("business_product")
	private InsProduct businessProduct;

	/** 
	 * 车辆信息
	 */
	@ApiField("car")
	private Car car;

	/** 
	 * 如果是图片验证码问题，返回验证码的base64流
	 */
	@ApiField("check_code")
	private String checkCode;

	/** 
	 * 图片验证码标识
	 */
	@ApiField("check_code_id")
	private String checkCodeId;

	/** 
	 * 0-不需要、1-江苏验证码、2-中保信验证码
	 */
	@ApiField("check_code_type")
	private String checkCodeType;

	/** 
	 * 保险公司ID
	 */
	@ApiField("com_id")
	private String comId;

	/** 
	 * 保险公司简称
	 */
	@ApiField("com_name")
	private String comName;

	/** 
	 * 车险询价申请号
	 */
	@ApiField("enquiry_biz_id")
	private String enquiryBizId;

	/** 
	 * 交强险保费
	 */
	@ApiField("force_premium")
	private String forcePremium;

	/** 
	 * 交强险产品信息
	 */
	@ApiField("force_product")
	private InsProduct forceProduct;

	/** 
	 * 报价ID
	 */
	@ApiField("quote_biz_id")
	private String quoteBizId;

	/** 
	 * 报价失败错误码，这个很重要
	 */
	@ApiField("quote_error_code")
	private String quoteErrorCode;

	/** 
	 * 报价失败提示信息
	 */
	@ApiField("quote_error_msg")
	private String quoteErrorMsg;

	/** 
	 * 实付保费[优惠后用户应付金额]
	 */
	@ApiField("real_premium")
	private String realPremium;

	/** 
	 * 优惠保费
	 */
	@ApiField("reduce_premium")
	private String reducePremium;

	/** 
	 * 总保费
	 */
	@ApiField("total_premium")
	private String totalPremium;

    /**
     * Sets business premium.
     *
     * @param businessPremium the business premium
     */
    public void setBusinessPremium(String businessPremium) {
		this.businessPremium = businessPremium;
	}

    /**
     * Gets business premium.
     *
     * @return the business premium
     */
    public String getBusinessPremium( ) {
		return this.businessPremium;
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
     * Gets business product.
     *
     * @return the business product
     */
    public InsProduct getBusinessProduct( ) {
		return this.businessProduct;
	}

    /**
     * Sets car.
     *
     * @param car the car
     */
    public void setCar(Car car) {
		this.car = car;
	}

    /**
     * Gets car.
     *
     * @return the car
     */
    public Car getCar( ) {
		return this.car;
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
     * Gets check code.
     *
     * @return the check code
     */
    public String getCheckCode( ) {
		return this.checkCode;
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
     * Gets check code id.
     *
     * @return the check code id
     */
    public String getCheckCodeId( ) {
		return this.checkCodeId;
	}

    /**
     * Sets check code type.
     *
     * @param checkCodeType the check code type
     */
    public void setCheckCodeType(String checkCodeType) {
		this.checkCodeType = checkCodeType;
	}

    /**
     * Gets check code type.
     *
     * @return the check code type
     */
    public String getCheckCodeType( ) {
		return this.checkCodeType;
	}

    /**
     * Sets com id.
     *
     * @param comId the com id
     */
    public void setComId(String comId) {
		this.comId = comId;
	}

    /**
     * Gets com id.
     *
     * @return the com id
     */
    public String getComId( ) {
		return this.comId;
	}

    /**
     * Sets com name.
     *
     * @param comName the com name
     */
    public void setComName(String comName) {
		this.comName = comName;
	}

    /**
     * Gets com name.
     *
     * @return the com name
     */
    public String getComName( ) {
		return this.comName;
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
     * Gets enquiry biz id.
     *
     * @return the enquiry biz id
     */
    public String getEnquiryBizId( ) {
		return this.enquiryBizId;
	}

    /**
     * Sets force premium.
     *
     * @param forcePremium the force premium
     */
    public void setForcePremium(String forcePremium) {
		this.forcePremium = forcePremium;
	}

    /**
     * Gets force premium.
     *
     * @return the force premium
     */
    public String getForcePremium( ) {
		return this.forcePremium;
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
     * Gets force product.
     *
     * @return the force product
     */
    public InsProduct getForceProduct( ) {
		return this.forceProduct;
	}

    /**
     * Sets quote biz id.
     *
     * @param quoteBizId the quote biz id
     */
    public void setQuoteBizId(String quoteBizId) {
		this.quoteBizId = quoteBizId;
	}

    /**
     * Gets quote biz id.
     *
     * @return the quote biz id
     */
    public String getQuoteBizId( ) {
		return this.quoteBizId;
	}

    /**
     * Sets quote error code.
     *
     * @param quoteErrorCode the quote error code
     */
    public void setQuoteErrorCode(String quoteErrorCode) {
		this.quoteErrorCode = quoteErrorCode;
	}

    /**
     * Gets quote error code.
     *
     * @return the quote error code
     */
    public String getQuoteErrorCode( ) {
		return this.quoteErrorCode;
	}

    /**
     * Sets quote error msg.
     *
     * @param quoteErrorMsg the quote error msg
     */
    public void setQuoteErrorMsg(String quoteErrorMsg) {
		this.quoteErrorMsg = quoteErrorMsg;
	}

    /**
     * Gets quote error msg.
     *
     * @return the quote error msg
     */
    public String getQuoteErrorMsg( ) {
		return this.quoteErrorMsg;
	}

    /**
     * Sets real premium.
     *
     * @param realPremium the real premium
     */
    public void setRealPremium(String realPremium) {
		this.realPremium = realPremium;
	}

    /**
     * Gets real premium.
     *
     * @return the real premium
     */
    public String getRealPremium( ) {
		return this.realPremium;
	}

    /**
     * Sets reduce premium.
     *
     * @param reducePremium the reduce premium
     */
    public void setReducePremium(String reducePremium) {
		this.reducePremium = reducePremium;
	}

    /**
     * Gets reduce premium.
     *
     * @return the reduce premium
     */
    public String getReducePremium( ) {
		return this.reducePremium;
	}

    /**
     * Sets total premium.
     *
     * @param totalPremium the total premium
     */
    public void setTotalPremium(String totalPremium) {
		this.totalPremium = totalPremium;
	}

    /**
     * Gets total premium.
     *
     * @return the total premium
     */
    public String getTotalPremium( ) {
		return this.totalPremium;
	}

}
