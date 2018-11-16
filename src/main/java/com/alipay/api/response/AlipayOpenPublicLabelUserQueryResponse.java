package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.label.user.query response.
 *
 * @author auto create
 * @since 1.0, 2016-12-08 11:53:10
 */
public class AlipayOpenPublicLabelUserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1199559817354165974L;

	/** 
	 * 用户标签id列表，以英文逗号分隔
	 */
	@ApiField("label_ids")
	private String labelIds;

    /**
     * Sets label ids.
     *
     * @param labelIds the label ids
     */
    public void setLabelIds(String labelIds) {
		this.labelIds = labelIds;
	}

    /**
     * Gets label ids.
     *
     * @return the label ids
     */
    public String getLabelIds( ) {
		return this.labelIds;
	}

}
