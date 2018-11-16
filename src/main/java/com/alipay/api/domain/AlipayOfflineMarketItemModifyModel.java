package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户可以通过此接口对商品进行库存等信息的修改（库存修改值只能大于当前值）
 *
 * @author auto create
 * @since 1.0, 2018-07-12 12:22:31
 */
public class AlipayOfflineMarketItemModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3896968815118963469L;

	/**
	 * 审核规则。支付宝内部使用，外部商户不需填写此字段。
	 */
	@ApiField("audit_rule")
	private AlipayItemAuditRule auditRule;

	/**
	 * 支付宝内部使用，暂时不支持ISV修改。商品失效时间，只能延长，不能缩短
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/**
	 * 库存
	 */
	@ApiField("inventory")
	private Long inventory;

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
	 * 支付宝内部参数，ISV不支持修改。销售规则
	 */
	@ApiField("sales_rule")
	private AlipayItemSalesRule salesRule;

	/**
	 * 商品顺序权重，必须是整数，不传默认为0，权重数值越大排序越靠前
	 */
	@ApiField("weight")
	private Long weight;

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
     * Gets gmt end.
     *
     * @return the gmt end
     */
    public String getGmtEnd() {
		return this.gmtEnd;
	}

    /**
     * Sets gmt end.
     *
     * @param gmtEnd the gmt end
     */
    public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

    /**
     * Gets inventory.
     *
     * @return the inventory
     */
    public Long getInventory() {
		return this.inventory;
	}

    /**
     * Sets inventory.
     *
     * @param inventory the inventory
     */
    public void setInventory(Long inventory) {
		this.inventory = inventory;
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
     * Gets sales rule.
     *
     * @return the sales rule
     */
    public AlipayItemSalesRule getSalesRule() {
		return this.salesRule;
	}

    /**
     * Sets sales rule.
     *
     * @param salesRule the sales rule
     */
    public void setSalesRule(AlipayItemSalesRule salesRule) {
		this.salesRule = salesRule;
	}

    /**
     * Gets weight.
     *
     * @return the weight
     */
    public Long getWeight() {
		return this.weight;
	}

    /**
     * Sets weight.
     *
     * @param weight the weight
     */
    public void setWeight(Long weight) {
		this.weight = weight;
	}

}
