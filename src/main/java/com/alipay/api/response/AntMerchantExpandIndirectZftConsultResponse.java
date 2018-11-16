package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.zft.consult response.
 *
 * @author auto create
 * @since 1.0, 2018-09-07 20:05:02
 */
public class AntMerchantExpandIndirectZftConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6514314747936967713L;

	/** 
	 * 资金账户是否审核。当调用没有报错时，本值才有参考意义
	 */
	@ApiField("account_audit")
	private Boolean accountAudit;

	/** 
	 * 咨询申请单id
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 是否风控审核。当调用没有报错时，本值才有参考意义
	 */
	@ApiField("risk_audit")
	private Boolean riskAudit;

    /**
     * Sets account audit.
     *
     * @param accountAudit the account audit
     */
    public void setAccountAudit(Boolean accountAudit) {
		this.accountAudit = accountAudit;
	}

    /**
     * Gets account audit.
     *
     * @return the account audit
     */
    public Boolean getAccountAudit( ) {
		return this.accountAudit;
	}

    /**
     * Sets order id.
     *
     * @param orderId the order id
     */
    public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

    /**
     * Gets order id.
     *
     * @return the order id
     */
    public String getOrderId( ) {
		return this.orderId;
	}

    /**
     * Sets risk audit.
     *
     * @param riskAudit the risk audit
     */
    public void setRiskAudit(Boolean riskAudit) {
		this.riskAudit = riskAudit;
	}

    /**
     * Gets risk audit.
     *
     * @return the risk audit
     */
    public Boolean getRiskAudit( ) {
		return this.riskAudit;
	}

}
