package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 优惠明细信息
 *
 * @author auto create
 * @since 1.0, 2018-08-30 10:41:10
 */
public class DiscountInfos extends AlipayObject {

	private static final long serialVersionUID = 1181251824693494738L;

	/**
	 * 优惠金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_infos")
	private String extInfos;

	/**
	 * 本次支付商家优惠的金额
	 */
	@ApiField("mdiscount_amount")
	private String mdiscountAmount;

	/**
	 * 优惠名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 本次支付平台补贴的金额
	 */
	@ApiField("platform_discount_amount")
	private String platformDiscountAmount;

	/**
	 * 优惠类型
	 */
	@ApiField("type")
	private String type;

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public String getAmount() {
		return this.amount;
	}

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(String amount) {
		this.amount = amount;
	}

    /**
     * Gets ext infos.
     *
     * @return the ext infos
     */
    public String getExtInfos() {
		return this.extInfos;
	}

    /**
     * Sets ext infos.
     *
     * @param extInfos the ext infos
     */
    public void setExtInfos(String extInfos) {
		this.extInfos = extInfos;
	}

    /**
     * Gets mdiscount amount.
     *
     * @return the mdiscount amount
     */
    public String getMdiscountAmount() {
		return this.mdiscountAmount;
	}

    /**
     * Sets mdiscount amount.
     *
     * @param mdiscountAmount the mdiscount amount
     */
    public void setMdiscountAmount(String mdiscountAmount) {
		this.mdiscountAmount = mdiscountAmount;
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

    /**
     * Gets platform discount amount.
     *
     * @return the platform discount amount
     */
    public String getPlatformDiscountAmount() {
		return this.platformDiscountAmount;
	}

    /**
     * Sets platform discount amount.
     *
     * @param platformDiscountAmount the platform discount amount
     */
    public void setPlatformDiscountAmount(String platformDiscountAmount) {
		this.platformDiscountAmount = platformDiscountAmount;
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
