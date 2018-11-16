package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 分页查询Leads、门店、商品相关操作流水信息
 *
 * @author auto create
 * @since 1.0, 2018-03-27 17:07:28
 */
public class AlipayOfflineMarketApplyorderBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8756117797354879694L;

	/**
	 * 操作动作
	 */
	@ApiField("action")
	private String action;

	/**
	 * 支付宝流水ID列表，最大不超过100个
	 */
	@ApiListField("apply_ids")
	@ApiField("string")
	private List<String> applyIds;

	/**
	 * 业务主体ID。根据biz_type不同可能对应shop_id或item_id。
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务类型：SHOP-店铺，ITEM-商品。
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 查询的流水创建时间最后值。格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 操作用户的支付账号id
	 */
	@ApiField("op_id")
	private String opId;

	/**
	 * 系统集成商统一传入ISV
	 */
	@ApiField("op_role")
	private String opRole;

	/**
	 * 页码，留空标示第一页，默认20个结果为一页
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页记录数。默认20，最大100。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 请求ID列表，最大不超过100个。
注意：暂时不支持此字段查询。
	 */
	@ApiListField("request_ids")
	@ApiField("string")
	private List<String> requestIds;

	/**
	 * 查询的流水创建时间起始值，只能查询近3个月数据。格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 流水状态：INIT-初始，PROCESS-处理中，SUCCESS-成功，FAIL-失败。
	 */
	@ApiField("status")
	private String status;

    /**
     * Gets action.
     *
     * @return the action
     */
    public String getAction() {
		return this.action;
	}

    /**
     * Sets action.
     *
     * @param action the action
     */
    public void setAction(String action) {
		this.action = action;
	}

    /**
     * Gets apply ids.
     *
     * @return the apply ids
     */
    public List<String> getApplyIds() {
		return this.applyIds;
	}

    /**
     * Sets apply ids.
     *
     * @param applyIds the apply ids
     */
    public void setApplyIds(List<String> applyIds) {
		this.applyIds = applyIds;
	}

    /**
     * Gets biz id.
     *
     * @return the biz id
     */
    public String getBizId() {
		return this.bizId;
	}

    /**
     * Sets biz id.
     *
     * @param bizId the biz id
     */
    public void setBizId(String bizId) {
		this.bizId = bizId;
	}

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType() {
		return this.bizType;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets end time.
     *
     * @return the end time
     */
    public Date getEndTime() {
		return this.endTime;
	}

    /**
     * Sets end time.
     *
     * @param endTime the end time
     */
    public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

    /**
     * Gets op id.
     *
     * @return the op id
     */
    public String getOpId() {
		return this.opId;
	}

    /**
     * Sets op id.
     *
     * @param opId the op id
     */
    public void setOpId(String opId) {
		this.opId = opId;
	}

    /**
     * Gets op role.
     *
     * @return the op role
     */
    public String getOpRole() {
		return this.opRole;
	}

    /**
     * Sets op role.
     *
     * @param opRole the op role
     */
    public void setOpRole(String opRole) {
		this.opRole = opRole;
	}

    /**
     * Gets page no.
     *
     * @return the page no
     */
    public Long getPageNo() {
		return this.pageNo;
	}

    /**
     * Sets page no.
     *
     * @param pageNo the page no
     */
    public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
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
     * Gets request ids.
     *
     * @return the request ids
     */
    public List<String> getRequestIds() {
		return this.requestIds;
	}

    /**
     * Sets request ids.
     *
     * @param requestIds the request ids
     */
    public void setRequestIds(List<String> requestIds) {
		this.requestIds = requestIds;
	}

    /**
     * Gets start time.
     *
     * @return the start time
     */
    public Date getStartTime() {
		return this.startTime;
	}

    /**
     * Sets start time.
     *
     * @param startTime the start time
     */
    public void setStartTime(Date startTime) {
		this.startTime = startTime;
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
