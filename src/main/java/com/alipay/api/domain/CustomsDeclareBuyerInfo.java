package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报关订购人信息，即用户留在商户处的身份信息。可用于与支付单的身份信息作比对。
 *
 * @author auto create
 * @since 1.0, 2018-03-02 14:37:05
 */
public class CustomsDeclareBuyerInfo extends AlipayObject {

	private static final long serialVersionUID = 5442262323675819916L;

	/**
	 * 订购人身份证号。即订购人留在商户处的身份证信息
	 */
	@ApiField("buyer_cert_no")
	private String buyerCertNo;

	/**
	 * 订购人姓名。即订购人留在商户处的姓名信息
	 */
	@ApiField("buyer_name")
	private String buyerName;

    /**
     * Gets buyer cert no.
     *
     * @return the buyer cert no
     */
    public String getBuyerCertNo() {
		return this.buyerCertNo;
	}

    /**
     * Sets buyer cert no.
     *
     * @param buyerCertNo the buyer cert no
     */
    public void setBuyerCertNo(String buyerCertNo) {
		this.buyerCertNo = buyerCertNo;
	}

    /**
     * Gets buyer name.
     *
     * @return the buyer name
     */
    public String getBuyerName() {
		return this.buyerName;
	}

    /**
     * Sets buyer name.
     *
     * @param buyerName the buyer name
     */
    public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

}
