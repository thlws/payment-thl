package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 经营参谋会员人物画像查询
 *
 * @author auto create
 * @since 1.0, 2017-10-02 18:21:01
 */
public class KoubeiMarketingDataBizadviserMemberprofileQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4794627756483599974L;

	/**
	 * 会员分层，可传 ALL/4/3/2/1  五个值
传ALL查询所有分层的汇总；
传4查询 流失客层级的；
传3查询 过客层级的；
传2查询 新客层级的；
传1查询 回头客层级的；
	 */
	@ApiField("member_grade")
	private String memberGrade;

    /**
     * Gets member grade.
     *
     * @return the member grade
     */
    public String getMemberGrade() {
		return this.memberGrade;
	}

    /**
     * Sets member grade.
     *
     * @param memberGrade the member grade
     */
    public void setMemberGrade(String memberGrade) {
		this.memberGrade = memberGrade;
	}

}
