package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.acquire.precreate response.
 *
 * @author auto create
 * @since 1.0, 2018-05-22 11:49:56
 */
public class AlipayAcquirePrecreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5644138612799435224L;

	/** 
	 * 详细错误码。对返回响应码进行原因说明
当result_code响应码为SUCCESS时，不返回该参数。
	 */
	@ApiField("detail_error_code")
	private String detailErrorCode;

	/** 
	 * 对详细错误码进行文字说明
当result_code响应码为SUCCESS时，不返回该参数
	 */
	@ApiField("detail_error_des")
	private String detailErrorDes;

	/** 
	 * 错误代码。
请求成功时，不存在本参数；
请求失败时，本参数为错误代码
	 */
	@ApiField("error")
	private String error;

	/** 
	 * 请求是否成功。请求成功不代表业务处理成功
T代表成功
F代表失败
	 */
	@ApiField("is_success")
	private String isSuccess;

	/** 
	 * 对应商户网站的订单系统中的唯一订单号，非支付宝交易号。
需保证在商户网站中的唯一性。是请求时对应的参数，原样返回
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 二维码图片的URL地址
	 */
	@ApiField("pic_url")
	private String picUrl;

	/** 
	 * 二维码码串的内容
	 */
	@ApiField("qr_code")
	private String qrCode;

	/** 
	 * 预下单处理结果响应码。
SUCCESS：预下单成功
FAIL：预下单失败
UNKNOWN：结果未知
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 支付宝交易号。该交易在支付宝系统中的交易流水号。
最短16位，最长64位
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 凭证类型，目前仅支持qrcode（二维码）
	 */
	@ApiField("voucher_type")
	private String voucherType;

    /**
     * Sets detail error code.
     *
     * @param detailErrorCode the detail error code
     */
    public void setDetailErrorCode(String detailErrorCode) {
		this.detailErrorCode = detailErrorCode;
	}

    /**
     * Gets detail error code.
     *
     * @return the detail error code
     */
    public String getDetailErrorCode( ) {
		return this.detailErrorCode;
	}

    /**
     * Sets detail error des.
     *
     * @param detailErrorDes the detail error des
     */
    public void setDetailErrorDes(String detailErrorDes) {
		this.detailErrorDes = detailErrorDes;
	}

    /**
     * Gets detail error des.
     *
     * @return the detail error des
     */
    public String getDetailErrorDes( ) {
		return this.detailErrorDes;
	}

    /**
     * Sets error.
     *
     * @param error the error
     */
    public void setError(String error) {
		this.error = error;
	}

    /**
     * Gets error.
     *
     * @return the error
     */
    public String getError( ) {
		return this.error;
	}

    /**
     * Sets is success.
     *
     * @param isSuccess the is success
     */
    public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}

    /**
     * Gets is success.
     *
     * @return the is success
     */
    public String getIsSuccess( ) {
		return this.isSuccess;
	}

    /**
     * Sets out trade no.
     *
     * @param outTradeNo the out trade no
     */
    public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

    /**
     * Gets out trade no.
     *
     * @return the out trade no
     */
    public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

    /**
     * Sets pic url.
     *
     * @param picUrl the pic url
     */
    public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

    /**
     * Gets pic url.
     *
     * @return the pic url
     */
    public String getPicUrl( ) {
		return this.picUrl;
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
     * Sets result code.
     *
     * @param resultCode the result code
     */
    public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

    /**
     * Gets result code.
     *
     * @return the result code
     */
    public String getResultCode( ) {
		return this.resultCode;
	}

    /**
     * Sets trade no.
     *
     * @param tradeNo the trade no
     */
    public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

    /**
     * Gets trade no.
     *
     * @return the trade no
     */
    public String getTradeNo( ) {
		return this.tradeNo;
	}

    /**
     * Sets voucher type.
     *
     * @param voucherType the voucher type
     */
    public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

    /**
     * Gets voucher type.
     *
     * @return the voucher type
     */
    public String getVoucherType( ) {
		return this.voucherType;
	}

}
