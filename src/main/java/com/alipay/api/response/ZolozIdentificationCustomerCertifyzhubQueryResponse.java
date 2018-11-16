package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.identification.customer.certifyzhub.query response.
 *
 * @author auto create
 * @since 1.0, 2018-09-16 10:03:19
 */
public class ZolozIdentificationCustomerCertifyzhubQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8848456357477213511L;

	/** 
	 * 业务单据号，用于核对和排查
	 */
	@ApiField("biz_id")
	private String bizId;

	/** 
	 * 图片字节数组进行Base64编码后的字符串
	 */
	@ApiField("img_str")
	private String imgStr;

	/** 
	 * 人脸服务端返回码
	 */
	@ApiField("zim_code")
	private String zimCode;

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
     * Sets img str.
     *
     * @param imgStr the img str
     */
    public void setImgStr(String imgStr) {
		this.imgStr = imgStr;
	}

    /**
     * Gets img str.
     *
     * @return the img str
     */
    public String getImgStr( ) {
		return this.imgStr;
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
