package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.autoinsprod.common.consult response.
 *
 * @author auto create
 * @since 1.0, 2018-01-09 11:44:10
 */
public class AlipayInsAutoAutoinsprodCommonConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6143617613188551635L;

	/** 
	 * 具体内容按照业务类型对应的key值传输
	 */
	@ApiField("biz_data")
	private String bizData;

    /**
     * Sets biz data.
     *
     * @param bizData the biz data
     */
    public void setBizData(String bizData) {
		this.bizData = bizData;
	}

    /**
     * Gets biz data.
     *
     * @return the biz data
     */
    public String getBizData( ) {
		return this.bizData;
	}

}
