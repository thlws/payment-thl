package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.item.extitem.info.delete response.
 *
 * @author auto create
 * @since 1.0, 2017-09-27 17:56:37
 */
public class KoubeiItemExtitemInfoDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 1612617521851859665L;

	/** 
	 * 删除成功，返回主键id
	 */
	@ApiField("id")
	private String id;

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
		this.id = id;
	}

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId( ) {
		return this.id;
	}

}
