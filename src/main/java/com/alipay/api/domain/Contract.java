package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 贷款相关的各种合约，如贷款协议、征信授权协议等
 *
 * @author auto create
 * @since 1.0, 2017-03-10 17:07:31
 */
public class Contract extends AlipayObject {

	private static final long serialVersionUID = 1655291967817932925L;

	/**
	 * 合约文本内容
	 */
	@ApiField("text")
	private String text;

	/**
	 * 合约标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 合约类型
	 */
	@ApiField("type")
	private String type;

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
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
	}

}
