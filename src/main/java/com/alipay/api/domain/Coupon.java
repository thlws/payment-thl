package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户红包
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class Coupon extends AlipayObject {

	private static final long serialVersionUID = 1759652775187395741L;

	/**
	 * 当前可用面额
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/**
	 * 红包编号
	 */
	@ApiField("coupon_no")
	private String couponNo;

	/**
	 * 可优惠面额
	 */
	@ApiField("deduct_amount")
	private String deductAmount;

	/**
	 * 有效期开始时间
	 */
	@ApiField("gmt_active")
	private String gmtActive;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 有效期结束时间
	 */
	@ApiField("gmt_expired")
	private String gmtExpired;

	/**
	 * 红包使用说明
	 */
	@ApiField("instructions")
	private String instructions;

	/**
	 * 红包详情说明
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户id
	 */
	@ApiField("merchant_uniq_id")
	private String merchantUniqId;

	/**
	 * 是否可叠加
	 */
	@ApiField("multi_use_flag")
	private String multiUseFlag;

	/**
	 * 红包名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 是否可退款标识
	 */
	@ApiField("refund_flag")
	private String refundFlag;

	/**
	 * 红包状态信息
	 */
	@ApiField("status")
	private String status;

	/**
	 * 红包模板编号
	 */
	@ApiField("template_no")
	private String templateNo;

	/**
	 * 用户openid
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets available amount.
     *
     * @return the available amount
     */
    public String getAvailableAmount() {
		return this.availableAmount;
	}

    /**
     * Sets available amount.
     *
     * @param availableAmount the available amount
     */
    public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}

    /**
     * Gets coupon no.
     *
     * @return the coupon no
     */
    public String getCouponNo() {
		return this.couponNo;
	}

    /**
     * Sets coupon no.
     *
     * @param couponNo the coupon no
     */
    public void setCouponNo(String couponNo) {
		this.couponNo = couponNo;
	}

    /**
     * Gets deduct amount.
     *
     * @return the deduct amount
     */
    public String getDeductAmount() {
		return this.deductAmount;
	}

    /**
     * Sets deduct amount.
     *
     * @param deductAmount the deduct amount
     */
    public void setDeductAmount(String deductAmount) {
		this.deductAmount = deductAmount;
	}

    /**
     * Gets gmt active.
     *
     * @return the gmt active
     */
    public String getGmtActive() {
		return this.gmtActive;
	}

    /**
     * Sets gmt active.
     *
     * @param gmtActive the gmt active
     */
    public void setGmtActive(String gmtActive) {
		this.gmtActive = gmtActive;
	}

    /**
     * Gets gmt create.
     *
     * @return the gmt create
     */
    public String getGmtCreate() {
		return this.gmtCreate;
	}

    /**
     * Sets gmt create.
     *
     * @param gmtCreate the gmt create
     */
    public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

    /**
     * Gets gmt expired.
     *
     * @return the gmt expired
     */
    public String getGmtExpired() {
		return this.gmtExpired;
	}

    /**
     * Sets gmt expired.
     *
     * @param gmtExpired the gmt expired
     */
    public void setGmtExpired(String gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

    /**
     * Gets instructions.
     *
     * @return the instructions
     */
    public String getInstructions() {
		return this.instructions;
	}

    /**
     * Sets instructions.
     *
     * @param instructions the instructions
     */
    public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

    /**
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo() {
		return this.memo;
	}

    /**
     * Sets memo.
     *
     * @param memo the memo
     */
    public void setMemo(String memo) {
		this.memo = memo;
	}

    /**
     * Gets merchant uniq id.
     *
     * @return the merchant uniq id
     */
    public String getMerchantUniqId() {
		return this.merchantUniqId;
	}

    /**
     * Sets merchant uniq id.
     *
     * @param merchantUniqId the merchant uniq id
     */
    public void setMerchantUniqId(String merchantUniqId) {
		this.merchantUniqId = merchantUniqId;
	}

    /**
     * Gets multi use flag.
     *
     * @return the multi use flag
     */
    public String getMultiUseFlag() {
		return this.multiUseFlag;
	}

    /**
     * Sets multi use flag.
     *
     * @param multiUseFlag the multi use flag
     */
    public void setMultiUseFlag(String multiUseFlag) {
		this.multiUseFlag = multiUseFlag;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets refund flag.
     *
     * @return the refund flag
     */
    public String getRefundFlag() {
		return this.refundFlag;
	}

    /**
     * Sets refund flag.
     *
     * @param refundFlag the refund flag
     */
    public void setRefundFlag(String refundFlag) {
		this.refundFlag = refundFlag;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets template no.
     *
     * @return the template no
     */
    public String getTemplateNo() {
		return this.templateNo;
	}

    /**
     * Sets template no.
     *
     * @param templateNo the template no
     */
    public void setTemplateNo(String templateNo) {
		this.templateNo = templateNo;
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
