package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品信息集合，JSON格式,注意，该参数将覆盖原有已经设置的数据,即如想除去某一商品，去除后重新设置该字段值。
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:51:27
 */
public class Product extends AlipayObject {

	private static final long serialVersionUID = 5698231881167799911L;

	/**
	 * 油品编号。（可设置的油品编号名称：89#，92#，95#，98#，101#，10#，5#，0#，-10#，-20#，-35#，-50#）。
	 */
	@ApiField("name")
	private String name;

	/**
	 * 油品价格（元/升），加油站列表页展示给用户。保留小数点后两位，单位元
	 */
	@ApiField("price")
	private String price;

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

    /**
     * Gets price.
     *
     * @return the price
     */
    public String getPrice() {
		return this.price;
	}

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(String price) {
		this.price = price;
	}

}
