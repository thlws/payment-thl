package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡开卡接口
 *
 * @author auto create
 * @since 1.0, 2017-09-04 19:47:19
 */
public class AlipayMarketingCardOpenModel extends AlipayObject {

	private static final long serialVersionUID = 3615795318924733716L;

	/**
	 * 外部卡信息(biz_card_no无需填写)
	 */
	@ApiField("card_ext_info")
	private MerchantCard cardExtInfo;

	/**
	 * 支付宝分配的卡模板Id（卡模板创建接口返回的模板ID）
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/**
	 * 发卡用户信息
	 */
	@ApiField("card_user_info")
	private CardUserInfo cardUserInfo;

	/**
	 * 商户会员信息
	 */
	@ApiField("member_ext_info")
	private MerchantMenber memberExtInfo;

	/**
	 * 领卡渠道，用于记录外部商户端领卡来源的渠道信息，渠道值可自行定义（仅限数字、字母、下划线） 
可直接标识领卡渠道，也可配合open_card_channel_id标识领卡渠道类型：
例如：
线下门店领取:20161534000000000008863（直接标识领卡渠道，门店shopId）
线下扫二维码领取:QR（标识领卡类型）;
线下活动领取:20170522000000000003609（直接标识领卡渠道，商户活动ID）
	 */
	@ApiField("open_card_channel")
	private String openCardChannel;

	/**
	 * 领卡来源的渠道id，注意区别于open_card_channel领卡渠道；
一般使用场景：
open_card_channel用于区分渠道类型，例如取值为"SHOP"（门店），"ACTIVITY"（活动）；
则open_card_channel_id可用于区分同渠道的不同实体，对应取各门店ID或各活动的标识ID等；
	 */
	@ApiField("open_card_channel_id")
	private String openCardChannelId;

	/**
	 * 外部商户流水号（商户需要确保唯一性控制，类似request_id唯一请求标识）
	 */
	@ApiField("out_serial_no")
	private String outSerialNo;

    /**
     * Gets card ext info.
     *
     * @return the card ext info
     */
    public MerchantCard getCardExtInfo() {
		return this.cardExtInfo;
	}

    /**
     * Sets card ext info.
     *
     * @param cardExtInfo the card ext info
     */
    public void setCardExtInfo(MerchantCard cardExtInfo) {
		this.cardExtInfo = cardExtInfo;
	}

    /**
     * Gets card template id.
     *
     * @return the card template id
     */
    public String getCardTemplateId() {
		return this.cardTemplateId;
	}

    /**
     * Sets card template id.
     *
     * @param cardTemplateId the card template id
     */
    public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}

    /**
     * Gets card user info.
     *
     * @return the card user info
     */
    public CardUserInfo getCardUserInfo() {
		return this.cardUserInfo;
	}

    /**
     * Sets card user info.
     *
     * @param cardUserInfo the card user info
     */
    public void setCardUserInfo(CardUserInfo cardUserInfo) {
		this.cardUserInfo = cardUserInfo;
	}

    /**
     * Gets member ext info.
     *
     * @return the member ext info
     */
    public MerchantMenber getMemberExtInfo() {
		return this.memberExtInfo;
	}

    /**
     * Sets member ext info.
     *
     * @param memberExtInfo the member ext info
     */
    public void setMemberExtInfo(MerchantMenber memberExtInfo) {
		this.memberExtInfo = memberExtInfo;
	}

    /**
     * Gets open card channel.
     *
     * @return the open card channel
     */
    public String getOpenCardChannel() {
		return this.openCardChannel;
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
     * Gets open card channel id.
     *
     * @return the open card channel id
     */
    public String getOpenCardChannelId() {
		return this.openCardChannelId;
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
     * Gets out serial no.
     *
     * @return the out serial no
     */
    public String getOutSerialNo() {
		return this.outSerialNo;
	}

    /**
     * Sets out serial no.
     *
     * @param outSerialNo the out serial no
     */
    public void setOutSerialNo(String outSerialNo) {
		this.outSerialNo = outSerialNo;
	}

}
