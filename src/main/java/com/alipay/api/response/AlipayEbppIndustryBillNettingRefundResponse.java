package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IndustryExtendField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.bill.netting.refund response.
 *
 * @author auto create
 * @since 1.0, 2018-09-14 14:30:01
 */
public class AlipayEbppIndustryBillNettingRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 1491388252724335747L;

	/** 
	 * 回传支付宝流水号。
	 */
	@ApiField("alipay_bill_no")
	private String alipayBillNo;

	/** 
	 * 扩展字段，一系列键值对属性列表，示例只是个形式，具体的Key-Value需要根据具体业务另行约定。
无特别约定时，此字段不必传。
	 */
	@ApiListField("industry_extend_field_list")
	@ApiField("industry_extend_field")
	private List<IndustryExtendField> industryExtendFieldList;

    /**
     * Sets alipay bill no.
     *
     * @param alipayBillNo the alipay bill no
     */
    public void setAlipayBillNo(String alipayBillNo) {
		this.alipayBillNo = alipayBillNo;
	}

    /**
     * Gets alipay bill no.
     *
     * @return the alipay bill no
     */
    public String getAlipayBillNo( ) {
		return this.alipayBillNo;
	}

    /**
     * Sets industry extend field list.
     *
     * @param industryExtendFieldList the industry extend field list
     */
    public void setIndustryExtendFieldList(List<IndustryExtendField> industryExtendFieldList) {
		this.industryExtendFieldList = industryExtendFieldList;
	}

    /**
     * Gets industry extend field list.
     *
     * @return the industry extend field list
     */
    public List<IndustryExtendField> getIndustryExtendFieldList( ) {
		return this.industryExtendFieldList;
	}

}
