package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑广告系统广告内容
 *
 * @author auto create
 * @since 1.0, 2017-02-15 13:57:59
 */
public class KbAdvertAdvContentResponse extends AlipayObject {

	private static final long serialVersionUID = 4412158992693961367L;

	/**
	 * 二维码类型的内容模型（当content_type为codec时，返回该模型）
	 */
	@ApiField("content_codec")
	private KbAdvertContentCodec contentCodec;

	/**
	 * 口令红包类型的内容模型（当content_type为passwordRed时，返回该模型）
	 */
	@ApiField("content_password")
	private KbAdvertContentPassword contentPassword;

	/**
	 * 吱口令类型的内容模型（当content_type为shareCode时，返回该模型）
	 */
	@ApiListField("content_share_code")
	@ApiField("kb_advert_content_share_code")
	private List<KbAdvertContentShareCode> contentShareCode;

	/**
	 * 短链接类型的内容模型（当content_type为shortLink时，返回该模型）
	 */
	@ApiField("content_short_link")
	private KbAdvertContentShortLink contentShortLink;

	/**
	 * 广告内容类型；
shortLink：短链接；
codec：二维码；
passwordRed：口令红包；
shareCode：吱口令；
	 */
	@ApiField("content_type")
	private String contentType;

    /**
     * Gets content codec.
     *
     * @return the content codec
     */
    public KbAdvertContentCodec getContentCodec() {
		return this.contentCodec;
	}

    /**
     * Sets content codec.
     *
     * @param contentCodec the content codec
     */
    public void setContentCodec(KbAdvertContentCodec contentCodec) {
		this.contentCodec = contentCodec;
	}

    /**
     * Gets content password.
     *
     * @return the content password
     */
    public KbAdvertContentPassword getContentPassword() {
		return this.contentPassword;
	}

    /**
     * Sets content password.
     *
     * @param contentPassword the content password
     */
    public void setContentPassword(KbAdvertContentPassword contentPassword) {
		this.contentPassword = contentPassword;
	}

    /**
     * Gets content share code.
     *
     * @return the content share code
     */
    public List<KbAdvertContentShareCode> getContentShareCode() {
		return this.contentShareCode;
	}

    /**
     * Sets content share code.
     *
     * @param contentShareCode the content share code
     */
    public void setContentShareCode(List<KbAdvertContentShareCode> contentShareCode) {
		this.contentShareCode = contentShareCode;
	}

    /**
     * Gets content short link.
     *
     * @return the content short link
     */
    public KbAdvertContentShortLink getContentShortLink() {
		return this.contentShortLink;
	}

    /**
     * Sets content short link.
     *
     * @param contentShortLink the content short link
     */
    public void setContentShortLink(KbAdvertContentShortLink contentShortLink) {
		this.contentShortLink = contentShortLink;
	}

    /**
     * Gets content type.
     *
     * @return the content type
     */
    public String getContentType() {
		return this.contentType;
	}

    /**
     * Sets content type.
     *
     * @param contentType the content type
     */
    public void setContentType(String contentType) {
		this.contentType = contentType;
	}

}
