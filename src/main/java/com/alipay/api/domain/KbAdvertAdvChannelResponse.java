package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑广告系统广告渠道模型
 *
 * @author auto create
 * @since 1.0, 2017-01-17 10:33:52
 */
public class KbAdvertAdvChannelResponse extends AlipayObject {

	private static final long serialVersionUID = 4648555688573738354L;

	/**
	 * 广告内容模型
	 */
	@ApiListField("adv_content_list")
	@ApiField("kb_advert_adv_content_response")
	private List<KbAdvertAdvContentResponse> advContentList;

	/**
	 * 广告id
	 */
	@ApiField("adv_id")
	private String advId;

	/**
	 * 渠道ID
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 渠道名称
	 */
	@ApiField("channel_name")
	private String channelName;

	/**
	 * 渠道类型
	 */
	@ApiField("channel_type")
	private String channelType;

    /**
     * Gets adv content list.
     *
     * @return the adv content list
     */
    public List<KbAdvertAdvContentResponse> getAdvContentList() {
		return this.advContentList;
	}

    /**
     * Sets adv content list.
     *
     * @param advContentList the adv content list
     */
    public void setAdvContentList(List<KbAdvertAdvContentResponse> advContentList) {
		this.advContentList = advContentList;
	}

    /**
     * Gets adv id.
     *
     * @return the adv id
     */
    public String getAdvId() {
		return this.advId;
	}

    /**
     * Sets adv id.
     *
     * @param advId the adv id
     */
    public void setAdvId(String advId) {
		this.advId = advId;
	}

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
     * Gets channel type.
     *
     * @return the channel type
     */
    public String getChannelType() {
		return this.channelType;
	}

    /**
     * Sets channel type.
     *
     * @param channelType the channel type
     */
    public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

}
