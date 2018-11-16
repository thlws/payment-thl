package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 会员卡模板修改
 *
 * @author auto create
 * @since 1.0, 2018-03-14 10:51:39
 */
public class AlipayMarketingCardTemplateModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7849168673622988473L;

	/**
	 * 业务卡号前缀，由商户指定
支付宝业务卡号生成规则：biz_no_prefix(商户指定)卡号前缀 + biz_no_suffix(实时生成）卡号后缀
	 */
	@ApiField("biz_no_prefix")
	private String bizNoPrefix;

	/**
	 * 卡行动点配置；
行动点，即用户可点击跳转的区块，类似按钮控件的交互；
单张卡最多定制4个行动点。
	 */
	@ApiListField("card_action_list")
	@ApiField("template_action_info_d_t_o")
	private List<TemplateActionInfoDTO> cardActionList;

	/**
	 * 卡级别配置
	 */
	@ApiListField("card_level_conf")
	@ApiField("template_card_level_conf_d_t_o")
	private List<TemplateCardLevelConfDTO> cardLevelConf;

	/**
	 * 卡特定标签，只供特定业务使用，通常接入无需关注
	 */
	@ApiField("card_spec_tag")
	private String cardSpecTag;

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
当write_off_type指定为商户动态码mdbarcode或mdqrcode时必填；
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
	 * 请求ID，由开发者生成并保证唯一性
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 会员卡上架门店id（支付宝门店id），既发放会员卡的商家门店id
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
	 * 支付宝卡模板ID（模板创建接口返回的支付宝端模板ID）
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 模板样式信息
	 */
	@ApiField("template_style_info")
	private TemplateStyleInfoDTO templateStyleInfo;

	/**
	 * 卡包详情页面中展现出的卡码（可用于扫码核销）

(1) 静态码
qrcode: 二维码，扫码得商户开卡传入的external_card_no
barcode: 条形码，扫码得商户开卡传入的external_card_no
text: 当前不再推荐使用，text的展示效果目前等价于barcode+qrcode，同时出现条形码和二维码 

(2) 动态码-支付宝生成码值(动态码会在2分钟左右后过期)
dqrcode: 动态二维码，扫码得到的码值可配合会员卡查询接口使用
dbarcode: 动态条形码，扫码得到的码值可配合会员卡查询接口使用

(3) 动态码-商家自主生成码值（码值、时效性都由商户控制）
mdqrcode: 商户动态二维码，扫码得商户自主传入的码值
mdbarcode: 商户动态条码，扫码得商户自主传入的码值
	 */
	@ApiField("write_off_type")
	private String writeOffType;

    /**
     * Gets biz no prefix.
     *
     * @return the biz no prefix
     */
    public String getBizNoPrefix() {
		return this.bizNoPrefix;
	}

    /**
     * Sets biz no prefix.
     *
     * @param bizNoPrefix the biz no prefix
     */
    public void setBizNoPrefix(String bizNoPrefix) {
		this.bizNoPrefix = bizNoPrefix;
	}

    /**
     * Gets card action list.
     *
     * @return the card action list
     */
    public List<TemplateActionInfoDTO> getCardActionList() {
		return this.cardActionList;
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
     * Gets card level conf.
     *
     * @return the card level conf
     */
    public List<TemplateCardLevelConfDTO> getCardLevelConf() {
		return this.cardLevelConf;
	}

    /**
     * Sets card level conf.
     *
     * @param cardLevelConf the card level conf
     */
    public void setCardLevelConf(List<TemplateCardLevelConfDTO> cardLevelConf) {
		this.cardLevelConf = cardLevelConf;
	}

    /**
     * Gets card spec tag.
     *
     * @return the card spec tag
     */
    public String getCardSpecTag() {
		return this.cardSpecTag;
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
     * Gets column info list.
     *
     * @return the column info list
     */
    public List<TemplateColumnInfoDTO> getColumnInfoList() {
		return this.columnInfoList;
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
     * Gets field rule list.
     *
     * @return the field rule list
     */
    public List<TemplateFieldRuleDTO> getFieldRuleList() {
		return this.fieldRuleList;
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
     * Gets mdcode notify conf.
     *
     * @return the mdcode notify conf
     */
    public TemplateMdcodeNotifyConfDTO getMdcodeNotifyConf() {
		return this.mdcodeNotifyConf;
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
     * Gets open card conf.
     *
     * @return the open card conf
     */
    public TemplateOpenCardConfDTO getOpenCardConf() {
		return this.openCardConf;
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
     * Gets pub channels.
     *
     * @return the pub channels
     */
    public List<PubChannelDTO> getPubChannels() {
		return this.pubChannels;
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
     * Gets request id.
     *
     * @return the request id
     */
    public String getRequestId() {
		return this.requestId;
	}

    /**
     * Sets request id.
     *
     * @param requestId the request id
     */
    public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

    /**
     * Gets shop ids.
     *
     * @return the shop ids
     */
    public List<String> getShopIds() {
		return this.shopIds;
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
     * Gets template benefit info.
     *
     * @return the template benefit info
     */
    public List<TemplateBenefitInfoDTO> getTemplateBenefitInfo() {
		return this.templateBenefitInfo;
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

    /**
     * Gets template style info.
     *
     * @return the template style info
     */
    public TemplateStyleInfoDTO getTemplateStyleInfo() {
		return this.templateStyleInfo;
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
     * Gets write off type.
     *
     * @return the write off type
     */
    public String getWriteOffType() {
		return this.writeOffType;
	}

    /**
     * Sets write off type.
     *
     * @param writeOffType the write off type
     */
    public void setWriteOffType(String writeOffType) {
		this.writeOffType = writeOffType;
	}

}
