package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁会员合作权益编辑接口
 *
 * @author auto create
 * @since 1.0, 2018-03-07 11:31:10
 */
public class AlipayUserBenefitEditModel extends AlipayObject {

	private static final long serialVersionUID = 8885483187527792484L;

	/**
	 * 权益专区码，在创建权益前应该先向蚂蚁会员平台申请一个合适的专区码。 专区必须存在。
	 */
	@ApiField("benefit_area_code")
	private String benefitAreaCode;

	/**
	 * 权益图标地址
	 */
	@ApiField("benefit_icon_url")
	private String benefitIconUrl;

	/**
	 * 权益的ID
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 权益的名称
	 */
	@ApiField("benefit_name")
	private String benefitName;

	/**
	 * 是否将权益的名称用作专区的副标题, 若为true,则会使用该权益的名称自动覆盖所属专区的副标题(暂未实现)
	 */
	@ApiField("benefit_name_as_area_subtitle")
	private String benefitNameAsAreaSubtitle;

	/**
	 * 权益详情页面地址
	 */
	@ApiField("benefit_page_url")
	private String benefitPageUrl;

	/**
	 * 权益兑换消耗的积分数(修改时必填，防止默认不传的时候被修改成0)
	 */
	@ApiField("benefit_point")
	private Long benefitPoint;

	/**
	 * 权益使用场景索引ID，接入时需要咨询@田豫如何取值
	 */
	@ApiField("benefit_rec_biz_id")
	private String benefitRecBizId;

	/**
	 * 支付宝商家券 ALIPAY_MERCHANT_COUPON
口碑商家券 KOUBEI_MERCHANT_COUPON
花呗分期免息券 HUABEI_FENQI_FREE_INTEREST_COUP
淘系通用券 TAOBAO_COMMON_COUPON
淘系商家券 TAOBAO_MERCHANT_COUPON
国际线上商家券 INTER_ONLINE_MERCHANT_COUPON
国际线下商家券 INTER_OFFLINE_MERCHANT_COUPON
通用商户权益 COMMON_MERCHANT_GOODS
其它 OTHERS, 接入是需要咨询@田豫如何选值
	 */
	@ApiField("benefit_rec_type")
	private String benefitRecType;

	/**
	 * 权益的副标题，用于补充描述权益
	 */
	@ApiField("benefit_subtitle")
	private String benefitSubtitle;

	/**
	 * 支付宝的营销活动id，若不走支付宝活动，则不需要填
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * primary,golden,platinum,diamond分别对应大众、黄金、铂金、钻石会员等级。eligible_grade属性用于限制能够兑换当前权益的用户等级，用户必须不低于配置的等级才能进行兑换。如果没有等级要求，则不要填写该字段。
	 */
	@ApiField("eligible_grade")
	private String eligibleGrade;

	/**
	 * 权益展示结束时间，填如自January 1, 1970, 00:00:00 GMT到目标时间的毫秒数，参考(new Date()).getTime()
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 兑换规则以及不满足该规则后给用户的提示文案，规则id和文案用:分隔；可配置多个，多个之间用,分隔。(分隔符皆是英文半角字符)规则id联系蚂蚁会员pd或运营提供
	 */
	@ApiField("exchange_rule_ids")
	private String exchangeRuleIds;

	/**
	 * 该权益对应每个等级会员的兑换折扣。等级和折扣用:分隔，多组折扣规则用:分隔。折扣0~1。分隔符皆为英文半角字符
	 */
	@ApiField("grade_discount")
	private String gradeDiscount;

	/**
	 * 权益展示起始时间，填如自January 1, 1970, 00:00:00 GMT到目标时间的毫秒数，参考(new Date()).getTime()
	 */
	@ApiField("start_time")
	private String startTime;

    /**
     * Gets benefit area code.
     *
     * @return the benefit area code
     */
    public String getBenefitAreaCode() {
		return this.benefitAreaCode;
	}

    /**
     * Sets benefit area code.
     *
     * @param benefitAreaCode the benefit area code
     */
    public void setBenefitAreaCode(String benefitAreaCode) {
		this.benefitAreaCode = benefitAreaCode;
	}

    /**
     * Gets benefit icon url.
     *
     * @return the benefit icon url
     */
    public String getBenefitIconUrl() {
		return this.benefitIconUrl;
	}

    /**
     * Sets benefit icon url.
     *
     * @param benefitIconUrl the benefit icon url
     */
    public void setBenefitIconUrl(String benefitIconUrl) {
		this.benefitIconUrl = benefitIconUrl;
	}

