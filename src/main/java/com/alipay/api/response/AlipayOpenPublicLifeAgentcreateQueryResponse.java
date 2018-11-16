package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.life.agentcreate.query response.
 *
 * @author auto create
 * @since 1.0, 2017-10-10 11:16:11
 */
public class AlipayOpenPublicLifeAgentcreateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5559334385177941846L;

	/** 
	 * 只有审核通过，且商户在支付宝发送的授权邮件中确认授权，此时生活号才会正式创建，查询才会返回该值
	 */
	@ApiField("life_app_id")
	private String lifeAppId;

	/** 
	 * 商户pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/** 
	 * 支付宝商户入驻申请单状态，申请单状态包括：暂存、审核中、待商户确认、成功、失败。注:暂存是审核前的中间状态，如出现暂存请再次提交
	 */
	@ApiField("order_status_biz_desc")
	private String orderStatusBizDesc;

	/** 
	 * 由开发者创建的外部入驻申请单据号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 只有审核失败才会返回该值
	 */
	@ApiField("refused_reason")
	private String refusedReason;

    /**
     * Sets life app id.
     *
     * @param lifeAppId the life app id
     */
    public void setLifeAppId(String lifeAppId) {
		this.lifeAppId = lifeAppId;
	}

    /**
     * Gets life app id.
     *
     * @return the life app id
     */
    public String getLifeAppId( ) {
		return this.lifeAppId;
	}

    /**
     * Sets merchant pid.
     *
     * @param merchantPid the merchant pid
     */
    public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

    /**
     * Gets merchant pid.
     *
     * @return the merchant pid
     */
    public String getMerchantPid( ) {
		return this.merchantPid;
	}

    /**
     * Sets order status biz desc.
     *
     * @param orderStatusBizDesc the order status biz desc
     */
    public void setOrderStatusBizDesc(String orderStatusBizDesc) {
		this.orderStatusBizDesc = orderStatusBizDesc;
	}

    /**
     * Gets order status biz desc.
     *
     * @return the order status biz desc
     */
    public String getOrderStatusBizDesc( ) {
		return this.orderStatusBizDesc;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo( ) {
		return this.outBizNo;
	}

    /**
     * Sets refused reason.
     *
     * @param refusedReason the refused reason
     */
    public void setRefusedReason(String refusedReason) {
		this.refusedReason = refusedReason;
	}

    /**
     * Gets refused reason.
     *
     * @return the refused reason
     */
    public String getRefusedReason( ) {
		return this.refusedReason;
	}

}
