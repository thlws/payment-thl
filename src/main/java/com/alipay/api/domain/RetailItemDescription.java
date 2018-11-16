package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品描述信息
 *
 * @author auto create
 * @since 1.0, 2017-11-30 10:18:28
 */
public class RetailItemDescription extends AlipayObject {

	private static final long serialVersionUID = 7218186266448143315L;

	/**
	 * 标题下的描述列表，列表类型，每项不得超过100个中文字符,最多10项
	 */
	@ApiListField("details")
	@ApiField("string")
	private List<String> details;

	/**
	 * 商品描述title
	 */
	@ApiField("title")
	private String title;

    /**
     * Gets details.
     *
     * @return the details
     */
    public List<String> getDetails() {
		return this.details;
	}

    /**
     * Sets details.
     *
     * @param details the details
     */
    public void setDetails(List<String> details) {
		this.details = details;
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

}
