package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易支付的渠道属性
 *
 * @author auto create
 * @since 1.0, 2017-09-08 11:37:41
 */
public class FundBillListEco extends AlipayObject {

	private static final long serialVersionUID = 4752256745641611574L;

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

}
