package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * pos优惠明细信息
 *
 * @author auto create
 * @since 1.0, 2018-03-20 18:20:26
 */
public class PosDiscountDetail extends AlipayObject {

	private static final long serialVersionUID = 8582253526348739359L;

	/**
	 * 优惠名称
	 */
	@ApiField("discount_name")
	private String discountName;

	/**
	 * 优惠类型
	 */
	@ApiField("discount_type")
	private String discountType;

	/**
	 * 扩展信息，存储优惠的详细模型。json对象格式，key和value都为字符串
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 商家出资优惠金额，以元为单位，精确到分
	 */
	@ApiField("mrt_discount")
	private String mrtDiscount;

	/**
	 * 平台出资优惠金额，以元为单位，精确到分
	 */
	@ApiField("rt_discount")
	private String rtDiscount;

    /**
     * Gets discount name.
     *
     * @return the discount name
     */
    public String getDiscountName() {
		return this.discountName;
	}

    /**
     * Sets discount name.
     *
     * @param discountName the discount name
     */
    public void setDiscountName(String discountName) {
		this.discountName = discountName;
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
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets mrt discount.
     *
     * @return the mrt discount
     */
    public String getMrtDiscount() {
		return this.mrtDiscount;
	}

    /**
     * Sets mrt discount.
     *
     * @param mrtDiscount the mrt discount
     */
    public void setMrtDiscount(String mrtDiscount) {
		this.mrtDiscount = mrtDiscount;
	}

    /**
     * Gets rt discount.
     *
     * @return the rt discount
     */
    public String getRtDiscount() {
		return this.rtDiscount;
	}

    /**
     * Sets rt discount.
     *
     * @param rtDiscount the rt discount
     */
    public void setRtDiscount(String rtDiscount) {
		this.rtDiscount = rtDiscount;
	}

}
