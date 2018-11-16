package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbadvertChannelTypeResponse;
import com.alipay.api.domain.KbadvertCommissionLimit;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.data.conf.query response.
 *
 * @author auto create
 * @since 1.0, 2017-03-03 10:41:20
 */
public class KoubeiAdvertDataConfQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6628146729184483913L;

	/** 
	 * 渠道类型配置
	 */
	@ApiListField("channel_types")
	@ApiField("kbadvert_channel_type_response")
	private List<KbadvertChannelTypeResponse> channelTypes;

	/** 
	 * 分佣配置金额
	 */
	@ApiListField("commission_limits")
	@ApiField("kbadvert_commission_limit")
	private List<KbadvertCommissionLimit> commissionLimits;

    /**
     * Sets channel types.
     *
     * @param channelTypes the channel types
     */
    public void setChannelTypes(List<KbadvertChannelTypeResponse> channelTypes) {
		this.channelTypes = channelTypes;
	}

    /**
     * Gets channel types.
     *
     * @return the channel types
     */
    public List<KbadvertChannelTypeResponse> getChannelTypes( ) {
		return this.channelTypes;
	}

    /**
     * Sets commission limits.
     *
     * @param commissionLimits the commission limits
     */
    public void setCommissionLimits(List<KbadvertCommissionLimit> commissionLimits) {
		this.commissionLimits = commissionLimits;
	}

    /**
     * Gets commission limits.
     *
     * @return the commission limits
     */
    public List<KbadvertCommissionLimit> getCommissionLimits( ) {
		return this.commissionLimits;
	}

}
