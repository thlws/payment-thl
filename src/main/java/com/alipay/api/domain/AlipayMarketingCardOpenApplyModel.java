package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡开卡（内部无需授权）
 *
 * @author auto create
 * @since 1.0, 2017-06-13 19:07:11
 */
public class AlipayMarketingCardOpenApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7275758667719415664L;

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
