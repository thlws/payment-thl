package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.policy.query response.
 *
 * @author auto create
 * @since 1.0, 2018-09-18 10:50:24
 */
public class AlipaySecurityRiskPolicyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4181963124111233456L;

	/** 
	 * 是否出二次核身的标识
	 */
	@ApiField("has_to_check")
	private Boolean hasToCheck;

	/** 
	 * 风险咨询情况下返回的风险等级，风险处理不会返回该值
	 */
	@ApiField("level")
	private Long level;

	/** 
	 * 查询是否成功
	 */
	@ApiField("query_success")
	private Boolean querySuccess;

	/** 
	 * 安全请求生成的唯一ID
	 */
	@ApiField("security_id")
	private String securityId;

	/** 
	 * 是否成功，本版本废弃
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 有风险需要失败业务情况下的返回码
	 */
	@ApiField("template_code")
	private String templateCode;

	/** 
	 * 有风险需要失败业务情况下的返回码描述
	 */
	@ApiField("template_desc")
	private String templateDesc;

	/** 
	 * native场景下的核身id
	 */
	@ApiField("verify_id")
	private String verifyId;

	/** 
	 * h5场景下的核身地址
	 */
	@ApiField("verify_url")
	private String verifyUrl;

    /**
     * Sets has to check.
     *
     * @param hasToCheck the has to check
     */
    public void setHasToCheck(Boolean hasToCheck) {
		this.hasToCheck = hasToCheck;
	}

    /**
     * Gets has to check.
     *
     * @return the has to check
     */
    public Boolean getHasToCheck( ) {
		return this.hasToCheck;
	}

    /**
     * Sets level.
     *
     * @param level the level
     */
    public void setLevel(Long level) {
		this.level = level;
	}

    /**
     * Gets level.
     *
     * @return the level
     */
    public Long getLevel( ) {
		return this.level;
	}

    /**
     * Sets query success.
     *
     * @param querySuccess the query success
     */
    public void setQuerySuccess(Boolean querySuccess) {
		this.querySuccess = querySuccess;
	}

    /**
     * Gets query success.
     *
     * @return the query success
     */
    public Boolean getQuerySuccess( ) {
		return this.querySuccess;
	}

    /**
     * Sets security id.
     *
     * @param securityId the security id
     */
    public void setSecurityId(String securityId) {
		this.securityId = securityId;
	}

    /**
     * Gets security id.
     *
     * @return the security id
     */
    public String getSecurityId( ) {
		return this.securityId;
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
     * Sets template code.
     *
     * @param templateCode the template code
     */
    public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

    /**
     * Gets template code.
     *
     * @return the template code
     */
    public String getTemplateCode( ) {
		return this.templateCode;
	}

    /**
     * Sets template desc.
     *
     * @param templateDesc the template desc
     */
    public void setTemplateDesc(String templateDesc) {
		this.templateDesc = templateDesc;
	}

    /**
     * Gets template desc.
     *
     * @return the template desc
     */
    public String getTemplateDesc( ) {
		return this.templateDesc;
	}

    /**
     * Sets verify id.
     *
     * @param verifyId the verify id
     */
    public void setVerifyId(String verifyId) {
		this.verifyId = verifyId;
	}

    /**
     * Gets verify id.
     *
     * @return the verify id
     */
    public String getVerifyId( ) {
		return this.verifyId;
	}

    /**
     * Sets verify url.
     *
     * @param verifyUrl the verify url
     */
    public void setVerifyUrl(String verifyUrl) {
		this.verifyUrl = verifyUrl;
	}

    /**
     * Gets verify url.
     *
     * @return the verify url
     */
    public String getVerifyUrl( ) {
		return this.verifyUrl;
	}

}
