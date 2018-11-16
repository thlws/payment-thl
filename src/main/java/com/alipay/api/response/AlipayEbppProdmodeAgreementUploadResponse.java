package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.prodmode.agreement.upload response.
 *
 * @author auto create
 * @since 1.0, 2018-04-26 13:56:07
 */
public class AlipayEbppProdmodeAgreementUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5833855734912895587L;

	/** 
	 * true:表示上传文件成功
false:表示上传文件失败
	 */
	@ApiField("is_success")
	private String isSuccess;

	/** 
	 * 上传文件成功备注说明。
	 */
	@ApiField("memo")
	private String memo;

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
     * Sets memo.
     *
     * @param memo the memo
     */
    public void setMemo(String memo) {
		this.memo = memo;
	}

    /**
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo( ) {
		return this.memo;
	}

}
