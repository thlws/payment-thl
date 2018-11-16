package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbAdvertChannelResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.commission.channel.create response.
 *
 * @author auto create
 * @since 1.0, 2017-03-03 10:40:48
 */
public class KoubeiAdvertCommissionChannelCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5898666971127793713L;

	/** 
	 * 新增渠道接口，需要记录渠道ID
	 */
	@ApiListField("channel_response")
	@ApiField("kb_advert_channel_response")
	private List<KbAdvertChannelResponse> channelResponse;

    /**
     * Sets channel response.
     *
     * @param channelResponse the channel response
     */
    public void setChannelResponse(List<KbAdvertChannelResponse> channelResponse) {
		this.channelResponse = channelResponse;
	}

    /**
     * Gets channel response.
     *
     * @return the channel response
     */
    public List<KbAdvertChannelResponse> getChannelResponse( ) {
		return this.channelResponse;
	}

}
