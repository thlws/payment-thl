package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ErrorMatcher;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.matchuser.label.delete response.
 *
 * @author auto create
 * @since 1.0, 2018-07-25 13:51:59
 */
public class AlipayOpenPublicMatchuserLabelDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 4145856883612873124L;

	/** 
	 * 用户打标失败数量
	 */
	@ApiField("error_count")
	private Long errorCount;

	/** 
	 * 出错的匹配器列表
	 */
	@ApiListField("error_matchers")
	@ApiField("error_matcher")
	private List<ErrorMatcher> errorMatchers;

    /**
     * Sets error count.
     *
     * @param errorCount the error count
     */
    public void setErrorCount(Long errorCount) {
		this.errorCount = errorCount;
	}

    /**
     * Gets error count.
     *
     * @return the error count
     */
    public Long getErrorCount( ) {
		return this.errorCount;
	}

    /**
     * Sets error matchers.
     *
     * @param errorMatchers the error matchers
     */
    public void setErrorMatchers(List<ErrorMatcher> errorMatchers) {
		this.errorMatchers = errorMatchers;
	}

    /**
     * Gets error matchers.
     *
     * @return the error matchers
     */
    public List<ErrorMatcher> getErrorMatchers( ) {
		return this.errorMatchers;
	}

}
