package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡查询
 *
 * @author auto create
 * @since 1.0, 2018-01-31 17:43:09
 */
public class AlipayMarketingCardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8412474847282741679L;

	/**
	 * 用户信息 填写则作为附加条件查询
	 */
	@ApiField("card_user_info")
	private CardUserInfo cardUserInfo;

	/**
	 * 扩展信息，暂时没有
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 操作卡号。
target_card_no为业务卡号，由开卡流程中，支付宝返回的业务卡号
	 */
	@ApiField("target_card_no")
	private String targetCardNo;

	/**
	 * 卡号ID类型（会员卡查询，只能提供支付宝端的卡号）
BIZ_CARD：支付宝卡号
D_QR_CODE：动态二维码（业务卡号对应的）
D_BAR_CODE：动态条码（业务卡号对应的）
如果卡号不空，则类型不能为空
	 */
	@ApiField("target_card_no_type")
	private String targetCardNoType;

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
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets target card no.
     *
     * @return the target card no
     */
    public String getTargetCardNo() {
		return this.targetCardNo;
	}

    /**
     * Sets target card no.
     *
     * @param targetCardNo the target card no
     */
    public void setTargetCardNo(String targetCardNo) {
		this.targetCardNo = targetCardNo;
	}

    /**
     * Gets target card no type.
     *
     * @return the target card no type
     */
    public String getTargetCardNoType() {
		return this.targetCardNoType;
	}

    /**
     * Sets target card no type.
     *
     * @param targetCardNoType the target card no type
     */
    public void setTargetCardNoType(String targetCardNoType) {
		this.targetCardNoType = targetCardNoType;
	}

}
