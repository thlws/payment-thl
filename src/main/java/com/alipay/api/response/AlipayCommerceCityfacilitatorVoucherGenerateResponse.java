package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.voucher.generate response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayCommerceCityfacilitatorVoucherGenerateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8289679642841187425L;

	/** 
	 * 核销码过期时间
	 */
	@ApiField("expired_date")
	private String expiredDate;

	/** 
	 * 地铁购票二维码编码，可自定义
	 */
	@ApiField("qr_code_no")
	private String qrCodeNo;

	/** 
	 * 地铁购票的核销码
	 */
	@ApiField("ticket_no")
	private String ticketNo;

    /**
     * Sets expired date.
     *
     * @param expiredDate the expired date
     */
    public void setExpiredDate(String expiredDate) {
		this.expiredDate = expiredDate;
	}

    /**
     * Gets expired date.
     *
     * @return the expired date
     */
    public String getExpiredDate( ) {
		return this.expiredDate;
	}

    /**
     * Sets qr code no.
     *
     * @param qrCodeNo the qr code no
     */
    public void setQrCodeNo(String qrCodeNo) {
		this.qrCodeNo = qrCodeNo;
	}

    /**
     * Gets qr code no.
     *
     * @return the qr code no
     */
    public String getQrCodeNo( ) {
		return this.qrCodeNo;
	}

    /**
     * Sets ticket no.
     *
     * @param ticketNo the ticket no
     */
    public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}

    /**
     * Gets ticket no.
     *
     * @return the ticket no
     */
    public String getTicketNo( ) {
		return this.ticketNo;
	}

}
