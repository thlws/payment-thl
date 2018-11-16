package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.modellist.create response.
 *
 * @author auto create
 * @since 1.0, 2017-09-14 22:22:34
 */
public class AlipayCommerceIotModellistCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2272115999683173188L;

	/** 
	 * 重复的型号id列表，当所请求创建的型号已经存在时，则将已存在的型号id列表通过该字段返回
	 */
	@ApiListField("duplicated_model_ids")
	@ApiField("string")
	private List<String> duplicatedModelIds;

    /**
     * Sets duplicated entity ids.
     *
     * @param duplicatedModelIds the duplicated entity ids
     */
    public void setDuplicatedModelIds(List<String> duplicatedModelIds) {
		this.duplicatedModelIds = duplicatedModelIds;
	}

    /**
     * Gets duplicated entity ids.
     *
     * @return the duplicated entity ids
     */
    public List<String> getDuplicatedModelIds( ) {
		return this.duplicatedModelIds;
	}

}
