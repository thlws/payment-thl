package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.grade.authbase.query response.
 *
 * @author auto create
 * @since 1.0, 2018-06-13 16:29:40
 */
public class AlipayUserGradeAuthbaseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6329371679132282916L;

	/** 
	 * 用户的蚂蚁会员积分余额
	 */
	@ApiField("balance")
	private Long balance;

	/** 
	 * 用户的蚂蚁会员等级
	 */
	@ApiField("grade")
	private String grade;

    /**
     * Sets balance.
     *
     * @param balance the balance
     */
    public void setBalance(Long balance) {
		this.balance = balance;
	}

    /**
     * Gets balance.
     *
     * @return the balance
     */
    public Long getBalance( ) {
		return this.balance;
	}

    /**
     * Sets grade.
     *
     * @param grade the grade
     */
    public void setGrade(String grade) {
		this.grade = grade;
	}

    /**
     * Gets grade.
     *
     * @return the grade
     */
    public String getGrade( ) {
		return this.grade;
	}

}
