package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.shop.create response.
 *
 * @author auto create
 * @since 1.0, 2017-07-19 16:55:33
 */
public class AlipayOfflineMarketShopCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4724182447123317834L;

	/** 
	 * 开店请求受理成功后返回的支付宝流水ID，根据此ID调用接口
alipay.offline.market.applyorder.batchquery，能够获取当前开店请求审核状态、驳回原因等信息。
	 */
	@ApiField("apply_id")
	private String applyId;

	/** 
	 * 废弃字段。
	 */
	@ApiField("audit_desc")
	private String auditDesc;

	/** 
	 * 同步请求如果支付宝受理成功，将返回AUDITING状态。
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/** 
	 * 废弃字段，T表示上架,F表示未上架。
	 */
	@ApiField("is_online")
	private String isOnline;

	/** 
	 * 废弃字段，T表示显示，F表示隐藏。
	 */
	@ApiField("is_show")
	private String isShow;

	/** 
	 * 开店请求结果码：
WAIT_MERCHANT_CONFIRM：等待商户确认
当开店需要商户确认时返回此结果码，商户需要登录到商家中心e.alipay.com进行开店确认。例如，ISV帮商户开店时，出现需要改签口碑当面付主体，接口同步返回此错误码，并且支付宝发送短信告知商户登录商家中心进行改签确认，确认后进入到后续审核流程。
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 废弃字段，支付宝门店ID。
	 */
	@ApiField("shop_id")
	private String shopId;

    /**
     * Sets apply id.
     *
     * @param applyId the apply id
     */
    public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

    /**
     * Gets apply id.
     *
     * @return the apply id
     */
    public String getApplyId( ) {
		return this.applyId;
	}

    /**
     * Sets audit desc.
     *
     * @param auditDesc the audit desc
     */
    public void setAuditDesc(String auditDesc) {
		this.auditDesc = auditDesc;
	}

    /**
     * Gets audit desc.
     *
     * @return the audit desc
     */
    public String getAuditDesc( ) {
		return this.auditDesc;
	}

    /**
     * Sets audit status.
     *
     * @param auditStatus the audit status
     */
    public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

    /**
     * Gets audit status.
     *
     * @return the audit status
     */
    public String getAuditStatus( ) {
		return this.auditStatus;
	}

    /**
     * Sets is online.
     *
     * @param isOnline the is online
     */
    public void setIsOnline(String isOnline) {
		this.isOnline = isOnline;
	}

    /**
     * Gets is online.
     *
     * @return the is online
     */
    public String getIsOnline( ) {
		return this.isOnline;
	}

    /**
     * Sets is show.
     *
     * @param isShow the is show
     */
    public void setIsShow(String isShow) {
		this.isShow = isShow;
	}

    /**
     * Gets is show.
     *
     * @return the is show
     */
    public String getIsShow( ) {
		return this.isShow;
	}

    /**
     * Sets result code.
     *
     * @param resultCode the result code
     */
    public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

    /**
     * Gets result code.
     *
     * @return the result code
     */
    public String getResultCode( ) {
		return this.resultCode;
	}

    /**
     * Sets shop id.
     *
     * @param shopId the shop id
     */
    public void setShopId(String shopId) {
		this.shopId = shopId;
	}

    /**
     * Gets shop id.
     *
     * @return the shop id
     */
    public String getShopId( ) {
		return this.shopId;
	}

}
