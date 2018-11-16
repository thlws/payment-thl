package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 广告标的分页搜索接口
 *
 * @author auto create
 * @since 1.0, 2017-01-17 10:33:12
 */
public class KoubeiAdvertCommissionMissionSearchModel extends AlipayObject {

	private static final long serialVersionUID = 1263397289856167561L;

	/**
	 * 分佣规则类型(枚举值key对应于请求对象中复杂类型的key)
percentage_clause-比例
quota_clause-定额
	 */
	@ApiField("commission_clause_type")
	private String commissionClauseType;

	/**
	 * 当前页码，默认1
	 */
	@ApiField("page_index")
	private String pageIndex;

	/**
	 * 每页记录数，默认10，最大100
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 比例分佣规则
只有commission_clause_type=percentage_clause才能传值
	 */
	@ApiField("percentage_clause")
	private KbAdvertCommissionClausePercentage percentageClause;

	/**
	 * 定额分佣规则
只有commission_clause_type=quota_clause才能传值
	 */
	@ApiField("quota_clause")
	private KbAdvertCommissionClauseQuota quotaClause;

	/**
	 * 任务类型(枚举值key对应于请求对象中复杂类型的key)
voucher-券
	 */
	@ApiField("type")
	private String type;

	/**
	 * 券任务(支持模糊匹配)
只有type=voucher才能传值
	 */
	@ApiField("voucher")
	private KbAdvertSubjectVoucher voucher;

    /**
     * Gets commission clause type.
     *
     * @return the commission clause type
     */
    public String getCommissionClauseType() {
		return this.commissionClauseType;
	}

    /**
     * Sets commission clause type.
     *
     * @param commissionClauseType the commission clause type
     */
    public void setCommissionClauseType(String commissionClauseType) {
		this.commissionClauseType = commissionClauseType;
	}

    /**
     * Gets page index.
     *
     * @return the page index
     */
    public String getPageIndex() {
		return this.pageIndex;
	}

    /**
     * Sets page index.
     *
     * @param pageIndex the page index
     */
    public void setPageIndex(String pageIndex) {
		this.pageIndex = pageIndex;
	}

    /**
     * Gets page size.
     *
     * @return the page size
     */
    public String getPageSize() {
		return this.pageSize;
	}

    /**
     * Sets page size.
     *
     * @param pageSize the page size
     */
    public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

    /**
     * Gets percentage clause.
     *
     * @return the percentage clause
     */
    public KbAdvertCommissionClausePercentage getPercentageClause() {
		return this.percentageClause;
	}

    /**
     * Sets percentage clause.
     *
     * @param percentageClause the percentage clause
     */
    public void setPercentageClause(KbAdvertCommissionClausePercentage percentageClause) {
		this.percentageClause = percentageClause;
	}

    /**
     * Gets quota clause.
     *
     * @return the quota clause
     */
    public KbAdvertCommissionClauseQuota getQuotaClause() {
		return this.quotaClause;
	}

    /**
     * Sets quota clause.
     *
     * @param quotaClause the quota clause
     */
    public void setQuotaClause(KbAdvertCommissionClauseQuota quotaClause) {
		this.quotaClause = quotaClause;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
	}

    /**
     * Gets voucher.
     *
     * @return the voucher
     */
    public KbAdvertSubjectVoucher getVoucher() {
		return this.voucher;
	}

    /**
     * Sets voucher.
     *
     * @param voucher the voucher
     */
    public void setVoucher(KbAdvertSubjectVoucher voucher) {
		this.voucher = voucher;
	}

}
