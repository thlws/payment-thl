package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TemplateActionInfoDTO;
import com.alipay.api.domain.TemplateCardLevelConfDTO;
import com.alipay.api.domain.TemplateColumnInfoDTO;
import com.alipay.api.domain.TemplateFieldRuleDTO;
import com.alipay.api.domain.TemplateMdcodeNotifyConfDTO;
import com.alipay.api.domain.TemplateOpenCardConfDTO;
import com.alipay.api.domain.PubChannelDTO;
import com.alipay.api.domain.TemplateBenefitInfoDTO;
import com.alipay.api.domain.TemplateStyleInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.template.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayMarketingCardTemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4652486749948447392L;

	/** 
	 * 业务卡号前缀，由商户指定
支付宝业务卡号生成规则：biz_no_prefix(商户指定)卡号前缀 + biz_no_suffix(实时生成）卡号后缀
	 */
	@ApiField("biz_no_prefix")
	private String bizNoPrefix;

	/** 
	 * 业务卡号后缀的长度
支付宝业务卡号生成规则：biz_no_prefix(商户指定)卡号前缀 + biz_no_suffix(实时生成）卡号后缀
	 */
	@ApiField("biz_no_suffix_len")
	private String bizNoSuffixLen;

	/** 
	 * 卡行动点配置；
行动点，即用户可点击跳转的区块，类似按钮控件的交互；
单张卡最多4个行动点。
	 */
	@ApiListField("card_action_list")
	@ApiField("template_action_info_d_t_o")
	private List<TemplateActionInfoDTO> cardActionList;

	/** 
	 * 卡等级配置
	 */
	@ApiListField("card_level_confs")
	@ApiField("template_card_level_conf_d_t_o")
	private List<TemplateCardLevelConfDTO> cardLevelConfs;

	/** 
	 * 卡特定标签，只供特定业务使用，通常接入无需关注
	 */
	@ApiField("card_spec_tag")
	private String cardSpecTag;

	/** 
	 * 会员卡类型：
OUT_MEMBER_CARD：外部权益卡
	 */
	@ApiField("card_type")
	private String cardType;

	/** 
	 * 栏位信息（卡包详情页面展现的栏位）
	 */
	@ApiListField("column_info_list")
	@ApiField("template_column_info_d_t_o")
	private List<TemplateColumnInfoDTO> columnInfoList;

	/** 
	 * 字段规则列表，会员卡开卡过程中，会员卡信息的生成规则，
例如：卡有效期为开卡后两年内有效，则设置为：DATE_IN_FUTURE
	 */
	@ApiListField("field_rule_list")
	@ApiField("template_field_rule_d_t_o")
	private List<TemplateFieldRuleDTO> fieldRuleList;

	/** 
	 * 商户动态码通知参数配置：
当write_off_type指定为商户动态码mdbarcode或mdqrcode时不为空；
在此字段配置用户打开会员卡时支付宝通知商户生成动态码（发码）的通知参数，如接收通知地址等。
	 */
	@ApiField("mdcode_notify_conf")
	private TemplateMdcodeNotifyConfDTO mdcodeNotifyConf;

	/** 
	 * 会员卡用户领卡配置，在门店等渠道露出领卡入口时，需要部署的商户领卡H5页面地址
	 */
	@ApiField("open_card_conf")
	private TemplateOpenCardConfDTO openCardConf;

	/** 
	 * 卡模板投放渠道
	 */
	@ApiListField("pub_channels")
	@ApiField("pub_channel_d_t_o")
	private List<PubChannelDTO> pubChannels;

	/** 
	 * 服务标签列表
	 */
	@ApiListField("service_label_list")
	@ApiField("string")
	private List<String> serviceLabelList;

	/** 
	 * 门店ids
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	/** 
	 * 权益信息，
1、在卡包的卡详情页面会自动添加权益栏位，展现会员卡特权，
2、如果添加门店渠道，则可在门店页展现会员卡的权益
	 */
	@ApiListField("template_benefit_info")
	@ApiField("template_benefit_info_d_t_o")
	private List<TemplateBenefitInfoDTO> templateBenefitInfo;

	/** 
	 * 模板样式信息(钱包展现效果)
	 */
	@ApiField("template_style_info")
	private TemplateStyleInfoDTO templateStyleInfo;

    /**
     * Sets biz no prefix.
     *
     * @param bizNoPrefix the biz no prefix
     */
    public void setBizNoPrefix(String bizNoPrefix) {
		this.bizNoPrefix = bizNoPrefix;
	}

    /**
     * Gets biz no prefix.
     *
     * @return the biz no prefix
     */
    public String getBizNoPrefix( ) {
		return this.bizNoPrefix;
	}

    /**
     * Sets biz no suffix len.
     *
     * @param bizNoSuffixLen the biz no suffix len
     */
    public void setBizNoSuffixLen(String bizNoSuffixLen) {
		this.bizNoSuffixLen = bizNoSuffixLen;
	}

    /**
     * Gets biz no suffix len.
     *
     * @return the biz no suffix len
     */
    public String getBizNoSuffixLen( ) {
		return this.bizNoSuffixLen;
	}

    /**
     * Sets card action list.
     *
     * @param cardActionList the card action list
     */
    public void setCardActionList(List<TemplateActionInfoDTO> cardActionList) {
		this.cardActionList = cardActionList;
	}

    /**
     * Gets card action list.
     *
     * @return the card action list
     */
    public List<TemplateActionInfoDTO> getCardActionList( ) {
		return this.cardActionList;
	}

    /**
     * Sets card level confs.
     *
     * @param cardLevelConfs the card level confs
     */
    public void setCardLevelConfs(List<TemplateCardLevelConfDTO> cardLevelConfs) {
		this.cardLevelConfs = cardLevelConfs;
	}

    /**
     * Gets card level confs.
     *
     * @return the card level confs
     */
    public List<TemplateCardLevelConfDTO> getCardLevelConfs( ) {
		return this.cardLevelConfs;
	}

    /**
     * Sets card spec tag.
     *
     * @param cardSpecTag the card spec tag
     */
    public void setCardSpecTag(String cardSpecTag) {
		this.cardSpecTag = cardSpecTag;
	}

    /**
     * Gets card spec tag.
     *
     * @return the card spec tag
     */
    public String getCardSpecTag( ) {
		return this.cardSpecTag;
	}

    /**
     * Sets card type.
     *
     * @param cardType the card type
     */
    public void setCardType(String cardType) {
		this.cardType = cardType;
	}

    /**
     * Gets card type.
     *
     * @return the card type
     */
    public String getCardType( ) {
		return this.cardType;
	}

    /**
     * Sets column info list.
     *
     * @param columnInfoList the column info list
     */
    public void setColumnInfoList(List<TemplateColumnInfoDTO> columnInfoList) {
		this.columnInfoList = columnInfoList;
	}

    /**
     * Gets column info list.
     *
     * @return the column info list
     */
    public List<TemplateColumnInfoDTO> getColumnInfoList( ) {
		return this.columnInfoList;
	}

    /**
     * Sets field rule list.
     *
     * @param fieldRuleList the field rule list
     */
    public void setFieldRuleList(List<TemplateFieldRuleDTO> fieldRuleList) {
		this.fieldRuleList = fieldRuleList;
	}

    /**
     * Gets field rule list.
     *
     * @return the field rule list
     */
    public List<TemplateFieldRuleDTO> getFieldRuleList( ) {
		return this.fieldRuleList;
	}

    /**
     * Sets mdcode notify conf.
     *
     * @param mdcodeNotifyConf the mdcode notify conf
     */
    public void setMdcodeNotifyConf(TemplateMdcodeNotifyConfDTO mdcodeNotifyConf) {
		this.mdcodeNotifyConf = mdcodeNotifyConf;
	}

    /**
     * Gets mdcode notify conf.
     *
     * @return the mdcode notify conf
     */
    public TemplateMdcodeNotifyConfDTO getMdcodeNotifyConf( ) {
		return this.mdcodeNotifyConf;
	}

    /**
     * Sets open card conf.
     *
     * @param openCardConf the open card conf
     */
    public void setOpenCardConf(TemplateOpenCardConfDTO openCardConf) {
		this.openCardConf = openCardConf;
	}

    /**
     * Gets open card conf.
     *
     * @return the open card conf
     */
    public TemplateOpenCardConfDTO getOpenCardConf( ) {
		return this.openCardConf;
	}

    /**
     * Sets pub channels.
     *
     * @param pubChannels the pub channels
     */
    public void setPubChannels(List<PubChannelDTO> pubChannels) {
		this.pubChannels = pubChannels;
	}

    /**
     * Gets pub channels.
     *
     * @return the pub channels
     */
    public List<PubChannelDTO> getPubChannels( ) {
		return this.pubChannels;
	}

    /**
     * Sets service label list.
     *
     * @param serviceLabelList the service label list
     */
    public void setServiceLabelList(List<String> serviceLabelList) {
		this.serviceLabelList = serviceLabelList;
	}

    /**
     * Gets service label list.
     *
     * @return the service label list
     */
    public List<String> getServiceLabelList( ) {
		return this.serviceLabelList;
	}

    /**
     * Sets shop ids.
     *
     * @param shopIds the shop ids
     */
    public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

    /**
     * Gets shop ids.
     *
     * @return the shop ids
     */
    public List<String> getShopIds( ) {
		return this.shopIds;
	}

    /**
     * Sets template benefit info.
     *
     * @param templateBenefitInfo the template benefit info
     */
    public void setTemplateBenefitInfo(List<TemplateBenefitInfoDTO> templateBenefitInfo) {
		this.templateBenefitInfo = templateBenefitInfo;
	}

    /**
     * Gets template benefit info.
     *
     * @return the template benefit info
     */
    public List<TemplateBenefitInfoDTO> getTemplateBenefitInfo( ) {
		return this.templateBenefitInfo;
	}

    /**
     * Sets template style info.
     *
     * @param templateStyleInfo the template style info
     */
    public void setTemplateStyleInfo(TemplateStyleInfoDTO templateStyleInfo) {
		this.templateStyleInfo = templateStyleInfo;
	}

    /**
     * Gets template style info.
     *
     * @return the template style info
     */
    public TemplateStyleInfoDTO getTemplateStyleInfo( ) {
		return this.templateStyleInfo;
	}

}
