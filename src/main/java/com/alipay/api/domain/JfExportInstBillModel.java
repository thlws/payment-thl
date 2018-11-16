package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 输出的机构账单模型
 *
 * @author auto create
 * @since 1.0, 2017-07-19 12:08:56
 */
public class JfExportInstBillModel extends AlipayObject {

	private static final long serialVersionUID = 2876318334799524636L;

	/**
	 * 账单金额，单位为：RMB元。
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 余额，单位为：RMB元。
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 账期
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 滞纳金，单位为：RMB元。
	 */
	@ApiField("bill_fines")
	private String billFines;

	/**
	 * 户号
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 拓展字段，json串(key-value对)
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 机构流水号
	 */
	@ApiField("inst_bill_no")
	private String instBillNo;

	/**
	 * 账单拥有者姓名
	 */
	@ApiField("owner_name")
	private String ownerName;

	/**
	 * 唯一标识，每次查询均保证唯一性，但是不保证幂等性
	 */
	@ApiField("uniq_id")
	private String uniqId;

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
     * Gets extend field.
     *
     * @return the extend field
     */
    public String getExtendField() {
		return this.extendField;
	}

    /**
     * Sets extend field.
     *
     * @param extendField the extend field
     */
    public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

    /**
     * Gets inst bill no.
     *
     * @return the inst bill no
     */
    public String getInstBillNo() {
		return this.instBillNo;
	}

    /**
     * Sets inst bill no.
     *
     * @param instBillNo the inst bill no
     */
    public void setInstBillNo(String instBillNo) {
		this.instBillNo = instBillNo;
	}

    /**
     * Gets owner name.
     *
     * @return the owner name
     */
    public String getOwnerName() {
		return this.ownerName;
	}

    /**
     * Sets owner name.
     *
     * @param ownerName the owner name
     */
    public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

    /**
     * Gets uniq id.
     *
     * @return the uniq id
     */
    public String getUniqId() {
		return this.uniqId;
	}

    /**
     * Sets uniq id.
     *
     * @param uniqId the uniq id
     */
    public void setUniqId(String uniqId) {
		this.uniqId = uniqId;
	}

}
