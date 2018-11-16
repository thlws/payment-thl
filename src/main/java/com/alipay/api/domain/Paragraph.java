package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 段落
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class Paragraph extends AlipayObject {

	private static final long serialVersionUID = 1598314639476138818L;

	/**
	 * 图片列表
	 */
	@ApiListField("pictures")
	@ApiField("picture")
	private List<Picture> pictures;

	/**
	 * 正文介绍
	 */
	@ApiField("text")
	private String text;

    /**
     * Gets pictures.
     *
     * @return the pictures
     */
    public List<Picture> getPictures() {
		return this.pictures;
	}

    /**
     * Sets pictures.
     *
     * @param pictures the pictures
     */
    public void setPictures(List<Picture> pictures) {
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
