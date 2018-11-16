package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 渠道新增接口
 *
 * @author auto create
 * @since 1.0, 2017-03-03 10:40:48
 */
public class KoubeiAdvertCommissionChannelCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3146466866764264752L;

	/**
	 * 新增渠道列表
	 */
	@ApiListField("channels")
	@ApiField("kb_advert_add_channel_request")
	private List<KbAdvertAddChannelRequest> channels;

    /**
     * Gets channels.
     *
     * @return the channels
     */
    public List<KbAdvertAddChannelRequest> getChannels() {
		return this.channels;
	}

    /**
     * Sets channels.
     *
     * @param channels the channels
     */
    public void setChannels(List<KbAdvertAddChannelRequest> channels) {
		this.channels = channels;
	}

}
