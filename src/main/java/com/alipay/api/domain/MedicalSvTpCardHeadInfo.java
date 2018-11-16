package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗行业通知行业消息card头部信息
 *
 * @author auto create
 * @since 1.0, 2016-11-16 15:16:20
 */
public class MedicalSvTpCardHeadInfo extends AlipayObject {

	private static final long serialVersionUID = 4417588218768217836L;

	/**
	 * 模板头部图标：开发者提供公网图片地址
图片大小（长*宽,单位px）81*81
	 */
	@ApiField("header_icon")
	private String headerIcon;

	/**
	 * 模板头部标题,开发者自定义
	 */
	@ApiField("header_title")
	private String headerTitle;

    /**
     * Gets header icon.
     *
     * @return the header icon
     */
    public String getHeaderIcon() {
		return this.headerIcon;
	}

    /**
     * Sets header icon.
     *
     * @param headerIcon the header icon
     */
    public void setHeaderIcon(String headerIcon) {
		this.headerIcon = headerIcon;
	}

    /**
     * Gets header title.
     *
     * @return the header title
     */
    public String getHeaderTitle() {
		return this.headerTitle;
	}

    /**
     * Sets header title.
     *
     * @param headerTitle the header title
     */
    public void setHeaderTitle(String headerTitle) {
		this.headerTitle = headerTitle;
	}

}
