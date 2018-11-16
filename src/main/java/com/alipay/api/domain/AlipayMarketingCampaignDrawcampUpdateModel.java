package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 营销抽奖活动修改
 *
 * @author auto create
 * @since 1.0, 2017-03-23 14:22:20
 */
public class AlipayMarketingCampaignDrawcampUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 7463873247825947194L;

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
	 * 活动奖品总中奖几率，开发者需传入整数值，如：传入99支付宝默认为99%
	 */
	@ApiField("award_rate")
	private String awardRate;

	/**
	 * 活动结束时间，yyyy-MM-dd HH:00:00格式(到小时)，需要大于活动开始时间
	 */
	@ApiField("camp_end_time")
	private String campEndTime;

	/**
	 * 抽奖活动id，通过alipay.marketing.campaign.drawcamp.create接口返回
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
	 * 开发者用于区分商户的唯一标识，由开发者自定义，用于区分是开发者名下哪一个商户的请求，为空则为默认标识
	 */
	@ApiField("mpid")
	private String mpid;

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
	 * 人群验证规则id，由支付宝配置
	 */
	@ApiField("user_rule_id")
	private String userRuleId;

    /**
     * Gets account count.
     *
     * @return the account count
     */
    public String getAccountCount() {
		return this.accountCount;
	}

    /**
     * Sets account count.
     *
     * @param accountCount the account count
     */
    public void setAccountCount(String accountCount) {
		this.accountCount = accountCount;
	}

    /**
     * Gets appid count.
     *
     * @return the appid count
     */
    public String getAppidCount() {
		return this.appidCount;
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
     * Gets award rate.
     *
     * @return the award rate
     */
    public String getAwardRate() {
		return this.awardRate;
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
     * Gets camp end time.
     *
     * @return the camp end time
     */
    public String getCampEndTime() {
		return this.campEndTime;
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
     * Gets camp id.
     *
     * @return the camp id
     */
    public String getCampId() {
		return this.campId;
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
     * Gets camp name.
     *
     * @return the camp name
     */
    public String getCampName() {
		return this.campName;
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
     * Gets camp start time.
     *
     * @return the camp start time
     */
    public String getCampStartTime() {
		return this.campStartTime;
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
     * Gets cert rule id.
     *
     * @return the cert rule id
     */
    public String getCertRuleId() {
		return this.certRuleId;
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
     * Gets certification count.
     *
     * @return the certification count
     */
    public String getCertificationCount() {
		return this.certificationCount;
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
     * Gets crowd rule id.
     *
     * @return the crowd rule id
     */
    public String getCrowdRuleId() {
		return this.crowdRuleId;
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
     * Gets mobile count.
     *
     * @return the mobile count
     */
    public String getMobileCount() {
		return this.mobileCount;
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
     * Gets mpid.
     *
     * @return the mpid
     */
    public String getMpid() {
		return this.mpid;
	}

    /**
     * Sets mpid.
     *
     * @param mpid the mpid
     */
    public void setMpid(String mpid) {
		this.mpid = mpid;
	}

    /**
     * Gets prize list.
     *
     * @return the prize list
     */
    public List<MpPrizeInfoModel> getPrizeList() {
		return this.prizeList;
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
     * Gets promo rule id.
     *
     * @return the promo rule id
     */
    public String getPromoRuleId() {
		return this.promoRuleId;
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
     * Gets user rule id.
     *
     * @return the user rule id
     */
    public String getUserRuleId() {
		return this.userRuleId;
	}

    /**
     * Sets user rule id.
     *
     * @param userRuleId the user rule id
     */
    public void setUserRuleId(String userRuleId) {
		this.userRuleId = userRuleId;
	}

}
