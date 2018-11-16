package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 账单同步
 *
 * @author auto create
 * @since 1.0, 2017-11-08 10:54:24
 */
public class AlipayEcoRenthouseBillOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2311675586481257959L;

	/**
	 * 账单条数1-50范围内，账单条数和账单明细数量必须一致
	 */
	@ApiField("bill_number")
	private String billNumber;

	/**
	 * 账单条数1-50范围内
	 */
	@ApiListField("bills")
	@ApiField("alipay_eco_renthouse_bill")
	private List<AlipayEcoRenthouseBill> bills;

	/**
	 * ka请求的唯一标志，长度64位以内字符串，仅限字母数字下划线组合。该标识作为业务调用的唯一标识，ka要保证其业务唯一性
	 */
	@ApiField("trade_id")
	private String tradeId;

    /**
     * Gets bill number.
     *
     * @return the bill number
     */
    public String getBillNumber() {
		return this.billNumber;
	}

    /**
     * Sets bill number.
     *
     * @param billNumber the bill number
     */
    public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}

    /**
     * Gets bills.
     *
     * @return the bills
     */
    public List<AlipayEcoRenthouseBill> getBills() {
		return this.bills;
	}

    /**
     * Sets bills.
     *
     * @param bills the bills
     */
    public void setBills(List<AlipayEcoRenthouseBill> bills) {
		this.bills = bills;
	}

    /**
     * Gets trade id.
     *
     * @return the trade id
     */
    public String getTradeId() {
		return this.tradeId;
	}

    /**
     * Sets trade id.
     *
     * @param tradeId the trade id
     */
    public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

}
