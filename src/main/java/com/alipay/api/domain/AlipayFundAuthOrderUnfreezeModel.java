package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预授权资金解冻接口
 *
 * @author auto create
 * @since 1.0, 2018-07-23 11:31:38
 */
public class AlipayFundAuthOrderUnfreezeModel extends AlipayObject {

	private static final long serialVersionUID = 2122243151539979538L;

	/**
	 * 本次操作解冻的金额，单位为：元（人民币），精确到小数点后两位，取值范围：[0.01,100000000.00]
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 支付宝资金授权订单号
	 */
	@ApiField("auth_no")
	private String authNo;

	/**
	 * 解冻扩展信息，json格式；unfreezeBizInfo 目前为芝麻消费字段，支持Key值如下：
"bizComplete":"true" -- 选填：标识本次解冻用户是否履约，如果true信用单会完结为COMPLETE
	 */
	@ApiField("extra_param")
	private String extraParam;

	/**
	 * 商户本次资金操作的请求流水号，同一商户每次不同的资金操作请求，商户请求流水号不能重复
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 商户对本次解冻操作的附言描述，长度不超过100个字母或50个汉字
	 */
	@ApiField("remark")
	private String remark;

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public String getAmount() {
		return this.amount;
	}

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(String amount) {
		this.amount = amount;
	}

    /**
     * Gets auth no.
     *
     * @return the auth no
     */
    public String getAuthNo() {
		return this.authNo;
	}

    /**
     * Sets auth no.
     *
     * @param authNo the auth no
     */
    public void setAuthNo(String authNo) {
		this.authNo = authNo;
	}

    /**
     * Gets extra param.
     *
     * @return the extra param
     */
    public String getExtraParam() {
		return this.extraParam;
	}

    /**
     * Sets extra param.
     *
     * @param extraParam the extra param
     */
    public void setExtraParam(String extraParam) {
		this.extraParam = extraParam;
	}

    /**
     * Gets out request no.
     *
     * @return the out request no
     */
    public String getOutRequestNo() {
		return this.outRequestNo;
	}

    /**
     * Sets out request no.
     *
     * @param outRequestNo the out request no
     */
    public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

    /**
     * Gets remark.
     *
     * @return the remark
     */
    public String getRemark() {
		return this.remark;
	}

    /**
     * Sets remark.
     *
     * @param remark the remark
     */
    public void setRemark(String remark) {
		this.remark = remark;
	}

}
