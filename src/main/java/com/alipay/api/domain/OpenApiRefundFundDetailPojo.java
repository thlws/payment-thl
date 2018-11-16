package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 退款资金明细
 *
 * @author auto create
 * @since 1.0, 2018-09-08 00:51:09
 */
public class OpenApiRefundFundDetailPojo extends AlipayObject {

	private static final long serialVersionUID = 8245654414674487995L;

	/**
	 * 退款资金明细
详：
若type为paySerialNo则funds为
[{"paySerialNo":"支付流水1","refundFee":"退款金额1"},{"paySerialNo":"支付流水2","refundFee":"退款金额2"}]
	 */
	@ApiListField("funds")
	@ApiField("string")
	private List<String> funds;

	/**
	 * 收入方账户
为空则原路退回
	 */
	@ApiField("trans_in")
	private String transIn;

	/**
	 * 收入方账户类型
	 */
	@ApiField("trans_in_type")
	private String transInType;

	/**
	 * 描述资金明细类型
详：若type为paySerialNo
则funds参数中体现的都为对应支付流水的退款明细
	 */
	@ApiField("type")
	private String type;

    /**
     * Gets funds.
     *
     * @return the funds
     */
    public List<String> getFunds() {
		return this.funds;
	}

    /**
     * Sets funds.
     *
     * @param funds the funds
     */
    public void setFunds(List<String> funds) {
		this.funds = funds;
	}

    /**
     * Gets trans in.
     *
     * @return the trans in
     */
    public String getTransIn() {
		return this.transIn;
	}

    /**
     * Sets trans in.
     *
     * @param transIn the trans in
     */
    public void setTransIn(String transIn) {
		this.transIn = transIn;
	}

    /**
     * Gets trans in type.
     *
     * @return the trans in type
     */
    public String getTransInType() {
		return this.transInType;
	}

    /**
     * Sets trans in type.
     *
     * @param transInType the trans in type
     */
    public void setTransInType(String transInType) {
		this.transInType = transInType;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
	}

}
