package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MerchantCard;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.open response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayMarketingCardOpenResponse extends AlipayResponse {

	private static final long serialVersionUID = 8552526631212717569L;

	/** 
	 * 商户卡信息（包括支付宝分配的业务卡号）
	 */
	@ApiField("card_info")
	private MerchantCard cardInfo;

	/** 
	 * 实际记录的领卡渠道（可能跟商户传入值不同）；
可直接标识领卡渠道，也可配合open_card_channel_id标识领卡渠道类型：
例如：
线下门店领取:20161534000000000008863（直接标识领卡渠道，门店shopId）
线下扫二维码领取:QR（标识领卡类型）;
线下活动领取:20170522000000000003609（直接标识领卡渠道，商户活动ID）
	 */
	@ApiField("open_card_channel")
	private String openCardChannel;

	/** 
	 * 实际记录的领卡来源渠道id（可能跟商户传入值不同）；
区别于open_card_channel领卡渠道；
一般使用场景：
open_card_channel用于区分渠道类型，例如取值为"SHOP"（门店），"ACTIVITY"（活动）；
则open_card_channel_id可用于区分同渠道的不同实体，对应取各门店ID或各活动的标识ID等；
	 */
	@ApiField("open_card_channel_id")
	private String openCardChannelId;

    /**
     * Sets card info.
     *
     * @param cardInfo the card info
     */
    public void setCardInfo(MerchantCard cardInfo) {
		this.cardInfo = cardInfo;
	}

    /**
     * Gets card info.
     *
     * @return the card info
     */
    public MerchantCard getCardInfo( ) {
		return this.cardInfo;
	}

    /**
     * Sets open card channel.
     *
     * @param openCardChannel the open card channel
     */
    public void setOpenCardChannel(String openCardChannel) {
		this.openCardChannel = openCardChannel;
	}

    /**
     * Gets open card channel.
     *
     * @return the open card channel
     */
    public String getOpenCardChannel( ) {
		return this.openCardChannel;
	}

    /**
     * Sets open card channel id.
     *
     * @param openCardChannelId the open card channel id
     */
    public void setOpenCardChannelId(String openCardChannelId) {
		this.openCardChannelId = openCardChannelId;
	}

    /**
     * Gets open card channel id.
     *
     * @return the open card channel id
     */
    public String getOpenCardChannelId( ) {
		return this.openCardChannelId;
	}

}
