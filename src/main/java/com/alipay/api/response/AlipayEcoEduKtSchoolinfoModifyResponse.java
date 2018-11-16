package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.edu.kt.schoolinfo.modify response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayEcoEduKtSchoolinfoModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2316691188174761676L;

	/** 
	 * 支付宝分配给学校的编码，作为学校在支付宝的标识
	 */
	@ApiField("school_no")
	private String schoolNo;

	/** 
	 * Y：代表成功；N：代表失败
	 */
	@ApiField("status")
	private String status;

    /**
     * Sets school no.
     *
     * @param schoolNo the school no
     */
    public void setSchoolNo(String schoolNo) {
		this.schoolNo = schoolNo;
	}

    /**
     * Gets school no.
     *
     * @return the school no
     */
    public String getSchoolNo( ) {
		return this.schoolNo;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus( ) {
		return this.status;
	}

}
