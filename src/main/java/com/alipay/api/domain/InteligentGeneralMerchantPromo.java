package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户自运营活动模型
 *
 * @author auto create
 * @since 1.0, 2018-01-22 17:39:15
 */
public class InteligentGeneralMerchantPromo extends AlipayObject {

	private static final long serialVersionUID = 7423531744898311592L;

	/**
	 * 营销活动的id，如merchant_promo_type：CONSUME_SEND即消费送的活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 圈人限制条件
	 */
	@ApiField("crowd_constraint")
	private CrowdConstraintInfo crowdConstraint;

	/**
	 * 活动描述信息，该信息有可能会在店铺详情页漏出，请自己填写
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
	 * 活动预算
	 */
	@ApiField("inteligent_budget")
	private InteligentBudgetInfo inteligentBudget;

	/**
	 * 活动限制信息
	 */
	@ApiField("inteligent_constraint")
	private InteligentConstraintInfo inteligentConstraint;

	/**
	 * 营销工具集合。主要是活动涉及到的奖品信息
	 */
	@ApiListField("inteligent_promo_tools")
	@ApiField("inteligent_promo_tool")
	private List<InteligentPromoTool> inteligentPromoTools;

	/**
	 * 投放渠道信息
	 */
	@ApiListField("inteligent_publish_channels")
	@ApiField("inteligent_publish_channel")
	private List<InteligentPublishChannel> inteligentPublishChannels;

	/**
	 * 营销活动类型；枚举（DIRECT_SEND：直发奖；CONSUME_SEND：消费送）
	 */
	@ApiField("merchant_promo_type")
	private String merchantPromoType;

	/**
	 * 营销活动名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 子营销活动对应的模板id
	 */
	@ApiField("template_id")
	private String templateId;

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
     * Gets inteligent budget.
     *
     * @return the inteligent budget
     */
    public InteligentBudgetInfo getInteligentBudget() {
		return this.inteligentBudget;
	}

    /**
     * Sets inteligent budget.
     *
     * @param inteligentBudget the inteligent budget
     */
    public void setInteligentBudget(InteligentBudgetInfo inteligentBudget) {
		this.inteligentBudget = inteligentBudget;
	}

    /**
     * Gets inteligent constraint.
     *
     * @return the inteligent constraint
     */
    public InteligentConstraintInfo getInteligentConstraint() {
		return this.inteligentConstraint;
	}

    /**
     * Sets inteligent constraint.
     *
     * @param inteligentConstraint the inteligent constraint
     */
    public void setInteligentConstraint(InteligentConstraintInfo inteligentConstraint) {
		this.inteligentConstraint = inteligentConstraint;
	}

    /**
     * Gets inteligent promo tools.
     *
     * @return the inteligent promo tools
     */
    public List<InteligentPromoTool> getInteligentPromoTools() {
		return this.inteligentPromoTools;
	}

    /**
     * Sets inteligent promo tools.
     *
     * @param inteligentPromoTools the inteligent promo tools
     */
    public void setInteligentPromoTools(List<InteligentPromoTool> inteligentPromoTools) {
		this.inteligentPromoTools = inteligentPromoTools;
	}

    /**
     * Gets inteligent publish channels.
     *
     * @return the inteligent publish channels
     */
    public List<InteligentPublishChannel> getInteligentPublishChannels() {
		return this.inteligentPublishChannels;
	}

    /**
     * Sets inteligent publish channels.
     *
     * @param inteligentPublishChannels the inteligent publish channels
     */
    public void setInteligentPublishChannels(List<InteligentPublishChannel> inteligentPublishChannels) {
		this.inteligentPublishChannels = inteligentPublishChannels;
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
