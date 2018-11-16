package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户的支付宝交易信息
 *
 * @author auto create
 * @since 1.0, 2018-07-02 10:30:07
 */
public class AlipayEbppInvoiceUserTradeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7587813127422655146L;

	/**
	 * 发票管家交易id，来源于用户支付后开票申请跳转开票方的链接中带入参数einv_trade_id
	 */
	@ApiField("einv_trade_id")
	private String einvTradeId;

	/**
	 * 随机数，从支付宝钱包链接跳转到开票方外部链接中带入的一项参数，调用该方法需将此参数透传回来，参数名：random
	 */
	@ApiField("random")
	private String random;

	/**
	 * 时间戳，从支付宝钱包链接跳转到开票方外部链接中带入的一项参数，调用该方法需将此参数透传回来，参数名：timestamp
	 */
	@ApiField("timestamp")
	private String timestamp;

	/**
	 * 令牌，从支付宝钱包链接跳转到开票方外部链接中带入的一项参数，调用该方法需将此参数透传回来,传入时请进行URLEncode,采用utf-编码格式，参数名：token
	 */
	@ApiField("token")
	private String token;

    /**
     * Gets einv trade id.
     *
     * @return the einv trade id
     */
    public String getEinvTradeId() {
		return this.einvTradeId;
	}

    /**
     * Sets einv trade id.
     *
     * @param einvTradeId the einv trade id
     */
    public void setEinvTradeId(String einvTradeId) {
		this.einvTradeId = einvTradeId;
	}

    /**
     * Gets random.
     *
     * @return the random
     */
    public String getRandom() {
		return this.random;
	}

    /**
     * Sets random.
     *
     * @param random the random
     */
    public void setRandom(String random) {
		this.random = random;
	}

    /**
     * Gets timestamp.
     *
     * @return the timestamp
     */
    public String getTimestamp() {
		return this.timestamp;
	}

    /**
     * Sets timestamp.
     *
     * @param timestamp the timestamp
     */
    public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

    /**
     * Gets token.
     *
     * @return the token
     */
    public String getToken() {
		return this.token;
	}

    /**
     * Sets token.
     *
     * @param token the token
     */
    public void setToken(String token) {
		this.token = token;
	}

}
