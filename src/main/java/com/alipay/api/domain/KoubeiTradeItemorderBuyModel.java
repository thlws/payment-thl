package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品下单购买
 *
 * @author auto create
 * @since 1.0, 2018-05-07 11:23:55
 */
public class KoubeiTradeItemorderBuyModel extends AlipayObject {

	private static final long serialVersionUID = 7799967942112753952L;

	/**
	 * 业务产品
	 */
	@ApiField("biz_product")
	private String bizProduct;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 买家支付宝ID
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 购买商品信息
	 */
	@ApiListField("item_order_details")
	@ApiField("item_order_detail")
	private List<ItemOrderDetail> itemOrderDetails;

	/**
	 * 商户订单号,64个字符以内、只能包含字母、数字、下划线；需保证在商户端不重复
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 商户传入营销信息，具体值要和口碑约定，格式为json格式
	 */
	@ApiField("promo_params")
	private String promoParams;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 订单标题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 该笔订单允许的最晚付款时间，逾期将关闭交易，取值范围:1m～30m(单位:分钟) 不传默认3m。
	 */
	@ApiField("timeout")
	private String timeout;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，必须等于费用之和
	 */
	@ApiField("total_amount")
	private String totalAmount;

    /**
     * Gets biz product.
     *
     * @return the biz product
     */
    public String getBizProduct() {
		return this.bizProduct;
	}

    /**
     * Sets biz product.
     *
     * @param bizProduct the biz product
     */
    public void setBizProduct(String bizProduct) {
		this.bizProduct = bizProduct;
	}

    /**
     * Gets biz scene.
     *
     * @return the biz scene
     */
    public String getBizScene() {
		return this.bizScene;
	}

    /**
     * Sets biz scene.
     *
     * @param bizScene the biz scene
     */
    public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

    /**
     * Gets buyer id.
     *
     * @return the buyer id
     */
    public String getBuyerId() {
		return this.buyerId;
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
     * Gets item order details.
     *
     * @return the item order details
     */
    public List<ItemOrderDetail> getItemOrderDetails() {
		return this.itemOrderDetails;
	}

    /**
     * Sets item order details.
     *
     * @param itemOrderDetails the item order details
     */
    public void setItemOrderDetails(List<ItemOrderDetail> itemOrderDetails) {
		this.itemOrderDetails = itemOrderDetails;
	}

    /**
     * Gets out order no.
     *
     * @return the out order no
     */
    public String getOutOrderNo() {
		return this.outOrderNo;
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
     * Gets promo params.
     *
     * @return the promo params
     */
    public String getPromoParams() {
		return this.promoParams;
	}

    /**
     * Sets promo params.
     *
     * @param promoParams the promo params
     */
    public void setPromoParams(String promoParams) {
		this.promoParams = promoParams;
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
     * Gets subject.
     *
     * @return the subject
     */
    public String getSubject() {
		return this.subject;
	}

    /**
     * Sets subject.
     *
     * @param subject the subject
     */
    public void setSubject(String subject) {
		this.subject = subject;
	}

    /**
     * Gets timeout.
     *
     * @return the timeout
     */
    public String getTimeout() {
		return this.timeout;
	}

    /**
     * Sets timeout.
     *
     * @param timeout the timeout
     */
    public void setTimeout(String timeout) {
		this.timeout = timeout;
	}

    /**
     * Gets total amount.
     *
     * @return the total amount
     */
    public String getTotalAmount() {
		return this.totalAmount;
	}

    /**
     * Sets total amount.
     *
     * @param totalAmount the total amount
     */
    public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
