package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝脱机交易
 *
 * @author auto create
 * @since 1.0, 2017-10-17 19:47:11
 */
public class AlipayOfflineTrade extends AlipayObject {

	private static final long serialVersionUID = 1642463759739753856L;

	/**
	 * 交易实际发生时间
	 */
	@ApiField("actual_order_time")
	private Date actualOrderTime;

	/**
	 * 交易金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 交易对应的卡类型。
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 交易扩展信息,json格式字符串。
	 */
	@ApiField("order_biz_context")
	private String orderBizContext;

	/**
	 * 支付宝外部交易号，唯一表示一笔商户支付宝交易。商户必须保证唯一。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 原始脱机操作记录
	 */
	@ApiListField("records")
	@ApiField("string")
	private List<String> records;

	/**
	 * 如果该值为空，则默认为商户签约账号对应的支付宝用户ID
	 */
	@ApiField("seller_login_name")
	private String sellerLoginName;

	/**
	 * 脱机交易标题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets actual order time.
     *
     * @return the actual order time
     */
    public Date getActualOrderTime() {
		return this.actualOrderTime;
	}

    /**
     * Sets actual order time.
     *
     * @param actualOrderTime the actual order time
     */
    public void setActualOrderTime(Date actualOrderTime) {
		this.actualOrderTime = actualOrderTime;
	}

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
     * Gets card type.
     *
     * @return the card type
     */
    public String getCardType() {
		return this.cardType;
	}

    /**
     * Sets card type.
     *
     * @param cardType the card type
     */
    public void setCardType(String cardType) {
		this.cardType = cardType;
	}

    /**
     * Gets order biz context.
     *
     * @return the order biz context
     */
    public String getOrderBizContext() {
		return this.orderBizContext;
	}

    /**
     * Sets order biz context.
     *
     * @param orderBizContext the order biz context
     */
    public void setOrderBizContext(String orderBizContext) {
		this.orderBizContext = orderBizContext;
	}

    /**
     * Gets out trade no.
     *
     * @return the out trade no
     */
    public String getOutTradeNo() {
		return this.outTradeNo;
	}

    /**
     * Sets out trade no.
     *
     * @param outTradeNo the out trade no
     */
    public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

    /**
     * Gets records.
     *
     * @return the records
     */
    public List<String> getRecords() {
		return this.records;
	}

    /**
     * Sets records.
     *
     * @param records the records
     */
    public void setRecords(List<String> records) {
		this.records = records;
	}

    /**
     * Gets seller login name.
     *
     * @return the seller login name
     */
    public String getSellerLoginName() {
		return this.sellerLoginName;
	}

    /**
     * Sets seller login name.
     *
     * @param sellerLoginName the seller login name
     */
    public void setSellerLoginName(String sellerLoginName) {
		this.sellerLoginName = sellerLoginName;
	}

    /**
     * Gets subject.
     *
     * @return the subject
     */
    public String getSubject() {
		return this.subject;
	}

    /**
     * Sets subject.
     *
     * @param subject the subject
     */
    public void setSubject(String subject) {
		this.subject = subject;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
