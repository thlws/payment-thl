package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品列表单条商品数据结构
 *
 * @author auto create
 * @since 1.0, 2017-09-21 13:03:20
 */
public class CaterItemListInfo extends AlipayObject {

	private static final long serialVersionUID = 5255156899764787275L;

	/**
	 * 商品最后修改时间。格式为YYYY-MM-DD HH:mm:ss
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 商品剩余库存数量
	 */
	@ApiField("inventory")
	private Long inventory;

	/**
	 * 口碑体系内部商品的唯一标识
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 当前商品状态。状态枚举值为：INIT表示初始状态， EFFECTIVE表示生效状态，PAUSE表示暂停售卖，FREEZE表示冻结，INVALID表示失效状态
	 */
	@ApiField("item_status")
	private String itemStatus;

	/**
	 * 商品原价。字符串，单位元，2位小数
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 商品现价。字符串，单位元，两位小数
	 */
	@ApiField("price")
	private String price;

	/**
	 * 已退回商品退回原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	/**
	 * 商品名称，请勿超过40汉字，80个字符
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 购买有效期：商品自购买起多长时间内有效，取值范围 7-360，单位天。举例，如果是7的话，是到第七天晚上23:59:59失效。商品购买后，没有在有效期内核销，则自动退款给用户。举例：买了一个鱼香肉丝杨梅汁套餐的商品，有效期一个月，如果一个月之后，用户没有消费该套餐，则自动退款给用户
	 */
	@ApiField("validity_period")
	private Long validityPeriod;

    /**
     * Gets gmt modified.
     *
     * @return the gmt modified
     */
    public Date getGmtModified() {
		return this.gmtModified;
	}

    /**
     * Sets gmt modified.
     *
     * @param gmtModified the gmt modified
     */
    public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

    /**
     * Gets inventory.
     *
     * @return the inventory
     */
    public Long getInventory() {
		return this.inventory;
	}

    /**
     * Sets inventory.
     *
     * @param inventory the inventory
     */
    public void setInventory(Long inventory) {
		this.inventory = inventory;
	}

    /**
     * Gets item id.
     *
     * @return the item id
     */
    public String getItemId() {
		return this.itemId;
	}

    /**
     * Sets item id.
     *
     * @param itemId the item id
     */
    public void setItemId(String itemId) {
		this.itemId = itemId;
	}

    /**
     * Gets item status.
     *
     * @return the item status
     */
    public String getItemStatus() {
		return this.itemStatus;
	}

    /**
     * Sets item status.
     *
     * @param itemStatus the item status
     */
    public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

    /**
     * Gets original price.
     *
     * @return the original price
     */
    public String getOriginalPrice() {
		return this.originalPrice;
	}

    /**
     * Sets original price.
     *
     * @param originalPrice the original price
     */
    public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
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

    /**
     * Gets reject reason.
     *
     * @return the reject reason
     */
    public String getRejectReason() {
		return this.rejectReason;
	}

    /**
     * Sets reject reason.
     *
     * @param rejectReason the reject reason
     */
    public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

    /**
     * Gets subject.
     *
     * @return the subject
     */
    public String getSubject() {
		return this.subject;
	}

    /**
     * Sets subject.
     *
     * @param subject the subject
     */
    public void setSubject(String subject) {
		this.subject = subject;
	}

    /**
     * Gets validity period.
     *
     * @return the validity period
     */
    public Long getValidityPeriod() {
		return this.validityPeriod;
	}

    /**
     * Sets validity period.
     *
     * @param validityPeriod the validity period
     */
    public void setValidityPeriod(Long validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

}
