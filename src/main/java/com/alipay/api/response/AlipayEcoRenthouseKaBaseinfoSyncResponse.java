package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.renthouse.ka.baseinfo.sync response.
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:48:00
 */
public class AlipayEcoRenthouseKaBaseinfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7611765185149943132L;

	/** 
	 * 返回kaCode唯一标识,用户查询ka信息时候用
	 */
	@ApiField("ka_code")
	private String kaCode;

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

}
