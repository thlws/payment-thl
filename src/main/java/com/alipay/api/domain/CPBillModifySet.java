package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社区物业平台待修改的物业费账单数据集合
 *
 * @author auto create
 * @since 1.0, 2018-06-09 20:15:11
 */
public class CPBillModifySet extends AlipayObject {

	private static final long serialVersionUID = 7483269439718162852L;

	/**
	 * 若账期需修改，则传入。账期用于缴费明细页归类和展示，可以使用不超过16个字符的有业务含义的字符串。
	 */
	@ApiField("acct_period")
	private String acctPeriod;

	/**
	 * 若应收金额需修改，则传入，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("bill_entry_amount")
	private String billEntryAmount;

	/**
	 * 待修改的物业费账单应收明细条目ID
	 */
	@ApiField("bill_entry_id")
	private String billEntryId;

	/**
	 * 若费用类型需修改，则传入
	 */
	@ApiField("cost_type")
	private String costType;

	/**
	 * 若缴费截止日期需修改，则传入。格式固定为YYYYMMDD
	 */
	@ApiField("deadline")
	private String deadline;

	/**
	 * 若出账日期需修改，则传入，格式固定为YYYYMMDD
	 */
	@ApiField("release_day")
	private String releaseDay;

	/**
	 * 若房屋门牌地址需要修改，则传入该值
	 */
	@ApiField("room_address")
	private String roomAddress;

    /**
     * Gets acct period.
     *
     * @return the acct period
     */
    public String getAcctPeriod() {
		return this.acctPeriod;
	}

    /**
     * Sets acct period.
     *
     * @param acctPeriod the acct period
     */
    public void setAcctPeriod(String acctPeriod) {
		this.acctPeriod = acctPeriod;
	}

    /**
     * Gets bill entry amount.
     *
     * @return the bill entry amount
     */
    public String getBillEntryAmount() {
		return this.billEntryAmount;
	}

    /**
     * Sets bill entry amount.
     *
     * @param billEntryAmount the bill entry amount
     */
    public void setBillEntryAmount(String billEntryAmount) {
		this.billEntryAmount = billEntryAmount;
	}

    /**
     * Gets bill entry id.
     *
     * @return the bill entry id
     */
    public String getBillEntryId() {
		return this.billEntryId;
	}

    /**
     * Sets bill entry id.
     *
     * @param billEntryId the bill entry id
     */
    public void setBillEntryId(String billEntryId) {
		this.billEntryId = billEntryId;
	}

    /**
     * Gets cost type.
     *
     * @return the cost type
     */
    public String getCostType() {
		return this.costType;
	}

    /**
     * Sets cost type.
     *
     * @param costType the cost type
     */
    public void setCostType(String costType) {
		this.costType = costType;
	}

    /**
     * Gets deadline.
     *
     * @return the deadline
     */
    public String getDeadline() {
		return this.deadline;
	}

    /**
     * Sets deadline.
     *
     * @param deadline the deadline
     */
    public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

    /**
     * Gets release day.
     *
     * @return the release day
     */
    public String getReleaseDay() {
		return this.releaseDay;
	}

    /**
     * Sets release day.
     *
     * @param releaseDay the release day
     */
    public void setReleaseDay(String releaseDay) {
		this.releaseDay = releaseDay;
	}

    /**
     * Gets room address.
     *
     * @return the room address
     */
    public String getRoomAddress() {
		return this.roomAddress;
	}

    /**
     * Sets room address.
     *
     * @param roomAddress the room address
     */
    public void setRoomAddress(String roomAddress) {
		this.roomAddress = roomAddress;
	}

}
