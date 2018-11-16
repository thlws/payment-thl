package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户分析数据
 *
 * @author auto create
 * @since 1.0, 2017-12-06 11:29:09
 */
public class UserAnalysisData extends AlipayObject {

	private static final long serialVersionUID = 8556859146568328447L;

	/**
	 * 取消关注人数
	 */
	@ApiField("cancel_user_cnt")
	private String cancelUserCnt;

	/**
	 * 累积关注人数
	 */
	@ApiField("cumulate_user_cnt")
	private String cumulateUserCnt;

	/**
	 * 日期
	 */
	@ApiField("date")
	private String date;

	/**
	 * 净增关注人数
	 */
	@ApiField("grow_user_cnt")
	private String growUserCnt;

	/**
	 * 新关注人数
	 */
	@ApiField("new_user_cnt")
	private String newUserCnt;

    /**
     * Gets cancel user cnt.
     *
     * @return the cancel user cnt
     */
    public String getCancelUserCnt() {
		return this.cancelUserCnt;
	}

    /**
     * Sets cancel user cnt.
     *
     * @param cancelUserCnt the cancel user cnt
     */
    public void setCancelUserCnt(String cancelUserCnt) {
		this.cancelUserCnt = cancelUserCnt;
	}

    /**
     * Gets cumulate user cnt.
     *
     * @return the cumulate user cnt
     */
    public String getCumulateUserCnt() {
		return this.cumulateUserCnt;
	}

    /**
     * Sets cumulate user cnt.
     *
     * @param cumulateUserCnt the cumulate user cnt
     */
    public void setCumulateUserCnt(String cumulateUserCnt) {
		this.cumulateUserCnt = cumulateUserCnt;
	}

    /**
     * Gets date.
     *
     * @return the date
     */
    public String getDate() {
		return this.date;
	}

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(String date) {
		this.date = date;
	}

    /**
     * Gets grow user cnt.
     *
     * @return the grow user cnt
     */
    public String getGrowUserCnt() {
		return this.growUserCnt;
	}

    /**
     * Sets grow user cnt.
     *
     * @param growUserCnt the grow user cnt
     */
    public void setGrowUserCnt(String growUserCnt) {
		this.growUserCnt = growUserCnt;
	}

    /**
     * Gets new user cnt.
     *
     * @return the new user cnt
     */
    public String getNewUserCnt() {
		return this.newUserCnt;
	}

    /**
     * Sets new user cnt.
     *
     * @param newUserCnt the new user cnt
     */
    public void setNewUserCnt(String newUserCnt) {
		this.newUserCnt = newUserCnt;
	}

}
