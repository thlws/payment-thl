package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁会员积分退还接口(需要用户授权)
 *
 * @author auto create
 * @since 1.0, 2017-03-23 19:50:01
 */
public class AlipayUserPointRefundModel extends AlipayObject {

	private static final long serialVersionUID = 7465343396368355841L;

	/**
	 * 业务大类，与调用扣减积分接口时传入的值一致。
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 业务流水号，用来映射需要回退积分的订单号，与调用扣减积分接口时传入的值一致。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 业务子类型，与调用扣减积分接口时传入的值一致。
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 订单所属支付宝用户的uid，与调用扣减积分接口时传入的值一致。
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType() {
		return this.bizType;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
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
     * Gets sub biz type.
     *
     * @return the sub biz type
     */
    public String getSubBizType() {
		return this.subBizType;
	}

    /**
     * Sets sub biz type.
     *
     * @param subBizType the sub biz type
     */
    public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
