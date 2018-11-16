package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻认证数据结构
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:41
 */
public class AliTrustCert extends AlipayObject {

	private static final long serialVersionUID = 7658189589865572952L;

	/**
	 * 点击信用认证图标之后的跳转链接
	 */
	@ApiField("forward_url")
	private String forwardUrl;

	/**
	 * 通过信用认证的图标链接
	 */
	@ApiField("icon_url")
	private String iconUrl;

	/**
	 * 当通过信用认证时,取值为"T";否则为"F".
	 */
	@ApiField("is_certified")
	private String isCertified;

	/**
	 * 芝麻认证等级，取值为1,2,3
	 */
	@ApiField("level")
	private String level;

	/**
	 * 当用户未通过芝麻认证时给出的原因提示
	 */
	@ApiField("message")
	private String message;

    /**
     * Gets forward url.
     *
     * @return the forward url
     */
    public String getForwardUrl() {
		return this.forwardUrl;
	}

    /**
     * Sets forward url.
     *
     * @param forwardUrl the forward url
     */
    public void setForwardUrl(String forwardUrl) {
		this.forwardUrl = forwardUrl;
	}

    /**
     * Gets icon url.
     *
     * @return the icon url
     */
    public String getIconUrl() {
		return this.iconUrl;
	}

    /**
     * Sets icon url.
     *
     * @param iconUrl the icon url
     */
    public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

    /**
     * Gets is certified.
     *
     * @return the is certified
     */
    public String getIsCertified() {
		return this.isCertified;
	}

    /**
     * Sets is certified.
     *
     * @param isCertified the is certified
     */
    public void setIsCertified(String isCertified) {
		this.isCertified = isCertified;
	}

    /**
     * Gets level.
     *
     * @return the level
     */
    public String getLevel() {
		return this.level;
	}

    /**
     * Sets level.
     *
     * @param level the level
     */
    public void setLevel(String level) {
		this.level = level;
	}

    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage() {
		return this.message;
	}

    /**
     * Sets message.
     *
     * @param message the message
     */
    public void setMessage(String message) {
		this.message = message;
	}

}
