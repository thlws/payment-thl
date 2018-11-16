package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚁盾内容识别
 *
 * @author auto create
 * @since 1.0, 2017-10-12 14:00:00
 */
public class SsdataDataserviceRiskContentVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 4333954446599456972L;

	/**
	 * 需要识别的文本，不要包含特殊字符以及双引号等可能引起json格式化错误问题的字符
	 */
	@ApiField("content")
	private String content;

	/**
	 * 风险类型，0-垃圾广告，1-暴恐政， 2-涉黄， 3-涉毒，4-涉赌
	 */
	@ApiField("risk_type")
	private String riskType;

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent() {
		return this.content;
	}

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(String content) {
		this.content = content;
	}

    /**
     * Gets risk type.
     *
     * @return the risk type
     */
    public String getRiskType() {
		return this.riskType;
	}

    /**
     * Sets risk type.
     *
     * @param riskType the risk type
     */
    public void setRiskType(String riskType) {
		this.riskType = riskType;
	}

}
