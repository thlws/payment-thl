package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 优惠规则
 *
 * @author auto create
 * @since 1.0, 2017-03-03 16:47:49
 */
public class DstCampRuleModel extends AlipayObject {

	private static final long serialVersionUID = 1125259162576872875L;

	/**
	 * 支付宝收银台:PC端:PC   安全支付端:WIRELESS_CLIENT   无线WAP端:WIRELESS_WAP   协议支付;AGREEMENTPAY
	 */
	@ApiField("alipay_cashier")
	private String alipayCashier;

	/**
	 * 优惠规则类型,主要有2种:账户优惠传 account、渠道优惠channel. 现在开放账户优惠account  默认请传account
	 */
	@ApiField("discount_type")
	private String discountType;

	/**
	 * 规则id 新增不传，修改传
	 */
	@ApiField("id")
	private String id;

	/**
	 * 同一个支付宝账户享受优惠次数.0表示不限制
	 */
	@ApiField("prize_count_per_account")
	private String prizeCountPerAccount;

	/**
	 * 产品类型 支付宝交易:trade   支付宝账单中心:commonDeduct   支付宝转账中心:ttc   支付宝通用代扣:billcenter
	 */
	@ApiField("product_type")
	private String productType;

	/**
	 * 立减规则，这个参数有支付宝运营小二提供给商户，录入
	 */
	@ApiField("rule_uuid")
	private String ruleUuid;

	/**
	 * 关联的凭证id,这个参数商户调凭证创建接口返回凭证id 然后设置到这个值
	 */
	@ApiField("voucher_id")
	private String voucherId;

    /**
     * Gets alipay cashier.
     *
     * @return the alipay cashier
     */
    public String getAlipayCashier() {
		return this.alipayCashier;
	}

    /**
     * Sets alipay cashier.
     *
     * @param alipayCashier the alipay cashier
     */
    public void setAlipayCashier(String alipayCashier) {
		this.alipayCashier = alipayCashier;
	}

    /**
     * Gets discount type.
     *
     * @return the discount type
     */
    public String getDiscountType() {
		return this.discountType;
	}

    /**
     * Sets discount type.
     *
     * @param discountType the discount type
     */
    public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
		return this.id;
	}

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
		this.id = id;
	}

    /**
     * Gets prize count per account.
     *
     * @return the prize count per account
     */
    public String getPrizeCountPerAccount() {
		return this.prizeCountPerAccount;
	}

    /**
     * Sets prize count per account.
     *
     * @param prizeCountPerAccount the prize count per account
     */
    public void setPrizeCountPerAccount(String prizeCountPerAccount) {
		this.prizeCountPerAccount = prizeCountPerAccount;
	}

    /**
     * Gets product type.
     *
     * @return the product type
     */
    public String getProductType() {
		return this.productType;
	}

    /**
     * Sets product type.
     *
     * @param productType the product type
     */
    public void setProductType(String productType) {
		this.productType = productType;
	}

    /**
     * Gets rule uuid.
     *
     * @return the rule uuid
     */
    public String getRuleUuid() {
		return this.ruleUuid;
	}

    /**
     * Sets rule uuid.
     *
     * @param ruleUuid the rule uuid
     */
    public void setRuleUuid(String ruleUuid) {
		this.ruleUuid = ruleUuid;
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
