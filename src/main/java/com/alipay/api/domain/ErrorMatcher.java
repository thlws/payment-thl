package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户打标接口失败的匹配器
 *
 * @author auto create
 * @since 1.0, 2017-06-01 11:25:22
 */
public class ErrorMatcher extends AlipayObject {

	private static final long serialVersionUID = 2537876335116691359L;

	/**
	 * 失败原因
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 用户打标接口出错的匹配器
	 */
	@ApiField("matcher")
	private Matcher matcher;

    /**
     * Gets error msg.
     *
     * @return the error msg
     */
    public String getErrorMsg() {
		return this.errorMsg;
	}

    /**
     * Sets error msg.
     *
     * @param errorMsg the error msg
     */
    public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

    /**
     * Gets matcher.
     *
     * @return the matcher
     */
    public Matcher getMatcher() {
		return this.matcher;
	}

    /**
     * Sets matcher.
     *
     * @param matcher the matcher
     */
    public void setMatcher(Matcher matcher) {
		this.matcher = matcher;
	}

}
