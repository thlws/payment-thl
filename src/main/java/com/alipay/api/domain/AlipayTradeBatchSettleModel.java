package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量请求结算
 *
 * @author auto create
 * @since 1.0, 2018-07-06 14:43:35
 */
public class AlipayTradeBatchSettleModel extends AlipayObject {

	private static final long serialVersionUID = 4688385822144947539L;

	/**
	 * 收单产品码，商家和支付宝签约的产品码
	 */
	@ApiField("biz_product")
	private String bizProduct;

	/**
	 * 扩展参数
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 结算请求外部流水号，32个字符以内、可包含字母、数字、下划线；需保证在商户端不重复
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 结算明细条款
	 */
	@ApiListField("settle_clauses")
	@ApiField("settle_clause")
	private List<SettleClause> settleClauses;

    /**
     * Gets biz product.
     *
     * @return the biz product
     */
    public String getBizProduct() {
		return this.bizProduct;
	}

    /**
     * Sets biz product.
     *
     * @param bizProduct the biz product
     */
    public void setBizProduct(String bizProduct) {
		this.bizProduct = bizProduct;
	}

    /**
     * Gets extend params.
     *
     * @return the extend params
     */
    public String getExtendParams() {
		return this.extendParams;
	}

    /**
     * Sets extend params.
     *
     * @param extendParams the extend params
     */
    public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

    /**
     * Gets out request no.
     *
     * @return the out request no
     */
    public String getOutRequestNo() {
		return this.outRequestNo;
	}

    /**
     * Sets out request no.
     *
     * @param outRequestNo the out request no
     */
    public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

    /**
     * Gets settle clauses.
     *
     * @return the settle clauses
     */
    public List<SettleClause> getSettleClauses() {
		return this.settleClauses;
	}

    /**
     * Sets settle clauses.
     *
     * @param settleClauses the settle clauses
     */
    public void setSettleClauses(List<SettleClause> settleClauses) {
		this.settleClauses = settleClauses;
	}

}
