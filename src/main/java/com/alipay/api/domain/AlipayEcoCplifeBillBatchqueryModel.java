package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物业费账单数据批量查询
 *
 * @author auto create
 * @since 1.0, 2018-06-09 20:13:42
 */
public class AlipayEcoCplifeBillBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5899246146795437966L;

	/**
	 * 查询过滤条件之一：
根据账期查询
	 */
	@ApiField("acct_period")
	private String acctPeriod;

	/**
	 * 查询过滤条件之一：
根据开发者上传物业费账单时需要的批次号查询指定批次下上传成功的账单。
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 查询过滤条件之一：根据账单状态查询，不传该字段则返回所有状态的账单。

状态值：
FINISH_PAYMENT - 用户完成支付和销账
UNDER_PAYMENT - 账单锁定待用户完成支付
WAIT_PAYMENT - 待缴且未过缴费截止日期
OUT_OF_DATE - 未支付且已过缴费截止日期
	 */
	@ApiField("bill_status")
	private String billStatus;

	/**
	 * 支付宝社区小区统一编号，必须在授权物业账号名下存在。
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 查询过滤条件之一：
根据费用类型查询，只支持精确查询。
	 */
	@ApiField("cost_type")
	private String costType;

	/**
	 * 查询过滤条件之一：
根据物业系统端房屋编号查询
	 */
	@ApiField("out_room_id")
	private String outRoomId;

	/**
	 * 分页查询的当前页码数，分页从1开始计数。
该参数不传入的时候，默认为1。
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询的每页最大数据条数，取值范围1-500。
不传该参数默认为200。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 查询过滤条件之一：
根据出账日期查询，格式为YYYYMMDD，只支持精确查询。
	 */
	@ApiField("release_day")
	private String releaseDay;

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
     * Gets batch id.
     *
     * @return the batch id
     */
    public String getBatchId() {
		return this.batchId;
	}

    /**
     * Sets batch id.
     *
     * @param batchId the batch id
     */
    public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

    /**
     * Gets bill status.
     *
     * @return the bill status
     */
    public String getBillStatus() {
		return this.billStatus;
	}

    /**
     * Sets bill status.
     *
     * @param billStatus the bill status
     */
    public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
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
     * Gets page num.
     *
     * @return the page num
     */
    public Long getPageNum() {
		return this.pageNum;
	}

    /**
     * Sets page num.
     *
     * @param pageNum the page num
     */
    public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

    /**
     * Gets page size.
     *
     * @return the page size
     */
    public Long getPageSize() {
		return this.pageSize;
	}

    /**
     * Sets page size.
     *
     * @param pageSize the page size
     */
    public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
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

}
