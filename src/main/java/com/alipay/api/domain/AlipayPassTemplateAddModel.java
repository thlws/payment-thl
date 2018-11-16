package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡券模板创建
 *
 * @author auto create
 * @since 1.0, 2018-01-09 22:27:56
 */
public class AlipayPassTemplateAddModel extends AlipayObject {

	private static final long serialVersionUID = 4534467125712142311L;

	/**
	 * 模板内容信息，遵循JSON规范，详情参见tpl_content参数说明：https://doc.open.alipay.com/doc2/detail.htm?treeId=193&articleId=105249&docType=1#tpl_content
	 */
	@ApiField("tpl_content")
	private String tplContent;

	/**
	 * 商户用于控制模版的唯一性。（可以使用时间戳保证唯一性）
	 */
	@ApiField("unique_id")
	private String uniqueId;

    /**
     * Gets tpl content.
     *
     * @return the tpl content
     */
    public String getTplContent() {
		return this.tplContent;
	}

    /**
     * Sets tpl content.
     *
     * @param tplContent the tpl content
     */
    public void setTplContent(String tplContent) {
		this.tplContent = tplContent;
	}

    /**
     * Gets unique id.
     *
     * @return the unique id
     */
    public String getUniqueId() {
		return this.uniqueId;
	}

    /**
     * Sets unique id.
     *
     * @param uniqueId the unique id
     */
    public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

}
