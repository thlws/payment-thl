package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemOrderVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.itemorder.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-19 23:35:00
 */
public class KoubeiTradeItemorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4753362127396345468L;

	/** 
	 * 业务产品
	 */
	@ApiField("biz_product")
	private String bizProduct;

	/** 
	 * 买家支付宝账户
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/** 
	 * 卖家实收金额，单笔订单中给打款给卖家的金额
	 */
	@ApiField("deliver_seller_real_amount")
	private String deliverSellerRealAmount;

	/** 
	 * 优惠金额
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/** 
	 * 订单创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 订单修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/** 
	 * 支付成功时间
	 */
	@ApiField("gmt_payment")
	private Date gmtPayment;

	/** 
	 * 商品信息
	 */
	@ApiListField("item_order_vo")
	@ApiField("item_order_v_o")
	private List<ItemOrderVO> itemOrderVo;

	/** 
	 * 口碑订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 商户订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 商户签约支付宝账号
	 */
	@ApiField("partner_id")
	private String partnerId;

	/** 
	 * 用户实付金额
	 */
	@ApiField("real_pay_amount")
	private String realPayAmount;

	/** 
	 * 卖家id
	 */
	@ApiField("seller_id")
	private String sellerId;

	/** 
	 * 订单状态, INIT（初始状态）,WAIT_PAY (待支付)，PAID（已支付），SUCCESS（订单成功-已打款给商户），FINISH（订单完成-全额退款）
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 订单金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

    /**
     * Sets biz product.
     *
     * @param bizProduct the biz product
     */
    public void setBizProduct(String bizProduct) {
		this.bizProduct = bizProduct;
	}

    /**
     * Gets biz product.
     *
     * @return the biz product
     */
    public String getBizProduct( ) {
		return this.bizProduct;
	}

    /**
     * Sets buyer id.
     *
     * @param buyerId the buyer id
     */
    public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

    /**
     * Gets buyer id.
     *
     * @return the buyer id
     */
    public String getBuyerId( ) {
		return this.buyerId;
	}

    /**
     * Sets deliver seller real amount.
     *
     * @param deliverSellerRealAmount the deliver seller real amount
     */
    public void setDeliverSellerRealAmount(String deliverSellerRealAmount) {
		this.deliverSellerRealAmount = deliverSellerRealAmount;
	}

    /**
     * Gets deliver seller real amount.
     *
     * @return the deliver seller real amount
     */
    public String getDeliverSellerRealAmount( ) {
		return this.deliverSellerRealAmount;
	}

    /**
     * Sets discount amount.
     *
     * @param discountAmount the discount amount
     */
    public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

    /**
     * Gets discount amount.
     *
     * @return the discount amount
     */
    public String getDiscountAmount( ) {
		return this.discountAmount;
	}

    /**
     * Sets gmt create.
     *
     * @param gmtCreate the gmt create
     */
    public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

    /**
     * Gets gmt create.
     *
     * @return the gmt create
     */
    public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

    /**
     * Sets gmt modified.
     *
     * @param gmtModified the gmt modified
     */
    public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

    /**
     * Gets gmt modified.
     *
     * @return the gmt modified
     */
    public Date getGmtModified( ) {
		return this.gmtModified;
	}

    /**
     * Sets gmt payment.
     *
     * @param gmtPayment the gmt payment
     */
    public void setGmtPayment(Date gmtPayment) {
		this.gmtPayment = gmtPayment;
	}

    /**
     * Gets gmt payment.
     *
     * @return the gmt payment
     */
    public Date getGmtPayment( ) {
		return this.gmtPayment;
	}

    /**
     * Sets item order vo.
     *
     * @param itemOrderVo the item order vo
     */
    public void setItemOrderVo(List<ItemOrderVO> itemOrderVo) {
		this.itemOrderVo = itemOrderVo;
	}

    /**
     * Gets item order vo.
     *
     * @return the item order vo
     */
    public List<ItemOrderVO> getItemOrderVo( ) {
		return this.itemOrderVo;
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
     * Sets out order no.
     *
     * @param outOrderNo the out order no
     */
    public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

    /**
     * Gets out order no.
     *
     * @return the out order no
     */
    public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

    /**
     * Sets partner id.
     *
     * @param partnerId the partner id
     */
    public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

    /**
     * Gets partner id.
     *
     * @return the partner id
     */
    public String getPartnerId( ) {
		return this.partnerId;
	}

    /**
     * Sets real pay amount.
     *
     * @param realPayAmount the real pay amount
     */
    public void setRealPayAmount(String realPayAmount) {
		this.realPayAmount = realPayAmount;
	}

    /**
     * Gets real pay amount.
     *
     * @return the real pay amount
     */
    public String getRealPayAmount( ) {
		return this.realPayAmount;
	}

    /**
     * Sets seller id.
     *
     * @param sellerId the seller id
     */
    public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

    /**
     * Gets seller id.
     *
     * @return the seller id
     */
    public String getSellerId( ) {
		return this.sellerId;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus( ) {
		return this.status;
	}

    /**
     * Sets total amount.
     *
     * @param totalAmount the total amount
     */
    public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

    /**
     * Gets total amount.
     *
     * @return the total amount
     */
    public String getTotalAmount( ) {
		return this.totalAmount;
	}

    /**
     * Sets trade no.
     *
     * @param tradeNo the trade no
     */
    public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

    /**
     * Gets trade no.
     *
     * @return the trade no
     */
    public String getTradeNo( ) {
		return this.tradeNo;
	}

}
