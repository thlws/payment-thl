package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsTradeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.autoinsprod.policy.apply response.
 *
 * @author auto create
 * @since 1.0, 2018-01-09 11:49:42
 */
public class AlipayInsAutoAutoinsprodPolicyApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2399565384928253695L;

	/** 
	 * 车险询价申请号
	 */
	@ApiField("enquiry_biz_id")
	private String enquiryBizId;

	/** 
	 * 报价ID
	 */
	@ApiField("quote_biz_id")
	private String quoteBizId;

	/** 
	 * 车险订单交易信息
	 */
	@ApiListField("trade_infos")
	@ApiField("ins_trade_info")
	private List<InsTradeInfo> tradeInfos;

	/** 
	 * 吱口令
	 */
	@ApiField("zhi_link")
	private String zhiLink;

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
     * Sets quote biz id.
     *
     * @param quoteBizId the quote biz id
     */
    public void setQuoteBizId(String quoteBizId) {
		this.quoteBizId = quoteBizId;
	}

    /**
     * Gets quote biz id.
     *
     * @return the quote biz id
     */
    public String getQuoteBizId( ) {
		return this.quoteBizId;
	}

    /**
     * Sets trade infos.
     *
     * @param tradeInfos the trade infos
     */
    public void setTradeInfos(List<InsTradeInfo> tradeInfos) {
		this.tradeInfos = tradeInfos;
	}

    /**
     * Gets trade infos.
     *
     * @return the trade infos
     */
    public List<InsTradeInfo> getTradeInfos( ) {
		return this.tradeInfos;
	}

    /**
     * Sets zhi link.
     *
     * @param zhiLink the zhi link
     */
    public void setZhiLink(String zhiLink) {
		this.zhiLink = zhiLink;
	}

    /**
     * Gets zhi link.
     *
     * @return the zhi link
     */
    public String getZhiLink( ) {
		return this.zhiLink;
	}

}
