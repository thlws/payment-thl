package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营业执照
 *
 * @author auto create
 * @since 1.0, 2018-04-20 09:30:36
 */
public class BusinessLicenseCertFileds extends AlipayObject {

	private static final long serialVersionUID = 2416998761918581614L;

	/**
	 * 社会信用代码
	 */
	@ApiField("creditcode")
	private String creditcode;

	/**
	 * 公司名字
	 */
	@ApiField("entname")
	private String entname;

    /**
     * Gets creditcode.
     *
     * @return the creditcode
     */
    public String getCreditcode() {
		return this.creditcode;
	}

    /**
     * Sets creditcode.
     *
     * @param creditcode the creditcode
     */
    public void setCreditcode(String creditcode) {
		this.creditcode = creditcode;
	}

    /**
     * Gets entname.
     *
     * @return the entname
     */
    public String getEntname() {
		return this.entname;
	}

    /**
     * Sets entname.
     *
     * @param entname the entname
     */
    public void setEntname(String entname) {
		this.entname = entname;
	}

}
