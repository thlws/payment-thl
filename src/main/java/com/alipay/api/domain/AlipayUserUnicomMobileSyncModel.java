package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联通老用户转宝卡套餐后，使用该接口将转宝卡手机号同步支付宝
 *
 * @author auto create
 * @since 1.0, 2017-11-29 23:15:10
 */
public class AlipayUserUnicomMobileSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7553419316746335955L;

	/**
	 * 业务状态发生变更的时间戳，精确到毫秒
	 */
	@ApiField("gmt_status_change")
	private Long gmtStatusChange;

	/**
	 * 联通老用户转宝卡套餐手机号，必须是联通手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 对手机号操作类型。CARD_ACTIVE:联通老用户转入宝卡套餐；CARD_CLOSE:宝卡用户转出宝卡套餐
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 比如某种业务标准外部订单号,比如交易外部订单号，代表商户端自己订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 联通资费产品名称
	 */
	@ApiField("product_name")
	private String productName;

    /**
     * Gets gmt status change.
     *
     * @return the gmt status change
     */
    public Long getGmtStatusChange() {
		return this.gmtStatusChange;
	}

    /**
     * Sets gmt status change.
     *
     * @param gmtStatusChange the gmt status change
     */
    public void setGmtStatusChange(Long gmtStatusChange) {
		this.gmtStatusChange = gmtStatusChange;
	}

    /**
     * Gets mobile.
     *
     * @return the mobile
     */
    public String getMobile() {
		return this.mobile;
	}

    /**
     * Sets mobile.
     *
     * @param mobile the mobile
     */
    public void setMobile(String mobile) {
		this.mobile = mobile;
	}

    /**
     * Gets operation type.
     *
     * @return the operation type
     */
    public String getOperationType() {
		return this.operationType;
	}

    /**
     * Sets operation type.
     *
     * @param operationType the operation type
     */
    public void setOperationType(String operationType) {
		this.operationType = operationType;
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
     * Gets product name.
     *
     * @return the product name
     */
    public String getProductName() {
		return this.productName;
	}

    /**
     * Sets product name.
     *
     * @param productName the product name
     */
    public void setProductName(String productName) {
		this.productName = productName;
	}

}
