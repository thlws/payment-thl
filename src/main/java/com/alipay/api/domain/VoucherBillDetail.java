package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券账单信息
 *
 * @author auto create
 * @since 1.0, 2017-09-25 10:26:02
 */
public class VoucherBillDetail extends AlipayObject {

	private static final long serialVersionUID = 1735483533294973755L;

	/**
	 * 券核销/退款金额
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 账单类型(V_USE:支付,V_REFUND:退款)
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 交易时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 交易合作伙伴ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 商户名称
	 */
	@ApiField("partner_name")
	private String partnerName;

	/**
	 * 交易状态(I: 处理中, S: 成功)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

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
     * Gets gmt create.
     *
     * @return the gmt create
     */
    public Date getGmtCreate() {
		return this.gmtCreate;
	}

    /**
     * Sets gmt create.
     *
     * @param gmtCreate the gmt create
     */
    public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
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
     * Gets partner name.
     *
     * @return the partner name
     */
    public String getPartnerName() {
		return this.partnerName;
	}

    /**
     * Sets partner name.
     *
     * @param partnerName the partner name
     */
    public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
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
