package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MerchantActivityVoucherInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.item.merchantactivity.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-06 17:37:42
 */
public class KoubeiMarketingCampaignItemMerchantactivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1765242867185591367L;

	/** 
	 * 活动Id
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 营销活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/** 
	 * 活动优惠次数限制
	 */
	@ApiField("count_limit")
	private Long countLimit;

	/** 
	 * 活动优惠单日次数限制
	 */
	@ApiField("count_limit_per_day")
	private Long countLimitPerDay;

	/** 
	 * 活动单用户限次
	 */
	@ApiField("count_limit_per_user")
	private Long countLimitPerUser;

	/** 
	 * 活动单用户单日限次
	 */
	@ApiField("count_limit_per_user_per_day")
	private Long countLimitPerUserPerDay;

	/** 
	 * 人群规则
DEFAULT：全部用户
ONLINE_NEWCOMER：在线购买新人
MEMBER：会员
	 */
	@ApiField("crowd")
	private String crowd;

	/** 
	 * 代金券面额
	 */
	@ApiField("deduct_amount")
	private String deductAmount;

	/** 
	 * 外部Id
	 */
	@ApiField("external_unique_id")
	private String externalUniqueId;

	/** 
	 * 活动结束时间
格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/** 
	 * 活动开始时间，格式为:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_start")
	private String gmtStart;

	/** 
	 * 商品列表
	 */
	@ApiListField("item_ids")
	@ApiField("string")
	private List<String> itemIds;

	/** 
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * 使用门槛，满X元可用，使用门槛必须大于券面额
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
     * Sets activity id.
     *
     * @param activityId the activity id
     */
    public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

    /**
     * Gets activity id.
     *
     * @return the activity id
     */
    public String getActivityId( ) {
		return this.activityId;
	}

    /**
     * Sets camp id.
     *
     * @param campId the camp id
     */
    public void setCampId(String campId) {
		this.campId = campId;
	}

    /**
     * Gets camp id.
     *
     * @return the camp id
     */
    public String getCampId( ) {
		return this.campId;
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
     * Gets count limit.
     *
     * @return the count limit
     */
    public Long getCountLimit( ) {
		return this.countLimit;
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
     * Gets count limit per day.
     *
     * @return the count limit per day
     */
    public Long getCountLimitPerDay( ) {
		return this.countLimitPerDay;
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
     * Gets count limit per user.
     *
     * @return the count limit per user
     */
    public Long getCountLimitPerUser( ) {
		return this.countLimitPerUser;
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
     * Gets count limit per user per day.
     *
     * @return the count limit per user per day
     */
    public Long getCountLimitPerUserPerDay( ) {
		return this.countLimitPerUserPerDay;
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
     * Gets crowd.
     *
     * @return the crowd
     */
    public String getCrowd( ) {
		return this.crowd;
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
     * Gets deduct amount.
     *
     * @return the deduct amount
     */
    public String getDeductAmount( ) {
		return this.deductAmount;
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
     * Gets external unique id.
     *
     * @return the external unique id
     */
    public String getExternalUniqueId( ) {
		return this.externalUniqueId;
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
     * Gets gmt end.
     *
     * @return the gmt end
     */
    public Date getGmtEnd( ) {
		return this.gmtEnd;
	}

    /**
     * Sets gmt start.
     *
     * @param gmtStart the gmt start
     */
    public void setGmtStart(String gmtStart) {
		this.gmtStart = gmtStart;
	}

    /**
     * Gets gmt start.
     *
     * @return the gmt start
     */
    public String getGmtStart( ) {
		return this.gmtStart;
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
     * Gets item ids.
     *
     * @return the item ids
     */
    public List<String> getItemIds( ) {
		return this.itemIds;
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
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo( ) {
		return this.memo;
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
     * Gets min cost.
     *
     * @return the min cost
     */
    public String getMinCost( ) {
		return this.minCost;
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
     * Gets obtain manually.
     *
     * @return the obtain manually
     */
    public Boolean getObtainManually( ) {
		return this.obtainManually;
	}

    /**
     * Sets voucher info.
     *
     * @param voucherInfo the voucher info
     */
    public void setVoucherInfo(MerchantActivityVoucherInfo voucherInfo) {
		this.voucherInfo = voucherInfo;
	}

    /**
     * Gets voucher info.
     *
     * @return the voucher info
     */
    public MerchantActivityVoucherInfo getVoucherInfo( ) {
		return this.voucherInfo;
	}

}