    /**
     * Gets benefit id.
     *
     * @return the benefit id
     */
    public String getBenefitId() {
		return this.benefitId;
	}

    /**
     * Sets benefit id.
     *
     * @param benefitId the benefit id
     */
    public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

    /**
     * Gets benefit name.
     *
     * @return the benefit name
     */
    public String getBenefitName() {
		return this.benefitName;
	}

    /**
     * Sets benefit name.
     *
     * @param benefitName the benefit name
     */
    public void setBenefitName(String benefitName) {
		this.benefitName = benefitName;
	}

    /**
     * Gets benefit name as area subtitle.
     *
     * @return the benefit name as area subtitle
     */
    public String getBenefitNameAsAreaSubtitle() {
		return this.benefitNameAsAreaSubtitle;
	}

    /**
     * Sets benefit name as area subtitle.
     *
     * @param benefitNameAsAreaSubtitle the benefit name as area subtitle
     */
    public void setBenefitNameAsAreaSubtitle(String benefitNameAsAreaSubtitle) {
		this.benefitNameAsAreaSubtitle = benefitNameAsAreaSubtitle;
	}

    /**
     * Gets benefit page url.
     *
     * @return the benefit page url
     */
    public String getBenefitPageUrl() {
		return this.benefitPageUrl;
	}

    /**
     * Sets benefit page url.
     *
     * @param benefitPageUrl the benefit page url
     */
    public void setBenefitPageUrl(String benefitPageUrl) {
		this.benefitPageUrl = benefitPageUrl;
	}

    /**
     * Gets benefit point.
     *
     * @return the benefit point
     */
    public Long getBenefitPoint() {
		return this.benefitPoint;
	}

    /**
     * Sets benefit point.
     *
     * @param benefitPoint the benefit point
     */
    public void setBenefitPoint(Long benefitPoint) {
		this.benefitPoint = benefitPoint;
	}

    /**
     * Gets benefit rec biz id.
     *
     * @return the benefit rec biz id
     */
    public String getBenefitRecBizId() {
		return this.benefitRecBizId;
	}

    /**
     * Sets benefit rec biz id.
     *
     * @param benefitRecBizId the benefit rec biz id
     */
    public void setBenefitRecBizId(String benefitRecBizId) {
		this.benefitRecBizId = benefitRecBizId;
	}

    /**
     * Gets benefit rec type.
     *
     * @return the benefit rec type
     */
    public String getBenefitRecType() {
		return this.benefitRecType;
	}

    /**
     * Sets benefit rec type.
     *
     * @param benefitRecType the benefit rec type
     */
    public void setBenefitRecType(String benefitRecType) {
		this.benefitRecType = benefitRecType;
	}

    /**
     * Gets benefit subtitle.
     *
     * @return the benefit subtitle
     */
    public String getBenefitSubtitle() {
		return this.benefitSubtitle;
	}

    /**
     * Sets benefit subtitle.
     *
     * @param benefitSubtitle the benefit subtitle
     */
    public void setBenefitSubtitle(String benefitSubtitle) {
		this.benefitSubtitle = benefitSubtitle;
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
     * Gets eligible grade.
     *
     * @return the eligible grade
     */
    public String getEligibleGrade() {
		return this.eligibleGrade;
	}

    /**
     * Sets eligible grade.
     *
     * @param eligibleGrade the eligible grade
     */
    public void setEligibleGrade(String eligibleGrade) {
		this.eligibleGrade = eligibleGrade;
	}

    /**
     * Gets end time.
     *
     * @return the end time
     */
    public String getEndTime() {
		return this.endTime;
	}

    /**
     * Sets end time.
     *
     * @param endTime the end time
     */
    public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

    /**
     * Gets exchange rule ids.
     *
     * @return the exchange rule ids
     */
    public String getExchangeRuleIds() {
		return this.exchangeRuleIds;
	}

    /**
     * Sets exchange rule ids.
     *
     * @param exchangeRuleIds the exchange rule ids
     */
    public void setExchangeRuleIds(String exchangeRuleIds) {
		this.exchangeRuleIds = exchangeRuleIds;
	}

    /**
     * Gets grade discount.
     *
     * @return the grade discount
     */
    public String getGradeDiscount() {
		return this.gradeDiscount;
	}

    /**
     * Sets grade discount.
     *
     * @param gradeDiscount the grade discount
     */
    public void setGradeDiscount(String gradeDiscount) {
		this.gradeDiscount = gradeDiscount;
	}

    /**
     * Gets start time.
     *
     * @return the start time
     */
    public String getStartTime() {
		return this.startTime;
	}

    /**
     * Sets start time.
     *
     * @param startTime the start time
     */
    public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
