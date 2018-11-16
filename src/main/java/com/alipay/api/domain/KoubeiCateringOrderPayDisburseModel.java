package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 餐饮pos业务订单支付
 *
 * @author auto create
 * @since 1.0, 2018-04-14 17:40:48
 */
public class KoubeiCateringOrderPayDisburseModel extends AlipayObject {

	private static final long serialVersionUID = 1318937622665921128L;

	/**
	 * 支付授权码，25~30开头的长度为16~24位的数字，实际字符串长度以开发者获取的付款码长度为准
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 是否享受会员价。如果为true，菜明细里面会按照会员价（没有改价情况下）作为单品价格咨询单品券优惠
	 */
	@ApiField("member_flag")
	private Boolean memberFlag;

	/**
	 * 外部支付订单号，唯一标识本次支付的requestID
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
	 * 订单付款金额，以元为单位，精确到分
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 是否整单不可打折
	 */
	@ApiField("undiscountable")
	private Boolean undiscountable;

    /**
     * Gets auth code.
     *
     * @return the auth code
     */
    public String getAuthCode() {
		return this.authCode;
	}

    /**
     * Sets auth code.
     *
     * @param authCode the auth code
     */
    public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

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

}
