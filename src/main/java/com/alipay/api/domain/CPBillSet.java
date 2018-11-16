package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社区物业平台物业费账单数据集合
 *
 * @author auto create
 * @since 1.0, 2018-06-09 20:14:19
 */
public class CPBillSet extends AlipayObject {

	private static final long serialVersionUID = 4418211719316459814L;

	/**
	 * 明细条目所归属的账期，用于归类和向用户展示，具体参数值由物业系统自行定义，除参数最大长度外支付宝不做限定。
	 */
	@ApiField("acct_period")
	private String acctPeriod;

	/**
	 * 应收金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("bill_entry_amount")
	private String billEntryAmount;

	/**
	 * 物业费账单应收明细条目ID，在同一小区内必须唯一，不同小区不做唯一性要求。
	 */
	@ApiField("bill_entry_id")
	private String billEntryId;

	/**
	 * 费用类型名称，根据物业系统定义传入，支付宝除参数最大长度外不做限定。
	 */
	@ApiField("cost_type")
	private String costType;

	/**
	 * 缴费截止日期，格式固定为YYYYMMDD。不能早于调用接口时的当前实际日期（北京时间）和出账日期。
	 */
	@ApiField("deadline")
	private String deadline;

	/**
	 * 物业系统端房屋编号，必须事先通过房屋信息上传接口上传到支付宝社区物业平台。
	 */
	@ApiField("out_room_id")
	private String outRoomId;

	/**
	 * 缴费明细条目关联ID。若物业系统业务约束上传的多条明细条目必须被一次同时支付，则对应的明细条目需传入同样的relate_id。
	 */
	@ApiField("relate_id")
	private String relateId;

	/**
	 * 出账日期，格式固定为YYYYMMDD。
	 */
	@ApiField("release_day")
	private String releaseDay;

	/**
	 * 缴费支付确认页显示给用户的提示确认信息，除房间名外的第二重校验信息，预防用户错缴。建议传入和缴费户相关的信息例如，可传入脱敏后的物业系统中的业主姓名，或其他相关信息。可选参数，不传则不展示。账单明细合并支付时，若部分账单明细的remark_str不同，则默认取第一条有remark_str值的账单明细进行展示。
	 */
	@ApiField("remark_str")
	private String remarkStr;

	/**
	 * 对应的房屋门牌地址。若开发者之前通过上传物业小区内部房屋信息接口中的address参数已上传，可不传。
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
     * Gets relate id.
     *
     * @return the relate id
     */
    public String getRelateId() {
		return this.relateId;
	}

    /**
     * Sets relate id.
     *
     * @param relateId the relate id
     */
    public void setRelateId(String relateId) {
		this.relateId = relateId;
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
     * Gets remark str.
     *
     * @return the remark str
     */
    public String getRemarkStr() {
		return this.remarkStr;
	}

    /**
     * Sets remark str.
     *
     * @param remarkStr the remark str
     */
    public void setRemarkStr(String remarkStr) {
		this.remarkStr = remarkStr;
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
