package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 包含两个String成员变量
 * String cardNo; //获取前6后2
 * String instId; //如ICBC
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class AlipayUserCreditCard extends AlipayObject {

	private static final long serialVersionUID = 6415383879158755143L;

	/**
	 * 信用卡卡号，显示前6后2
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 开户行代码
	 */
	@ApiField("inst_id")
	private String instId;

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
     * Gets inst id.
     *
     * @return the inst id
     */
    public String getInstId() {
		return this.instId;
	}

    /**
     * Sets inst id.
     *
     * @param instId the inst id
     */
    public void setInstId(String instId) {
		this.instId = instId;
	}

}
