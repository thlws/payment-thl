package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约校验信息
 *
 * @author auto create
 * @since 1.0, 2017-07-11 14:31:50
 */
public class VerifyParams extends AlipayObject {

	private static final long serialVersionUID = 5264919329946593932L;

	/**
	 * 用户证件号后4位
	 */
	@ApiField("cert_no")
	private String certNo;

    /**
     * Gets cert no.
     *
     * @return the cert no
     */
    public String getCertNo() {
		return this.certNo;
	}

    /**
     * Sets cert no.
     *
     * @param certNo the cert no
     */
    public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

}
