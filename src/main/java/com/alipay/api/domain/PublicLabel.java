package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公众号标签模型
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class PublicLabel extends AlipayObject {

	private static final long serialVersionUID = 5781632563357393958L;

	/**
	 * 标签用户量
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 标签编号
	 */
	@ApiField("id")
	private String id;

	/**
	 * 标签名称
	 */
	@ApiField("name")
	private String name;

    /**
     * Gets count.
     *
     * @return the count
     */
    public Long getCount() {
		return this.count;
	}

    /**
     * Sets count.
     *
     * @param count the count
     */
    public void setCount(Long count) {
		this.count = count;
	}

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
		return this.id;
	}

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
		this.id = id;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

}
