package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商圈会员卡模型
 *
 * @author auto create
 * @since 1.0, 2018-06-28 21:01:01
 */
public class MallCardBo extends AlipayObject {

	private static final long serialVersionUID = 1261454977346156745L;

	/**
	 * 商圈会员卡权益描述
	 */
	@ApiListField("benefit_desc")
	@ApiField("string")
	private List<String> benefitDesc;

	/**
	 * 会员卡图片url
	 */
	@ApiField("card_logo_url")
	private String cardLogoUrl;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 等级展示名称
	 */
	@ApiField("level_show_name")
	private String levelShowName;

	/**
	 * 会员卡卡模版ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 权益标题 多个权益用,分隔
	 */
	@ApiField("title")
	private String title;

    /**
     * Gets benefit desc.
     *
     * @return the benefit desc
     */
    public List<String> getBenefitDesc() {
		return this.benefitDesc;
	}

    /**
     * Sets benefit desc.
     *
     * @param benefitDesc the benefit desc
     */
    public void setBenefitDesc(List<String> benefitDesc) {
		this.benefitDesc = benefitDesc;
	}

    /**
     * Gets card logo url.
     *
     * @return the card logo url
     */
    public String getCardLogoUrl() {
		return this.cardLogoUrl;
	}

    /**
     * Sets card logo url.
     *
     * @param cardLogoUrl the card logo url
     */
    public void setCardLogoUrl(String cardLogoUrl) {
		this.cardLogoUrl = cardLogoUrl;
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
     * Gets level show name.
     *
     * @return the level show name
     */
    public String getLevelShowName() {
		return this.levelShowName;
	}

    /**
     * Sets level show name.
     *
     * @param levelShowName the level show name
     */
    public void setLevelShowName(String levelShowName) {
		this.levelShowName = levelShowName;
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
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
		return this.title;
	}

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
		this.title = title;
	}

}
