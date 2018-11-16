package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序内容风险检测服务
 *
 * @author auto create
 * @since 1.0, 2018-07-13 18:26:08
 */
public class AlipaySecurityRiskContentDetectModel extends AlipayObject {

	private static final long serialVersionUID = 6519831785194142172L;

	/**
	 * 需要识别的文本，不要包含特殊字符以及双引号等可能引起json格式化错误问题的字符.
	 */
	@ApiField("content")
	private String content;

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

}
