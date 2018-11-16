package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券明细信息
 *
 * @author auto create
 * @since 1.0, 2017-11-01 20:01:02
 */
public class VoucherDetail extends AlipayObject {

	private static final long serialVersionUID = 8219969782353892549L;

	/**
	 * 优惠券面额，它应该会等于商家出资加上其他出资方出资
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 券id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 优惠券备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商家出资（特指发起交易的商家出资金额）
	 */
	@ApiField("merchant_contribute")
	private String merchantContribute;

	/**
	 * 券名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 其他出资方出资金额，可能是支付宝，可能是品牌商，或者其他方，也可能是他们的一起出资
	 */
	@ApiField("other_contribute")
	private String otherContribute;

	/**
	 * 优惠券的其他出资方明细
	 */
	@ApiListField("other_contribute_detail")
	@ApiField("contribute_detail")
	private List<ContributeDetail> otherContributeDetail;

	/**
	 * 如果使用的这张券是用户购买的，则该字段代表用户在购买这张券时平台优惠的金额
	 */
	@ApiField("purchase_ant_contribute")
	private String purchaseAntContribute;

	/**
	 * 如果使用的这张券是用户购买的，则该字段代表用户在购买这张券时用户实际付款的金额
	 */
	@ApiField("purchase_buyer_contribute")
	private String purchaseBuyerContribute;

	/**
	 * 如果使用的这张券是用户购买的，则该字段代表用户在购买这张券时商户优惠的金额
	 */
	@ApiField("purchase_merchant_contribute")
	private String purchaseMerchantContribute;

	/**
	 * 券模板id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 当前有三种类型：
ALIPAY_FIX_VOUCHER - 全场代金券
ALIPAY_DISCOUNT_VOUCHER - 折扣券
ALIPAY_ITEM_VOUCHER - 单品优惠
注：不排除将来新增其他类型的可能，商家接入时注意兼容性避免硬编码
	 */
	@ApiField("type")
	private String type;

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
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo() {
		return this.memo;
	}

    /**
     * Sets memo.
     *
     * @param memo the memo
     */
    public void setMemo(String memo) {
		this.memo = memo;
	}

    /**
     * Gets merchant contribute.
     *
     * @return the merchant contribute
     */
    public String getMerchantContribute() {
		return this.merchantContribute;
	}

    /**
     * Sets merchant contribute.
     *
     * @param merchantContribute the merchant contribute
     */
    public void setMerchantContribute(String merchantContribute) {
		this.merchantContribute = merchantContribute;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets other contribute.
     *
     * @return the other contribute
     */
    public String getOtherContribute() {
		return this.otherContribute;
	}

    /**
     * Sets other contribute.
     *
     * @param otherContribute the other contribute
     */
    public void setOtherContribute(String otherContribute) {
		this.otherContribute = otherContribute;
	}

    /**
     * Gets other contribute detail.
     *
     * @return the other contribute detail
     */
    public List<ContributeDetail> getOtherContributeDetail() {
		return this.otherContributeDetail;
	}

    /**
     * Sets other contribute detail.
     *
     * @param otherContributeDetail the other contribute detail
     */
    public void setOtherContributeDetail(List<ContributeDetail> otherContributeDetail) {
		this.otherContributeDetail = otherContributeDetail;
	}

    /**
     * Gets purchase ant contribute.
     *
     * @return the purchase ant contribute
     */
    public String getPurchaseAntContribute() {
		return this.purchaseAntContribute;
	}

    /**
     * Sets purchase ant contribute.
     *
     * @param purchaseAntContribute the purchase ant contribute
     */
    public void setPurchaseAntContribute(String purchaseAntContribute) {
		this.purchaseAntContribute = purchaseAntContribute;
	}

    /**
     * Gets purchase buyer contribute.
     *
     * @return the purchase buyer contribute
     */
    public String getPurchaseBuyerContribute() {
		return this.purchaseBuyerContribute;
	}

    /**
     * Sets purchase buyer contribute.
     *
     * @param purchaseBuyerContribute the purchase buyer contribute
     */
    public void setPurchaseBuyerContribute(String purchaseBuyerContribute) {
		this.purchaseBuyerContribute = purchaseBuyerContribute;
	}

    /**
     * Gets purchase merchant contribute.
     *
     * @return the purchase merchant contribute
     */
    public String getPurchaseMerchantContribute() {
		return this.purchaseMerchantContribute;
	}

    /**
     * Sets purchase merchant contribute.
     *
     * @param purchaseMerchantContribute the purchase merchant contribute
     */
    public void setPurchaseMerchantContribute(String purchaseMerchantContribute) {
		this.purchaseMerchantContribute = purchaseMerchantContribute;
	}

    /**
     * Gets template id.
     *
     * @return the template id
     */
    public String getTemplateId() {
		return this.templateId;
	}

    /**
     * Sets template id.
     *
     * @param templateId the template id
     */
    public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
	}

}
