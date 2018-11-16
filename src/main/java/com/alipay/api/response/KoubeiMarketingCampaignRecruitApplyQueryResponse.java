package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecruitItemApplyData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.recruit.apply.query response.
 *
 * @author auto create
 * @since 1.0, 2017-02-20 13:50:48
 */
public class KoubeiMarketingCampaignRecruitApplyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3216168213468595926L;

	/** 
	 * 活动开始购买时间
	 */
	@ApiField("bought_time")
	private Date boughtTime;

	/** 
	 * 活动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/** 
	 * 招商报名数据总数
	 */
	@ApiField("item_count")
	private String itemCount;

	/** 
	 * 招商报名数据
	 */
	@ApiListField("item_info")
	@ApiField("recruit_item_apply_data")
	private List<RecruitItemApplyData> itemInfo;

	/** 
	 * 活动名称
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 预热开始时间 2016-12-12 10:10:10
	 */
	@ApiField("prehot_time")
	private Date prehotTime;

    /**
     * Sets bought time.
     *
     * @param boughtTime the bought time
     */
    public void setBoughtTime(Date boughtTime) {
		this.boughtTime = boughtTime;
	}

    /**
     * Gets bought time.
     *
     * @return the bought time
     */
    public Date getBoughtTime( ) {
		return this.boughtTime;
	}

    /**
     * Sets end time.
     *
     * @param endTime the end time
     */
    public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

    /**
     * Gets end time.
     *
     * @return the end time
     */
    public Date getEndTime( ) {
		return this.endTime;
	}

    /**
     * Sets item count.
     *
     * @param itemCount the item count
     */
    public void setItemCount(String itemCount) {
		this.itemCount = itemCount;
	}

    /**
     * Gets item count.
     *
     * @return the item count
     */
    public String getItemCount( ) {
		return this.itemCount;
	}

    /**
     * Sets item info.
     *
     * @param itemInfo the item info
     */
    public void setItemInfo(List<RecruitItemApplyData> itemInfo) {
		this.itemInfo = itemInfo;
	}

    /**
     * Gets item info.
     *
     * @return the item info
     */
    public List<RecruitItemApplyData> getItemInfo( ) {
		return this.itemInfo;
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
     * Gets name.
     *
     * @return the name
     */
    public String getName( ) {
		return this.name;
	}

    /**
     * Sets prehot time.
     *
     * @param prehotTime the prehot time
     */
    public void setPrehotTime(Date prehotTime) {
		this.prehotTime = prehotTime;
	}

    /**
     * Gets prehot time.
     *
     * @return the prehot time
     */
    public Date getPrehotTime( ) {
		return this.prehotTime;
	}

}
