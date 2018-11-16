package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QuoteInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.autoinsprod.quote.apply response.
 *
 * @author auto create
 * @since 1.0, 2018-01-09 12:04:54
 */
public class AlipayInsAutoAutoinsprodQuoteApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7278886467149649635L;

	/** 
	 * 车险询价申请号
	 */
	@ApiField("enquiry_biz_id")
	private String enquiryBizId;

	/** 
	 * 报价返回信息
	 */
	@ApiListField("quote_infos")
	@ApiField("quote_info")
	private List<QuoteInfo> quoteInfos;

    /**
     * Sets enquiry biz id.
     *
     * @param enquiryBizId the enquiry biz id
     */
    public void setEnquiryBizId(String enquiryBizId) {
		this.enquiryBizId = enquiryBizId;
	}

    /**
     * Gets enquiry biz id.
     *
     * @return the enquiry biz id
     */
    public String getEnquiryBizId( ) {
		return this.enquiryBizId;
	}

    /**
     * Sets quote infos.
     *
     * @param quoteInfos the quote infos
     */
    public void setQuoteInfos(List<QuoteInfo> quoteInfos) {
		this.quoteInfos = quoteInfos;
	}

    /**
     * Gets quote infos.
     *
     * @return the quote infos
     */
    public List<QuoteInfo> getQuoteInfos( ) {
		return this.quoteInfos;
	}

}
