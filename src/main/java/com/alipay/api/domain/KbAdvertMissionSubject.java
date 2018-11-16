package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 分佣任务的标的信息
 *
 * @author auto create
 * @since 1.0, 2017-01-13 11:53:39
 */
public class KbAdvertMissionSubject extends AlipayObject {

	private static final long serialVersionUID = 2464523893238742944L;

	/**
	 * 分佣条款信息
	 */
	@ApiListField("commission_clause_list")
	@ApiField("kb_advert_commission_clause")
	private List<KbAdvertCommissionClause> commissionClauseList;

	/**
	 * 标的对象的业务ID，如果标的为商品，则subject_biz_id为商品ID
	 */
	@ApiField("subject_biz_id")
	private String subjectBizId;

	/**
	 * 标的类型
voucher-券
	 */
	@ApiField("subject_type")
	private String subjectType;

    /**
     * Gets commission clause list.
     *
     * @return the commission clause list
     */
    public List<KbAdvertCommissionClause> getCommissionClauseList() {
		return this.commissionClauseList;
	}

    /**
     * Sets commission clause list.
     *
     * @param commissionClauseList the commission clause list
     */
    public void setCommissionClauseList(List<KbAdvertCommissionClause> commissionClauseList) {
		this.commissionClauseList = commissionClauseList;
	}

    /**
     * Gets subject biz id.
     *
     * @return the subject biz id
     */
    public String getSubjectBizId() {
		return this.subjectBizId;
	}

    /**
     * Sets subject biz id.
     *
     * @param subjectBizId the subject biz id
     */
    public void setSubjectBizId(String subjectBizId) {
		this.subjectBizId = subjectBizId;
	}

    /**
     * Gets subject type.
     *
     * @return the subject type
     */
    public String getSubjectType() {
		return this.subjectType;
	}

    /**
     * Sets subject type.
     *
     * @param subjectType the subject type
     */
    public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

}
