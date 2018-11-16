package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券的集合信息
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:29:40
 */
public class CodeNOList extends AlipayObject {

	private static final long serialVersionUID = 2642368935873273484L;

	/**
	 * 金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 对应TP活动码
	 */
	@ApiField("code_no")
	private String codeNo;

	/**
	 * 如果ticket_type为油券，则该字段1:石化，2:石油
	 */
	@ApiField("sub_type")
	private String subType;

	/**
	 * 券类型,1:油券
	 */
	@ApiField("ticket_type")
	private String ticketType;

	/**
	 * 有效期
	 */
	@ApiField("valid_date")
	private String validDate;

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public String getAmount() {
		return this.amount;
	}

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(String amount) {
		this.amount = amount;
	}

    /**
     * Gets code no.
     *
     * @return the code no
     */
    public String getCodeNo() {
		return this.codeNo;
	}

    /**
     * Sets code no.
     *
     * @param codeNo the code no
     */
    public void setCodeNo(String codeNo) {
		this.codeNo = codeNo;
	}

    /**
     * Gets sub type.
     *
     * @return the sub type
     */
    public String getSubType() {
		return this.subType;
	}

    /**
     * Sets sub type.
     *
     * @param subType the sub type
     */
    public void setSubType(String subType) {
		this.subType = subType;
	}

    /**
     * Gets ticket type.
     *
     * @return the ticket type
     */
    public String getTicketType() {
		return this.ticketType;
	}

    /**
     * Sets ticket type.
     *
     * @param ticketType the ticket type
     */
    public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

    /**
     * Gets valid date.
     *
     * @return the valid date
     */
    public String getValidDate() {
		return this.validDate;
	}

    /**
     * Sets valid date.
     *
     * @param validDate the valid date
     */
    public void setValidDate(String validDate) {
		this.validDate = validDate;
	}

}
