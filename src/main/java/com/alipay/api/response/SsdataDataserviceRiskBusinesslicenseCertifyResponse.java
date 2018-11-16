package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.risk.businesslicense.certify response.
 *
 * @author auto create
 * @since 1.0, 2018-03-05 14:51:28
 */
public class SsdataDataserviceRiskBusinesslicenseCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3512832427181453773L;

	/** 
	 * 营业执照的公司地址
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 业务令牌，由服务端生成后下发，是联系图片认证和非图片认证的桥梁，非图片认证时设置biz_id为上次图片认证调用返回的bis_token，视为一次调用，不会重复计费
	 */
	@ApiField("bis_token")
	private String bisToken;

	/** 
	 * 图片本次检测结果，true：认证成功；false：认证未成功
	 */
	@ApiField("check_result")
	private Boolean checkResult;

	/** 
	 * 企业营业执照统一信用码，每个企业唯一的编号
	 */
	@ApiField("credit_code")
	private String creditCode;

	/** 
	 * 营业执照法人名称
	 */
	@ApiField("ent_legal_name")
	private String entLegalName;

	/** 
	 * 企业名称
	 */
	@ApiField("ent_name")
	private String entName;

	/** 
	 * 营业执照营业期限
	 */
	@ApiField("expires")
	private String expires;

	/** 
	 * 有效期终止时间
	 */
	@ApiField("expires_end")
	private String expiresEnd;

	/** 
	 * 有效期起始时间
	 */
	@ApiField("expires_start")
	private String expiresStart;

	/** 
	 * 返回匹配的字段，多个字段一英文逗号分割 ，企业营业执照统一信用码在底层数据库中为空，字段返回空。
	 */
	@ApiField("match_param")
	private String matchParam;

	/** 
	 * 不匹配的字段，多个字段以英文逗号分割，企业营业执照统一信用码在底层数据库中为空，字段返回空。
	 */
	@ApiField("no_match_param")
	private String noMatchParam;

	/** 
	 * 业务唯一识别码
	 */
	@ApiField("unique_id")
	private String uniqueId;

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
		this.address = address;
	}

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress( ) {
		return this.address;
	}

    /**
     * Sets bis token.
     *
     * @param bisToken the bis token
     */
    public void setBisToken(String bisToken) {
		this.bisToken = bisToken;
	}

    /**
     * Gets bis token.
     *
     * @return the bis token
     */
    public String getBisToken( ) {
		return this.bisToken;
	}

    /**
     * Sets check result.
     *
     * @param checkResult the check result
     */
    public void setCheckResult(Boolean checkResult) {
		this.checkResult = checkResult;
	}

    /**
     * Gets check result.
     *
     * @return the check result
     */
    public Boolean getCheckResult( ) {
		return this.checkResult;
	}

    /**
     * Sets credit code.
     *
     * @param creditCode the credit code
     */
    public void setCreditCode(String creditCode) {
		this.creditCode = creditCode;
	}

    /**
     * Gets credit code.
     *
     * @return the credit code
     */
    public String getCreditCode( ) {
		return this.creditCode;
	}

    /**
     * Sets ent legal name.
     *
     * @param entLegalName the ent legal name
     */
    public void setEntLegalName(String entLegalName) {
		this.entLegalName = entLegalName;
	}

    /**
     * Gets ent legal name.
     *
     * @return the ent legal name
     */
    public String getEntLegalName( ) {
		return this.entLegalName;
	}

    /**
     * Sets ent name.
     *
     * @param entName the ent name
     */
    public void setEntName(String entName) {
		this.entName = entName;
	}

    /**
     * Gets ent name.
     *
     * @return the ent name
     */
    public String getEntName( ) {
		return this.entName;
	}

    /**
     * Sets expires.
     *
     * @param expires the expires
     */
    public void setExpires(String expires) {
		this.expires = expires;
	}

    /**
     * Gets expires.
     *
     * @return the expires
     */
    public String getExpires( ) {
		return this.expires;
	}

    /**
     * Sets expires end.
     *
     * @param expiresEnd the expires end
     */
    public void setExpiresEnd(String expiresEnd) {
		this.expiresEnd = expiresEnd;
	}

    /**
     * Gets expires end.
     *
     * @return the expires end
     */
    public String getExpiresEnd( ) {
		return this.expiresEnd;
	}

    /**
     * Sets expires start.
     *
     * @param expiresStart the expires start
     */
    public void setExpiresStart(String expiresStart) {
		this.expiresStart = expiresStart;
	}

    /**
     * Gets expires start.
     *
     * @return the expires start
     */
    public String getExpiresStart( ) {
		return this.expiresStart;
	}

    /**
     * Sets match param.
     *
     * @param matchParam the match param
     */
    public void setMatchParam(String matchParam) {
		this.matchParam = matchParam;
	}

    /**
     * Gets match param.
     *
     * @return the match param
     */
    public String getMatchParam( ) {
		return this.matchParam;
	}

    /**
     * Sets no match param.
     *
     * @param noMatchParam the no match param
     */
    public void setNoMatchParam(String noMatchParam) {
		this.noMatchParam = noMatchParam;
	}

    /**
     * Gets no match param.
     *
     * @return the no match param
     */
    public String getNoMatchParam( ) {
		return this.noMatchParam;
	}

    /**
     * Sets unique id.
     *
     * @param uniqueId the unique id
     */
    public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

    /**
     * Gets unique id.
     *
     * @return the unique id
     */
    public String getUniqueId( ) {
		return this.uniqueId;
	}

}
