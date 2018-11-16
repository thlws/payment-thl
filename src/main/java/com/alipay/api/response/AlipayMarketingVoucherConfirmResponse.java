package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.confirm response.
 *
 * @author auto create
 * @since 1.0, 2018-01-30 22:42:32
 */
public class AlipayMarketingVoucherConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 4171754371871653523L;

	/** 
	 * 用于决定在用户确认领券后是否重定向。可枚举：true表示需要重定向，false表示不需要重定向
	 */
	@ApiField("need_redirect")
	private Boolean needRedirect;

	/** 
	 * 外部业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 重定向地址，用于接收支付宝返回的领取码，必须使用utf-8编码
	 */
	@ApiField("redirect_uri")
	private String redirectUri;

	/** 
	 * 发券码。如果发生异常sendCode为空
	 */
	@ApiField("send_code")
	private String sendCode;

	/** 
	 * 模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/** 
	 * 指定的用户确认页面主题名称
	 */
	@ApiField("theme")
	private String theme;

	/** 
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Sets need redirect.
     *
     * @param needRedirect the need redirect
     */
    public void setNeedRedirect(Boolean needRedirect) {
		this.needRedirect = needRedirect;
	}

    /**
     * Gets need redirect.
     *
     * @return the need redirect
     */
    public Boolean getNeedRedirect( ) {
		return this.needRedirect;
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
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo( ) {
		return this.outBizNo;
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
     * Gets redirect uri.
     *
     * @return the redirect uri
     */
    public String getRedirectUri( ) {
		return this.redirectUri;
	}

    /**
     * Sets send code.
     *
     * @param sendCode the send code
     */
    public void setSendCode(String sendCode) {
		this.sendCode = sendCode;
	}

    /**
     * Gets send code.
     *
     * @return the send code
     */
    public String getSendCode( ) {
		return this.sendCode;
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
     * Gets template id.
     *
     * @return the template id
     */
    public String getTemplateId( ) {
		return this.templateId;
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
     * Gets theme.
     *
     * @return the theme
     */
    public String getTheme( ) {
		return this.theme;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId( ) {
		return this.userId;
	}

}
