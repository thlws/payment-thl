package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.label.create response.
 *
 * @author auto create
 * @since 1.0, 2016-12-08 11:55:52
 */
public class AlipayOpenPublicLabelCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3414791741427231251L;

	/** 
	 * 支付宝返回的标签ID，开发者后续通过该ID进行标签的查询、修改、删除等操作
	 */
	@ApiField("id")
	private Long id;

	/** 
	 * 开发者传入name的值
	 */
	@ApiField("name")
	private String name;

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
		this.id = id;
	}

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId( ) {
		return this.id;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName( ) {
		return this.name;
	}

}
