package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 多保单投保申请
 *
 * @author auto create
 * @since 1.0, 2018-07-09 17:45:36
 */
public class AlipayInsSceneApplicationGroupApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2416344465683452185L;

	/**
	 * 收件人
	 */
	@ApiField("addressee")
	private InsAddressee addressee;

	/**
	 * 投保人
	 */
	@ApiField("applicant")
	private InsPerson applicant;

	/**
	 * 投保申请信息列表
	 */
	@ApiListField("applications")
	@ApiField("ins_application")
	private List<InsApplication> applications;

	/**
	 * 保费支付账单流水的标题
	 */
	@ApiField("bill_title")
	private String billTitle;

	/**
	 * 权益，可选不唯一，优惠使用，优惠决策时产生。
	 */
	@ApiListField("coupons")
	@ApiField("ins_coupon")
	private List<InsCoupon> coupons;

	/**
	 * 优惠单号，可选不唯一，优惠使用，优惠决策时产生。
	 */
	@ApiField("discount_id")
	private String discountId;

	/**
	 * 商户生成的外部投保业务号,必须保证唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 产品编码;由蚂蚁保险平台分配,商户通过该产品编码投保特定的保险产品
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 报价单号，可选不唯一，用于指定投保订单对应的报价单，报价时产生。
	 */
	@ApiField("quote_biz_id")
	private String quoteBizId;

	/**
	 * 渠道来源
	 */
	@ApiField("source")
	private String source;

    /**
     * Gets addressee.
     *
     * @return the addressee
     */
    public InsAddressee getAddressee() {
		return this.addressee;
	}

    /**
     * Sets addressee.
     *
     * @param addressee the addressee
     */
    public void setAddressee(InsAddressee addressee) {
		this.addressee = addressee;
	}

    /**
     * Gets applicant.
     *
     * @return the applicant
     */
    public InsPerson getApplicant() {
		return this.applicant;
	}

    /**
     * Sets applicant.
     *
     * @param applicant the applicant
     */
    public void setApplicant(InsPerson applicant) {
		this.applicant = applicant;
	}

    /**
     * Gets applications.
     *
     * @return the applications
     */
    public List<InsApplication> getApplications() {
		return this.applications;
	}

    /**
     * Sets applications.
     *
     * @param applications the applications
     */
    public void setApplications(List<InsApplication> applications) {
		this.applications = applications;
	}

    /**
     * Gets bill title.
     *
     * @return the bill title
     */
    public String getBillTitle() {
		return this.billTitle;
	}

    /**
     * Sets bill title.
     *
     * @param billTitle the bill title
     */
    public void setBillTitle(String billTitle) {
		this.billTitle = billTitle;
	}

    /**
     * Gets coupons.
     *
     * @return the coupons
     */
    public List<InsCoupon> getCoupons() {
		return this.coupons;
	}

    /**
     * Sets coupons.
     *
     * @param coupons the coupons
     */
    public void setCoupons(List<InsCoupon> coupons) {
		this.coupons = coupons;
	}

    /**
     * Gets discount id.
     *
     * @return the discount id
     */
    public String getDiscountId() {
		return this.discountId;
	}

    /**
     * Sets discount id.
     *
     * @param discountId the discount id
     */
    public void setDiscountId(String discountId) {
		this.discountId = discountId;
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
     * Gets prod code.
     *
     * @return the prod code
     */
    public String getProdCode() {
		return this.prodCode;
	}

    /**
     * Sets prod code.
     *
     * @param prodCode the prod code
     */
    public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

    /**
     * Gets quote biz id.
     *
     * @return the quote biz id
     */
    public String getQuoteBizId() {
		return this.quoteBizId;
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
     * Gets source.
     *
     * @return the source
     */
    public String getSource() {
		return this.source;
	}

    /**
     * Sets source.
     *
     * @param source the source
     */
    public void setSource(String source) {
		this.source = source;
	}

}
