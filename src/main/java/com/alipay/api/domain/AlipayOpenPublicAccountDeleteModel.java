package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 解除绑定商户会员号
 *
 * @author auto create
 * @since 1.0, 2016-12-02 15:41:31
 */
public class AlipayOpenPublicAccountDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2155984387759621268L;

	/**
	 * 协议号，商户会员在支付宝服务窗账号中的唯一标识，与bind_account_no不能同时为空
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 绑定帐号，建议在开发者的系统中保持唯一性，与agreement_id不能同时为空
	 */
	@ApiField("bind_account_no")
	private String bindAccountNo;

    /**
     * Gets agreement id.
     *
     * @return the agreement id
     */
    public String getAgreementId() {
		return this.agreementId;
	}

    /**
     * Sets agreement id.
     *
     * @param agreementId the agreement id
     */
    public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

    /**
     * Gets bind account no.
     *
     * @return the bind account no
     */
    public String getBindAccountNo() {
		return this.bindAccountNo;
	}

    /**
     * Sets bind account no.
     *
     * @param bindAccountNo the bind account no
     */
    public void setBindAccountNo(String bindAccountNo) {
		this.bindAccountNo = bindAccountNo;
	}

}
