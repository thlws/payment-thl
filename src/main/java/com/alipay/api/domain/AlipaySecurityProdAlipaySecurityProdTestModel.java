package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 安全业务操作
 *
 * @author auto create
 * @since 1.0, 2016-03-02 10:47:05
 */
public class AlipaySecurityProdAlipaySecurityProdTestModel extends AlipayObject {

	private static final long serialVersionUID = 7693475314985434958L;

	/**
	 * ddd
	 */
	@ApiListField("cds")
	@ApiField("string")
	private List<String> cds;

	/**
	 * aaa
	 */
	@ApiField("ddd")
	private String ddd;

    /**
     * Gets cds.
     *
     * @return the cds
     */
    public List<String> getCds() {
		return this.cds;
	}

    /**
     * Sets cds.
     *
     * @param cds the cds
     */
    public void setCds(List<String> cds) {
		this.cds = cds;
	}

    /**
     * Gets ddd.
     *
     * @return the ddd
     */
    public String getDdd() {
		return this.ddd;
	}

    /**
     * Sets ddd.
     *
     * @param ddd the ddd
     */
    public void setDdd(String ddd) {
		this.ddd = ddd;
	}

}
