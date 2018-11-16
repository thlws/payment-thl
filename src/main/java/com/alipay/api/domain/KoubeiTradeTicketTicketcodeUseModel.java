package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑凭证码核销
 *
 * @author auto create
 * @since 1.0, 2018-08-30 20:00:21
 */
public class KoubeiTradeTicketTicketcodeUseModel extends AlipayObject {

	private static final long serialVersionUID = 8237976384136697482L;

	/**
	 * 凭证码类型,INTERNAL_CODE(内部凭证码),EXTERNAL_CODE(外部凭证码),默认INTERNAL_CODE,外部券场景必填
	 */
	@ApiField("code_type")
	private String codeType;

	/**
	 * 业务发生时间，默认为接口调用时间
	 */
	@ApiField("gmt_biz")
	private Date gmtBiz;

	/**
	 * 口碑订单号，使用外部凭证码核销时必填
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 核销份数，次卡业务必填;非次卡业务不能填写
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 外部请求号，支持英文字母和数字，由开发者自行定义（不允许重复）
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 口碑门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 门店id类型,INTERNAL_SHOP(内部店铺id),EXTERNAL_SHOP(外部店铺id),默认INTERNAL_SHOP
	 */
	@ApiField("shop_type")
	private String shopType;

	/**
	 * 凭证码，包括内部凭证码和外部凭证码，内部凭证码为12位，纯数字，且唯一不重复
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
     * Gets gmt biz.
     *
     * @return the gmt biz
     */
    public Date getGmtBiz() {
		return this.gmtBiz;
	}

    /**
     * Sets gmt biz.
     *
     * @param gmtBiz the gmt biz
     */
    public void setGmtBiz(Date gmtBiz) {
		this.gmtBiz = gmtBiz;
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
     * Gets shop type.
     *
     * @return the shop type
     */
    public String getShopType() {
		return this.shopType;
	}

    /**
     * Sets shop type.
     *
     * @param shopType the shop type
     */
    public void setShopType(String shopType) {
		this.shopType = shopType;
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
