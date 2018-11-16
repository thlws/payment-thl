package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询报关详细信息
 *
 * @author auto create
 * @since 1.0, 2018-03-02 14:37:16
 */
public class AlipayTradeCustomsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8276993195484481339L;

	/**
	 * 报关请求号。需要查询的商户端报关请求号，支持批量查询，
多个值用英文半角逗号分隔，单次请求最多10个;
	 */
	@ApiField("out_request_nos")
	private String outRequestNos;

    /**
     * Gets out request nos.
     *
     * @return the out request nos
     */
    public String getOutRequestNos() {
		return this.outRequestNos;
	}

    /**
     * Sets out request nos.
     *
     * @param outRequestNos the out request nos
     */
    public void setOutRequestNos(String outRequestNos) {
		this.outRequestNos = outRequestNos;
	}

}
