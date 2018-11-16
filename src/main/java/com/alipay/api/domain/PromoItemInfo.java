package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动商品的信息
 *
 * @author auto create
 * @since 1.0, 2017-09-30 11:21:09
 */
public class PromoItemInfo extends AlipayObject {

	private static final long serialVersionUID = 4562596399427784785L;

	/**
	 * 商品购买限制
	 */
	@ApiField("constraint_info")
	private ConstraintInfo constraintInfo;

	/**
	 * 商品ID，用于领取时使用
	 */
	@ApiField("id")
	private String id;

	/**
	 * 商品售卖结束时间
	 */
	@ApiField("sale_end_time")
	private String saleEndTime;

	/**
	 * 商品售卖的开始时间
	 */
	@ApiField("sale_start_time")
	private Date saleStartTime;

	/**
	 * 剩余库存
	 */
	@ApiField("total_inventory")
	private String totalInventory;

	/**
	 * 券信息
	 */
	@ApiField("voucher")
	private Voucher voucher;

    /**
     * Gets constraint info.
     *
     * @return the constraint info
     */
    public ConstraintInfo getConstraintInfo() {
		return this.constraintInfo;
	}

    /**
     * Sets constraint info.
     *
     * @param constraintInfo the constraint info
     */
    public void setConstraintInfo(ConstraintInfo constraintInfo) {
		this.constraintInfo = constraintInfo;
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
     * Gets sale end time.
     *
     * @return the sale end time
     */
    public String getSaleEndTime() {
		return this.saleEndTime;
	}

    /**
     * Sets sale end time.
     *
     * @param saleEndTime the sale end time
     */
    public void setSaleEndTime(String saleEndTime) {
		this.saleEndTime = saleEndTime;
	}

    /**
     * Gets sale start time.
     *
     * @return the sale start time
     */
    public Date getSaleStartTime() {
		return this.saleStartTime;
	}

    /**
     * Sets sale start time.
     *
     * @param saleStartTime the sale start time
     */
    public void setSaleStartTime(Date saleStartTime) {
		this.saleStartTime = saleStartTime;
	}

    /**
     * Gets total inventory.
     *
     * @return the total inventory
     */
    public String getTotalInventory() {
		return this.totalInventory;
	}

    /**
     * Sets total inventory.
     *
     * @param totalInventory the total inventory
     */
    public void setTotalInventory(String totalInventory) {
		this.totalInventory = totalInventory;
	}

    /**
     * Gets voucher.
     *
     * @return the voucher
     */
    public Voucher getVoucher() {
		return this.voucher;
	}

    /**
     * Sets voucher.
     *
     * @param voucher the voucher
     */
    public void setVoucher(Voucher voucher) {
		this.voucher = voucher;
	}

}
