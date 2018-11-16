package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公服业务通用办理流水查询
 *
 * @author auto create
 * @since 1.0, 2018-07-17 15:14:14
 */
public class AlipayEbppIndustryApplyflowQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2351774949123443259L;

	/**
	 * 支付宝办理流水号，支持幂等，和外部办理流水号之间必须传一个
	 */
	@ApiField("apply_flow_no")
	private String applyFlowNo;

	/**
	 * 拓展字段
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 外部申请流水号，支持幂等，和支付宝办理流水号之间必须传一个
	 */
	@ApiField("out_apply_no")
	private String outApplyNo;

    /**
     * Gets apply flow no.
     *
     * @return the apply flow no
     */
    public String getApplyFlowNo() {
		return this.applyFlowNo;
	}

    /**
     * Sets apply flow no.
     *
     * @param applyFlowNo the apply flow no
     */
    public void setApplyFlowNo(String applyFlowNo) {
		this.applyFlowNo = applyFlowNo;
	}

    /**
     * Gets extend field.
     *
     * @return the extend field
     */
    public String getExtendField() {
		return this.extendField;
	}

    /**
     * Sets extend field.
     *
     * @param extendField the extend field
     */
    public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

    /**
     * Gets out apply no.
     *
     * @return the out apply no
     */
    public String getOutApplyNo() {
		return this.outApplyNo;
	}

    /**
     * Sets out apply no.
     *
     * @param outApplyNo the out apply no
     */
    public void setOutApplyNo(String outApplyNo) {
		this.outApplyNo = outApplyNo;
	}

}
