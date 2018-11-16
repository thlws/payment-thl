package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据标签组发消息接口
 *
 * @author auto create
 * @since 1.0, 2016-12-02 17:04:34
 */
public class AlipayOpenPublicMessageLabelSendModel extends AlipayObject {

	private static final long serialVersionUID = 1745562442253845482L;

	/**
	 * 根据标签圈人的过滤器
	 */
	@ApiField("filter")
	private Filter filter;

	/**
	 * 发送消息内容，支持文本消息和图文消息
	 */
	@ApiField("material")
	private Material material;

    /**
     * Gets filter.
     *
     * @return the filter
     */
    public Filter getFilter() {
		return this.filter;
	}

    /**
     * Sets filter.
     *
     * @param filter the filter
     */
    public void setFilter(Filter filter) {
		this.filter = filter;
	}

    /**
     * Gets material.
     *
     * @return the material
     */
    public Material getMaterial() {
		return this.material;
	}

    /**
     * Sets material.
     *
     * @param material the material
     */
    public void setMaterial(Material material) {
		this.material = material;
	}

}
