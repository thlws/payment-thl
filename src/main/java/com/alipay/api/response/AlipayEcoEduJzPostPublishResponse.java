package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.edu.jz.post.publish response.
 *
 * @author auto create
 * @since 1.0, 2016-12-15 00:03:56
 */
public class AlipayEcoEduJzPostPublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 5354949588146846994L;

	/** 
	 * 职位编号
	 */
	@ApiField("third_id")
	private String thirdId;

    /**
     * Sets third id.
     *
     * @param thirdId the third id
     */
    public void setThirdId(String thirdId) {
		this.thirdId = thirdId;
	}

    /**
     * Gets third id.
     *
     * @return the third id
     */
    public String getThirdId( ) {
		return this.thirdId;
	}

}
