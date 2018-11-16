package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 实时查询欠费单返回对象
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class QueryInstBillInfo extends AlipayObject {

	private static final long serialVersionUID = 8515247259826984783L;

	/**
	 * 账单金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 余额
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 账单日期
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 明细说明
	 */
	@ApiListField("bill_detail")
	@ApiField("query_inst_bill_detail")
	private List<QueryInstBillDetail> billDetail;

	/**
	 * 滞纳金
	 */
	@ApiField("bill_fines")
	private String billFines;

	/**
	 * 账单流水
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 户名
	 */
	@ApiField("bill_user_name")
	private String billUserName;

	/**
	 * JDBXINHUI
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 查询欠费单的惟一标识
	 */
	@ApiField("charge_uniq_id")
	private String chargeUniqId;

	/**
	 * 销账机构
	 */
	@ApiField("chargeoff_inst")
	private String chargeoffInst;

	/**
	 * 销账机构给出账机构分配的ID
	 */
	@ApiField("company_id")
	private String companyId;

	/**
	 * 扩展属性
	 */
	@ApiField("extend")
	private String extend;

	/**
	 * 业务类型
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 外部流水号
	 */
	@ApiField("out_id")
	private String outId;

	/**
	 * 错误信息
	 */
	@ApiField("return_message")
	private String returnMessage;

	/**
	 * 子业务类型
	 */
	@ApiField("sub_order_type")
	private String subOrderType;

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public String getAmount() {
		return this.amount;
	}

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(String amount) {
		this.amount = amount;
	}

    /**
     * Gets balance.
     *
     * @return the balance
     */
    public String getBalance() {
		return this.balance;
	}

    /**
     * Sets balance.
     *
     * @param balance the balance
     */
    public void setBalance(String balance) {
		this.balance = balance;
	}

    /**
     * Gets bill date.
     *
     * @return the bill date
     */
    public String getBillDate() {
		return this.billDate;
	}

    /**
     * Sets bill date.
     *
     * @param billDate the bill date
     */
    public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

    /**
     * Gets bill detail.
     *
     * @return the bill detail
     */
    public List<QueryInstBillDetail> getBillDetail() {
		return this.billDetail;
	}

    /**
     * Sets bill detail.
     *
     * @param billDetail the bill detail
     */
    public void setBillDetail(List<QueryInstBillDetail> billDetail) {
		this.billDetail = billDetail;
	}

    /**
     * Gets bill fines.
     *
     * @return the bill fines
     */
    public String getBillFines() {
		return this.billFines;
	}

    /**
     * Sets bill fines.
     *
     * @param billFines the bill fines
     */
    public void setBillFines(String billFines) {
		this.billFines = billFines;
	}

    /**
     * Gets bill key.
     *
     * @return the bill key
     */
    public String getBillKey() {
		return this.billKey;
	}

    /**
     * Sets bill key.
     *
     * @param billKey the bill key
     */
    public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

    /**
     * Gets bill user name.
     *
     * @return the bill user name
     */
    public String getBillUserName() {
		return this.billUserName;
	}

    /**
     * Sets bill user name.
     *
     * @param billUserName the bill user name
     */
    public void setBillUserName(String billUserName) {
		this.billUserName = billUserName;
	}

    /**
     * Gets charge inst.
     *
     * @return the charge inst
     */
    public String getChargeInst() {
		return this.chargeInst;
	}

    /**
     * Sets charge inst.
     *
     * @param chargeInst the charge inst
     */
    public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

    /**
     * Gets charge uniq id.
     *
     * @return the charge uniq id
     */
    public String getChargeUniqId() {
		return this.chargeUniqId;
	}

    /**
     * Sets charge uniq id.
     *
     * @param chargeUniqId the charge uniq id
     */
    public void setChargeUniqId(String chargeUniqId) {
		this.chargeUniqId = chargeUniqId;
	}

    /**
     * Gets chargeoff inst.
     *
     * @return the chargeoff inst
     */
    public String getChargeoffInst() {
		return this.chargeoffInst;
	}

    /**
     * Sets chargeoff inst.
     *
     * @param chargeoffInst the chargeoff inst
     */
    public void setChargeoffInst(String chargeoffInst) {
		this.chargeoffInst = chargeoffInst;
	}

    /**
     * Gets company id.
     *
     * @return the company id
     */
    public String getCompanyId() {
		return this.companyId;
	}

    /**
     * Sets company id.
     *
     * @param companyId the company id
     */
    public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

    /**
     * Gets extend.
     *
     * @return the extend
     */
    public String getExtend() {
		return this.extend;
	}

    /**
     * Sets extend.
     *
     * @param extend the extend
     */
    public void setExtend(String extend) {
		this.extend = extend;
	}

    /**
     * Gets order type.
     *
     * @return the order type
     */
    public String getOrderType() {
		return this.orderType;
	}

    /**
     * Sets order type.
     *
     * @param orderType the order type
     */
    public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

    /**
     * Gets out id.
     *
     * @return the out id
     */
    public String getOutId() {
		return this.outId;
	}

    /**
     * Sets out id.
     *
     * @param outId the out id
     */
    public void setOutId(String outId) {
		this.outId = outId;
	}

    /**
     * Gets return message.
     *
     * @return the return message
     */
    public String getReturnMessage() {
		return this.returnMessage;
	}

    /**
     * Sets return message.
     *
     * @param returnMessage the return message
     */
    public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}

    /**
     * Gets sub order type.
     *
     * @return the sub order type
     */
    public String getSubOrderType() {
		return this.subOrderType;
	}

    /**
     * Sets sub order type.
     *
     * @param subOrderType the sub order type
     */
    public void setSubOrderType(String subOrderType) {
		this.subOrderType = subOrderType;
	}

}
