package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡模板基本信息
 *
 * @author auto create
 * @since 1.0, 2018-02-05 15:47:28
 */
public class McardTemplate extends AlipayObject {

	private static final long serialVersionUID = 8544128284917718584L;

	/**
	 * 会员卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 会员卡模板创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 会员卡模板修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 会员卡模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 会员卡模板展示样式，会员卡在卡包中的卡面展示效果
	 */
	@ApiField("template_style_info")
	private TemplateStyleInfoDTO templateStyleInfo;

    /**
     * Gets card type.
     *
     * @return the card type
     */
    public String getCardType() {
		return this.cardType;
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
     * Gets gmt create.
     *
     * @return the gmt create
     */
    public Date getGmtCreate() {
		return this.gmtCreate;
	}

    /**
     * Sets gmt create.
     *
     * @param gmtCreate the gmt create
     */
    public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

    /**
     * Gets gmt modified.
     *
     * @return the gmt modified
     */
    public Date getGmtModified() {
		return this.gmtModified;
	}

    /**
     * Sets gmt modified.
     *
     * @param gmtModified the gmt modified
     */
    public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
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

}
