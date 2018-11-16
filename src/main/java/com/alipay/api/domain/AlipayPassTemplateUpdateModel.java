package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝pass更新模版接口
 *
 * @author auto create
 * @since 1.0, 2018-01-09 22:28:13
 */
public class AlipayPassTemplateUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 1483127814112174591L;

	/**
	 * 模板内容信息，遵循JSON规范，详情参见tpl_content参数说明:https://doc.open.alipay.com/doc2/detail.htm?treeId=193&articleId=105249&docType=1#tpl_content
	 */
	@ApiField("tpl_content")
	private String tplContent;

	/**
	 * 更新的模板ID
	 */
	@ApiField("tpl_id")
	private String tplId;

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
     * Gets tpl id.
     *
     * @return the tpl id
     */
    public String getTplId() {
		return this.tplId;
	}

    /**
     * Sets tpl id.
     *
     * @param tplId the tpl id
     */
    public void setTplId(String tplId) {
		this.tplId = tplId;
	}

}
