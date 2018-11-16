package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步发票申请结果
 *
 * @author auto create
 * @since 1.0, 2018-06-21 14:42:28
 */
public class AlipayEbppInvoiceApplyResultSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3396329617739971127L;

	/**
	 * 支付宝发起开票申请的id，该id具有唯一性，该字段由支付宝向税控发起申请的时候带过去，作为支付宝向税控开票申请的唯一标志
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 支付宝向税控商或ISV发起发票申请后，对应这笔申请的发票开具结果。
取值如下：
SUCCESS:成功;FAIL:失败
	 */
	@ApiField("result")
	private String result;

	/**
	 * 结果码，支付宝向税控商或ISV发起发票申请后，对应这笔申请的发票开具结果进行详细说明的结果码。
取值如下：
成功(SUCCESS),
参数不合法(PARAMETER_ILLEGAL),
商户税控设备异常(MERCHANT_TAX_DEVICE_ERROR).
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 结果描述，支付宝向税控商或ISV发起发票申请后，对应这笔申请的发票开具结果描述信息。
	 */
	@ApiField("result_msg")
	private String resultMsg;

	/**
	 * 该字段是税控商或ISV收到支付宝开票请求后生成的申请id，由税控商或isv自己生成，该id具有唯一性
当ISV接入时是按照tax_apply_id来查询发票信息时，该字段必填。
	 */
	@ApiField("tax_apply_id")
	private String taxApplyId;

    /**
     * Gets apply id.
     *
     * @return the apply id
     */
    public String getApplyId() {
		return this.applyId;
	}

    /**
     * Sets apply id.
     *
     * @param applyId the apply id
     */
    public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

    /**
     * Gets result.
     *
     * @return the result
     */
    public String getResult() {
		return this.result;
	}

    /**
     * Sets result.
     *
     * @param result the result
     */
    public void setResult(String result) {
		this.result = result;
	}

    /**
     * Gets result code.
     *
     * @return the result code
     */
    public String getResultCode() {
		return this.resultCode;
	}

    /**
     * Sets result code.
     *
     * @param resultCode the result code
     */
    public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

    /**
     * Gets result msg.
     *
     * @return the result msg
     */
    public String getResultMsg() {
		return this.resultMsg;
	}

    /**
     * Sets result msg.
     *
     * @param resultMsg the result msg
     */
    public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

    /**
     * Gets tax apply id.
     *
     * @return the tax apply id
     */
    public String getTaxApplyId() {
		return this.taxApplyId;
	}

    /**
     * Sets tax apply id.
     *
     * @param taxApplyId the tax apply id
     */
    public void setTaxApplyId(String taxApplyId) {
		this.taxApplyId = taxApplyId;
	}

}
