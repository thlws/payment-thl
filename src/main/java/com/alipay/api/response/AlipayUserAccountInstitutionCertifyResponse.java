package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.institution.certify response.
 *
 * @author auto create
 * @since 1.0, 2017-02-10 10:27:11
 */
public class AlipayUserAccountInstitutionCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6826869279624195383L;

	/** 
	 * 机构是否存在的标示
如果此机构存在，exist返回值为T
如果此机构不存在，exist返回为F
	 */
	@ApiField("match")
	private String match;

	/** 
	 * 该帐号对应的uid
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Sets match.
     *
     * @param match the match
     */
    public void setMatch(String match) {
		this.match = match;
	}

    /**
     * Gets match.
     *
     * @return the match
     */
    public String getMatch( ) {
		return this.match;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId( ) {
		return this.userId;
	}

}
