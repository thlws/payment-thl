package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.identification.customer.certify.consult response.
 *
 * @author auto create
 * @since 1.0, 2017-10-10 15:09:34
 */
public class ZolozIdentificationCustomerCertifyConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3251192291942533376L;

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

}
