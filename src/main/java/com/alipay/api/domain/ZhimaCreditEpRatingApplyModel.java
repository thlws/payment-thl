package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用基于客户的信用评估申请（页面接口）
 *
 * @author auto create
 * @since 1.0, 2018-08-24 11:14:18
 */
public class ZhimaCreditEpRatingApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2111153573336297448L;

	/**
	 * 发起申请的环境，支持以下值：
PC：PC端浏览器,
ALIPAY_H5，支付宝移动端H5,
XIAOCHENGXU:支付宝小程序
默认ALIPAY_H5
	 */
	@ApiField("apply_environment")
	private String applyEnvironment;

	/**
	 * 芝麻企业信用评估订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 商户请求的唯一标志，64位长度的字母数字下划线组合。该标识作为对账的关键信息，商户要保证其唯一性。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

    /**
     * Gets apply environment.
     *
     * @return the apply environment
     */
    public String getApplyEnvironment() {
		return this.applyEnvironment;
	}

    /**
     * Sets apply environment.
     *
     * @param applyEnvironment the apply environment
     */
    public void setApplyEnvironment(String applyEnvironment) {
		this.applyEnvironment = applyEnvironment;
	}

    /**
     * Gets order no.
     *
     * @return the order no
     */
    public String getOrderNo() {
		return this.orderNo;
	}

    /**
     * Sets order no.
     *
     * @param orderNo the order no
     */
    public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

    /**
     * Gets out order no.
     *
     * @return the out order no
     */
    public String getOutOrderNo() {
		return this.outOrderNo;
	}

    /**
     * Sets out order no.
     *
     * @param outOrderNo the out order no
     */
    public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

}
