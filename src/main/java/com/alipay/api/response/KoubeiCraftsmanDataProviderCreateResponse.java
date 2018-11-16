package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.craftsman.data.provider.create response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class KoubeiCraftsmanDataProviderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7497854834866213373L;

	/** 
	 * 手艺人id
	 */
	@ApiField("craftsman_id")
	private String craftsmanId;

    /**
     * Sets craftsman id.
     *
     * @param craftsmanId the craftsman id
     */
    public void setCraftsmanId(String craftsmanId) {
		this.craftsmanId = craftsmanId;
	}

    /**
     * Gets craftsman id.
     *
     * @return the craftsman id
     */
    public String getCraftsmanId( ) {
		return this.craftsmanId;
	}

}
