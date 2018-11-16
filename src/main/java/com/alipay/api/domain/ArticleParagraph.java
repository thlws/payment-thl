package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 文章段落
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:37
 */
public class ArticleParagraph extends AlipayObject {

	private static final long serialVersionUID = 4887429366694472926L;

	/**
	 * 图片列表
	 */
	@ApiListField("pictures")
	@ApiField("article_picture")
	private List<ArticlePicture> pictures;

	/**
	 * 文章正文描述
	 */
	@ApiField("text")
	private String text;

    /**
     * Gets pictures.
     *
     * @return the pictures
     */
    public List<ArticlePicture> getPictures() {
		return this.pictures;
	}

    /**
     * Sets pictures.
     *
     * @param pictures the pictures
     */
    public void setPictures(List<ArticlePicture> pictures) {
		this.pictures = pictures;
	}

    /**
     * Gets text.
     *
     * @return the text
     */
    public String getText() {
		return this.text;
	}

    /**
     * Sets text.
     *
     * @param text the text
     */
    public void setText(String text) {
		this.text = text;
	}

}
