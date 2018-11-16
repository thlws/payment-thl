package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 优惠信息
 *
 * @author auto create
 * @since 1.0, 2017-08-16 14:42:02
 */
public class DiscountDetail extends AlipayObject {

	private static final long serialVersionUID = 6447391346211284836L;

	/**
	 * 优惠金额
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 优惠描述，比如至多优惠XX元，满XX减XX
	 */
	@ApiListField("discount_desc")
	@ApiField("string")
	private List<String> discountDesc;

	/**
	 * 优惠类型,商家优惠（M_DISCOUNT），平台优惠（RT_DISCOUNT）
	 */
	@ApiField("discount_type")
	private String discountType;

	/**
	 * 优惠ID或活动ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 优惠是否命中, true代表命中了优惠；false代表未命中优惠
	 */
	@ApiField("is_hit")
	private String isHit;

	/**
	 * 是否是购买券, true代表是购买的券，false调表不是购买的券
	 */
	@ApiField("is_purchased")
	private String isPurchased;

	/**
	 * 优惠名称
	 */
	@ApiField("name")
	private String name;

    /**
     * Gets discount amount.
     *
     * @return the discount amount
     */
    public String getDiscountAmount() {
		return this.discountAmount;
	}

    /**
     * Sets discount amount.
     *
     * @param discountAmount the discount amount
     */
    public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

    /**
     * Gets discount desc.
     *
     * @return the discount desc
     */
    public List<String> getDiscountDesc() {
		return this.discountDesc;
	}

    /**
     * Sets discount desc.
     *
     * @param discountDesc the discount desc
     */
    public void setDiscountDesc(List<String> discountDesc) {
		this.discountDesc = discountDesc;
	}

    /**
     * Gets discount type.
     *
     * @return the discount type
     */
    public String getDiscountType() {
		return this.discountType;
	}

    /**
     * Sets discount type.
     *
     * @param discountType the discount type
     */
    public void setDiscountType(String discountType) {
		this.discountType = discountType;
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
     * Gets is hit.
     *
     * @return the is hit
     */
    public String getIsHit() {
		return this.isHit;
	}

    /**
     * Sets is hit.
     *
     * @param isHit the is hit
     */
    public void setIsHit(String isHit) {
		this.isHit = isHit;
	}

    /**
     * Gets is purchased.
     *
     * @return the is purchased
     */
    public String getIsPurchased() {
		return this.isPurchased;
	}

    /**
     * Sets is purchased.
     *
     * @param isPurchased the is purchased
     */
    public void setIsPurchased(String isPurchased) {
		this.isPurchased = isPurchased;
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
