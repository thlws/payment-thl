package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 福利使用的门店信息
 *
 * @author auto create
 * @since 1.0, 2016-11-02 19:53:47
 */
public class WelfareEcoStoreInfo extends AlipayObject {

	private static final long serialVersionUID = 6798744225154371851L;

	/**
	 * 门店具体位置（中文）
	 */
	@ApiField("address")
	private String address;

	/**
	 * 品牌
	 */
	@ApiField("brand")
	private String brand;

	/**
	 * 门店编号
	 */
	@ApiField("code")
	private String code;

	/**
	 * 门店名称
	 */
	@ApiField("name")
	private String name;

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
		return this.address;
	}

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
		this.address = address;
	}

    /**
     * Gets brand.
     *
     * @return the brand
     */
    public String getBrand() {
		return this.brand;
	}

    /**
     * Sets brand.
     *
     * @param brand the brand
     */
    public void setBrand(String brand) {
		this.brand = brand;
	}

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
		return this.code;
	}

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
		this.code = code;
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
