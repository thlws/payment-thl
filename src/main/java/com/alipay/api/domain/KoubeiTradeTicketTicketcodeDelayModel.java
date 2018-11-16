package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑凭证延期接口
 *
 * @author auto create
 * @since 1.0, 2018-05-21 11:33:21
 */
public class KoubeiTradeTicketTicketcodeDelayModel extends AlipayObject {

	private static final long serialVersionUID = 8637488984111254966L;

	/**
	 * 凭证码类型,INTERNAL_CODE(内部凭证码),EXTERNAL_CODE(外部凭证码),默认INTERNAL_CODE,外部券场景必填
	 */
	@ApiField("code_type")
	private String codeType;

	/**
	 * 延至日期
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 口碑订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 请求id，唯一标识一次请求
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 凭证码
	 */
	@ApiField("ticket_code")
	private String ticketCode;

    /**
     * Gets code type.
     *
     * @return the code type
     */
    public String getCodeType() {
		return this.codeType;
	}

    /**
     * Sets code type.
     *
     * @param codeType the code type
     */
    public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

    /**
     * Gets end date.
     *
     * @return the end date
     */
    public Date getEndDate() {
		return this.endDate;
	}

    /**
     * Sets end date.
     *
     * @param endDate the end date
     */
    public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

    /**
     * Gets order no.
     *
     * @return the order no
     */
    public String getOrderNo() {
		return this.orderNo;
	}

    /**
     * Sets order no.
     *
     * @param orderNo the order no
     */
    public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

    /**
     * Gets request id.
     *
     * @return the request id
     */
    public String getRequestId() {
		return this.requestId;
	}

    /**
     * Sets request id.
     *
     * @param requestId the request id
     */
    public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

    /**
     * Gets ticket code.
     *
     * @return the ticket code
     */
    public String getTicketCode() {
		return this.ticketCode;
	}

    /**
     * Sets ticket code.
     *
     * @param ticketCode the ticket code
     */
    public void setTicketCode(String ticketCode) {
		this.ticketCode = ticketCode;
	}

}
