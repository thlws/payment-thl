package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * pos订单推进同步
 *
 * @author auto create
 * @since 1.0, 2018-09-18 16:34:15
 */
public class KoubeiCateringOrderInfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6254742972258563786L;

	/**
	 * 订单操作类型，RECEIPT—接单、REJECT—拒单、PREPARE—已备餐、DELIVER—已送餐、REFUND—退款、RENEW—反结、ACCEPT_REFUND 接受退款，REJECT_REFUND 拒接退款，TABLE_CHANGE-修改桌号
	 */
	@ApiField("action")
	private String action;

	/**
	 * 操作内容信息，Map<String,String> actionInfo = new HashMap<String,String>();
actionInfo.put("NO","5100");// 取餐号
JSONObject.toJSONString(actionInfo);拒单原因/主动退款原因/同意退款原因包括:1、RECEIVE_TIMEOUT超时未接单，2、BUSY店铺太忙，无法接待3、DUPLICATE_ORDER重复订单，4、SHOP_CLOSE店铺已打烊5、SELL_OUT菜品售完，5、OTHER_REASON 其他原因，6、TABLE_NOT_EXIST 桌号不存在;拒绝退款原因包括:1、RECEIVE_TIMEOUT用户已取餐，2、UNDER_LINE_NEGOTIATION和用户协商一致，线下解决，3、OTHER_REASON其他原因;接单时action_info中加桌号(tableNo)，tableNo和no只能传一种，并确定取餐方式;修改桌号时action_info中传tableNo
	 */
	@ApiField("action_info")
	private String actionInfo;

	/**
	 * 口碑端自己的订单号
	 */
	@ApiField("order_id")
	private String orderId;

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
     * Gets action info.
     *
     * @return the action info
     */
    public String getActionInfo() {
		return this.actionInfo;
	}

    /**
     * Sets action info.
     *
     * @param actionInfo the action info
     */
    public void setActionInfo(String actionInfo) {
		this.actionInfo = actionInfo;
	}

    /**
     * Gets order id.
     *
     * @return the order id
     */
    public String getOrderId() {
		return this.orderId;
	}

    /**
     * Sets order id.
     *
     * @param orderId the order id
     */
    public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
