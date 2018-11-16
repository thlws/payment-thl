package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.renthouse.ka.baseinfo.query response.
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:53:07
 */
public class AlipayEcoRenthouseKaBaseinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7214325534159264778L;

	/** 
	 * 返回kaCode唯一标识
	 */
	@ApiField("ka_code")
	private String kaCode;

	/** 
	 * ka名称
	 */
	@ApiField("ka_name")
	private String kaName;

	/** 
	 * 是否生效 1:生效 0:没有生效
	 */
	@ApiField("valid")
	private String valid;

    /**
     * Sets ka code.
     *
     * @param kaCode the ka code
     */
    public void setKaCode(String kaCode) {
		this.kaCode = kaCode;
	}

    /**
     * Gets ka code.
     *
     * @return the ka code
     */
    public String getKaCode( ) {
		return this.kaCode;
	}

    /**
     * Sets ka name.
     *
     * @param kaName the ka name
     */
    public void setKaName(String kaName) {
		this.kaName = kaName;
	}

    /**
     * Gets ka name.
     *
     * @return the ka name
     */
    public String getKaName( ) {
		return this.kaName;
	}

    /**
     * Sets valid.
     *
     * @param valid the valid
     */
    public void setValid(String valid) {
		this.valid = valid;
	}

    /**
     * Gets valid.
     *
     * @return the valid
     */
    public String getValid( ) {
		return this.valid;
	}

}
