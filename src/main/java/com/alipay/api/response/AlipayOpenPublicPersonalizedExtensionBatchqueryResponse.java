package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QueryExtension;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.personalized.extension.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-07-25 13:54:59
 */
public class AlipayOpenPublicPersonalizedExtensionBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6627673898347657755L;

	/** 
	 * 扩展区套数
	 */
	@ApiField("count")
	private Long count;

	/** 
	 * 扩展区信息
	 */
	@ApiListField("extensions")
	@ApiField("query_extension")
	private List<QueryExtension> extensions;

    /**
     * Sets count.
     *
     * @param count the count
     */
    public void setCount(Long count) {
		this.count = count;
	}

    /**
     * Gets count.
     *
     * @return the count
     */
    public Long getCount( ) {
		return this.count;
	}

    /**
     * Sets extensions.
     *
     * @param extensions the extensions
     */
    public void setExtensions(List<QueryExtension> extensions) {
		this.extensions = extensions;
	}

    /**
     * Gets extensions.
     *
     * @return the extensions
     */
    public List<QueryExtension> getExtensions( ) {
		return this.extensions;
	}

}
