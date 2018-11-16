package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.commodity.order.buy response.
 *
 * @author auto create
 * @since 1.0, 2018-08-22 14:35:00
 */
public class KoubeiCateringCommodityOrderBuyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6172817593257588116L;

	/** 
	 * 扩展字段，供以后拓展使用
	 */
	@ApiListField("ext_info")
	@ApiField("string")
	private List<String> extInfo;

	/** 
	 * order_result为success时返回；order_result为fail的时候不返回
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * success表示订购成功；fail表示订购失败
	 */
	@ApiField("order_result")
	private String orderResult;

	/** 
	 * 描述订购结果信息
	 */
	@ApiField("order_result_msg")
	private String orderResultMsg;

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(List<String> extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public List<String> getExtInfo( ) {
		return this.extInfo;
	}

    /**
     * Sets order id.
     *
     * @param orderId the order id
     */
    public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

    /**
     * Gets order id.
     *
     * @return the order id
     */
    public String getOrderId( ) {
		return this.orderId;
	}

    /**
     * Sets order result.
     *
     * @param orderResult the order result
     */
    public void setOrderResult(String orderResult) {
		this.orderResult = orderResult;
	}

    /**
     * Gets order result.
     *
     * @return the order result
     */
    public String getOrderResult( ) {
		return this.orderResult;
	}

    /**
     * Sets order result msg.
     *
     * @param orderResultMsg the order result msg
     */
    public void setOrderResultMsg(String orderResultMsg) {
		this.orderResultMsg = orderResultMsg;
	}

    /**
     * Gets order result msg.
     *
     * @return the order result msg
     */
    public String getOrderResultMsg( ) {
		return this.orderResultMsg;
	}

}
