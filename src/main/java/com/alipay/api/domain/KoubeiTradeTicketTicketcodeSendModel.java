package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 码商发码成功回调接口
 *
 * @author auto create
 * @since 1.0, 2018-05-02 14:41:39
 */
public class KoubeiTradeTicketTicketcodeSendModel extends AlipayObject {

	private static final long serialVersionUID = 7391754113641582339L;

	/**
	 * 需要发送的码列表，其中code表示串码码值，num表示码的可核销份数
	 */
	@ApiListField("isv_ma_list")
	@ApiField("kb_isv_ma_code")
	private List<KbIsvMaCode> isvMaList;

	/**
	 * 口碑订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 请求id，唯一标识一次请求
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 口碑商品发货单号
	 */
	@ApiField("send_order_no")
	private String sendOrderNo;

	/**
	 * 口碑发码通知透传码商，码商需要跟发码通知获取到的参数一致
	 */
	@ApiField("send_token")
	private String sendToken;

    /**
     * Gets isv ma list.
     *
     * @return the isv ma list
     */
    public List<KbIsvMaCode> getIsvMaList() {
		return this.isvMaList;
	}

    /**
     * Sets isv ma list.
     *
     * @param isvMaList the isv ma list
     */
    public void setIsvMaList(List<KbIsvMaCode> isvMaList) {
		this.isvMaList = isvMaList;
	}

    /**
     * Gets order no.
     *
     * @return the order no
     */
    public String getOrderNo() {
		return this.orderNo;
	}

    /**
     * Sets order no.
     *
     * @param orderNo the order no
     */
    public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
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
     * Gets send order no.
     *
     * @return the send order no
     */
    public String getSendOrderNo() {
		return this.sendOrderNo;
	}

    /**
     * Sets send order no.
     *
     * @param sendOrderNo the send order no
     */
    public void setSendOrderNo(String sendOrderNo) {
		this.sendOrderNo = sendOrderNo;
	}

    /**
     * Gets send token.
     *
     * @return the send token
     */
    public String getSendToken() {
		return this.sendToken;
	}

    /**
     * Sets send token.
     *
     * @param sendToken the send token
     */
    public void setSendToken(String sendToken) {
		this.sendToken = sendToken;
	}

}
