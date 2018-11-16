package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 智能营销活动下属子活动
 *
 * @author auto create
 * @since 1.0, 2018-01-22 16:17:56
 */
public class IntelligentPromoDetail extends AlipayObject {

	private static final long serialVersionUID = 5269439484753292341L;

	/**
	 * 活动预算
	 */
	@ApiField("budget")
	private BudgetInfo budget;

	/**
	 * 营销活动的id，也就是消费送的活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 活动限制信息
	 */
	@ApiField("constraint")
	private ConstraintInfo constraint;

	/**
	 * 圈人限制条件
	 */
	@ApiField("crowd_constraint")
	private CrowdConstraintInfo crowdConstraint;

	/**
	 * 智能营销活动的子活动
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 活动扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 营销活动预测效果
	 */
	@ApiField("forecast_effect")
	private IntelligentPromoEffect forecastEffect;

	/**
	 * 自运营活动类型。DIRECT_SEND：直发奖；CONSUME_SEND：消费送
	 */
	@ApiField("merchant_promo_type")
	private String merchantPromoType;

	/**
	 * 子营销活动名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 营销工具集合。主要是活动涉及到的奖品信息
	 */
	@ApiListField("promo_tools")
	@ApiField("promo_tool")
	private List<PromoTool> promoTools;

	/**
	 * 投放渠道信息
	 */
	@ApiListField("publish_channels")
	@ApiField("publish_channel")
	private List<PublishChannel> publishChannels;

	/**
	 * 子营销活动对应的模板id
	 */
	@ApiField("template_id")
	private String templateId;

    /**
     * Gets budget.
     *
     * @return the budget
     */
    public BudgetInfo getBudget() {
		return this.budget;
	}

    /**
     * Sets budget.
     *
     * @param budget the budget
     */
    public void setBudget(BudgetInfo budget) {
		this.budget = budget;
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
     * Gets constraint.
     *
     * @return the constraint
     */
    public ConstraintInfo getConstraint() {
		return this.constraint;
	}

    /**
     * Sets constraint.
     *
     * @param constraint the constraint
     */
    public void setConstraint(ConstraintInfo constraint) {
		this.constraint = constraint;
	}

    /**
     * Gets crowd constraint.
     *
     * @return the crowd constraint
     */
    public CrowdConstraintInfo getCrowdConstraint() {
		return this.crowdConstraint;
	}

    /**
     * Sets crowd constraint.
     *
     * @param crowdConstraint the crowd constraint
     */
    public void setCrowdConstraint(CrowdConstraintInfo crowdConstraint) {
		this.crowdConstraint = crowdConstraint;
	}

    /**
     * Gets desc.
     *
     * @return the desc
     */
    public String getDesc() {
		return this.desc;
	}

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String desc) {
		this.desc = desc;
	}

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets forecast effect.
     *
     * @return the forecast effect
     */
    public IntelligentPromoEffect getForecastEffect() {
		return this.forecastEffect;
	}

    /**
     * Sets forecast effect.
     *
     * @param forecastEffect the forecast effect
     */
    public void setForecastEffect(IntelligentPromoEffect forecastEffect) {
		this.forecastEffect = forecastEffect;
	}

    /**
     * Gets merchant promo type.
     *
     * @return the merchant promo type
     */
    public String getMerchantPromoType() {
		return this.merchantPromoType;
	}

    /**
     * Sets merchant promo type.
     *
     * @param merchantPromoType the merchant promo type
     */
    public void setMerchantPromoType(String merchantPromoType) {
		this.merchantPromoType = merchantPromoType;
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
     * Gets promo tools.
     *
     * @return the promo tools
     */
    public List<PromoTool> getPromoTools() {
		return this.promoTools;
	}

    /**
     * Sets promo tools.
     *
     * @param promoTools the promo tools
     */
    public void setPromoTools(List<PromoTool> promoTools) {
		this.promoTools = promoTools;
	}

    /**
     * Gets publish channels.
     *
     * @return the publish channels
     */
    public List<PublishChannel> getPublishChannels() {
		return this.publishChannels;
	}

    /**
     * Sets publish channels.
     *
     * @param publishChannels the publish channels
     */
    public void setPublishChannels(List<PublishChannel> publishChannels) {
		this.publishChannels = publishChannels;
	}

    /**
     * Gets template id.
     *
     * @return the template id
     */
    public String getTemplateId() {
		return this.templateId;
	}

    /**
     * Sets template id.
     *
     * @param templateId the template id
     */
    public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
