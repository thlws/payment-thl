package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物业小区摘要信息列表
 *
 * @author auto create
 * @since 1.0, 2017-01-14 11:36:39
 */
public class CPCommunitySet extends AlipayObject {

	private static final long serialVersionUID = 4488796881113793433L;

	/**
	 * 支付宝社区小区统一编号。
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 小区对应的物业公司支付宝账号PID（合作伙伴partner id）。物业公司给开发者做第三方应用授权后，开发者可获取物业公司PID。
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 小区在物业系统中的唯一编号。若开发者传入过，则返回。
	 */
	@ApiField("out_community_id")
	private String outCommunityId;

	/**
	 * 小区当前状态,状态值：
PENDING_ONLINE 待上线
ONLINE - 上线
MAINTAIN - 维护中
OFFLINE - 下线
	 */
	@ApiField("status")
	private String status;

    /**
     * Gets community id.
     *
     * @return the community id
     */
    public String getCommunityId() {
		return this.communityId;
	}

    /**
     * Sets community id.
     *
     * @param communityId the community id
     */
    public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

    /**
     * Gets merchant pid.
     *
     * @return the merchant pid
     */
    public String getMerchantPid() {
		return this.merchantPid;
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
     * Gets out community id.
     *
     * @return the out community id
     */
    public String getOutCommunityId() {
		return this.outCommunityId;
	}

    /**
     * Sets out community id.
     *
     * @param outCommunityId the out community id
     */
    public void setOutCommunityId(String outCommunityId) {
		this.outCommunityId = outCommunityId;
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
