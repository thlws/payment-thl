package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退税用户信息查询
 *
 * @author auto create
 * @since 1.0, 2018-09-06 11:05:52
 */
public class AlipayOverseasTaxUserinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3245277759382231757L;

	/**
	 * 支付宝账号标识号,由identify_account_type指定类型:
identify_account_type为barcode表示支付宝钱包付款码,退税公司通过扫描用户支付宝钱包付款码获取,17位到32位的数字
	 */
	@ApiField("identify_account_no")
	private String identifyAccountNo;

	/**
	 * 支付宝账号标识类型，
条码退税，取值：barcode
	 */
	@ApiField("identify_account_type")
	private String identifyAccountType;

    /**
     * Gets identify account no.
     *
     * @return the identify account no
     */
    public String getIdentifyAccountNo() {
		return this.identifyAccountNo;
	}

    /**
     * Sets identify account no.
     *
     * @param identifyAccountNo the identify account no
     */
    public void setIdentifyAccountNo(String identifyAccountNo) {
		this.identifyAccountNo = identifyAccountNo;
	}

    /**
     * Gets identify account type.
     *
     * @return the identify account type
     */
    public String getIdentifyAccountType() {
		return this.identifyAccountType;
	}

    /**
     * Sets identify account type.
     *
     * @param identifyAccountType the identify account type
     */
    public void setIdentifyAccountType(String identifyAccountType) {
		this.identifyAccountType = identifyAccountType;
	}

}
