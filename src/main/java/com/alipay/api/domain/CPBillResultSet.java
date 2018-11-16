package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社区物业平台物业费账单查询结果数据集合
 *
 * @author auto create
 * @since 1.0, 2017-01-18 16:46:05
 */
public class CPBillResultSet extends AlipayObject {

	private static final long serialVersionUID = 8617134225836439416L;

	/**
	 * 账期
	 */
	@ApiField("acct_period")
	private String acctPeriod;

	/**
	 * 应收金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("bill_entry_amount")
	private String billEntryAmount;

	/**
	 * 物业费账单应收明细条目ID
	 */
	@ApiField("bill_entry_id")
	private String billEntryId;

	/**
	 * 费用类型
	 */
	@ApiField("cost_type")
	private String costType;

	/**
	 * 缴费截止日期
	 */
	@ApiField("deadline")
	private String deadline;

	/**
	 * 物业系统端房屋编号
	 */
	@ApiField("out_room_id")
	private String outRoomId;

	/**
	 * 出账日期
	 */
	@ApiField("release_day")
	private String releaseDay;

	/**
	 * 房屋门牌地址
	 */
	@ApiField("room_address")
	private String roomAddress;

	/**
	 * 账单条目当前状态，状态值：
FINISH_PAYMENT - 用户完成支付和销账
UNDER_PAYMENT - 账单锁定待用户完成支付
WAIT_PAYMENT - 待缴且未过缴费截止日期
OUT_OF_DATE - 未支付且已过缴费截止日期
	 */
	@ApiField("status")
	private String status;

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
     * Gets out room id.
     *
     * @return the out room id
     */
    public String getOutRoomId() {
		return this.outRoomId;
	}

    /**
     * Sets out room id.
     *
     * @param outRoomId the out room id
     */
    public void setOutRoomId(String outRoomId) {
		this.outRoomId = outRoomId;
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

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

}
