package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV同步售后单状态
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:28:26
 */
public class AlipayEcoMycarMaintainAftersaleSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8323892259676413487L;

	/**
	 * 车主平台售后编号
	 */
	@ApiField("aftersale_no")
	private String aftersaleNo;

	/**
	 * 客服拒绝退款原因描述
	 */
	@ApiField("refuse_reason")
	private String refuseReason;

	/**
	 * 1：受理 2：拒绝
	 */
	@ApiField("status")
	private String status;

    /**
     * Gets aftersale no.
     *
     * @return the aftersale no
     */
    public String getAftersaleNo() {
		return this.aftersaleNo;
	}

    /**
     * Sets aftersale no.
     *
     * @param aftersaleNo the aftersale no
     */
    public void setAftersaleNo(String aftersaleNo) {
		this.aftersaleNo = aftersaleNo;
	}

    /**
     * Gets refuse reason.
     *
     * @return the refuse reason
     */
    public String getRefuseReason() {
		return this.refuseReason;
	}

    /**
     * Sets refuse reason.
     *
     * @param refuseReason the refuse reason
     */
    public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
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

}
