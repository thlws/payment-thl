package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.templatedetail.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayMarketingVoucherTemplatedetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8758893865265834626L;

	/** 
	 * 面额。每张代金券可以抵扣的金额。币种为人民币，单位为元。该数值不小于0，小数点以后最多两位。
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 最低额度。券的最低使用门槛金额，只有订单金额大于等于最低额度时券才能使用。币种为人民币，单位为元。该数值不小于0，小数点以后最多保留两位。
	 */
	@ApiField("floor_amount")
	private String floorAmount;

	/** 
	 * 已发放总金额。币种为人民币，单位为元。该数值不小于0，小数点以后最多两位。
	 */
	@ApiField("publish_amount")
	private String publishAmount;

	/** 
	 * 已发放张数。单位为张。该数值是大于0的整数。
	 */
	@ApiField("publish_count")
	private Long publishCount;

	/** 
	 * 发放结束时间，格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_end_time")
	private Date publishEndTime;

	/** 
	 * 发放开始时间，格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_start_time")
	private Date publishStartTime;

	/** 
	 * 退回金额。币种为人民币，单位为元。该数值不小于0，小数点以后最多两位。
	 */
	@ApiField("recycle_amount")
	private String recycleAmount;

	/** 
	 * 模板状态，可枚举。分别为‘草稿’(I)、‘生效’(S)、‘删除’(D)和‘过期’(E)
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 券模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/** 
	 * 总金额面额。币种为人民币，单位为元。该数值不小于0，小数点以后最多两位。仅代金券
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 已使用总金额。币种为人民币，单位为元。该数值不小于0，小数点以后最多两位。
	 */
	@ApiField("used_amount")
	private String usedAmount;

	/** 
	 * 已使用张数。单位为张。该数值是大于0的整数。
	 */
	@ApiField("used_count")
	private Long usedCount;

	/** 
	 * 券使用说明
	 */
	@ApiField("voucher_description")
	private String voucherDescription;

	/** 
	 * 券名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/** 
	 * 拟发行券的数量。单位为张。该数值是大于0的整数。
	 */
	@ApiField("voucher_quantity")
	private Long voucherQuantity;

	/** 
	 * 券类型。可枚举，暂时只支持"代金券"(FIX_VOUCHER)
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/** 
	 * 券有效期。有两种类型：绝对时间和相对时间。使用JSON字符串表示。绝对时间有3个key：type、start、end，type取值固定为"ABSOLUTE"，start和end分别表示券生效时间和失效时间，格式为yyyy-MM-dd HH:mm:ss。绝对时间示例：{"type": "ABSOLUTE", "start": "2017-01-10 00:00:00", "end": "2017-01-13 23:59:59"}。相对时间有3个key：type、duration、unit，type取值固定为"RELATIVE"，duration表示从发券时间开始到往后推duration个单位时间为止作为券的使用有效期，unit表示有效时间单位，有效时间单位可枚举：MINUTE, HOUR, DAY。示例：{"type": "RELATIVE", "duration": 1 , "unit": "DAY" }，如果此刻发券，那么该券从现在开始生效1(duration)天(unit)后失效。
	 */
	@ApiField("voucher_valid_period")
	private String voucherValidPeriod;

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(String amount) {
		this.amount = amount;
	}

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public String getAmount( ) {
		return this.amount;
	}

    /**
     * Sets floor amount.
     *
     * @param floorAmount the floor amount
     */
    public void setFloorAmount(String floorAmount) {
		this.floorAmount = floorAmount;
	}

    /**
     * Gets floor amount.
     *
     * @return the floor amount
     */
    public String getFloorAmount( ) {
		return this.floorAmount;
	}

    /**
     * Sets publish amount.
     *
     * @param publishAmount the publish amount
     */
    public void setPublishAmount(String publishAmount) {
		this.publishAmount = publishAmount;
	}

    /**
     * Gets publish amount.
     *
     * @return the publish amount
     */
    public String getPublishAmount( ) {
		return this.publishAmount;
	}

    /**
     * Sets publish count.
     *
     * @param publishCount the publish count
     */
    public void setPublishCount(Long publishCount) {
		this.publishCount = publishCount;
	}

    /**
     * Gets publish count.
     *
     * @return the publish count
     */
    public Long getPublishCount( ) {
		return this.publishCount;
	}

    /**
     * Sets publish end time.
     *
     * @param publishEndTime the publish end time
     */
    public void setPublishEndTime(Date publishEndTime) {
		this.publishEndTime = publishEndTime;
	}

    /**
     * Gets publish end time.
     *
     * @return the publish end time
     */
    public Date getPublishEndTime( ) {
		return this.publishEndTime;
	}

    /**
     * Sets publish start time.
     *
     * @param publishStartTime the publish start time
     */
    public void setPublishStartTime(Date publishStartTime) {
		this.publishStartTime = publishStartTime;
	}

    /**
     * Gets publish start time.
     *
     * @return the publish start time
     */
    public Date getPublishStartTime( ) {
		return this.publishStartTime;
	}

    /**
     * Sets recycle amount.
     *
     * @param recycleAmount the recycle amount
     */
    public void setRecycleAmount(String recycleAmount) {
		this.recycleAmount = recycleAmount;
	}

    /**
     * Gets recycle amount.
     *
     * @return the recycle amount
     */
    public String getRecycleAmount( ) {
		return this.recycleAmount;
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
     * Gets status.
     *
     * @return the status
     */
    public String getStatus( ) {
		return this.status;
	}

    /**
     * Sets template id.
     *
     * @param templateId the template id
     */
    public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

    /**
     * Gets template id.
     *
     * @return the template id
     */
    public String getTemplateId( ) {
		return this.templateId;
	}

    /**
     * Sets total amount.
     *
     * @param totalAmount the total amount
     */
    public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

    /**
     * Gets total amount.
     *
     * @return the total amount
     */
    public String getTotalAmount( ) {
		return this.totalAmount;
	}

    /**
     * Sets used amount.
     *
     * @param usedAmount the used amount
     */
    public void setUsedAmount(String usedAmount) {
		this.usedAmount = usedAmount;
	}

    /**
     * Gets used amount.
     *
     * @return the used amount
     */
    public String getUsedAmount( ) {
		return this.usedAmount;
	}

    /**
     * Sets used count.
     *
     * @param usedCount the used count
     */
    public void setUsedCount(Long usedCount) {
		this.usedCount = usedCount;
	}

    /**
     * Gets used count.
     *
     * @return the used count
     */
    public Long getUsedCount( ) {
		return this.usedCount;
	}

    /**
     * Sets voucher description.
     *
     * @param voucherDescription the voucher description
     */
    public void setVoucherDescription(String voucherDescription) {
		this.voucherDescription = voucherDescription;
	}

    /**
     * Gets voucher description.
     *
     * @return the voucher description
     */
    public String getVoucherDescription( ) {
		return this.voucherDescription;
	}

    /**
     * Sets voucher name.
     *
     * @param voucherName the voucher name
     */
    public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

    /**
     * Gets voucher name.
     *
     * @return the voucher name
     */
    public String getVoucherName( ) {
		return this.voucherName;
	}

    /**
     * Sets voucher quantity.
     *
     * @param voucherQuantity the voucher quantity
     */
    public void setVoucherQuantity(Long voucherQuantity) {
		this.voucherQuantity = voucherQuantity;
	}

    /**
     * Gets voucher quantity.
     *
     * @return the voucher quantity
     */
    public Long getVoucherQuantity( ) {
		return this.voucherQuantity;
	}

    /**
     * Sets voucher type.
     *
     * @param voucherType the voucher type
     */
    public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

    /**
     * Gets voucher type.
     *
     * @return the voucher type
     */
    public String getVoucherType( ) {
		return this.voucherType;
	}

    /**
     * Sets voucher valid period.
     *
     * @param voucherValidPeriod the voucher valid period
     */
    public void setVoucherValidPeriod(String voucherValidPeriod) {
		this.voucherValidPeriod = voucherValidPeriod;
	}

    /**
     * Gets voucher valid period.
     *
     * @return the voucher valid period
     */
    public String getVoucherValidPeriod( ) {
		return this.voucherValidPeriod;
	}

}
