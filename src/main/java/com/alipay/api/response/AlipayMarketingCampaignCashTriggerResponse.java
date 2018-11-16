package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.cash.trigger response.
 *
 * @author auto create
 * @since 1.0, 2018-07-19 14:27:18
 */
public class AlipayMarketingCampaignCashTriggerResponse extends AlipayResponse {

	private static final long serialVersionUID = 1281526279563844898L;

	/** 
	 * 支付宝业务号,发奖成功时返回,调用者可提供此字符串进行问题排查与核对等
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 红包名称,创建活动时设置，用于账单列表和详情、红包列表和详情的展示
	 */
	@ApiField("coupon_name")
	private String couponName;

	/** 
	 * 用户领取失败的错误信息描述
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 商户头像logo的图片url地址，用于账单和红包列表、详情的展示
	 */
	@ApiField("merchant_logo")
	private String merchantLogo;

	/** 
	 * 外部业务号,回填请求中的out_biz_no,请求参数中传了out_biz_no就会回传回去，如果不传就回传默认的"default_out_biz_no"，请求者可用于日志记录与核对等
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 发送红包商户签约pid，发奖成功时非空
	 */
	@ApiField("partner_id")
	private String partnerId;

	/** 
	 * 现金红包金额，发奖成功时非空，单位为元，保留两位小数
	 */
	@ApiField("prize_amount")
	private String prizeAmount;

	/** 
	 * 活动文案,用于账单的备注展示、红包详情页的文案展示
	 */
	@ApiField("prize_msg")
	private String prizeMsg;

	/** 
	 * 用户是否重复领取，如果重复领取，返回的是之前的中奖结果，如果是首次领取，则走发奖流程
	 */
	@ApiField("repeat_trigger_flag")
	private String repeatTriggerFlag;

	/** 
	 * 是否中奖结果状态，取值为true或false。如果为true表示发奖成功，这时返回的结果中的其他字段非空；如果为false表示发奖失败，这时返回的其他字段为空
	 */
	@ApiField("trigger_result")
	private String triggerResult;

    /**
     * Sets biz no.
     *
     * @param bizNo the biz no
     */
    public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

    /**
     * Gets biz no.
     *
     * @return the biz no
     */
    public String getBizNo( ) {
		return this.bizNo;
	}

    /**
     * Sets coupon name.
     *
     * @param couponName the coupon name
     */
    public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

    /**
     * Gets coupon name.
     *
     * @return the coupon name
     */
    public String getCouponName( ) {
		return this.couponName;
	}

    /**
     * Sets error msg.
     *
     * @param errorMsg the error msg
     */
    public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

    /**
     * Gets error msg.
     *
     * @return the error msg
     */
    public String getErrorMsg( ) {
		return this.errorMsg;
	}

    /**
     * Sets merchant logo.
     *
     * @param merchantLogo the merchant logo
     */
    public void setMerchantLogo(String merchantLogo) {
		this.merchantLogo = merchantLogo;
	}

    /**
     * Gets merchant logo.
     *
     * @return the merchant logo
     */
    public String getMerchantLogo( ) {
		return this.merchantLogo;
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
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo( ) {
		return this.outBizNo;
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
     * Gets partner id.
     *
     * @return the partner id
     */
    public String getPartnerId( ) {
		return this.partnerId;
	}

    /**
     * Sets prize amount.
     *
     * @param prizeAmount the prize amount
     */
    public void setPrizeAmount(String prizeAmount) {
		this.prizeAmount = prizeAmount;
	}

    /**
     * Gets prize amount.
     *
     * @return the prize amount
     */
    public String getPrizeAmount( ) {
		return this.prizeAmount;
	}

    /**
     * Sets prize msg.
     *
     * @param prizeMsg the prize msg
     */
    public void setPrizeMsg(String prizeMsg) {
		this.prizeMsg = prizeMsg;
	}

    /**
     * Gets prize msg.
     *
     * @return the prize msg
     */
    public String getPrizeMsg( ) {
		return this.prizeMsg;
	}

    /**
     * Sets repeat trigger flag.
     *
     * @param repeatTriggerFlag the repeat trigger flag
     */
    public void setRepeatTriggerFlag(String repeatTriggerFlag) {
		this.repeatTriggerFlag = repeatTriggerFlag;
	}

    /**
     * Gets repeat trigger flag.
     *
     * @return the repeat trigger flag
     */
    public String getRepeatTriggerFlag( ) {
		return this.repeatTriggerFlag;
	}

    /**
     * Sets trigger result.
     *
     * @param triggerResult the trigger result
     */
    public void setTriggerResult(String triggerResult) {
		this.triggerResult = triggerResult;
	}

    /**
     * Gets trigger result.
     *
     * @return the trigger result
     */
    public String getTriggerResult( ) {
		return this.triggerResult;
	}

}
