package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑客商品渠道推广汇总数据
 *
 * @author auto create
 * @since 1.0, 2017-02-16 20:40:20
 */
public class PromoteDetailChannelModel extends AlipayObject {

	private static final long serialVersionUID = 4563758333457388295L;

	/**
	 * 渠道id
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 渠道名称
	 */
	@ApiField("channel_name")
	private String channelName;

	/**
	 * 查询时间段内的推广数据
	 */
	@ApiField("part_promote_data")
	private PromoteDataModel partPromoteData;

	/**
	 * 总推广数据
	 */
	@ApiField("total_promote_data")
	private PromoteDataModel totalPromoteData;

    /**
     * Gets channel id.
     *
     * @return the channel id
     */
    public String getChannelId() {
		return this.channelId;
	}

    /**
     * Sets channel id.
     *
     * @param channelId the channel id
     */
    public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

    /**
     * Gets channel name.
     *
     * @return the channel name
     */
    public String getChannelName() {
		return this.channelName;
	}

    /**
     * Sets channel name.
     *
     * @param channelName the channel name
     */
    public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

    /**
     * Gets part promote data.
     *
     * @return the part promote data
     */
    public PromoteDataModel getPartPromoteData() {
		return this.partPromoteData;
	}

    /**
     * Sets part promote data.
     *
     * @param partPromoteData the part promote data
     */
    public void setPartPromoteData(PromoteDataModel partPromoteData) {
		this.partPromoteData = partPromoteData;
	}

    /**
     * Gets total promote data.
     *
     * @return the total promote data
     */
    public PromoteDataModel getTotalPromoteData() {
		return this.totalPromoteData;
	}

    /**
     * Sets total promote data.
     *
     * @param totalPromoteData the total promote data
     */
    public void setTotalPromoteData(PromoteDataModel totalPromoteData) {
		this.totalPromoteData = totalPromoteData;
	}

}
