package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 优惠说明信息
 *
 * @author auto create
 * @since 1.0, 2018-09-14 13:54:41
 */
public class VoucherDescDetailModel extends AlipayObject {

	private static final long serialVersionUID = 1654527415743293332L;

	/**
	 * 优惠的说明信息
	 */
	@ApiListField("details")
	@ApiField("string")
	private List<String> details;

	/**
	 * 优惠的标题
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
