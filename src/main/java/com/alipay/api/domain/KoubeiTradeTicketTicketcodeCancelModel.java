package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑凭证码撤销核销
 *
 * @author auto create
 * @since 1.0, 2018-05-21 11:32:59
 */
public class KoubeiTradeTicketTicketcodeCancelModel extends AlipayObject {

	private static final long serialVersionUID = 2888717681486537467L;

	/**
	 * 凭证码类型,INTERNAL_CODE(内部凭证码),EXTERNAL_CODE(外部凭证码),默认INTERNAL_CODE,外部券场景必填
	 */
	@ApiField("code_type")
	private String codeType;

	/**
	 * 口碑订单号，使用外部凭证码取消时必填
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 冲正份数，次卡业务必填，用于校验正反向份数相同
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 业务请求号,一般为正向核销时使用的外部请求号
	 */
	@ApiField("request_biz_no")
	private String requestBizNo;

	/**
	 * 核销的外部请求号，指定撤销某一次的核销动作
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * request_id对应核销的凭证码
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
     * Gets quantity.
     *
     * @return the quantity
     */
    public String getQuantity() {
		return this.quantity;
	}

    /**
     * Sets quantity.
     *
     * @param quantity the quantity
     */
    public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

    /**
     * Gets request biz no.
     *
     * @return the request biz no
     */
    public String getRequestBizNo() {
		return this.requestBizNo;
	}

    /**
     * Sets request biz no.
     *
     * @param requestBizNo the request biz no
     */
    public void setRequestBizNo(String requestBizNo) {
		this.requestBizNo = requestBizNo;
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
