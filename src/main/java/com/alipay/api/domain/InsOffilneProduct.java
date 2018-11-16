package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险产品信息
 *
 * @author auto create
 * @since 1.0, 2017-09-20 17:56:35
 */
public class InsOffilneProduct extends AlipayObject {

	private static final long serialVersionUID = 8871948347719858574L;

	/**
	 * 需要透传给机构的个性化数据，比如机构的内部产品编码，以json格式返回，key需要和蚂蚁的技术进行确认
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 产品编码，蚂蚁保险平台会为每个产品分配一个唯一的产品编码
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 产品名称，机构在蚂蚁保险后台进行配置的
	 */
	@ApiField("prod_name")
	private String prodName;

    /**
     * Gets biz data.
     *
     * @return the biz data
     */
    public String getBizData() {
		return this.bizData;
	}

    /**
     * Sets biz data.
     *
     * @param bizData the biz data
     */
    public void setBizData(String bizData) {
		this.bizData = bizData;
	}

    /**
     * Gets prod code.
     *
     * @return the prod code
     */
    public String getProdCode() {
		return this.prodCode;
	}

    /**
     * Sets prod code.
     *
     * @param prodCode the prod code
     */
    public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

    /**
     * Gets prod name.
     *
     * @return the prod name
     */
    public String getProdName() {
		return this.prodName;
	}

    /**
     * Sets prod name.
     *
     * @param prodName the prod name
     */
    public void setProdName(String prodName) {
		this.prodName = prodName;
	}

}
