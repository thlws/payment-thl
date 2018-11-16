package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 徐伟波测试用
 *
 * @author auto create
 * @since 1.0, 2018-08-09 19:45:02
 */
public class AlipaySecurityProdXwbtestprodQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8147992413594788565L;

	/**
	 * Stop
	 */
	@ApiField("in_a")
	private String inA;

	/**
	 * 省份编码，国标码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * wert
	 */
	@ApiField("qwe_dfgfd")
	private String qweDfgfd;

    /**
     * Gets in a.
     *
     * @return the in a
     */
    public String getInA() {
		return this.inA;
	}

    /**
     * Sets in a.
     *
     * @param inA the in a
     */
    public void setInA(String inA) {
		this.inA = inA;
	}

    /**
     * Gets province code.
     *
     * @return the province code
     */
    public String getProvinceCode() {
		return this.provinceCode;
	}

    /**
     * Sets province code.
     *
     * @param provinceCode the province code
     */
    public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

    /**
     * Gets qwe dfgfd.
     *
     * @return the qwe dfgfd
     */
    public String getQweDfgfd() {
		return this.qweDfgfd;
	}

    /**
     * Sets qwe dfgfd.
     *
     * @param qweDfgfd the qwe dfgfd
     */
    public void setQweDfgfd(String qweDfgfd) {
		this.qweDfgfd = qweDfgfd;
	}

}
