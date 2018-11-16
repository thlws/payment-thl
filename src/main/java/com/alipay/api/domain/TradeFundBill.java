package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易支付的渠道属性
 *
 * @author auto create
 * @since 1.0, 2018-06-07 15:14:51
 */
public class TradeFundBill extends AlipayObject {

	private static final long serialVersionUID = 5653129259578121527L;

	/**
	 * 该支付工具类型所使用的金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 交易使用的资金渠道，详见 <a href="https://doc.open.alipay.com/doc2/detail?treeId=26&articleId=103259&docType=1">支付渠道列表</a>
	 */
	@ApiField("fund_channel")
	private String fundChannel;

	/**
	 * 渠道所使用的资金类型,目前只在资金渠道(fund_channel)是银行卡渠道(BANKCARD)的情况下才返回该信息(DEBIT_CARD:借记卡,CREDIT_CARD:信用卡,MIXED_CARD:借贷合一卡)
	 */
	@ApiField("fund_type")
	private String fundType;

	/**
	 * 渠道实际付款金额
	 */
	@ApiField("real_amount")
	private String realAmount;

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
     * Gets fund channel.
     *
     * @return the fund channel
     */
    public String getFundChannel() {
		return this.fundChannel;
	}

    /**
     * Sets fund channel.
     *
     * @param fundChannel the fund channel
     */
    public void setFundChannel(String fundChannel) {
		this.fundChannel = fundChannel;
	}

    /**
     * Gets fund type.
     *
     * @return the fund type
     */
    public String getFundType() {
		return this.fundType;
	}

    /**
     * Sets fund type.
     *
     * @param fundType the fund type
     */
    public void setFundType(String fundType) {
		this.fundType = fundType;
	}

    /**
     * Gets real amount.
     *
     * @return the real amount
     */
    public String getRealAmount() {
		return this.realAmount;
	}

    /**
     * Sets real amount.
     *
     * @param realAmount the real amount
     */
    public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}

}
