package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.data.feedbackurl.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class ZhimaDataFeedbackurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1434453865751362824L;

	/** 
	 * 反馈模板地址
	 */
	@ApiField("feedback_url")
	private String feedbackUrl;

    /**
     * Sets feedback url.
     *
     * @param feedbackUrl the feedback url
     */
    public void setFeedbackUrl(String feedbackUrl) {
		this.feedbackUrl = feedbackUrl;
	}

    /**
     * Gets feedback url.
     *
     * @return the feedback url
     */
    public String getFeedbackUrl( ) {
		return this.feedbackUrl;
	}

}
