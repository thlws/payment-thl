package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.freedeposit.orderrisk.query response.
 *
 * @author auto create
 * @since 1.0, 2018-03-16 13:48:06
 */
public class ZhimaCreditEpFreedepositOrderriskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4674745886348284347L;

	/** 
	 * 风控结果
	 */
	@ApiField("decision")
	private String decision;

	/** 
	 * 芝麻业务流水号
	 */
	@ApiField("lease_order_no")
	private String leaseOrderNo;

	/** 
	 * 商户业务流水号，请确保每次业务唯一
	 */
	@ApiField("merchant_lease_order_no")
	private String merchantLeaseOrderNo;

	/** 
	 * 拒绝原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

    /**
     * Sets decision.
     *
     * @param decision the decision
     */
    public void setDecision(String decision) {
		this.decision = decision;
	}

    /**
     * Gets decision.
     *
     * @return the decision
     */
    public String getDecision( ) {
		return this.decision;
	}

    /**
     * Sets lease order no.
     *
     * @param leaseOrderNo the lease order no
     */
    public void setLeaseOrderNo(String leaseOrderNo) {
		this.leaseOrderNo = leaseOrderNo;
	}

    /**
     * Gets lease order no.
     *
     * @return the lease order no
     */
    public String getLeaseOrderNo( ) {
		return this.leaseOrderNo;
	}

    /**
     * Sets merchant lease order no.
     *
     * @param merchantLeaseOrderNo the merchant lease order no
     */
    public void setMerchantLeaseOrderNo(String merchantLeaseOrderNo) {
		this.merchantLeaseOrderNo = merchantLeaseOrderNo;
	}

    /**
     * Gets merchant lease order no.
     *
     * @return the merchant lease order no
     */
    public String getMerchantLeaseOrderNo( ) {
		return this.merchantLeaseOrderNo;
	}

    /**
     * Sets reject reason.
     *
     * @param rejectReason the reject reason
     */
    public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

    /**
     * Gets reject reason.
     *
     * @return the reject reason
     */
    public String getRejectReason( ) {
		return this.rejectReason;
	}

}
