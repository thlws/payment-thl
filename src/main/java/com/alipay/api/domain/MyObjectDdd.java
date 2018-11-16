package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ddd
 *
 * @author auto create
 * @since 1.0, 2018-08-08 21:56:22
 */
public class MyObjectDdd extends AlipayObject {

	private static final long serialVersionUID = 8528973221972267434L;

	/**
	 * xx
	 */
	@ApiField("item")
	private String item;

	/**
	 * xxx
	 */
	@ApiField("param")
	private String param;

    /**
     * Gets item.
     *
     * @return the item
     */
    public String getItem() {
		return this.item;
	}

    /**
     * Sets item.
     *
     * @param item the item
     */
    public void setItem(String item) {
		this.item = item;
	}

    /**
     * Gets param.
     *
     * @return the param
     */
    public String getParam() {
		return this.param;
	}

    /**
     * Sets param.
     *
     * @param param the param
     */
    public void setParam(String param) {
		this.param = param;
	}

}
