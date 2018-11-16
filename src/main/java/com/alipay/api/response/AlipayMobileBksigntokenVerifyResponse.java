package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.bksigntoken.verify response.
 *
 * @author auto create
 * @since 1.0, 2017-04-07 18:08:15
 */
public class AlipayMobileBksigntokenVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4322489758726447648L;

	/** 
	 * 返回值创建时间
	 */
	@ApiField("createtimestamp")
	private String createtimestamp;

	/** 
	 * 返回值logonId
	 */
	@ApiField("loginid")
	private String loginid;

	/** 
	 * 结果说明
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * 结果状态码
	 */
	@ApiField("resultcode")
	private Long resultcode;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 返回值userId
	 */
	@ApiField("userid")
	private String userid;

    /**
     * Sets createtimestamp.
     *
     * @param createtimestamp the createtimestamp
     */
    public void setCreatetimestamp(String createtimestamp) {
		this.createtimestamp = createtimestamp;
	}

    /**
     * Gets createtimestamp.
     *
     * @return the createtimestamp
     */
    public String getCreatetimestamp( ) {
		return this.createtimestamp;
	}

    /**
     * Sets loginid.
     *
     * @param loginid the loginid
     */
    public void setLoginid(String loginid) {
		this.loginid = loginid;
	}

    /**
     * Gets loginid.
     *
     * @return the loginid
     */
    public String getLoginid( ) {
		return this.loginid;
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

    /**
     * Sets resultcode.
     *
     * @param resultcode the resultcode
     */
    public void setResultcode(Long resultcode) {
		this.resultcode = resultcode;
	}

    /**
     * Gets resultcode.
     *
     * @return the resultcode
     */
    public Long getResultcode( ) {
		return this.resultcode;
	}

    /**
     * Sets success.
     *
     * @param success the success
     */
    public void setSuccess(Boolean success) {
		this.success = success;
	}

    /**
     * Gets success.
     *
     * @return the success
     */
    public Boolean getSuccess( ) {
		return this.success;
	}

    /**
     * Sets userid.
     *
     * @param userid the userid
     */
    public void setUserid(String userid) {
		this.userid = userid;
	}

    /**
     * Gets userid.
     *
     * @return the userid
     */
    public String getUserid( ) {
		return this.userid;
	}

}
