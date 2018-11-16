package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 包裹明细
 *
 * @author auto create
 * @since 1.0, 2018-06-01 17:20:31
 */
public class DeliveryPackageDetail extends AlipayObject {

	private static final long serialVersionUID = 4774741149934562875L;

	/**
	 * 运单号
	 */
	@ApiField("express_code")
	private String expressCode;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 货品编码
	 */
	@ApiField("goods_code")
	private String goodsCode;

	/**
	 * 货品数量
	 */
	@ApiField("goods_quantity")
	private String goodsQuantity;

	/**
	 * 包裹编号
	 */
	@ApiField("package_code")
	private String packageCode;

    /**
     * Gets express code.
     *
     * @return the express code
     */
    public String getExpressCode() {
		return this.expressCode;
	}

    /**
     * Sets express code.
     *
     * @param expressCode the express code
     */
    public void setExpressCode(String expressCode) {
		this.expressCode = expressCode;
	}

    /**
     * Gets gmt create.
     *
     * @return the gmt create
     */
    public String getGmtCreate() {
		return this.gmtCreate;
	}

    /**
     * Sets gmt create.
     *
     * @param gmtCreate the gmt create
     */
    public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

    /**
     * Gets gmt modified.
     *
     * @return the gmt modified
     */
    public String getGmtModified() {
		return this.gmtModified;
	}

    /**
     * Sets gmt modified.
     *
     * @param gmtModified the gmt modified
     */
    public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

    /**
     * Gets goods code.
     *
     * @return the goods code
     */
    public String getGoodsCode() {
		return this.goodsCode;
	}

    /**
     * Sets goods code.
     *
     * @param goodsCode the goods code
     */
    public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

    /**
     * Gets goods quantity.
     *
     * @return the goods quantity
     */
    public String getGoodsQuantity() {
		return this.goodsQuantity;
	}

    /**
     * Sets goods quantity.
     *
     * @param goodsQuantity the goods quantity
     */
    public void setGoodsQuantity(String goodsQuantity) {
		this.goodsQuantity = goodsQuantity;
	}

    /**
     * Gets package code.
     *
     * @return the package code
     */
    public String getPackageCode() {
		return this.packageCode;
	}

    /**
     * Sets package code.
     *
     * @param packageCode the package code
     */
    public void setPackageCode(String packageCode) {
		this.packageCode = packageCode;
	}

}
