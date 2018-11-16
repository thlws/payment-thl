package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pass.instance.add response.
 *
 * @author auto create
 * @since 1.0, 2018-07-23 15:40:00
 */
public class AlipayPassInstanceAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 8287333663257829742L;

	/** 
	 * 接口调用返回结果信息
serialNumber：唯一核销凭证串号（必须由动态传参指定）
passId：券唯一id
operation：本次调用的操作类型，ADD
errorCode：处理结果码（错误码）
errorMsg：处理结果说明（错误说明）
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 操作成功标识【true：成功；false：失败】
	 */
	@ApiField("success")
	private String success;

    /**
     * Sets result.
     *
     * @param result the result
     */
    public void setResult(String result) {
		this.result = result;
	}

    /**
     * Gets result.
     *
     * @return the result
     */
    public String getResult( ) {
		return this.result;
	}

    /**
     * Sets success.
     *
     * @param success the success
     */
    public void setSuccess(String success) {
		this.success = success;
	}

    /**
     * Gets success.
     *
     * @return the success
     */
    public String getSuccess( ) {
		return this.success;
	}

}
