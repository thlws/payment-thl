package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询交易评价信息
 *
 * @author auto create
 * @since 1.0, 2016-06-13 20:25:02
 */
public class AlipayOfflineMarketMcommentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1246876955292754436L;

	/**
	 * 调用途径：
1：当值为ISV表示isv途径调用
2：当值为PROVIDER表示服务商调用
	 */
	@ApiField("op_role")
	private String opRole;

	/**
	 * 字段涵义：当前交易对应的商户partner_id
仅op_role='PROVIDER'必须传入
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

    /**
     * Gets op role.
     *
     * @return the op role
     */
    public String getOpRole() {
		return this.opRole;
	}

    /**
     * Sets op role.
     *
     * @param opRole the op role
     */
    public void setOpRole(String opRole) {
		this.opRole = opRole;
	}

    /**
     * Gets partner id.
     *
     * @return the partner id
     */
    public String getPartnerId() {
		return this.partnerId;
	}

    /**
     * Sets partner id.
     *
     * @param partnerId the partner id
     */
    public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

    /**
     * Gets trade no.
     *
     * @return the trade no
     */
    public String getTradeNo() {
		return this.tradeNo;
	}

    /**
     * Sets trade no.
     *
     * @param tradeNo the trade no
     */
    public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
