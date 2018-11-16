package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺商品产品系统业务流水信息接口模型
 *
 * @author auto create
 * @since 1.0, 2017-02-07 16:46:17
 */
public class BizOrderQueryResponse extends AlipayObject {

	private static final long serialVersionUID = 7684257877124138158L;

	/**
	 * 操作动作。
CREATE_SHOP-创建门店，
MODIFY_SHOP-修改门店，
CREATE_ITEM-创建商品，
MODIFY_ITEM-修改商品，
EFFECTIVE_ITEM-上架商品，
INVALID_ITEM-下架商品，
RESUME_ITEM-暂停售卖商品，
PAUSE_ITEM-恢复售卖商品
	 */
	@ApiField("action")
	private String action;

	/**
	 * 操作模式：NORMAL-普通开店
	 */
	@ApiField("action_mode")
	private String actionMode;

	/**
	 * 支付宝流水ID
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 流水上下文信息，JSON格式。根据action不同对应的结构也不同，JSON字段与含义可参考各个接口的请求参数。
	 */
	@ApiField("biz_context_info")
	private String bizContextInfo;

	/**
	 * 业务主体ID。根据biz_type不同可能对应shop_id或item_id。
特别注意对于门店创建，当流水status=SUCCESS时，此字段才为shop_id，其他状态时为0或空。
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务类型：SHOP-店铺，ITEM-商品
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 操作用户的支付账号id
	 */
	@ApiField("op_id")
	private String opId;

	/**
	 * 注意：此字段并非外部商户请求时传入的request_id，暂时代表支付宝内部字段，请勿用。
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 流水处理结果码
<a href="https://doc.open.alipay.com/doc2/detail.htm?spm=a219a.7629140.0.0.lL9hGI&treeId=78&articleId=103834&docType=1#s2">点此查看</a>
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 流水处理结果描述
	 */
	@ApiField("result_desc")
	private String resultDesc;

	/**
	 * 流水状态：INIT-初始，PROCESS-处理中，SUCCESS-成功，FAIL-失败。
	 */
	@ApiField("status")
	private String status;

	/**
	 * 流水子状态：WAIT_CERTIFY-等待认证，LICENSE_AUDITING-证照审核中，RISK_AUDITING-风控审核中，WAIT_SIGN-等待签约，FINISH-终结。
	 */
	@ApiField("sub_status")
	private String subStatus;

	/**
	 * 更新时间
	 */
	@ApiField("update_time")
	private Date updateTime;

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
     * Gets action mode.
     *
     * @return the action mode
     */
    public String getActionMode() {
		return this.actionMode;
	}

    /**
     * Sets action mode.
     *
     * @param actionMode the action mode
     */
    public void setActionMode(String actionMode) {
		this.actionMode = actionMode;
	}

    /**
     * Gets apply id.
     *
     * @return the apply id
     */
    public String getApplyId() {
		return this.applyId;
	}

    /**
     * Sets apply id.
     *
     * @param applyId the apply id
     */
    public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

    /**
     * Gets biz context info.
     *
     * @return the biz context info
     */
    public String getBizContextInfo() {
		return this.bizContextInfo;
	}

    /**
     * Sets biz context info.
     *
     * @param bizContextInfo the biz context info
     */
    public void setBizContextInfo(String bizContextInfo) {
		this.bizContextInfo = bizContextInfo;
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
     * Gets create time.
     *
     * @return the create time
     */
    public Date getCreateTime() {
		return this.createTime;
	}

    /**
     * Sets create time.
     *
     * @param createTime the create time
     */
    public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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
     * Gets request id.
     *
     * @return the request id
     */
    public String getRequestId() {
		return this.requestId;
	}

    /**
     * Sets request id.
     *
     * @param requestId the request id
     */
    public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

    /**
     * Gets result code.
     *
     * @return the result code
     */
    public String getResultCode() {
		return this.resultCode;
	}

    /**
     * Sets result code.
     *
     * @param resultCode the result code
     */
    public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

    /**
     * Gets result desc.
     *
     * @return the result desc
     */
    public String getResultDesc() {
		return this.resultDesc;
	}

    /**
     * Sets result desc.
     *
     * @param resultDesc the result desc
     */
    public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
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

    /**
     * Gets sub status.
     *
     * @return the sub status
     */
    public String getSubStatus() {
		return this.subStatus;
	}

    /**
     * Sets sub status.
     *
     * @param subStatus the sub status
     */
    public void setSubStatus(String subStatus) {
		this.subStatus = subStatus;
	}

    /**
     * Gets update time.
     *
     * @return the update time
     */
    public Date getUpdateTime() {
		return this.updateTime;
	}

    /**
     * Sets update time.
     *
     * @param updateTime the update time
     */
    public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
