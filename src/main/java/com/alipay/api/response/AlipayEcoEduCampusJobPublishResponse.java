package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.edu.campus.job.publish response.
 *
 * @author auto create
 * @since 1.0, 2017-06-01 14:55:55
 */
public class AlipayEcoEduCampusJobPublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 4475174695594239763L;

	/** 
	 * 备注问题，或者异常
	 */
	@ApiField("content")
	private String content;

	/** 
	 * 消息描述
	 */
	@ApiField("description")
	private String description;

	/** 
	 * 返回code编码;成功返回SUCCESS
	 */
	@ApiField("isv_code")
	private String isvCode;

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(String content) {
		this.content = content;
	}

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent( ) {
		return this.content;
	}

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
		this.description = description;
	}

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription( ) {
		return this.description;
	}

    /**
     * Sets isv code.
     *
     * @param isvCode the isv code
     */
    public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
	}

    /**
     * Gets isv code.
     *
     * @return the isv code
     */
    public String getIsvCode( ) {
		return this.isvCode;
	}

}
