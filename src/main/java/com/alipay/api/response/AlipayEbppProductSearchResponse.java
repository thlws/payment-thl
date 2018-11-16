package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExproductconfResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.product.search response.
 *
 * @author auto create
 * @since 1.0, 2017-04-07 17:10:21
 */
public class AlipayEbppProductSearchResponse extends AlipayResponse {

	private static final long serialVersionUID = 7552269879298197759L;

	/** 
	 * 产品(学校)模型列表
	 */
	@ApiListField("exproductconfs")
	@ApiField("exproductconf_response")
	private List<ExproductconfResponse> exproductconfs;

    /**
     * Sets exproductconfs.
     *
     * @param exproductconfs the exproductconfs
     */
    public void setExproductconfs(List<ExproductconfResponse> exproductconfs) {
		this.exproductconfs = exproductconfs;
	}

    /**
     * Gets exproductconfs.
     *
     * @return the exproductconfs
     */
    public List<ExproductconfResponse> getExproductconfs( ) {
		return this.exproductconfs;
	}

}
