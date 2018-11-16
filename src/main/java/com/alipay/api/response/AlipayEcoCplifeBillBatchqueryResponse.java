package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CPBillResultSet;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cplife.bill.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayEcoCplifeBillBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7224219511646488216L;

	/** 
	 * 若查询到符合条件的账单条目，返回结果集
	 */
	@ApiListField("bill_result_set")
	@ApiField("c_p_bill_result_set")
	private List<CPBillResultSet> billResultSet;

	/** 
	 * 当前页码
	 */
	@ApiField("current_page_num")
	private Long currentPageNum;

	/** 
	 * 符合条件的总结果数
	 */
	@ApiField("total_bill_count")
	private Long totalBillCount;

    /**
     * Sets bill result set.
     *
     * @param billResultSet the bill result set
     */
    public void setBillResultSet(List<CPBillResultSet> billResultSet) {
		this.billResultSet = billResultSet;
	}

    /**
     * Gets bill result set.
     *
     * @return the bill result set
     */
    public List<CPBillResultSet> getBillResultSet( ) {
		return this.billResultSet;
	}

    /**
     * Sets current page num.
     *
     * @param currentPageNum the current page num
     */
    public void setCurrentPageNum(Long currentPageNum) {
		this.currentPageNum = currentPageNum;
	}

    /**
     * Gets current page num.
     *
     * @return the current page num
     */
    public Long getCurrentPageNum( ) {
		return this.currentPageNum;
	}

    /**
     * Sets total bill count.
     *
     * @param totalBillCount the total bill count
     */
    public void setTotalBillCount(Long totalBillCount) {
		this.totalBillCount = totalBillCount;
	}

    /**
     * Gets total bill count.
     *
     * @return the total bill count
     */
    public Long getTotalBillCount( ) {
		return this.totalBillCount;
	}

}
