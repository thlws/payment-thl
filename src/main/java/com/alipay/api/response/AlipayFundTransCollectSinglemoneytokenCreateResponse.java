package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.collect.singlemoneytoken.create response.
 *
 * @author auto create
 * @since 1.0, 2018-08-02 19:05:00
 */
public class AlipayFundTransCollectSinglemoneytokenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1383257316894873699L;

	/** 
	 * 其他扩展属性
	 */
	@ApiField("ext_param")
	private String extParam;

	/** 
	 * 收钱二维码
	 */
	@ApiField("qr_code")
	private String qrCode;

	/** 
	 * 吱口令文案
	 */
	@ApiField("zhi_token")
	private String zhiToken;

    /**
     * Sets ext param.
     *
     * @param extParam the ext param
     */
    public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

    /**
     * Gets ext param.
     *
     * @return the ext param
     */
    public String getExtParam( ) {
		return this.extParam;
	}

    /**
     * Sets qr code.
     *
     * @param qrCode the qr code
     */
    public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

    /**
     * Gets qr code.
     *
     * @return the qr code
     */
    public String getQrCode( ) {
		return this.qrCode;
	}

    /**
     * Sets zhi token.
     *
     * @param zhiToken the zhi token
     */
    public void setZhiToken(String zhiToken) {
		this.zhiToken = zhiToken;
	}

    /**
     * Gets zhi token.
     *
     * @return the zhi token
     */
    public String getZhiToken( ) {
		return this.zhiToken;
	}

}
