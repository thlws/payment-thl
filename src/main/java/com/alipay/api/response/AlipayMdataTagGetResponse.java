package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mdata.tag.get response.
 *
 * @author auto create
 * @since 1.0, 2015-03-11 14:09:56
 */
public class AlipayMdataTagGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7161133567157477748L;

	/** 
	 * 查询到的标签值, JSON字符串
	 */
	@ApiField("tag_values")
	private String tagValues;

    /**
     * Sets tag values.
     *
     * @param tagValues the tag values
     */
    public void setTagValues(String tagValues) {
		this.tagValues = tagValues;
	}

    /**
     * Gets tag values.
     *
     * @return the tag values
     */
    public String getTagValues( ) {
		return this.tagValues;
	}

}
