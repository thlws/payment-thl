package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 餐饮pos业务订单支付申请
 *
 * @author auto create
 * @since 1.0, 2018-05-28 13:29:45
 */
public class KoubeiCateringOrderPayApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7429149433689258748L;

	/**
	 * 是否享受会员价。如果为 true,菜明细里面会按照会员 价(没有改价情况下)作为单 品价格咨询单品券优惠
	 */
	@ApiField("member_flag")
	private Boolean memberFlag;

	/**
	 * 外部支付订单号,唯一标识本次支付的requestID
	 */
	@ApiField("out_pay_no")
	private String outPayNo;

	/**
	 * pos业务订单外部主键信息
	 */
	@ApiField("pos_order_key")
	private PosOrderKey posOrderKey;

	/**
	 * 交易超时时间  选填，默认3分钟.透传给交易，设置可支持如下格式：d:天，h:小时,m:分钟。 示例：5d,1h,3m
	 */
	@ApiField("timeout")
	private String timeout;

	/**
	 * 订单付款金额,以元为单位,精确到分
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 是否整单不可打折
	 */
	@ApiField("undiscountable")
	private Boolean undiscountable;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets member flag.
     *
     * @return the member flag
     */
    public Boolean getMemberFlag() {
		return this.memberFlag;
	}

    /**
     * Sets member flag.
     *
     * @param memberFlag the member flag
     */
    public void setMemberFlag(Boolean memberFlag) {
		this.memberFlag = memberFlag;
	}

    /**
     * Gets out pay no.
     *
     * @return the out pay no
     */
    public String getOutPayNo() {
		return this.outPayNo;
	}

    /**
     * Sets out pay no.
     *
     * @param outPayNo the out pay no
     */
    public void setOutPayNo(String outPayNo) {
		this.outPayNo = outPayNo;
	}

    /**
     * Gets pos order key.
     *
     * @return the pos order key
     */
    public PosOrderKey getPosOrderKey() {
		return this.posOrderKey;
	}

    /**
     * Sets pos order key.
     *
     * @param posOrderKey the pos order key
     */
    public void setPosOrderKey(PosOrderKey posOrderKey) {
		this.posOrderKey = posOrderKey;
	}

    /**
     * Gets timeout.
     *
     * @return the timeout
     */
    public String getTimeout() {
		return this.timeout;
	}

    /**
     * Sets timeout.
     *
     * @param timeout the timeout
     */
    public void setTimeout(String timeout) {
		this.timeout = timeout;
	}

    /**
     * Gets total amount.
     *
     * @return the total amount
     */
    public String getTotalAmount() {
		return this.totalAmount;
	}

    /**
     * Sets total amount.
     *
     * @param totalAmount the total amount
     */
    public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

    /**
     * Gets undiscountable.
     *
     * @return the undiscountable
     */
    public Boolean getUndiscountable() {
		return this.undiscountable;
	}

    /**
     * Sets undiscountable.
     *
     * @param undiscountable the undiscountable
     */
    public void setUndiscountable(Boolean undiscountable) {
		this.undiscountable = undiscountable;
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
