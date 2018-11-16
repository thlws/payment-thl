package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询芝麻信用等级
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:48:31
 */
public class AlipayEcoRenthouseRenterZhimaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7556317411526948527L;

	/**
	 * 身份证号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 用户姓名
	 */
	@ApiField("user_name")
	private String userName;

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
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName() {
		return this.userName;
	}

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {
		this.userName = userName;
	}

}
