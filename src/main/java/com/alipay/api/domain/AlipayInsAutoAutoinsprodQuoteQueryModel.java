package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询报价详情接口
 *
 * @author auto create
 * @since 1.0, 2018-01-09 11:33:25
 */
public class AlipayInsAutoAutoinsprodQuoteQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4624549952641816458L;

	/**
	 * 询价ID
	 */
	@ApiField("enquiry_biz_id")
	private String enquiryBizId;

	/**
	 * 报价ID
	 */
	@ApiField("quote_biz_id")
	private String quoteBizId;

    /**
     * Gets enquiry biz id.
     *
     * @return the enquiry biz id
     */
    public String getEnquiryBizId() {
		return this.enquiryBizId;
	}

    /**
     * Sets enquiry biz id.
     *
     * @param enquiryBizId the enquiry biz id
     */
    public void setEnquiryBizId(String enquiryBizId) {
		this.enquiryBizId = enquiryBizId;
	}

    /**
     * Gets quote biz id.
     *
     * @return the quote biz id
     */
    public String getQuoteBizId() {
		return this.quoteBizId;
	}

    /**
     * Sets quote biz id.
     *
     * @param quoteBizId the quote biz id
     */
    public void setQuoteBizId(String quoteBizId) {
		this.quoteBizId = quoteBizId;
	}

}
