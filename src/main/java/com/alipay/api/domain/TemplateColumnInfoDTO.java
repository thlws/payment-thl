package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模板栏位信息
 *
 * @author auto create
 * @since 1.0, 2018-03-22 14:17:06
 */
public class TemplateColumnInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2869857424287648826L;

	/**
	 * 标准栏位：行为由支付宝统一定，同时已经分配标准Code
BALANCE：会员卡余额
POINT：积分
LEVEL：等级
TELEPHONE：联系方式
自定义栏位：行为由商户定义，自定义Code码（只要无重复）
	 */
	@ApiField("code")
	private String code;

	/**
	 * 若template_style_info.column_info_layout
的值为grid，此项为宫格项所属分组标题。可空。如果需要展示该项，还需支付宝内部进行特殊配置。
	 */
	@ApiField("group_title")
	private String groupTitle;

	/**
	 * 若template_style_info.column_info_layout
的值为grid，此项为宫格项的展示icon。通过接口（alipay.offline.material.image.upload）上传图片。
	 */
	@ApiField("icon_id")
	private String iconId;

	/**
	 * 扩展信息
	 */
	@ApiField("more_info")
	private MoreInfoDTO moreInfo;

	/**
	 * 1、openNative：打开二级页面，展现 more中descs
2、openWeb：打开URL
3、staticinfo：静态信息
注意：
不填则默认staticinfo；
标准code尽量使用staticinfo，例如TELEPHONE商家电话栏位就只支持staticinfo；
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 若template_style_info.column_info_layout
的值为grid，此项为宫格项标签。可空。
	 */
	@ApiField("tag")
	private String tag;

	/**
	 * 栏目的标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 卡包详情页面，卡栏位右边展现的值

TELEPHONE栏位的商家联系电话号码由此value字段传入
	 */
	@ApiField("value")
	private String value;

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
		return this.code;
	}

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
		this.code = code;
	}

    /**
     * Gets group title.
     *
     * @return the group title
     */
    public String getGroupTitle() {
		return this.groupTitle;
	}

    /**
     * Sets group title.
     *
     * @param groupTitle the group title
     */
    public void setGroupTitle(String groupTitle) {
		this.groupTitle = groupTitle;
	}

    /**
     * Gets icon id.
     *
     * @return the icon id
     */
    public String getIconId() {
		return this.iconId;
	}

    /**
     * Sets icon id.
     *
     * @param iconId the icon id
     */
    public void setIconId(String iconId) {
		this.iconId = iconId;
	}

    /**
     * Gets more info.
     *
     * @return the more info
     */
    public MoreInfoDTO getMoreInfo() {
		return this.moreInfo;
	}

    /**
     * Sets more info.
     *
     * @param moreInfo the more info
     */
    public void setMoreInfo(MoreInfoDTO moreInfo) {
		this.moreInfo = moreInfo;
	}

    /**
     * Gets operate type.
     *
     * @return the operate type
     */
    public String getOperateType() {
		return this.operateType;
	}

    /**
     * Sets operate type.
     *
     * @param operateType the operate type
     */
    public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

    /**
     * Gets tag.
     *
     * @return the tag
     */
    public String getTag() {
		return this.tag;
	}

    /**
     * Sets tag.
     *
     * @param tag the tag
     */
    public void setTag(String tag) {
		this.tag = tag;
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

    /**
     * Gets value.
     *
     * @return the value
     */
    public String getValue() {
		return this.value;
	}

    /**
     * Sets value.
     *
     * @param value the value
     */
    public void setValue(String value) {
		this.value = value;
	}

}
