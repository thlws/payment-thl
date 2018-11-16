package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 宣讲会下架接口
 *
 * @author auto create
 * @since 1.0, 2017-08-03 10:59:08
 */
public class AlipayEcoEduCampusJobtalkCancelModel extends AlipayObject {

	private static final long serialVersionUID = 6666962552121455218L;

	/**
	 * 备用字段，json格式
	 */
	@ApiField("content_var")
	private String contentVar;

	/**
	 * 宣讲会来源方id
	 */
	@ApiField("talk_source_code")
	private String talkSourceCode;

	/**
	 * 宣讲会在合作方的ID
	 */
	@ApiField("talk_source_id")
	private String talkSourceId;

    /**
     * Gets content var.
     *
     * @return the content var
     */
    public String getContentVar() {
		return this.contentVar;
	}

    /**
     * Sets content var.
     *
     * @param contentVar the content var
     */
    public void setContentVar(String contentVar) {
		this.contentVar = contentVar;
	}

    /**
     * Gets talk source code.
     *
     * @return the talk source code
     */
    public String getTalkSourceCode() {
		return this.talkSourceCode;
	}

    /**
     * Sets talk source code.
     *
     * @param talkSourceCode the talk source code
     */
    public void setTalkSourceCode(String talkSourceCode) {
		this.talkSourceCode = talkSourceCode;
	}

    /**
     * Gets talk source id.
     *
     * @return the talk source id
     */
    public String getTalkSourceId() {
		return this.talkSourceId;
	}

    /**
     * Sets talk source id.
     *
     * @param talkSourceId the talk source id
     */
    public void setTalkSourceId(String talkSourceId) {
		this.talkSourceId = talkSourceId;
	}

}
