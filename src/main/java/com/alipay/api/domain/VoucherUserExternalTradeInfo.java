package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券使用外部交易信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class VoucherUserExternalTradeInfo extends AlipayObject {

	private static final long serialVersionUID = 2614185238878378593L;

	/**
	 * 核销金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 核销时间
	 */
	@ApiField("consume_date")
	private String consumeDate;

	/**
	 * 券核销的门店id
	 */
	@ApiField("consume_shop_id")
	private String consumeShopId;

	/**
	 * 外部交易号
	 */
	@ApiField("external_trade_no")
	private String externalTradeNo;

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
     * Gets consume date.
     *
     * @return the consume date
     */
    public String getConsumeDate() {
		return this.consumeDate;
	}

    /**
     * Sets consume date.
     *
     * @param consumeDate the consume date
     */
    public void setConsumeDate(String consumeDate) {
		this.consumeDate = consumeDate;
	}

    /**
     * Gets consume shop id.
     *
     * @return the consume shop id
     */
    public String getConsumeShopId() {
		return this.consumeShopId;
	}

    /**
     * Sets consume shop id.
     *
     * @param consumeShopId the consume shop id
     */
    public void setConsumeShopId(String consumeShopId) {
		this.consumeShopId = consumeShopId;
	}

    /**
     * Gets external trade no.
     *
     * @return the external trade no
     */
    public String getExternalTradeNo() {
		return this.externalTradeNo;
	}

    /**
     * Sets external trade no.
     *
     * @param externalTradeNo the external trade no
     */
    public void setExternalTradeNo(String externalTradeNo) {
		this.externalTradeNo = externalTradeNo;
	}

}
