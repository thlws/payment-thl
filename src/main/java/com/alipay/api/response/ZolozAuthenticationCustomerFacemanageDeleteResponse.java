package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.customer.facemanage.delete response.
 *
 * @author auto create
 * @since 1.0, 2018-07-27 17:35:00
 */
public class ZolozAuthenticationCustomerFacemanageDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 8795445487377366954L;

	/** 
	 * 返回值
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 返回码
	 */
	@ApiField("retcode")
	private String retcode;

	/** 
	 * 返回详细码
	 */
	@ApiField("retcodesub")
	private String retcodesub;

	/** 
	 * 返回信息
	 */
	@ApiField("retmessage")
	private String retmessage;

	/** 
	 * 返回详细信息
	 */
	@ApiField("retmessagesub")
	private String retmessagesub;

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
     * Sets retcode.
     *
     * @param retcode the retcode
     */
    public void setRetcode(String retcode) {
		this.retcode = retcode;
	}

    /**
     * Gets retcode.
     *
     * @return the retcode
     */
    public String getRetcode( ) {
		return this.retcode;
	}

    /**
     * Sets retcodesub.
     *
     * @param retcodesub the retcodesub
     */
    public void setRetcodesub(String retcodesub) {
		this.retcodesub = retcodesub;
	}

    /**
     * Gets retcodesub.
     *
     * @return the retcodesub
     */
    public String getRetcodesub( ) {
		return this.retcodesub;
	}

    /**
     * Sets retmessage.
     *
     * @param retmessage the retmessage
     */
    public void setRetmessage(String retmessage) {
		this.retmessage = retmessage;
	}

    /**
     * Gets retmessage.
     *
     * @return the retmessage
     */
    public String getRetmessage( ) {
		return this.retmessage;
	}

    /**
     * Sets retmessagesub.
     *
     * @param retmessagesub the retmessagesub
     */
    public void setRetmessagesub(String retmessagesub) {
		this.retmessagesub = retmessagesub;
	}

    /**
     * Gets retmessagesub.
     *
     * @return the retmessagesub
     */
    public String getRetmessagesub( ) {
		return this.retmessagesub;
	}

}
