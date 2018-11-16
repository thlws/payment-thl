package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.cash.detail.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-19 14:27:35
 */
public class AlipayMarketingCampaignCashDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6665795977479133869L;

	/** 
	 * 活动状态，CREATED: 已创建未打款
PAID:已打款
READY:活动已开始
PAUSE:活动已暂停
CLOSED:活动已结束
SETTLE:活动已清算
	 */
	@ApiField("camp_status")
	private String campStatus;

	/** 
	 * 红包名称
	 */
	@ApiField("coupon_name")
	private String couponName;

	/** 
	 * 活动号
	 */
	@ApiField("crowd_no")
	private String crowdNo;

	/** 
	 * 活动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/** 
	 * 原始活动号,商户排查问题时提供的活动依据
	 */
	@ApiField("origin_crowd_no")
	private String originCrowdNo;

	/** 
	 * 活动文案,用户在账单中看到的红包描述
	 */
	@ApiField("prize_msg")
	private String prizeMsg;

	/** 
	 * 现金红包的发放形式, fixed为固定金额,random为随机金额
	 */
	@ApiField("prize_type")
	private String prizeType;

	/** 
	 * 活动已发放金额
	 */
	@ApiField("send_amount")
	private String sendAmount;

	/** 
	 * 活动开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/** 
	 * 活动总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 红包总个数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 红包总个数(废弃)
	 */
	@ApiField("total_num")
	private Long totalNum;

    /**
     * Sets camp status.
     *
     * @param campStatus the camp status
     */
    public void setCampStatus(String campStatus) {
		this.campStatus = campStatus;
	}

    /**
     * Gets camp status.
     *
     * @return the camp status
     */
    public String getCampStatus( ) {
		return this.campStatus;
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
     * Sets crowd no.
     *
     * @param crowdNo the crowd no
     */
    public void setCrowdNo(String crowdNo) {
		this.crowdNo = crowdNo;
	}

    /**
     * Gets crowd no.
     *
     * @return the crowd no
     */
    public String getCrowdNo( ) {
		return this.crowdNo;
	}

    /**
     * Sets end time.
     *
     * @param endTime the end time
     */
    public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

    /**
     * Gets end time.
     *
     * @return the end time
     */
    public Date getEndTime( ) {
		return this.endTime;
	}

    /**
     * Sets origin crowd no.
     *
     * @param originCrowdNo the origin crowd no
     */
    public void setOriginCrowdNo(String originCrowdNo) {
		this.originCrowdNo = originCrowdNo;
	}

    /**
     * Gets origin crowd no.
     *
     * @return the origin crowd no
     */
    public String getOriginCrowdNo( ) {
		return this.originCrowdNo;
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
     * Sets prize type.
     *
     * @param prizeType the prize type
     */
    public void setPrizeType(String prizeType) {
		this.prizeType = prizeType;
	}

    /**
     * Gets prize type.
     *
     * @return the prize type
     */
    public String getPrizeType( ) {
		return this.prizeType;
	}

    /**
     * Sets send amount.
     *
     * @param sendAmount the send amount
     */
    public void setSendAmount(String sendAmount) {
		this.sendAmount = sendAmount;
	}

    /**
     * Gets send amount.
     *
     * @return the send amount
     */
    public String getSendAmount( ) {
		return this.sendAmount;
	}

    /**
     * Sets start time.
     *
     * @param startTime the start time
     */
    public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

    /**
     * Gets start time.
     *
     * @return the start time
     */
    public Date getStartTime( ) {
		return this.startTime;
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
     * Sets total count.
     *
     * @param totalCount the total count
     */
    public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

    /**
     * Gets total count.
     *
     * @return the total count
     */
    public Long getTotalCount( ) {
		return this.totalCount;
	}

    /**
     * Sets total num.
     *
     * @param totalNum the total num
     */
    public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}

    /**
     * Gets total num.
     *
     * @return the total num
     */
    public Long getTotalNum( ) {
		return this.totalNum;
	}

}
