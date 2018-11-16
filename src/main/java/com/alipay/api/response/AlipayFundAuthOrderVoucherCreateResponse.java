package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.auth.order.voucher.create response.
 *
 * @author auto create
 * @since 1.0, 2018-07-26 17:30:00
 */
public class AlipayFundAuthOrderVoucherCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7724775588738821162L;

	/** 
	 * 码类型，分为  barCode：条形码 (一维码) 和 qrCode:二维码(qrCode) ；
目前发码只支持 qrCode
	 */
	@ApiField("code_type")
	private String codeType;

	/** 
	 * 生成的带有支付宝logo的二维码地址，如：http://mobilecodec.alipay.com/show.htm?code=aeparsv2dknkqf3018556a；商户端通过在末尾追加picSize来指定要显示的图片大小，如
显示1280大小的URL:http://mobilecodec.alipay.com/show.htm?code=aeparsv2dknkqf3018556a&picSize=1280；目前支持的大小有：256, 227, 270, 344, 430, 512, 570, 860, 1280, 1546；
	 */
	@ApiField("code_url")
	private String codeUrl;

	/** 
	 * 当前发码请求生成的二维码码串，商户端可以利用二维码生成工具根据该码串值生成对应的二维码
	 */
	@ApiField("code_value")
	private String codeValue;

	/** 
	 * 商户的授权资金订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 商户本次资金操作的请求流水号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

    /**
     * Sets code type.
     *
     * @param codeType the code type
     */
    public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

    /**
     * Gets code type.
     *
     * @return the code type
     */
    public String getCodeType( ) {
		return this.codeType;
	}

    /**
     * Sets code url.
     *
     * @param codeUrl the code url
     */
    public void setCodeUrl(String codeUrl) {
		this.codeUrl = codeUrl;
	}

    /**
     * Gets code url.
     *
     * @return the code url
     */
    public String getCodeUrl( ) {
		return this.codeUrl;
	}

    /**
     * Sets code value.
     *
     * @param codeValue the code value
     */
    public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
	}

    /**
     * Gets code value.
     *
     * @return the code value
     */
    public String getCodeValue( ) {
		return this.codeValue;
	}

    /**
     * Sets out order no.
     *
     * @param outOrderNo the out order no
     */
    public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

    /**
     * Gets out order no.
     *
     * @return the out order no
     */
    public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

    /**
     * Sets out request no.
     *
     * @param outRequestNo the out request no
     */
    public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

    /**
     * Gets out request no.
     *
     * @return the out request no
     */
    public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

}
