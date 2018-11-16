package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑客渠道删除接口
 *
 * @author auto create
 * @since 1.0, 2017-03-03 10:41:04
 */
public class KoubeiAdvertCommissionChannelDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2233636996965659689L;

	/**
	 * 需要删除的渠道ID列表
	 */
	@ApiListField("channel_ids")
	@ApiField("string")
	private List<String> channelIds;

    /**
     * Gets channel ids.
     *
     * @return the channel ids
     */
    public List<String> getChannelIds() {
		return this.channelIds;
	}

    /**
     * Sets channel ids.
     *
     * @param channelIds the channel ids
     */
    public void setChannelIds(List<String> channelIds) {
		this.channelIds = channelIds;
	}

}
