package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 开放活动接口奖品
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class OpenPromoPrize extends AlipayObject {

	private static final long serialVersionUID = 7177891864673796846L;

	/**
	 * 消费门槛设置，单位元
	 */
	@ApiField("prize_base_rule_amount")
	private String prizeBaseRuleAmount;

	/**
	 * 商户增加的自定义菜单内容，包括菜单名称，详情页标题。JSON串形式上传
	 */
	@ApiListField("prize_custom_menu")
	@ApiField("prize_custom_menu")
	private List<PrizeCustomMenu> prizeCustomMenu;

	/**
	 * 奖品详情说明，默认和活动详情相同
	 */
	@ApiField("prize_desc")
	private String prizeDesc;

	/**
	 * ISV提供素材中心的图片ID
	 */
	@ApiField("prize_detail_img")
	private String prizeDetailImg;

	/**
	 * 周期性使用时段规则
	 */
	@ApiListField("prize_dimension_time")
	@ApiField("open_promo_prize_dimension")
	private List<OpenPromoPrizeDimension> prizeDimensionTime;

	/**
	 * 券指定可用有效结束日期，和相对可用时间互斥
	 */
	@ApiField("prize_end_time")
	private String prizeEndTime;

	/**
	 * ISV提供素材中心的图片ID，建议尺寸120*120，默认为空
	 */
	@ApiField("prize_logo")
	private String prizeLogo;

	/**
	 * 奖品名称，默认和活动名称相同
	 */
	@ApiField("prize_name")
	private String prizeName;

	/**
	 * 券相可用对时间，和指定可用时间互斥。
	 */
	@ApiField("prize_relative_time")
	private OpenPromoPrizeRelativeTime prizeRelativeTime;

	/**
	 * 券指定可用开始时间，和相对可用时间互斥
	 */
	@ApiField("prize_start_time")
	private String prizeStartTime;

	/**
	 * 券副标题
	 */
	@ApiField("prize_subtitle")
	private String prizeSubtitle;

	/**
	 * 店铺数据，支持多条
	 */
	@ApiListField("prize_suitable_shops")
	@ApiField("string")
	private List<String> prizeSuitableShops;

	/**
	 * 券模板有效结束日期，默认和活动结束时间相同
	 */
	@ApiField("prize_template_end_time")
	private String prizeTemplateEndTime;

	/**
	 * 券模板有效起始日期，默认和活动开始时间相同
	 */
	@ApiField("prize_template_start_time")
	private String prizeTemplateStartTime;

	/**
	 * 商家自定义使用须知内容，按条传入。JSON串形式上传，最多6条，每条最多100字
	 */
	@ApiListField("prize_terms")
	@ApiField("string")
	private List<String> prizeTerms;

	/**
	 * 奖品类型，现在支持VOUCHER_TICKET：表示代金券
	 */
	@ApiField("prize_type")
	private String prizeType;

	/**
	 * 抵扣金额，单位元。
	 */
	@ApiField("prize_worth_amount")
	private String prizeWorthAmount;

    /**
     * Gets prize base rule amount.
     *
     * @return the prize base rule amount
     */
    public String getPrizeBaseRuleAmount() {
		return this.prizeBaseRuleAmount;
	}

    /**
     * Sets prize base rule amount.
     *
     * @param prizeBaseRuleAmount the prize base rule amount
     */
    public void setPrizeBaseRuleAmount(String prizeBaseRuleAmount) {
		this.prizeBaseRuleAmount = prizeBaseRuleAmount;
	}

    /**
     * Gets prize custom menu.
     *
     * @return the prize custom menu
     */
    public List<PrizeCustomMenu> getPrizeCustomMenu() {
		return this.prizeCustomMenu;
	}

    /**
     * Sets prize custom menu.
     *
     * @param prizeCustomMenu the prize custom menu
     */
    public void setPrizeCustomMenu(List<PrizeCustomMenu> prizeCustomMenu) {
		this.prizeCustomMenu = prizeCustomMenu;
	}

    /**
     * Gets prize desc.
     *
     * @return the prize desc
     */
    public String getPrizeDesc() {
		return this.prizeDesc;
	}

    /**
     * Sets prize desc.
     *
     * @param prizeDesc the prize desc
     */
    public void setPrizeDesc(String prizeDesc) {
		this.prizeDesc = prizeDesc;
	}

    /**
     * Gets prize detail img.
     *
     * @return the prize detail img
     */
    public String getPrizeDetailImg() {
		return this.prizeDetailImg;
	}

    /**
     * Sets prize detail img.
     *
     * @param prizeDetailImg the prize detail img
     */
    public void setPrizeDetailImg(String prizeDetailImg) {
		this.prizeDetailImg = prizeDetailImg;
	}

    /**
     * Gets prize dimension time.
     *
     * @return the prize dimension time
     */
    public List<OpenPromoPrizeDimension> getPrizeDimensionTime() {
		return this.prizeDimensionTime;
	}

    /**
     * Sets prize dimension time.
     *
     * @param prizeDimensionTime the prize dimension time
     */
    public void setPrizeDimensionTime(List<OpenPromoPrizeDimension> prizeDimensionTime) {
		this.prizeDimensionTime = prizeDimensionTime;
	}

    /**
     * Gets prize end time.
     *
     * @return the prize end time
     */
    public String getPrizeEndTime() {
		return this.prizeEndTime;
	}

    /**
     * Sets prize end time.
     *
     * @param prizeEndTime the prize end time
     */
    public void setPrizeEndTime(String prizeEndTime) {
		this.prizeEndTime = prizeEndTime;
	}

    /**
     * Gets prize logo.
     *
     * @return the prize logo
     */
    public String getPrizeLogo() {
		return this.prizeLogo;
	}

    /**
     * Sets prize logo.
     *
     * @param prizeLogo the prize logo
     */
    public void setPrizeLogo(String prizeLogo) {
		this.prizeLogo = prizeLogo;
	}

    /**
     * Gets prize name.
     *
     * @return the prize name
     */
    public String getPrizeName() {
		return this.prizeName;
	}

    /**
     * Sets prize name.
     *
     * @param prizeName the prize name
     */
    public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

    /**
     * Gets prize relative time.
     *
     * @return the prize relative time
     */
    public OpenPromoPrizeRelativeTime getPrizeRelativeTime() {
		return this.prizeRelativeTime;
	}

    /**
     * Sets prize relative time.
     *
     * @param prizeRelativeTime the prize relative time
     */
    public void setPrizeRelativeTime(OpenPromoPrizeRelativeTime prizeRelativeTime) {
		this.prizeRelativeTime = prizeRelativeTime;
	}

    /**
     * Gets prize start time.
     *
     * @return the prize start time
     */
    public String getPrizeStartTime() {
		return this.prizeStartTime;
	}

    /**
     * Sets prize start time.
     *
     * @param prizeStartTime the prize start time
     */
    public void setPrizeStartTime(String prizeStartTime) {
		this.prizeStartTime = prizeStartTime;
	}

    /**
     * Gets prize subtitle.
     *
     * @return the prize subtitle
     */
    public String getPrizeSubtitle() {
		return this.prizeSubtitle;
	}

    /**
     * Sets prize subtitle.
     *
     * @param prizeSubtitle the prize subtitle
     */
    public void setPrizeSubtitle(String prizeSubtitle) {
		this.prizeSubtitle = prizeSubtitle;
	}

    /**
     * Gets prize suitable shops.
     *
     * @return the prize suitable shops
     */
    public List<String> getPrizeSuitableShops() {
		return this.prizeSuitableShops;
	}

    /**
     * Sets prize suitable shops.
     *
     * @param prizeSuitableShops the prize suitable shops
     */
    public void setPrizeSuitableShops(List<String> prizeSuitableShops) {
		this.prizeSuitableShops = prizeSuitableShops;
	}

    /**
     * Gets prize template end time.
     *
     * @return the prize template end time
     */
    public String getPrizeTemplateEndTime() {
		return this.prizeTemplateEndTime;
	}

    /**
     * Sets prize template end time.
     *
     * @param prizeTemplateEndTime the prize template end time
     */
    public void setPrizeTemplateEndTime(String prizeTemplateEndTime) {
		this.prizeTemplateEndTime = prizeTemplateEndTime;
	}

    /**
     * Gets prize template start time.
     *
     * @return the prize template start time
     */
    public String getPrizeTemplateStartTime() {
		return this.prizeTemplateStartTime;
	}

    /**
     * Sets prize template start time.
     *
     * @param prizeTemplateStartTime the prize template start time
     */
    public void setPrizeTemplateStartTime(String prizeTemplateStartTime) {
		this.prizeTemplateStartTime = prizeTemplateStartTime;
	}

    /**
     * Gets prize terms.
     *
     * @return the prize terms
     */
    public List<String> getPrizeTerms() {
		return this.prizeTerms;
	}

    /**
     * Sets prize terms.
     *
     * @param prizeTerms the prize terms
     */
    public void setPrizeTerms(List<String> prizeTerms) {
		this.prizeTerms = prizeTerms;
	}

    /**
     * Gets prize type.
     *
     * @return the prize type
     */
    public String getPrizeType() {
		return this.prizeType;
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
     * Gets prize worth amount.
     *
     * @return the prize worth amount
     */
    public String getPrizeWorthAmount() {
		return this.prizeWorthAmount;
	}

    /**
     * Sets prize worth amount.
     *
     * @param prizeWorthAmount the prize worth amount
     */
    public void setPrizeWorthAmount(String prizeWorthAmount) {
		this.prizeWorthAmount = prizeWorthAmount;
	}

}
