package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券的说明条款
 *
 * @author auto create
 * @since 1.0, 2018-01-22 16:28:56
 */
public class InteligentClauseTerm extends AlipayObject {

	private static final long serialVersionUID = 7124815592155516411L;

	/**
	 * 说明描述内容
	 */
	@ApiListField("descriptions")
	@ApiField("string")
	private List<String> descriptions;

	/**
	 * 说明title
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
