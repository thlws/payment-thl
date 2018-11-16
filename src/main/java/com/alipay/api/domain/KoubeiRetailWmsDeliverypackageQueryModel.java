package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 包裹信息查询
 *
 * @author auto create
 * @since 1.0, 2018-06-12 17:18:08
 */
public class KoubeiRetailWmsDeliverypackageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2663312472213273396L;

	/**
	 * 运单号（与通知单号二选一，如果都存在，以通知单号查询）
	 */
	@ApiField("express_code")
	private String expressCode;

	/**
	 * 通知单id（与运单号二选一）
	 */
	@ApiField("notice_order_id")
	private String noticeOrderId;

	/**
	 * 操作上下文
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 作业id
	 */
	@ApiField("work_order_id")
	private String workOrderId;

    /**
     * Gets express code.
     *
     * @return the express code
     */
    public String getExpressCode() {
		return this.expressCode;
	}

    /**
     * Sets express code.
     *
     * @param expressCode the express code
     */
    public void setExpressCode(String expressCode) {
		this.expressCode = expressCode;
	}

    /**
     * Gets notice order id.
     *
     * @return the notice order id
     */
    public String getNoticeOrderId() {
		return this.noticeOrderId;
	}

    /**
     * Sets notice order id.
     *
     * @param noticeOrderId the notice order id
     */
    public void setNoticeOrderId(String noticeOrderId) {
		this.noticeOrderId = noticeOrderId;
	}

    /**
     * Gets operate context.
     *
     * @return the operate context
     */
    public OperateContext getOperateContext() {
		return this.operateContext;
	}

    /**
     * Sets operate context.
     *
     * @param operateContext the operate context
     */
    public void setOperateContext(OperateContext operateContext) {
		this.operateContext = operateContext;
	}

    /**
     * Gets work order id.
     *
     * @return the work order id
     */
    public String getWorkOrderId() {
		return this.workOrderId;
	}

    /**
     * Sets work order id.
     *
     * @param workOrderId the work order id
     */
    public void setWorkOrderId(String workOrderId) {
		this.workOrderId = workOrderId;
	}

}
