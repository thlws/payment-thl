package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.user.sitemember.enterprise.match response.
 *
 * @author auto create
 * @since 1.0, 2018-09-06 14:20:00
 */
public class MybankCreditUserSitememberEnterpriseMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 1134877231627394655L;

	/** 
	 * 本接口会通过传入的alipay_login_id查询企业支付宝会员信息，然后与传入的企业信息做比对，同时满足下面2个条件时返回true，反之则为false：
1. 公司名称一致；
2. 支付宝会员中的证件号存在于传入的工商注册号和社会信用代码里的一个
	 */
	@ApiField("match")
	private Boolean match;

	/** 
	 * MEMBER_NOT_EXIST 会员不存在
MEMBER_CERT_GRADE_NOT_CORRECT 会员认证等级不正确
COMPANY_NAME_DIFF 公司名称不同
COMPANY_CERTNO_DIFF 公司证件号不同
	 */
	@ApiField("not_match_code")
	private String notMatchCode;

    /**
     * Sets match.
     *
     * @param match the match
     */
    public void setMatch(Boolean match) {
		this.match = match;
	}

    /**
     * Gets match.
     *
     * @return the match
     */
    public Boolean getMatch( ) {
		return this.match;
	}

    /**
     * Sets not match code.
     *
     * @param notMatchCode the not match code
     */
    public void setNotMatchCode(String notMatchCode) {
		this.notMatchCode = notMatchCode;
	}

    /**
     * Gets not match code.
     *
     * @return the not match code
     */
    public String getNotMatchCode( ) {
		return this.notMatchCode;
	}

}
