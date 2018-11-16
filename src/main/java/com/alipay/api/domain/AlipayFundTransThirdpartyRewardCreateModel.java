package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部商户可通过此接口创建支付宝用户的打赏订单，而后通过支付宝快捷支付对此订单进行支付完成打赏。（不支持企业用户）
 *
 * @author auto create
 * @since 1.0, 2018-09-18 15:50:21
 */
public class AlipayFundTransThirdpartyRewardCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5133694991584775113L;

	/**
	 * 打赏金额，单位：人民币分
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 扩展参数，json格式
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 外部业务号，用于幂等控制
	 */
	@ApiField("out_no")
	private String outNo;

	/**
	 * 收款用户的支付宝userId
	 */
	@ApiField("receiver_user_id")
	private String receiverUserId;

	/**
	 * 场景码，需业务方分配方可使用
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 付款用户的支付宝userId
	 */
	@ApiField("sender_user_id")
	private String senderUserId;

	/**
	 * 打赏的标题（理由）
	 */
	@ApiField("title")
	private String title;

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public String getAmount() {
		return this.amount;
	}

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(String amount) {
		this.amount = amount;
	}

    /**
     * Gets ext param.
     *
     * @return the ext param
     */
    public String getExtParam() {
		return this.extParam;
	}

    /**
     * Sets ext param.
     *
     * @param extParam the ext param
     */
    public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

    /**
     * Gets out no.
     *
     * @return the out no
     */
    public String getOutNo() {
		return this.outNo;
	}

    /**
     * Sets out no.
     *
     * @param outNo the out no
     */
    public void setOutNo(String outNo) {
		this.outNo = outNo;
	}

    /**
     * Gets receiver user id.
     *
     * @return the receiver user id
     */
    public String getReceiverUserId() {
		return this.receiverUserId;
	}

    /**
     * Sets receiver user id.
     *
     * @param receiverUserId the receiver user id
     */
    public void setReceiverUserId(String receiverUserId) {
		this.receiverUserId = receiverUserId;
	}

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
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
		return this.title;
	}

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
		this.title = title;
	}

}
