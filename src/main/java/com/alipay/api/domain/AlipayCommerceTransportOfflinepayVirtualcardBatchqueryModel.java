package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 虚拟卡信息查询
 *
 * @author auto create
 * @since 1.0, 2018-04-13 11:00:57
 */
public class AlipayCommerceTransportOfflinepayVirtualcardBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8387858722189235141L;

	/**
	 * 卡号。和卡类型一起，唯一确定一张卡。为空时将返回该用户该卡类型下的所有卡。
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 卡类型。每种虚拟卡都有对应的卡类型，该值由支付宝分配给商户。
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets card no.
     *
     * @return the card no
     */
    public String getCardNo() {
		return this.cardNo;
	}

    /**
     * Sets card no.
     *
     * @param cardNo the card no
     */
    public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

    /**
     * Gets card type.
     *
     * @return the card type
     */
    public String getCardType() {
		return this.cardType;
	}

    /**
     * Sets card type.
     *
     * @param cardType the card type
     */
    public void setCardType(String cardType) {
		this.cardType = cardType;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
