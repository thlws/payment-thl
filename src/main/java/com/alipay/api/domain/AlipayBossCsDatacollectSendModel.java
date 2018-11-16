package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 舆情数据处理平台外部数据提交接口
 *
 * @author auto create
 * @since 1.0, 2017-06-02 13:56:58
 */
public class AlipayBossCsDatacollectSendModel extends AlipayObject {

	private static final long serialVersionUID = 2676579423582843938L;

	/**
	 * 上数提交数据内容
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
