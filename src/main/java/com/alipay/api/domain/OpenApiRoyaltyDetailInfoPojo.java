package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OpenApiRoyaltyDetailInfoPojo
 *
 * @author auto create
 * @since 1.0, 2018-05-11 10:43:52
 */
public class OpenApiRoyaltyDetailInfoPojo extends AlipayObject {

	private static final long serialVersionUID = 1419965198778613799L;

	/**
	 * 分账的金额，单位为元
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 分账信息中分账百分比。取值范围为大于0，少于或等于100的整数。
	 */
	@ApiField("amount_percentage")
	private Long amountPercentage;

	/**
	 * 分账描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 分账类型.
普通分账为：transfer;
补差为：replenish;
为空默认为分账transfer;
	 */
	@ApiField("royalty_type")
	private String royaltyType;

	/**
	 * 收入方账户。如果收入方账户类型为userId，本参数为收入方的支付宝账号对应的支付宝唯一用户号，以2088开头的纯16位数字；如果收入方类型为cardSerialNo，本参数为收入方在支付宝绑定的卡编号；如果收入方类型为loginName，本参数为收入方的支付宝登录号；
	 */
	@ApiField("trans_in")
	private String transIn;

	/**
	 * 收入方账户类型。userId表示是支付宝账号对应的支付宝唯一用户号;cardSerialNo表示是卡编号;loginName表示是支付宝登录号；
	 */
	@ApiField("trans_in_type")
	private String transInType;

	/**
	 * 支出方账户。如果支出方账户类型为userId，本参数为支出方的支付宝账号对应的支付宝唯一用户号，以2088开头的纯16位数字；如果支出方类型为loginName，本参数为支出方的支付宝登录号；
	 */
	@ApiField("trans_out")
	private String transOut;

	/**
	 * 支出方账户类型。userId表示是支付宝账号对应的支付宝唯一用户号;loginName表示是支付宝登录号；
	 */
	@ApiField("trans_out_type")
	private String transOutType;

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public Long getAmount() {
		return this.amount;
	}

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(Long amount) {
		this.amount = amount;
	}

    /**
     * Gets amount percentage.
     *
     * @return the amount percentage
     */
    public Long getAmountPercentage() {
		return this.amountPercentage;
	}

    /**
     * Sets amount percentage.
     *
     * @param amountPercentage the amount percentage
     */
    public void setAmountPercentage(Long amountPercentage) {
		this.amountPercentage = amountPercentage;
	}

    /**
     * Gets desc.
     *
     * @return the desc
     */
    public String getDesc() {
		return this.desc;
	}

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String desc) {
		this.desc = desc;
	}

    /**
     * Gets royalty type.
     *
     * @return the royalty type
     */
    public String getRoyaltyType() {
		return this.royaltyType;
	}

    /**
     * Sets royalty type.
     *
     * @param royaltyType the royalty type
     */
    public void setRoyaltyType(String royaltyType) {
		this.royaltyType = royaltyType;
	}

    /**
     * Gets trans in.
     *
     * @return the trans in
     */
    public String getTransIn() {
		return this.transIn;
	}

    /**
     * Sets trans in.
     *
     * @param transIn the trans in
     */
    public void setTransIn(String transIn) {
		this.transIn = transIn;
	}

    /**
     * Gets trans in type.
     *
     * @return the trans in type
     */
    public String getTransInType() {
		return this.transInType;
	}

    /**
     * Sets trans in type.
     *
     * @param transInType the trans in type
     */
    public void setTransInType(String transInType) {
		this.transInType = transInType;
	}

    /**
     * Gets trans out.
     *
     * @return the trans out
     */
    public String getTransOut() {
		return this.transOut;
	}

    /**
     * Sets trans out.
     *
     * @param transOut the trans out
     */
    public void setTransOut(String transOut) {
		this.transOut = transOut;
	}

    /**
     * Gets trans out type.
     *
     * @return the trans out type
     */
    public String getTransOutType() {
		return this.transOutType;
	}

    /**
     * Sets trans out type.
     *
     * @param transOutType the trans out type
     */
    public void setTransOutType(String transOutType) {
		this.transOutType = transOutType;
	}

}
