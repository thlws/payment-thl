package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户确认领券
 *
 * @author auto create
 * @since 1.0, 2018-01-30 22:42:32
 */
public class AlipayMarketingVoucherConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 5797195936142383772L;

	/**
	 * 用于决定在用户确认领券后是否重定向。可枚举：true表示需要重定向，false表示不需要重定向，不区分大小写
	 */
	@ApiField("need_redirect")
	private Boolean needRedirect;

	/**
	 * 外部业务单号。用作幂等控制。同一个template_id、user_id、out_biz_no返回相同的发券码
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 重定向地址，用于接收支付宝返回的领取码
	 */
	@ApiField("redirect_uri")
	private String redirectUri;

	/**
	 * 券模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 指定用户确认页面的主题名称。目前提供5套主题，分别为：red, blue, yellow, green, orange
	 */
	@ApiField("theme")
	private String theme;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets need redirect.
     *
     * @return the need redirect
     */
    public Boolean getNeedRedirect() {
		return this.needRedirect;
	}

    /**
     * Sets need redirect.
     *
     * @param needRedirect the need redirect
     */
    public void setNeedRedirect(Boolean needRedirect) {
		this.needRedirect = needRedirect;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets redirect uri.
     *
     * @return the redirect uri
     */
    public String getRedirectUri() {
		return this.redirectUri;
	}

    /**
     * Sets redirect uri.
     *
     * @param redirectUri the redirect uri
     */
    public void setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
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
     * Gets theme.
     *
     * @return the theme
     */
    public String getTheme() {
		return this.theme;
	}

    /**
     * Sets theme.
     *
     * @param theme the theme
     */
    public void setTheme(String theme) {
		this.theme = theme;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
