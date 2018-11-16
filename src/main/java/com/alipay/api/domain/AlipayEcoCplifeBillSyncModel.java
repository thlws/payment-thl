package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物业费账单数据同步
 *
 * @author auto create
 * @since 1.0, 2018-06-09 20:10:28
 */
public class AlipayEcoCplifeBillSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5133825678563288374L;

	/**
	 * 待同步的物业费账单应收明细条目ID
	 */
	@ApiField("bill_entry_id")
	private String billEntryId;

	/**
	 * 支付宝社区物业平台小区ID，用户通过支付宝社区物业平台物业查询获取。
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 指定条目待更新的缴费截止日期
若operate_type为update，该参数选填；
若operate_type为delete，该参数不用填。
	 */
	@ApiField("new_deadline")
	private String newDeadline;

	/**
	 * 指定条目待更新的应收金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
若operate_type为update，该参数选填；
若operate_type为delete，该参数不用填。
	 */
	@ApiField("new_entry_amount")
	private String newEntryAmount;

	/**
	 * 同步类型：
delete：删除
update：更改
	 */
	@ApiField("operate_type")
	private String operateType;

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
     * Gets community id.
     *
     * @return the community id
     */
    public String getCommunityId() {
		return this.communityId;
	}

    /**
     * Sets community id.
     *
     * @param communityId the community id
     */
    public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

    /**
     * Gets new deadline.
     *
     * @return the new deadline
     */
    public String getNewDeadline() {
		return this.newDeadline;
	}

    /**
     * Sets new deadline.
     *
     * @param newDeadline the new deadline
     */
    public void setNewDeadline(String newDeadline) {
		this.newDeadline = newDeadline;
	}

    /**
     * Gets new entry amount.
     *
     * @return the new entry amount
     */
    public String getNewEntryAmount() {
		return this.newEntryAmount;
	}

    /**
     * Sets new entry amount.
     *
     * @param newEntryAmount the new entry amount
     */
    public void setNewEntryAmount(String newEntryAmount) {
		this.newEntryAmount = newEntryAmount;
	}

    /**
     * Gets operate type.
     *
     * @return the operate type
     */
    public String getOperateType() {
		return this.operateType;
	}

    /**
     * Sets operate type.
     *
     * @param operateType the operate type
     */
    public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

}
