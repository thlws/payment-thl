package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应链金融-预付申请单取消
 *
 * @author auto create
 * @since 1.0, 2018-02-08 14:28:25
 */
public class MybankCreditSupplychainPrepaymentCancelModel extends AlipayObject {

	private static final long serialVersionUID = 6616345547629911731L;

	/**
	 * 买家身份信息
	 */
	@ApiField("buyer")
	private Member buyer;

	/**
	 * 预付申请单编号，由调用创建预付申请时自动分配。
	 */
	@ApiField("prepay_apply_no")
	private String prepayApplyNo;

	/**
	 * 接口幂等字段，相同requestId请求系统默认认为是相同的请求。此处requestId要求的格式为"{机构IpRoleId}_{机构生成的唯一请求ID}"。
	 */
	@ApiField("request_id")
	private String requestId;

    /**
     * Gets buyer.
     *
     * @return the buyer
     */
    public Member getBuyer() {
		return this.buyer;
	}

    /**
     * Sets buyer.
     *
     * @param buyer the buyer
     */
    public void setBuyer(Member buyer) {
		this.buyer = buyer;
	}

    /**
     * Gets prepay apply no.
     *
     * @return the prepay apply no
     */
    public String getPrepayApplyNo() {
		return this.prepayApplyNo;
	}

    /**
     * Sets prepay apply no.
     *
     * @param prepayApplyNo the prepay apply no
     */
    public void setPrepayApplyNo(String prepayApplyNo) {
		this.prepayApplyNo = prepayApplyNo;
	}

    /**
     * Gets request id.
     *
     * @return the request id
     */
    public String getRequestId() {
		return this.requestId;
	}

    /**
     * Sets request id.
     *
     * @param requestId the request id
     */
    public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
