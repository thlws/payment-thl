package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.label.add response.
 *
 * @author auto create
 * @since 1.0, 2016-07-29 20:00:29
 */
public class AlipayMobilePublicLabelAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 5123685417377464196L;

	/** 
	 * 结果码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 标签编码
	 */
	@ApiField("id")
	private Long id;

	/** 
	 * 结果信息
	 */
	@ApiField("msg")
	private String msg;

	/** 
	 * 标签名称
	 */
	@ApiField("name")
	private String name;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
		this.id = id;
	}

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId( ) {
		return this.id;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName( ) {
		return this.name;
	}

}
