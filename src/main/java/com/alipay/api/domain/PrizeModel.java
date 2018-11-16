package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 奖品信息
 *
 * @author auto create
 * @since 1.0, 2018-02-07 12:00:22
 */
public class PrizeModel extends AlipayObject {

	private static final long serialVersionUID = 7284162244672612678L;

	/**
	 * 生效时间
	 */
	@ApiField("active_time")
	private Date activeTime;

	/**
	 * 可用金额，单位元，精度分
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/**
	 * 可用次数，大于1为可找零红包，等于1为不找零红包
	 */
	@ApiField("available_count")
	private Long availableCount;

	/**
	 * 奖品描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 按天折扣信息
	 */
	@ApiListField("discount_by_day_list")
	@ApiField("discount_by_day_model")
	private List<DiscountByDayModel> discountByDayList;

	/**
	 * 分期和整笔折扣信息
	 */
	@ApiListField("discount_list")
	@ApiField("discount_model")
	private List<DiscountModel> discountList;

	/**
	 * 失效时间
	 */
	@ApiField("expired_time")
	private Date expiredTime;

	/**
	 * 扩展信息，JSON结构
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 奖品名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 奖品的复合ID
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 奖品状态
VALID 可使用
EXPIRED 已过期
ALL_USED 全部使用完
	 */
	@ApiField("status")
	private String status;

	/**
	 * 总金额，单位元，精度分
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 奖品类型
DISCOUNT_VOUCHER 利率打折卡券
COUPON_VOUCHER 利息红包卡券
DISCOUNT_CAMP 实时优惠活动
	 */
	@ApiField("type")
	private String type;

	/**
	 * 已使用次数
	 */
	@ApiField("used_count")
	private Long usedCount;

    /**
     * Gets active time.
     *
     * @return the active time
     */
    public Date getActiveTime() {
		return this.activeTime;
	}

    /**
     * Sets active time.
     *
     * @param activeTime the active time
     */
    public void setActiveTime(Date activeTime) {
		this.activeTime = activeTime;
	}

    /**
     * Gets available amount.
     *
     * @return the available amount
     */
    public String getAvailableAmount() {
		return this.availableAmount;
	}

    /**
     * Sets available amount.
     *
     * @param availableAmount the available amount
     */
    public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}

    /**
     * Gets available count.
     *
     * @return the available count
     */
    public Long getAvailableCount() {
		return this.availableCount;
	}

    /**
     * Sets available count.
     *
     * @param availableCount the available count
     */
    public void setAvailableCount(Long availableCount) {
		this.availableCount = availableCount;
	}

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
		return this.description;
	}

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
		this.description = description;
	}

    /**
     * Gets discount by day list.
     *
     * @return the discount by day list
     */
    public List<DiscountByDayModel> getDiscountByDayList() {
		return this.discountByDayList;
	}

    /**
     * Sets discount by day list.
     *
     * @param discountByDayList the discount by day list
     */
    public void setDiscountByDayList(List<DiscountByDayModel> discountByDayList) {
		this.discountByDayList = discountByDayList;
	}

    /**
     * Gets discount list.
     *
     * @return the discount list
     */
    public List<DiscountModel> getDiscountList() {
		return this.discountList;
	}

    /**
     * Sets discount list.
     *
     * @param discountList the discount list
     */
    public void setDiscountList(List<DiscountModel> discountList) {
		this.discountList = discountList;
	}

    /**
     * Gets expired time.
     *
     * @return the expired time
     */
    public Date getExpiredTime() {
		return this.expiredTime;
	}

    /**
     * Sets expired time.
     *
     * @param expiredTime the expired time
     */
    public void setExpiredTime(Date expiredTime) {
		this.expiredTime = expiredTime;
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
     * Gets prize id.
     *
     * @return the prize id
     */
    public String getPrizeId() {
		return this.prizeId;
	}

    /**
     * Sets prize id.
     *
     * @param prizeId the prize id
     */
    public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
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

    /**
     * Gets total amount.
     *
     * @return the total amount
     */
    public String getTotalAmount() {
		return this.totalAmount;
	}

    /**
     * Sets total amount.
     *
     * @param totalAmount the total amount
     */
    public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
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

    /**
     * Gets used count.
     *
     * @return the used count
     */
    public Long getUsedCount() {
		return this.usedCount;
	}

    /**
     * Sets used count.
     *
     * @param usedCount the used count
     */
    public void setUsedCount(Long usedCount) {
		this.usedCount = usedCount;
	}

}
