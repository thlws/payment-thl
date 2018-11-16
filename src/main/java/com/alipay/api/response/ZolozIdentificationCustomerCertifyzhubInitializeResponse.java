package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.identification.customer.certifyzhub.initialize response.
 *
 * @author auto create
 * @since 1.0, 2018-09-10 12:13:56
 */
public class ZolozIdentificationCustomerCertifyzhubInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 4462671435978268848L;

	/** 
	 * 业务单据号，用于核对和排查
	 */
	@ApiField("biz_id")
	private String bizId;

	/** 
	 * 人脸服务端返回码
	 */
	@ApiField("zim_code")
	private String zimCode;

	/** 
	 * 唯一标识一次人脸服务的id
	 */
	@ApiField("zim_id")
	private String zimId;

	/** 
	 * 人脸服务端返回信息
	 */
	@ApiField("zim_msg")
	private String zimMsg;

    /**
     * Sets biz id.
     *
     * @param bizId the biz id
     */
    public void setBizId(String bizId) {
		this.bizId = bizId;
	}

    /**
     * Gets biz id.
     *
     * @return the biz id
     */
    public String getBizId( ) {
		return this.bizId;
	}

    /**
     * Sets zim code.
     *
     * @param zimCode the zim code
     */
    public void setZimCode(String zimCode) {
		this.zimCode = zimCode;
	}

    /**
     * Gets zim code.
     *
     * @return the zim code
     */
    public String getZimCode( ) {
		return this.zimCode;
	}

    /**
     * Sets zim id.
     *
     * @param zimId the zim id
     */
    public void setZimId(String zimId) {
		this.zimId = zimId;
	}

    /**
     * Gets zim id.
     *
     * @return the zim id
     */
    public String getZimId( ) {
		return this.zimId;
	}

    /**
     * Sets zim msg.
     *
     * @param zimMsg the zim msg
     */
    public void setZimMsg(String zimMsg) {
		this.zimMsg = zimMsg;
	}

    /**
     * Gets zim msg.
     *
     * @return the zim msg
     */
    public String getZimMsg( ) {
		return this.zimMsg;
	}

}
