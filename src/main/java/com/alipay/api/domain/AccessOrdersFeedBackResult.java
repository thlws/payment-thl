package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料单据反馈结果
 *
 * @author auto create
 * @since 1.0, 2017-07-27 19:41:21
 */
public class AccessOrdersFeedBackResult extends AlipayObject {

	private static final long serialVersionUID = 2637435868135953574L;

	/**
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误描述
	 */
	@ApiField("error_desc")
	private String errorDesc;

	/**
	 * 反馈主键ID（生产单ID或者采购单ID或者码token）
	 */
	@ApiField("feedback_id")
	private String feedbackId;

	/**
	 * 生产单：PRODUCE_ORDER
采购单：PURCHASE_ORDER
二维码：QRCODE
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 外部单据号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 每条记录处理结果
	 */
	@ApiField("success")
	private Boolean success;

    /**
     * Gets error code.
     *
     * @return the error code
     */
    public String getErrorCode() {
		return this.errorCode;
	}

    /**
     * Sets error code.
     *
     * @param errorCode the error code
     */
    public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

    /**
     * Gets error desc.
     *
     * @return the error desc
     */
    public String getErrorDesc() {
		return this.errorDesc;
	}

    /**
     * Sets error desc.
     *
     * @param errorDesc the error desc
     */
    public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

    /**
     * Gets feedback id.
     *
     * @return the feedback id
     */
    public String getFeedbackId() {
		return this.feedbackId;
	}

    /**
     * Sets feedback id.
     *
     * @param feedbackId the feedback id
     */
    public void setFeedbackId(String feedbackId) {
		this.feedbackId = feedbackId;
	}

    /**
     * Gets order type.
     *
     * @return the order type
     */
    public String getOrderType() {
		return this.orderType;
	}

    /**
     * Sets order type.
     *
     * @param orderType the order type
     */
    public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
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
     * Gets success.
     *
     * @return the success
     */
    public Boolean getSuccess() {
		return this.success;
	}

    /**
     * Sets success.
     *
     * @param success the success
     */
    public void setSuccess(Boolean success) {
		this.success = success;
	}

}
