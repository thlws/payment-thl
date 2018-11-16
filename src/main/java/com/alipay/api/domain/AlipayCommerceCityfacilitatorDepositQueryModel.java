package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户查询用户的充值转账记录
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:20
 */
public class AlipayCommerceCityfacilitatorDepositQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8478323789929311373L;

	/**
	 * 交通卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 和渠道定义的卡类型，一个城市支持一种卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * transfer：待圈存 success：圈存成功 fail：圈存失败
	 */
	@ApiField("status")
	private String status;

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
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

}
