package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 饿了么订单状态推送接口
 *
 * @author auto create
 * @since 1.0, 2017-08-21 17:24:35
 */
public class KoubeiCateringEleOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8347253934894216119L;

	/**
	 * 饿了么数据回流action类型.包含ORDER_STATUS，ORDER_DELIVERY,ORDER_REFUND
	 */
	@ApiField("action")
	private String action;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 饿了么推送的数据类型json字符串.注意data是一个字符串类型,要把一串json作为字符串传入
	 */
	@ApiField("data")
	private String data;

	/**
	 * 数据推送来源,需要找业务PD申请
	 */
	@ApiField("source")
	private String source;

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
     * Gets alipay user id.
     *
     * @return the alipay user id
     */
    public String getAlipayUserId() {
		return this.alipayUserId;
	}

    /**
     * Sets alipay user id.
     *
     * @param alipayUserId the alipay user id
     */
    public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

    /**
     * Gets data.
     *
     * @return the data
     */
    public String getData() {
		return this.data;
	}

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(String data) {
		this.data = data;
	}

    /**
     * Gets source.
     *
     * @return the source
     */
    public String getSource() {
		return this.source;
	}

    /**
     * Sets source.
     *
     * @param source the source
     */
    public void setSource(String source) {
		this.source = source;
	}

}
