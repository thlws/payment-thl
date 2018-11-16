package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.label.user.query response.
 *
 * @author auto create
 * @since 1.0, 2016-07-29 19:58:41
 */
public class AlipayMobilePublicLabelUserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4732525626266442388L;

	/** 
	 * 结果码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 标签编号，英文逗号分隔。
	 */
	@ApiField("label_ids")
	private String labelIds;

	/** 
	 * 结果信息
	 */
	@ApiField("msg")
	private String msg;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

    /**
     * Sets label ids.
     *
     * @param labelIds the label ids
     */
    public void setLabelIds(String labelIds) {
		this.labelIds = labelIds;
	}

    /**
     * Gets label ids.
     *
     * @return the label ids
     */
    public String getLabelIds( ) {
		return this.labelIds;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

}
