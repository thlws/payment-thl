package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.content.detect response.
 *
 * @author auto create
 * @since 1.0, 2018-07-30 15:40:00
 */
public class AlipaySecurityRiskContentDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 6322483571266325273L;

	/** 
	 * 表示处理结果，REJECTED表示拦截，PASSED表示放过。
	 */
	@ApiField("action")
	private String action;

	/** 
	 * 命中的关键词列表
	 */
	@ApiListField("keywords")
	@ApiField("string")
	private List<String> keywords;

	/** 
	 * 业务唯一识别码，可用来对应异步识别结果
	 */
	@ApiField("unique_id")
	private String uniqueId;

    /**
     * Sets action.
     *
     * @param action the action
     */
    public void setAction(String action) {
		this.action = action;
	}

    /**
     * Gets action.
     *
     * @return the action
     */
    public String getAction( ) {
		return this.action;
	}

    /**
     * Sets keywords.
     *
     * @param keywords the keywords
     */
    public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}

    /**
     * Gets keywords.
     *
     * @return the keywords
     */
    public List<String> getKeywords( ) {
		return this.keywords;
	}

    /**
     * Sets unique id.
     *
     * @param uniqueId the unique id
     */
    public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

    /**
     * Gets unique id.
     *
     * @return the unique id
     */
    public String getUniqueId( ) {
		return this.uniqueId;
	}

}
