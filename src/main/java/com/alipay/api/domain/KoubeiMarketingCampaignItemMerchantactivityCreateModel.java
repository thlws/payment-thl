package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户创建商品代金券
 *
 * @author auto create
 * @since 1.0, 2018-07-06 17:37:06
 */
public class KoubeiMarketingCampaignItemMerchantactivityCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7246626596428817945L;

	/**
	 * 活动优惠次数限制
活动优惠总次数限制不能小于1,且不能为不限制
活动优惠总次数限制不能大于99999999
	 */
	@ApiField("count_limit")
	private Long countLimit;

	/**
	 * 活动优惠单日次数限制
0表示不限制
活动优惠单日次数限制不能为负数
活动优惠单日次数限制不能大于99999999
	 */
	@ApiField("count_limit_per_day")
	private Long countLimitPerDay;

	/**
	 * 活动单用户限次
0表示不限制
活动单用户总限次不能为负数
活动单用户总限次不能大于999
	 */
	@ApiField("count_limit_per_user")
	private Long countLimitPerUser;

	/**
	 * 活动单用户单日限次
0表示不限制
活动单用户单日限次不能为负数
活动单用户单日限次不能大于999
	 */
	@ApiField("count_limit_per_user_per_day")
	private Long countLimitPerUserPerDay;

	/**
	 * 人群规则：
DEFAULT： 全部用户
ONLINE_NEWCOMER：在线购买新人
MEMBER：会员
	 */
	@ApiField("crowd")
	private String crowd;

	/**
	 * 代金券面额
代金券面额 单位为元
代金券面额格式必须为#.##
代金券面额需小于49999
	 */
	@ApiField("deduct_amount")
	private String deductAmount;

	/**
	 * 外部回调地址
外部回调地址最大字符数不能超过500
	 */
	@ApiField("external_callback_url")
	private String externalCallbackUrl;

	/**
	 * 外部Id
最大长度不能超过64
最小长度不能低于13
	 */
	@ApiField("external_unique_id")
	private String externalUniqueId;

	/**
	 * 活动结束时间
格式必须为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 活动开始时间
格式必须为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_start")
	private Date gmtStart;

	/**
	 * 商品列表
参加活动的商品列表不能为空
参加活动的商品列表最大个数不能超过100
	 */
	@ApiListField("item_ids")
	@ApiField("string")
	private List<String> itemIds;

	/**
	 * 备注
备注最大字符数不能超过500
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 使用门槛，满X元可用，使用门槛必须大于券面额
使用门槛单位为元
使用门槛格式必须为#.##
	 */
	@ApiField("min_cost")
	private String minCost;

	/**
	 * 是否手动领取，本期只支持true
	 */
	@ApiField("obtain_manually")
	private Boolean obtainManually;

	/**
	 * 券信息
	 */
	@ApiField("voucher_info")
	private MerchantActivityVoucherInfo voucherInfo;

    /**
     * Gets count limit.
     *
     * @return the count limit
     */
    public Long getCountLimit() {
		return this.countLimit;
	}

    /**
     * Sets count limit.
     *
     * @param countLimit the count limit
     */
    public void setCountLimit(Long countLimit) {
		this.countLimit = countLimit;
	}

    /**
     * Gets count limit per day.
     *
     * @return the count limit per day
     */
    public Long getCountLimitPerDay() {
		return this.countLimitPerDay;
	}

    /**
     * Sets count limit per day.
     *
     * @param countLimitPerDay the count limit per day
     */
    public void setCountLimitPerDay(Long countLimitPerDay) {
		this.countLimitPerDay = countLimitPerDay;
	}

    /**
     * Gets count limit per user.
     *
     * @return the count limit per user
     */
    public Long getCountLimitPerUser() {
		return this.countLimitPerUser;
	}

    /**
     * Sets count limit per user.
     *
     * @param countLimitPerUser the count limit per user
     */
    public void setCountLimitPerUser(Long countLimitPerUser) {
		this.countLimitPerUser = countLimitPerUser;
	}

    /**
     * Gets count limit per user per day.
     *
     * @return the count limit per user per day
     */
    public Long getCountLimitPerUserPerDay() {
		return this.countLimitPerUserPerDay;
	}

    /**
     * Sets count limit per user per day.
     *
     * @param countLimitPerUserPerDay the count limit per user per day
     */
    public void setCountLimitPerUserPerDay(Long countLimitPerUserPerDay) {
		this.countLimitPerUserPerDay = countLimitPerUserPerDay;
	}

    /**
     * Gets crowd.
     *
     * @return the crowd
     */
    public String getCrowd() {
		return this.crowd;
	}

    /**
     * Sets crowd.
     *
     * @param crowd the crowd
     */
    public void setCrowd(String crowd) {
		this.crowd = crowd;
	}

    /**
     * Gets deduct amount.
     *
     * @return the deduct amount
     */
    public String getDeductAmount() {
		return this.deductAmount;
	}

    /**
     * Sets deduct amount.
     *
     * @param deductAmount the deduct amount
     */
    public void setDeductAmount(String deductAmount) {
		this.deductAmount = deductAmount;
	}

    /**
     * Gets external callback url.
     *
     * @return the external callback url
     */
    public String getExternalCallbackUrl() {
		return this.externalCallbackUrl;
	}

    /**
     * Sets external callback url.
     *
     * @param externalCallbackUrl the external callback url
     */
    public void setExternalCallbackUrl(String externalCallbackUrl) {
		this.externalCallbackUrl = externalCallbackUrl;
	}

    /**
     * Gets external unique id.
     *
     * @return the external unique id
     */
    public String getExternalUniqueId() {
		return this.externalUniqueId;
	}

    /**
     * Sets external unique id.
     *
     * @param externalUniqueId the external unique id
     */
    public void setExternalUniqueId(String externalUniqueId) {
		this.externalUniqueId = externalUniqueId;
	}

    /**
     * Gets gmt end.
     *
     * @return the gmt end
     */
    public Date getGmtEnd() {
		return this.gmtEnd;
	}

    /**
     * Sets gmt end.
     *
     * @param gmtEnd the gmt end
     */
    public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

    /**
     * Gets gmt start.
     *
     * @return the gmt start
     */
    public Date getGmtStart() {
		return this.gmtStart;
	}

    /**
     * Sets gmt start.
     *
     * @param gmtStart the gmt start
     */
    public void setGmtStart(Date gmtStart) {
		this.gmtStart = gmtStart;
	}

    /**
     * Gets item ids.
     *
     * @return the item ids
     */
    public List<String> getItemIds() {
		return this.itemIds;
	}

    /**
     * Sets item ids.
     *
     * @param itemIds the item ids
     */
    public void setItemIds(List<String> itemIds) {
		this.itemIds = itemIds;
	}

    /**
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo() {
		return this.memo;
	}

    /**
     * Sets memo.
     *
     * @param memo the memo
     */
    public void setMemo(String memo) {
		this.memo = memo;
	}

    /**
     * Gets min cost.
     *
     * @return the min cost
     */
    public String getMinCost() {
		return this.minCost;
	}

    /**
     * Sets min cost.
     *
     * @param minCost the min cost
     */
    public void setMinCost(String minCost) {
		this.minCost = minCost;
	}

    /**
     * Gets obtain manually.
     *
     * @return the obtain manually
     */
    public Boolean getObtainManually() {
		return this.obtainManually;
	}

    /**
     * Sets obtain manually.
     *
     * @param obtainManually the obtain manually
     */
    public void setObtainManually(Boolean obtainManually) {
		this.obtainManually = obtainManually;
	}

    /**
     * Gets voucher info.
     *
     * @return the voucher info
     */
    public MerchantActivityVoucherInfo getVoucherInfo() {
		return this.voucherInfo;
	}

    /**
     * Sets voucher info.
     *
     * @param voucherInfo the voucher info
     */
    public void setVoucherInfo(MerchantActivityVoucherInfo voucherInfo) {
		this.voucherInfo = voucherInfo;
	}

}
