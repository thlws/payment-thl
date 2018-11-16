package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用借还订单归还
 *
 * @author auto create
 * @since 1.0, 2018-07-06 15:45:18
 */
public class ZhimaMerchantOrderRentCompleteModel extends AlipayObject {

	private static final long serialVersionUID = 7582572234512773287L;

	/**
	 * 扩展信息。商户发起借用服务时的扩展信息字段，格式：json，注意，如果字符串对应的json对象包含中文字符，需要对包含中文的字段进行编码
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 信用借还订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 支付金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 金额类型：
RENT:租金
DAMAGE:赔偿金
	 */
	@ApiField("pay_amount_type")
	private String payAmountType;

	/**
	 * 信用借还的产品码:w1010100000000002858
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 物品归还门店名称
	 */
	@ApiField("restore_shop_name")
	private String restoreShopName;

	/**
	 * 物品实际归还时间，borrow_time<restore_time<当前时间+24小时，即该时间不能早于借还订单创建时的borrow_time，且最晚不能晚于当前时间后24小时。
	 */
	@ApiField("restore_time")
	private String restoreTime;

    /**
     * Gets extend info.
     *
     * @return the extend info
     */
    public String getExtendInfo() {
		return this.extendInfo;
	}

    /**
     * Sets extend info.
     *
     * @param extendInfo the extend info
     */
    public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
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
     * Gets pay amount.
     *
     * @return the pay amount
     */
    public String getPayAmount() {
		return this.payAmount;
	}

    /**
     * Sets pay amount.
     *
     * @param payAmount the pay amount
     */
    public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

    /**
     * Gets pay amount type.
     *
     * @return the pay amount type
     */
    public String getPayAmountType() {
		return this.payAmountType;
	}

    /**
     * Sets pay amount type.
     *
     * @param payAmountType the pay amount type
     */
    public void setPayAmountType(String payAmountType) {
		this.payAmountType = payAmountType;
	}

    /**
     * Gets product code.
     *
     * @return the product code
     */
    public String getProductCode() {
		return this.productCode;
	}

    /**
     * Sets product code.
     *
     * @param productCode the product code
     */
    public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

    /**
     * Gets restore shop name.
     *
     * @return the restore shop name
     */
    public String getRestoreShopName() {
		return this.restoreShopName;
	}

    /**
     * Sets restore shop name.
     *
     * @param restoreShopName the restore shop name
     */
    public void setRestoreShopName(String restoreShopName) {
		this.restoreShopName = restoreShopName;
	}

    /**
     * Gets restore time.
     *
     * @return the restore time
     */
    public String getRestoreTime() {
		return this.restoreTime;
	}

    /**
     * Sets restore time.
     *
     * @param restoreTime the restore time
     */
    public void setRestoreTime(String restoreTime) {
		this.restoreTime = restoreTime;
	}

}
