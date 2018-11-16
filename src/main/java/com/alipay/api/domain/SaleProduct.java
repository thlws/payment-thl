package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 销售产品
 *
 * @author auto create
 * @since 1.0, 2013-12-17 15:55:22
 */
public class SaleProduct extends AlipayObject {

	private static final long serialVersionUID = 3635852337678261435L;

	/**
	 * 宝贝来源 例如：TAOBAO ALIPAY
	 */
	@ApiField("channel_type")
	private String channelType;

	/**
	 * 销售产品DB ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 面额
	 */
	@ApiField("market_price")
	private String marketPrice;

	/**
	 * 充值产品提供商
	 */
	@ApiField("product_provider")
	private ProductProvider productProvider;

	/**
	 * 销售价格
	 */
	@ApiField("sale_price")
	private String salePrice;

	/**
	 * 产品状态, 0为不可用，1为可用
	 */
	@ApiField("status")
	private String status;

    /**
     * Gets channel type.
     *
     * @return the channel type
     */
    public String getChannelType() {
		return this.channelType;
	}

    /**
     * Sets channel type.
     *
     * @param channelType the channel type
     */
    public void setChannelType(String channelType) {
		this.channelType = channelType;
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
     * Gets market price.
     *
     * @return the market price
     */
    public String getMarketPrice() {
		return this.marketPrice;
	}

    /**
     * Sets market price.
     *
     * @param marketPrice the market price
     */
    public void setMarketPrice(String marketPrice) {
		this.marketPrice = marketPrice;
	}

    /**
     * Gets product provider.
     *
     * @return the product provider
     */
    public ProductProvider getProductProvider() {
		return this.productProvider;
	}

    /**
     * Sets product provider.
     *
     * @param productProvider the product provider
     */
    public void setProductProvider(ProductProvider productProvider) {
		this.productProvider = productProvider;
	}

    /**
     * Gets sale price.
     *
     * @return the sale price
     */
    public String getSalePrice() {
		return this.salePrice;
	}

    /**
     * Sets sale price.
     *
     * @param salePrice the sale price
     */
    public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

}
