package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社区物业报事报修单状态更新
 *
 * @author auto create
 * @since 1.0, 2018-06-09 20:19:57
 */
public class AlipayEcoCplifeRepairStatusUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 4263183459143985437L;

	/**
	 * 报修单状态明细
	 */
	@ApiField("biz_details")
	private String bizDetails;

	/**
	 * 当前报修单状态
	 */
	@ApiField("biz_state")
	private String bizState;

	/**
	 * 报修单ID
	 */
	@ApiField("req_id")
	private String reqId;

    /**
     * Gets biz details.
     *
     * @return the biz details
     */
    public String getBizDetails() {
		return this.bizDetails;
	}

    /**
     * Sets biz details.
     *
     * @param bizDetails the biz details
     */
    public void setBizDetails(String bizDetails) {
		this.bizDetails = bizDetails;
	}

    /**
     * Gets biz state.
     *
     * @return the biz state
     */
    public String getBizState() {
		return this.bizState;
	}

    /**
     * Sets biz state.
     *
     * @param bizState the biz state
     */
    public void setBizState(String bizState) {
		this.bizState = bizState;
	}

    /**
     * Gets req id.
     *
     * @return the req id
     */
    public String getReqId() {
		return this.reqId;
	}

    /**
     * Sets req id.
     *
     * @param reqId the req id
     */
    public void setReqId(String reqId) {
		this.reqId = reqId;
	}

}
