package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.life.label.create response.
 *
 * @author auto create
 * @since 1.0, 2018-07-25 13:52:34
 */
public class AlipayOpenPublicLifeLabelCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3322223274138199776L;

	/** 
	 * 标签id
	 */
	@ApiField("label_id")
	private String labelId;

    /**
     * Sets label id.
     *
     * @param labelId the label id
     */
    public void setLabelId(String labelId) {
		this.labelId = labelId;
	}

    /**
     * Gets label id.
     *
     * @return the label id
     */
    public String getLabelId( ) {
		return this.labelId;
	}

}
