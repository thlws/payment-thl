package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.authsubs.add response.
 *
 * @author auto create
 * @since 1.0, 2015-07-29 17:11:25
 */
public class AlipayOpenAppAuthsubsAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 1139966281566911185L;

	/** 
	 * 授权结果唯一标识
	 */
	@ApiField("auth_code")
	private String authCode;

	/** 
	 * 表明订购失效时间
	 */
	@ApiField("invalid_date")
	private Date invalidDate;

    /**
     * Sets auth code.
     *
     * @param authCode the auth code
     */
    public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

    /**
     * Gets auth code.
     *
     * @return the auth code
     */
    public String getAuthCode( ) {
		return this.authCode;
	}

    /**
     * Sets invalid date.
     *
     * @param invalidDate the invalid date
     */
    public void setInvalidDate(Date invalidDate) {
		this.invalidDate = invalidDate;
	}

    /**
     * Gets invalid date.
     *
     * @return the invalid date
     */
    public Date getInvalidDate( ) {
		return this.invalidDate;
	}

}
