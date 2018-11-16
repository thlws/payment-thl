package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MpPrizeInfoModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.drawcamp.query response.
 *
 * @author auto create
 * @since 1.0, 2017-03-23 14:22:15
 */
public class AlipayMarketingCampaignDrawcampQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3541751476659479862L;

	/** 
	 * 单用户以支付宝账号维度可参与当前营销活动的总次数，由开发者自定义此数值
	 */
	@ApiField("account_count")
	private String accountCount;

	/** 
	 * 以移动设备维度可参与当前营销活动的总次数，由开发者自定义此数值
	 */
	@ApiField("appid_count")
	private String appidCount;

	/** 
	 * 单个用户当前活动允许中奖的最大次数，最大值999999
	 */
	@ApiField("award_count")
	private String awardCount;

	/** 
	 * 活动奖品总中奖几率，开发者需传入整数值，如：传入99支付宝默认为99%
	 */
	@ApiField("award_rate")
	private String awardRate;

	/** 
	 * 活动唯一标识,不能包含除中文、英文、数字以外的字符，创建后不能修改，需要保证在商户端不重复。
	 */
	@ApiField("camp_code")
	private String campCode;

	/** 
	 * 活动结束时间，yyyy-MM-dd HH:00:00格式(到小时)，需要大于活动开始时间
	 */
	@ApiField("camp_end_time")
	private String campEndTime;

	/** 
	 * 抽奖活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/** 
	 * 活动名称，开发者自定义
	 */
	@ApiField("camp_name")
	private String campName;

	/** 
	 * 活动开始时间，yyyy-MM-dd HH:00:00格式（到小时），时间不能早于当前日期的0点
	 */
	@ApiField("camp_start_time")
	private String campStartTime;

	/** 
	 * 活动状态，CAMP_CREATED(已创建状态)，CAMP_PAUSED(暂停状态)，CAMP_ENDED(结束状态)，CAMP_GOING(启动状态)，可由alipay.marketing.campaign.drawcamp.status.update 接口将已创建状态改为启动状态，将启动状态改为暂停/结束状态，将暂停状态置为结束状态
	 */
	@ApiField("camp_status")
	private String campStatus;

	/** 
	 * 凭证验证规则id，通过alipay.marketing.campaign.cert.create 接口创建的凭证id
	 */
	@ApiField("cert_rule_id")
	private String certRuleId;

	/** 
	 * 单用户以账户证件号（如身份证号、护照、军官证等）维度可参与当前营销活动的总次数，由开发者自定义此数值
	 */
	@ApiField("certification_count")
	private String certificationCount;

	/** 
	 * 签约商户的pid，系统默认获取当前接口调用者的签约pid
	 */
	@ApiField("creator")
	private String creator;

	/** 
	 * 圈人规则id，通过alipay.marketing.campaign.rule.crowd.create 接口创建的规则id
	 */
	@ApiField("crowd_rule_id")
	private String crowdRuleId;

	/** 
	 * 以认证手机号（与支付宝账号绑定的手机号）维度的可参与当前营销活动的总次数，由开发者自定义此数值
	 */
	@ApiField("mobile_count")
	private String mobileCount;

	/** 
	 * 奖品模型，至少有一个奖品模型
	 */
	@ApiListField("prize_list")
	@ApiField("mp_prize_info_model")
	private List<MpPrizeInfoModel> prizeList;

	/** 
	 * 营销验证规则id，由支付宝配置
	 */
	@ApiField("promo_rule_id")
	private String promoRuleId;

	/** 
	 * 活动触发类型，目前支持
CAMP_USER_TRIGGER：用户触发（开发者调用alipay.marketing.campaign.drawcamp.trigger 接口触发）；
CAMP_SYS_TRIGGER：系统触发，必须配置实时人群验证规则（如：配置了监听用户支付事件，支付宝会根据活动规则自动发奖，无需用户手动触发）。
	 */
	@ApiField("trigger_type")
	private String triggerType;

	/** 
	 * 实时人群验证规则id，由支付宝配置
	 */
	@ApiField("trigger_user_rule_id")
	private String triggerUserRuleId;

	/** 
	 * 人群验证规则id，由支付宝配置
	 */
	@ApiField("user_rule_id")
	private String userRuleId;

    /**
     * Sets account count.
     *
     * @param accountCount the account count
     */
    public void setAccountCount(String accountCount) {
		this.accountCount = accountCount;
	}

    /**
     * Gets account count.
     *
     * @return the account count
     */
    public String getAccountCount( ) {
		return this.accountCount;
	}

    /**
     * Sets appid count.
     *
     * @param appidCount the appid count
     */
    public void setAppidCount(String appidCount) {
		this.appidCount = appidCount;
	}

    /**
     * Gets appid count.
     *
     * @return the appid count
     */
    public String getAppidCount( ) {
		return this.appidCount;
	}

    /**
     * Sets award count.
     *
     * @param awardCount the award count
     */
    public void setAwardCount(String awardCount) {
		this.awardCount = awardCount;
	}

    /**
     * Gets award count.
     *
     * @return the award count
     */
    public String getAwardCount( ) {
		return this.awardCount;
	}

    /**
     * Sets award rate.
     *
     * @param awardRate the award rate
     */
    public void setAwardRate(String awardRate) {
		this.awardRate = awardRate;
	}

    /**
     * Gets award rate.
     *
     * @return the award rate
     */
    public String getAwardRate( ) {
		return this.awardRate;
	}

    /**
     * Sets camp code.
     *
     * @param campCode the camp code
     */
    public void setCampCode(String campCode) {
		this.campCode = campCode;
	}

    /**
     * Gets camp code.
     *
     * @return the camp code
     */
    public String getCampCode( ) {
		return this.campCode;
	}

    /**
     * Sets camp end time.
     *
     * @param campEndTime the camp end time
     */
    public void setCampEndTime(String campEndTime) {
		this.campEndTime = campEndTime;
	}

    /**
     * Gets camp end time.
     *
     * @return the camp end time
     */
    public String getCampEndTime( ) {
		return this.campEndTime;
	}

    /**
     * Sets camp id.
     *
     * @param campId the camp id
     */
    public void setCampId(String campId) {
		this.campId = campId;
	}

    /**
     * Gets camp id.
     *
     * @return the camp id
     */
    public String getCampId( ) {
		return this.campId;
	}

    /**
     * Sets camp name.
     *
     * @param campName the camp name
     */
    public void setCampName(String campName) {
		this.campName = campName;
	}

    /**
     * Gets camp name.
     *
     * @return the camp name
     */
    public String getCampName( ) {
		return this.campName;
	}

    /**
     * Sets camp start time.
     *
     * @param campStartTime the camp start time
     */
    public void setCampStartTime(String campStartTime) {
		this.campStartTime = campStartTime;
	}

    /**
     * Gets camp start time.
     *
     * @return the camp start time
     */
    public String getCampStartTime( ) {
		return this.campStartTime;
	}

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
     * Sets cert rule id.
     *
     * @param certRuleId the cert rule id
     */
    public void setCertRuleId(String certRuleId) {
		this.certRuleId = certRuleId;
	}

    /**
     * Gets cert rule id.
     *
     * @return the cert rule id
     */
    public String getCertRuleId( ) {
		return this.certRuleId;
	}

    /**
     * Sets certification count.
     *
     * @param certificationCount the certification count
     */
    public void setCertificationCount(String certificationCount) {
		this.certificationCount = certificationCount;
	}

    /**
     * Gets certification count.
     *
     * @return the certification count
     */
    public String getCertificationCount( ) {
		return this.certificationCount;
	}

    /**
     * Sets creator.
     *
     * @param creator the creator
     */
    public void setCreator(String creator) {
		this.creator = creator;
	}

    /**
     * Gets creator.
     *
     * @return the creator
     */
    public String getCreator( ) {
		return this.creator;
	}

    /**
     * Sets crowd rule id.
     *
     * @param crowdRuleId the crowd rule id
     */
    public void setCrowdRuleId(String crowdRuleId) {
		this.crowdRuleId = crowdRuleId;
	}

    /**
     * Gets crowd rule id.
     *
     * @return the crowd rule id
     */
    public String getCrowdRuleId( ) {
		return this.crowdRuleId;
	}

    /**
     * Sets mobile count.
     *
     * @param mobileCount the mobile count
     */
    public void setMobileCount(String mobileCount) {
		this.mobileCount = mobileCount;
	}

    /**
     * Gets mobile count.
     *
     * @return the mobile count
     */
    public String getMobileCount( ) {
		return this.mobileCount;
	}

    /**
     * Sets prize list.
     *
     * @param prizeList the prize list
     */
    public void setPrizeList(List<MpPrizeInfoModel> prizeList) {
		this.prizeList = prizeList;
	}

    /**
     * Gets prize list.
     *
     * @return the prize list
     */
    public List<MpPrizeInfoModel> getPrizeList( ) {
		return this.prizeList;
	}

    /**
     * Sets promo rule id.
     *
     * @param promoRuleId the promo rule id
     */
    public void setPromoRuleId(String promoRuleId) {
		this.promoRuleId = promoRuleId;
	}

    /**
     * Gets promo rule id.
     *
     * @return the promo rule id
     */
    public String getPromoRuleId( ) {
		return this.promoRuleId;
	}

    /**
     * Sets trigger type.
     *
     * @param triggerType the trigger type
     */
    public void setTriggerType(String triggerType) {
		this.triggerType = triggerType;
	}

    /**
     * Gets trigger type.
     *
     * @return the trigger type
     */
    public String getTriggerType( ) {
		return this.triggerType;
	}

    /**
     * Sets trigger user rule id.
     *
     * @param triggerUserRuleId the trigger user rule id
     */
    public void setTriggerUserRuleId(String triggerUserRuleId) {
		this.triggerUserRuleId = triggerUserRuleId;
	}

    /**
     * Gets trigger user rule id.
     *
     * @return the trigger user rule id
     */
    public String getTriggerUserRuleId( ) {
		return this.triggerUserRuleId;
	}

    /**
     * Sets user rule id.
     *
     * @param userRuleId the user rule id
     */
    public void setUserRuleId(String userRuleId) {
		this.userRuleId = userRuleId;
	}

    /**
     * Gets user rule id.
     *
     * @return the user rule id
     */
    public String getUserRuleId( ) {
		return this.userRuleId;
	}

}
