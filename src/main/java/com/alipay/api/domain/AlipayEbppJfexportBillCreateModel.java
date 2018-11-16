package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建支付宝缴费订单
 *
 * @author auto create
 * @since 1.0, 2018-05-02 14:57:46
 */
public class AlipayEbppJfexportBillCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2231731936494583886L;

	/**
	 * 支付金额,单位为：RMB 元。
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 户号
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 业务类型英文名称 ，固定传JF，表示缴费
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 缓存的账单的key，每次查询机构账单时返回，在创建时需要透传回支付宝这边
	 */
	@ApiField("cache_key")
	private String cacheKey;

	/**
	 * 出账机构英文简称
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 拓展字段，json格式的key-value串，可以放返佣标识等信息
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 外部商户的业务流水号，需要保证唯一性和幂等性；并且，需要确保同一个外部商户的业务流水号只能使用同一个开放平台账户进行创建。
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 子业务类型英文名称 ，ELECTRIC-电费，WATER-水费，GAS-燃气费
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 选中的机构账单列表中单笔账单的uniq_id，标识创建哪一笔账单
	 */
	@ApiField("unique_id")
	private String uniqueId;

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public String getAmount() {
		return this.amount;
	}

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(String amount) {
		this.amount = amount;
	}

    /**
     * Gets bill key.
     *
     * @return the bill key
     */
    public String getBillKey() {
		return this.billKey;
	}

    /**
     * Sets bill key.
     *
     * @param billKey the bill key
     */
    public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType() {
		return this.bizType;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets cache key.
     *
     * @return the cache key
     */
    public String getCacheKey() {
		return this.cacheKey;
	}

    /**
     * Sets cache key.
     *
     * @param cacheKey the cache key
     */
    public void setCacheKey(String cacheKey) {
		this.cacheKey = cacheKey;
	}

    /**
     * Gets charge inst.
     *
     * @return the charge inst
     */
    public String getChargeInst() {
		return this.chargeInst;
	}

    /**
     * Sets charge inst.
     *
     * @param chargeInst the charge inst
     */
    public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

    /**
     * Gets extend field.
     *
     * @return the extend field
     */
    public String getExtendField() {
		return this.extendField;
	}

    /**
     * Sets extend field.
     *
     * @param extendField the extend field
     */
    public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

    /**
     * Gets merchant order no.
     *
     * @return the merchant order no
     */
    public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}

    /**
     * Sets merchant order no.
     *
     * @param merchantOrderNo the merchant order no
     */
    public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

    /**
     * Gets sub biz type.
     *
     * @return the sub biz type
     */
    public String getSubBizType() {
		return this.subBizType;
	}

    /**
     * Sets sub biz type.
     *
     * @param subBizType the sub biz type
     */
    public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

    /**
     * Gets unique id.
     *
     * @return the unique id
     */
    public String getUniqueId() {
		return this.uniqueId;
	}

    /**
     * Sets unique id.
     *
     * @param uniqueId the unique id
     */
    public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

}
