package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TicketTransInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.ticket.ticketcode.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-30 20:01:01
 */
public class KoubeiTradeTicketTicketcodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3246419833418697452L;

	/** 
	 * 次卡场景，可用核销份数。仅当次卡场景有值
	 */
	@ApiField("available_quantity")
	private String availableQuantity;

	/** 
	 * 用户购买时商品的现价
	 */
	@ApiField("current_price")
	private String currentPrice;

	/** 
	 * 券生效时间
	 */
	@ApiField("effect_date")
	private String effectDate;

	/** 
	 * 券失效时间
	 */
	@ApiField("expire_date")
	private String expireDate;

	/** 
	 * 口碑商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/** 
	 * 凭证对应的订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 用户购买时商品的原价
	 */
	@ApiField("original_price")
	private String originalPrice;

	/** 
	 * 12位的券码，券码为纯数字，且唯一不重复
	 */
	@ApiField("ticket_code")
	private String ticketCode;

	/** 
	 * 券状态
1.  USED:该券已经被消费,无法核销
2.  EFFECTIVE:未核销，且可以在当前门店核销
3.  UN_EFFECTIVE:未核销，但不可以在当前门店核销
4.  REFUNDED:该券已经退款,无法核销
5.  USING:核销处理中,无法核销
6.  REFUNDING:退款处理中,无法核销
	 */
	@ApiField("ticket_status")
	private String ticketStatus;

	/** 
	 * 券状态描述
1.  该券已经被消费，无法核销
2.  未核销，且可以在当前门店核销
3.  未核销，但不可以在当前门店核销
4.  该券已经退款，无法核销
5.  该券正在核销处理中,无法核销
6.  该券正在退款处理中,无法核销
	 */
	@ApiField("ticket_status_desc")
	private String ticketStatusDesc;

	/** 
	 * 凭证的流水记录
	 */
	@ApiListField("ticket_trans_info_list")
	@ApiField("ticket_trans_info")
	private List<TicketTransInfo> ticketTransInfoList;

	/** 
	 * 是否次卡。是次卡场景值为true，反之为false
	 */
	@ApiField("time_cards")
	private String timeCards;

	/** 
	 * 券码对应的凭证资产id
	 */
	@ApiField("voucher_id")
	private String voucherId;

    /**
     * Sets available quantity.
     *
     * @param availableQuantity the available quantity
     */
    public void setAvailableQuantity(String availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

    /**
     * Gets available quantity.
     *
     * @return the available quantity
     */
    public String getAvailableQuantity( ) {
		return this.availableQuantity;
	}

    /**
     * Sets current price.
     *
     * @param currentPrice the current price
     */
    public void setCurrentPrice(String currentPrice) {
		this.currentPrice = currentPrice;
	}

    /**
     * Gets current price.
     *
     * @return the current price
     */
    public String getCurrentPrice( ) {
		return this.currentPrice;
	}

    /**
     * Sets effect date.
     *
     * @param effectDate the effect date
     */
    public void setEffectDate(String effectDate) {
		this.effectDate = effectDate;
	}

    /**
     * Gets effect date.
     *
     * @return the effect date
     */
    public String getEffectDate( ) {
		return this.effectDate;
	}

    /**
     * Sets expire date.
     *
     * @param expireDate the expire date
     */
    public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

    /**
     * Gets expire date.
     *
     * @return the expire date
     */
    public String getExpireDate( ) {
		return this.expireDate;
	}

    /**
     * Sets item id.
     *
     * @param itemId the item id
     */
    public void setItemId(String itemId) {
		this.itemId = itemId;
	}

    /**
     * Gets item id.
     *
     * @return the item id
     */
    public String getItemId( ) {
		return this.itemId;
	}

    /**
     * Sets item name.
     *
     * @param itemName the item name
     */
    public void setItemName(String itemName) {
		this.itemName = itemName;
	}

    /**
     * Gets item name.
     *
     * @return the item name
     */
    public String getItemName( ) {
		return this.itemName;
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
     * Gets order no.
     *
     * @return the order no
     */
    public String getOrderNo( ) {
		return this.orderNo;
	}

    /**
     * Sets original price.
     *
     * @param originalPrice the original price
     */
    public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

    /**
     * Gets original price.
     *
     * @return the original price
     */
    public String getOriginalPrice( ) {
		return this.originalPrice;
	}

    /**
     * Sets ticket code.
     *
     * @param ticketCode the ticket code
     */
    public void setTicketCode(String ticketCode) {
		this.ticketCode = ticketCode;
	}

    /**
     * Gets ticket code.
     *
     * @return the ticket code
     */
    public String getTicketCode( ) {
		return this.ticketCode;
	}

    /**
     * Sets ticket status.
     *
     * @param ticketStatus the ticket status
     */
    public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

    /**
     * Gets ticket status.
     *
     * @return the ticket status
     */
    public String getTicketStatus( ) {
		return this.ticketStatus;
	}

    /**
     * Sets ticket status desc.
     *
     * @param ticketStatusDesc the ticket status desc
     */
    public void setTicketStatusDesc(String ticketStatusDesc) {
		this.ticketStatusDesc = ticketStatusDesc;
	}

    /**
     * Gets ticket status desc.
     *
     * @return the ticket status desc
     */
    public String getTicketStatusDesc( ) {
		return this.ticketStatusDesc;
	}

    /**
     * Sets ticket trans info list.
     *
     * @param ticketTransInfoList the ticket trans info list
     */
    public void setTicketTransInfoList(List<TicketTransInfo> ticketTransInfoList) {
		this.ticketTransInfoList = ticketTransInfoList;
	}

    /**
     * Gets ticket trans info list.
     *
     * @return the ticket trans info list
     */
    public List<TicketTransInfo> getTicketTransInfoList( ) {
		return this.ticketTransInfoList;
	}

    /**
     * Sets time cards.
     *
     * @param timeCards the time cards
     */
    public void setTimeCards(String timeCards) {
		this.timeCards = timeCards;
	}

    /**
     * Gets time cards.
     *
     * @return the time cards
     */
    public String getTimeCards( ) {
		return this.timeCards;
	}

    /**
     * Sets voucher id.
     *
     * @param voucherId the voucher id
     */
    public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

    /**
     * Gets voucher id.
     *
     * @return the voucher id
     */
    public String getVoucherId( ) {
		return this.voucherId;
	}

}
