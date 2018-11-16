package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 到位通用的描述信息对象
 *
 * @author auto create
 * @since 1.0, 2017-01-16 11:30:10
 */
public class CommonDescInfo extends AlipayObject {

	private static final long serialVersionUID = 2228799152345881315L;

	/**
	 * 图片URL地址，最大不超过60K，必须使用https
	 */
	@ApiField("img")
	private String img;

	/**
	 * 文本描述
	 */
	@ApiField("text")
	private String text;

    /**
     * Gets img.
     *
     * @return the img
     */
    public String getImg() {
		return this.img;
	}

    /**
     * Sets img.
     *
     * @param img the img
     */
    public void setImg(String img) {
		this.img = img;
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
