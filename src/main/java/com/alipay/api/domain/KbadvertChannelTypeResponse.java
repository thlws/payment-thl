package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道类型配置
 *
 * @author auto create
 * @since 1.0, 2017-03-03 10:41:20
 */
public class KbadvertChannelTypeResponse extends AlipayObject {

	private static final long serialVersionUID = 4721838394933433549L;

	/**
	 * 渠道描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 排序，暂时无用
	 */
	@ApiField("order")
	private String order;

	/**
	 * 类型
	 */
	@ApiField("type")
	private String type;

    /**
     * Gets desc.
     *
     * @return the desc
     */
    public String getDesc() {
		return this.desc;
	}

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String desc) {
		this.desc = desc;
	}

    /**
     * Gets order.
     *
     * @return the order
     */
    public String getOrder() {
		return this.order;
	}

    /**
     * Sets order.
     *
     * @param order the order
     */
    public void setOrder(String order) {
		this.order = order;
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
