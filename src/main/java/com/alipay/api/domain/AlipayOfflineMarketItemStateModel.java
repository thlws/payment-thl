package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过此接口，商户可以出传入item_id与上下架标识，对商户创建的商品进行上架或下架处理
 *
 * @author auto create
 * @since 1.0, 2018-07-12 12:22:37
 */
public class AlipayOfflineMarketItemStateModel extends AlipayObject {

	private static final long serialVersionUID = 3391213588244154524L;

	/**
	 * 审核规则。支付宝内部使用，外部商户不需填写此字段。
	 */
	@ApiField("audit_rule")
	private AlipayItemAuditRule auditRule;

	/**
	 * 口碑体系内部商品的唯一标识
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户通知地址，口碑发消息给商户通知其是否对商品创建、修改、变更状态成功
	 */
	@ApiField("operate_notify_url")
	private String operateNotifyUrl;

	/**
	 * 商品操作上下文。支付宝内部使用，外部商户不需填写此字段。
	 */
	@ApiField("operation_context")
	private AlipayItemOperationContext operationContext;

	/**
	 * 支持英文字母和数字，由开发者自行定义（不允许重复），在商品notify消息中也会带有该参数，以此标明本次notify消息是对哪个请求的回应
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 商品上下架
	 */
	@ApiField("state_type")
	private String stateType;

    /**
     * Gets audit rule.
     *
     * @return the audit rule
     */
    public AlipayItemAuditRule getAuditRule() {
		return this.auditRule;
	}

    /**
     * Sets audit rule.
     *
     * @param auditRule the audit rule
     */
    public void setAuditRule(AlipayItemAuditRule auditRule) {
		this.auditRule = auditRule;
	}

    /**
     * Gets item id.
     *
     * @return the item id
     */
    public String getItemId() {
		return this.itemId;
	}

    /**
     * Sets item id.
     *
     * @param itemId the item id
     */
    public void setItemId(String itemId) {
		this.itemId = itemId;
	}

    /**
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo() {
		return this.memo;
	}

    /**
     * Sets memo.
     *
     * @param memo the memo
     */
    public void setMemo(String memo) {
		this.memo = memo;
	}

    /**
     * Gets operate notify url.
     *
     * @return the operate notify url
     */
    public String getOperateNotifyUrl() {
		return this.operateNotifyUrl;
	}

    /**
     * Sets operate notify url.
     *
     * @param operateNotifyUrl the operate notify url
     */
    public void setOperateNotifyUrl(String operateNotifyUrl) {
		this.operateNotifyUrl = operateNotifyUrl;
	}

    /**
     * Gets operation context.
     *
     * @return the operation context
     */
    public AlipayItemOperationContext getOperationContext() {
		return this.operationContext;
	}

    /**
     * Sets operation context.
     *
     * @param operationContext the operation context
     */
    public void setOperationContext(AlipayItemOperationContext operationContext) {
		this.operationContext = operationContext;
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
     * Gets state type.
     *
     * @return the state type
     */
    public String getStateType() {
		return this.stateType;
	}

    /**
     * Sets state type.
     *
     * @param stateType the state type
     */
    public void setStateType(String stateType) {
		this.stateType = stateType;
	}

}
