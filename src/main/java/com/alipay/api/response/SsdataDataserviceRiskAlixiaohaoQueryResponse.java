package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.risk.alixiaohao.query response.
 *
 * @author auto create
 * @since 1.0, 2017-07-26 14:38:27
 */
public class SsdataDataserviceRiskAlixiaohaoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2824227872186424497L;

	/** 
	 * 是否阿里小号
	 */
	@ApiField("is_alixiaohao")
	private Boolean isAlixiaohao;

    /**
     * Sets is alixiaohao.
     *
     * @param isAlixiaohao the is alixiaohao
     */
    public void setIsAlixiaohao(Boolean isAlixiaohao) {
		this.isAlixiaohao = isAlixiaohao;
	}

    /**
     * Gets is alixiaohao.
     *
     * @return the is alixiaohao
     */
    public Boolean getIsAlixiaohao( ) {
		return this.isAlixiaohao;
	}

}
