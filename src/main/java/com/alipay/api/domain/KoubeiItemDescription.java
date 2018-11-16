package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品描述
 *
 * @author auto create
 * @since 1.0, 2017-09-22 18:18:37
 */
public class KoubeiItemDescription extends AlipayObject {

	private static final long serialVersionUID = 1863562432537627485L;

	/**
	 * 标题下的描述列表，列表类型，每项不得为空,最多10项，总长度不能超过2600个中文字符
	 */
	@ApiListField("details")
	@ApiField("string")
	private List<String> details;

	/**
	 * 描述标题，不得超过40个中文字符
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
