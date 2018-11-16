package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑凭证码查询
 *
 * @author auto create
 * @since 1.0, 2018-08-30 20:01:01
 */
public class KoubeiTradeTicketTicketcodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7324189217149573982L;

	/**
	 * 口碑门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 12位的券码，券码为纯数字，且唯一不重复
	 */
	@ApiField("ticket_code")
	private String ticketCode;

    /**
     * Gets shop id.
     *
     * @return the shop id
     */
    public String getShopId() {
		return this.shopId;
	}

    /**
     * Sets shop id.
     *
     * @param shopId the shop id
     */
    public void setShopId(String shopId) {
		this.shopId = shopId;
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
