package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 送礼平台商户进行核销调用
 *
 * @author auto create
 * @since 1.0, 2018-09-04 16:32:42
 */
public class AlipaySocialGiftVoucherUseModel extends AlipayObject {

	private static final long serialVersionUID = 6487571777614891345L;

	/**
	 * 失效时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 商户再送礼平台的唯一ID，用于标识具体的调用业务方，需要先在送礼平台进行业务类型的分配之后才看使用。
	 */
	@ApiField("mid")
	private String mid;

	/**
	 * 主订单id，核销对应的送礼平台主订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 当前金额，注意这个金额是核销后的当前金额。use_price是核销金额
	 */
	@ApiField("price")
	private String price;

	/**
	 * 生效时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 核销金额
	 */
	@ApiField("use_price")
	private String usePrice;

	/**
	 * 卡码code
	 */
	@ApiField("voucher_id")
	private String voucherId;

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
     * Gets mid.
     *
     * @return the mid
     */
    public String getMid() {
		return this.mid;
	}

    /**
     * Sets mid.
     *
     * @param mid the mid
     */
    public void setMid(String mid) {
		this.mid = mid;
	}

    /**
     * Gets order id.
     *
     * @return the order id
     */
    public String getOrderId() {
		return this.orderId;
	}

    /**
     * Sets order id.
     *
     * @param orderId the order id
     */
    public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

    /**
     * Gets price.
     *
     * @return the price
     */
    public String getPrice() {
		return this.price;
	}

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(String price) {
		this.price = price;
	}

    /**
     * Gets start date.
     *
     * @return the start date
     */
    public Date getStartDate() {
		return this.startDate;
	}

    /**
     * Sets start date.
     *
     * @param startDate the start date
     */
    public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

    /**
     * Gets use price.
     *
     * @return the use price
     */
    public String getUsePrice() {
		return this.usePrice;
	}

    /**
     * Sets use price.
     *
     * @param usePrice the use price
     */
    public void setUsePrice(String usePrice) {
		this.usePrice = usePrice;
	}

    /**
     * Gets voucher id.
     *
     * @return the voucher id
     */
    public String getVoucherId() {
		return this.voucherId;
	}

    /**
     * Sets voucher id.
     *
     * @param voucherId the voucher id
     */
    public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
