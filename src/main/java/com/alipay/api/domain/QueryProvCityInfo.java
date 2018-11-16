package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 省市下拉列表数据对象模型
 *
 * @author auto create
 * @since 1.0, 2016-12-21 11:02:47
 */
public class QueryProvCityInfo extends AlipayObject {

	private static final long serialVersionUID = 1585236347523149734L;

	/**
	 * 省市编号
	 */
	@ApiField("adcode")
	private String adcode;

	/**
	 * 城市名称
	 */
	@ApiField("name")
	private String name;

    /**
     * Gets adcode.
     *
     * @return the adcode
     */
    public String getAdcode() {
		return this.adcode;
	}

    /**
     * Sets adcode.
     *
     * @param adcode the adcode
     */
    public void setAdcode(String adcode) {
		this.adcode = adcode;
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
