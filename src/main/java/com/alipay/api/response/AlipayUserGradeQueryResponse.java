package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.grade.query response.
 *
 * @author auto create
 * @since 1.0, 2018-04-27 11:35:54
 */
public class AlipayUserGradeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8251135567955267463L;

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
