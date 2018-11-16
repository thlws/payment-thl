package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券详情描述
 *
 * @author auto create
 * @since 1.0, 2016-06-23 17:38:07
 */
public class VoucherTermInfo extends AlipayObject {

	private static final long serialVersionUID = 3129757237844875422L;

	/**
	 * 描述信息
	 */
	@ApiListField("descriptions")
	@ApiField("string")
	private List<String> descriptions;

	/**
	 * 详情title
	 */
	@ApiField("title")
	private String title;

    /**
     * Gets descriptions.
     *
     * @return the descriptions
     */
    public List<String> getDescriptions() {
		return this.descriptions;
	}

    /**
     * Sets descriptions.
     *
     * @param descriptions the descriptions
     */
    public void setDescriptions(List<String> descriptions) {
		this.descriptions = descriptions;
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
