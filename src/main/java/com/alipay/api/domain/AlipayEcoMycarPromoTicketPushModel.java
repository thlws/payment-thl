package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车主营销平台券核销结果通知
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:29:58
 */
public class AlipayEcoMycarPromoTicketPushModel extends AlipayObject {

	private static final long serialVersionUID = 2115723569816158253L;

	/**
	 * 核销流水
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 核销状态，0：成功，1：失败
	 */
	@ApiField("apply_status")
	private String applyStatus;

	/**
	 * 对应TP活动码
	 */
	@ApiField("code_no")
	private String codeNo;

	/**
	 * 券ID
	 */
	@ApiField("ticket_id")
	private String ticketId;

    /**
     * Gets apply no.
     *
     * @return the apply no
     */
    public String getApplyNo() {
		return this.applyNo;
	}

    /**
     * Sets apply no.
     *
     * @param applyNo the apply no
     */
    public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

    /**
     * Gets apply status.
     *
     * @return the apply status
     */
    public String getApplyStatus() {
		return this.applyStatus;
	}

    /**
     * Sets apply status.
     *
     * @param applyStatus the apply status
     */
    public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
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
     * Gets ticket id.
     *
     * @return the ticket id
     */
    public String getTicketId() {
		return this.ticketId;
	}

    /**
     * Sets ticket id.
     *
     * @param ticketId the ticket id
     */
    public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

}
