package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝打赏订单查询接口，返回打赏订单明细及状态
 *
 * @author auto create
 * @since 1.0, 2018-09-13 19:52:55
 */
public class AlipayFundTransThirdpartyRewardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2532194486989196334L;

	/**
	 * 场景码，接入时找业务方分配
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 付款方支付宝UserId
	 */
	@ApiField("sender_user_id")
	private String senderUserId;

	/**
	 * 打赏单据号
	 */
	@ApiField("transfer_no")
	private String transferNo;

    /**
     * Gets scene.
     *
     * @return the scene
     */
    public String getScene() {
		return this.scene;
	}

    /**
     * Sets scene.
     *
     * @param scene the scene
     */
    public void setScene(String scene) {
		this.scene = scene;
	}

    /**
     * Gets sender user id.
     *
     * @return the sender user id
     */
    public String getSenderUserId() {
		return this.senderUserId;
	}

    /**
     * Sets sender user id.
     *
     * @param senderUserId the sender user id
     */
    public void setSenderUserId(String senderUserId) {
		this.senderUserId = senderUserId;
	}

    /**
     * Gets transfer no.
     *
     * @return the transfer no
     */
    public String getTransferNo() {
		return this.transferNo;
	}

    /**
     * Sets transfer no.
     *
     * @param transferNo the transfer no
     */
    public void setTransferNo(String transferNo) {
		this.transferNo = transferNo;
	}

}
