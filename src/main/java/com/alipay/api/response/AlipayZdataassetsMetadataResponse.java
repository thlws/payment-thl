package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CustomerEntity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.zdataassets.metadata response.
 *
 * @author auto create
 * @since 1.0, 2017-04-26 15:12:06
 */
public class AlipayZdataassetsMetadataResponse extends AlipayResponse {

	private static final long serialVersionUID = 3389223283893438925L;

	/** 
	 * 用户标签集合
	 */
	@ApiListField("result")
	@ApiField("customer_entity")
	private List<CustomerEntity> result;

    /**
     * Sets result.
     *
     * @param result the result
     */
    public void setResult(List<CustomerEntity> result) {
		this.result = result;
	}

    /**
     * Gets result.
     *
     * @return the result
     */
    public List<CustomerEntity> getResult( ) {
		return this.result;
	}

}
