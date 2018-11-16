package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保险营销活动DTO对象
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class InsMktCampaignDTO extends AlipayObject {

	private static final long serialVersionUID = 3623585544267351315L;

	/**
	 * 保险营销活动id
	 */
	@ApiField("campaign_id")
	private String campaignId;

	/**
	 * 活动奖品发行量
	 */
	@ApiField("circulation")
	private Long circulation;

	/**
	 * 活动权益配置
	 */
	@ApiField("coupon_config")
	private InsMktCouponConfigDTO couponConfig;

	/**
	 * 活动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 活动备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 活动标的列表
	 */
	@ApiListField("mkt_objects")
	@ApiField("ins_mkt_object_d_t_o")
	private List<InsMktObjectDTO> mktObjects;

	/**
	 * 保险营销活动名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 发奖金额算法
	 */
	@ApiField("send_algorithm")
	private String sendAlgorithm;

	/**
	 * 发奖规则类型：
1. 基于账户做发奖控制
2. 基于身份证做发奖控制
3. 基于业务单号做发奖控制
	 */
	@ApiField("send_frqnc_type")
	private Long sendFrqncType;

	/**
	 * 发奖规则值，频次为3
	 */
	@ApiField("send_frqnc_value")
	private Long sendFrqncValue;

	/**
	 * 活动开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 活动状态：
5：活动已发布，待生效
6：活动已生效
7：活动已失效
8：活动已下线
	 */
	@ApiField("status")
	private Long status;

    /**
     * Gets campaign id.
     *
     * @return the campaign id
     */
    public String getCampaignId() {
		return this.campaignId;
	}

    /**
     * Sets campaign id.
     *
     * @param campaignId the campaign id
     */
    public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

    /**
     * Gets circulation.
     *
     * @return the circulation
     */
    public Long getCirculation() {
		return this.circulation;
	}

    /**
     * Sets circulation.
     *
     * @param circulation the circulation
     */
    public void setCirculation(Long circulation) {
		this.circulation = circulation;
	}

    /**
     * Gets coupon config.
     *
     * @return the coupon config
     */
    public InsMktCouponConfigDTO getCouponConfig() {
		return this.couponConfig;
	}

    /**
     * Sets coupon config.
     *
     * @param couponConfig the coupon config
     */
    public void setCouponConfig(InsMktCouponConfigDTO couponConfig) {
		this.couponConfig = couponConfig;
	}

    /**
     * Gets end time.
     *
     * @return the end time
     */
    public Date getEndTime() {
		return this.endTime;
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
     * Gets send algorithm.
     *
     * @return the send algorithm
     */
    public String getSendAlgorithm() {
		return this.sendAlgorithm;
	}

    /**
     * Sets send algorithm.
     *
     * @param sendAlgorithm the send algorithm
     */
    public void setSendAlgorithm(String sendAlgorithm) {
		this.sendAlgorithm = sendAlgorithm;
	}

    /**
     * Gets send frqnc type.
     *
     * @return the send frqnc type
     */
    public Long getSendFrqncType() {
		return this.sendFrqncType;
	}

    /**
     * Sets send frqnc type.
     *
     * @param sendFrqncType the send frqnc type
     */
    public void setSendFrqncType(Long sendFrqncType) {
		this.sendFrqncType = sendFrqncType;
	}

    /**
     * Gets send frqnc value.
     *
     * @return the send frqnc value
     */
    public Long getSendFrqncValue() {
		return this.sendFrqncValue;
	}

    /**
     * Sets send frqnc value.
     *
     * @param sendFrqncValue the send frqnc value
     */
    public void setSendFrqncValue(Long sendFrqncValue) {
		this.sendFrqncValue = sendFrqncValue;
	}

    /**
     * Gets start time.
     *
     * @return the start time
     */
    public Date getStartTime() {
		return this.startTime;
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
     * Gets status.
     *
     * @return the status
     */
    public Long getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(Long status) {
		this.status = status;
	}

}
