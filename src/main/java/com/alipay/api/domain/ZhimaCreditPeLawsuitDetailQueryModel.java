package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 个人涉诉详情接口
 *
 * @author auto create
 * @since 1.0, 2017-11-02 14:03:41
 */
public class ZhimaCreditPeLawsuitDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1396843231934961679L;

	/**
	 * 涉诉类型明细ID，对应字段值：裁判文书id（cpwsId)，当事人id（partyId)，执行公告id(zxggId)，失信公告id(shixinId)，曝光台id(bgtId)
	 */
	@ApiField("lawsuit_id")
	private String lawsuitId;

	/**
	 * 涉诉类型包括：裁判文书（cpws)，当事人（party)，执行公告(zxgg)，失信公告(sxgg)，曝光台(bgt)
	 */
	@ApiField("lawsuit_type")
	private String lawsuitType;

	/**
	 * 产品码，直接使用［示例］给出的值
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 商户请求的唯一标志，64位长度的字母数字下划线组合。该标识作为对账的关键信息，商户要保证其唯一性，对于用户使用相同transaction_id的查询，芝麻在一天（86400秒）内返回首次查询数据，超过有效期的查询即为无效并返回异常，有效期内的重复查询不重新计费
	 */
	@ApiField("transaction_id")
	private String transactionId;

    /**
     * Gets lawsuit id.
     *
     * @return the lawsuit id
     */
    public String getLawsuitId() {
		return this.lawsuitId;
	}

    /**
     * Sets lawsuit id.
     *
     * @param lawsuitId the lawsuit id
     */
    public void setLawsuitId(String lawsuitId) {
		this.lawsuitId = lawsuitId;
	}

    /**
     * Gets lawsuit type.
     *
     * @return the lawsuit type
     */
    public String getLawsuitType() {
		return this.lawsuitType;
	}

    /**
     * Sets lawsuit type.
     *
     * @param lawsuitType the lawsuit type
     */
    public void setLawsuitType(String lawsuitType) {
		this.lawsuitType = lawsuitType;
	}

    /**
     * Gets product code.
     *
     * @return the product code
     */
    public String getProductCode() {
		return this.productCode;
	}

    /**
     * Sets product code.
     *
     * @param productCode the product code
     */
    public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

    /**
     * Gets transaction id.
     *
     * @return the transaction id
     */
    public String getTransactionId() {
		return this.transactionId;
	}

    /**
     * Sets transaction id.
     *
     * @param transactionId the transaction id
     */
    public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

}
