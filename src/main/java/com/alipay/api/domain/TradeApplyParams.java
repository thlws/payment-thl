package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业代理收单接口使用的交易相关参数
 *
 * @author auto create
 * @since 1.0, 2017-05-10 11:09:03
 */
public class TradeApplyParams extends AlipayObject {

	private static final long serialVersionUID = 6681534692149348787L;

	/**
	 * 系统商编号，该参数作为系统商返佣数据提取的依据，请填写系统商签约协议的PID
	 */
	@ApiField("broker_id")
	private String brokerId;

	/**
	 * 买家姓名
	 */
	@ApiField("buyer_name")
	private String buyerName;

	/**
	 * 货币符号
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 设置未付款支付宝订单的超时时间，一旦超时，该笔订单就会自动失效。当商户调用接口时开始计时。取值精确至秒，格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("expire_time")
	private String expireTime;

	/**
	 * 第三方唯一序列号， 64个字符以内、可包含字母、数字、下划线；需保证在商户端不重复
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 优惠参数,用于传递营销信息。传递参数时，请所在行业的业务人员确认。
	 */
	@ApiField("promo_params")
	private String promoParams;

	/**
	 * 交易标题/订单标题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("total_amount")
	private String totalAmount;

    /**
     * Gets broker id.
     *
     * @return the broker id
     */
    public String getBrokerId() {
		return this.brokerId;
	}

    /**
     * Sets broker id.
     *
     * @param brokerId the broker id
     */
    public void setBrokerId(String brokerId) {
		this.brokerId = brokerId;
	}

    /**
     * Gets buyer name.
     *
     * @return the buyer name
     */
    public String getBuyerName() {
		return this.buyerName;
	}

    /**
     * Sets buyer name.
     *
     * @param buyerName the buyer name
     */
    public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

    /**
     * Gets currency.
     *
     * @return the currency
     */
    public String getCurrency() {
		return this.currency;
	}

    /**
     * Sets currency.
     *
     * @param currency the currency
     */
    public void setCurrency(String currency) {
		this.currency = currency;
	}

    /**
     * Gets expire time.
     *
     * @return the expire time
     */
    public String getExpireTime() {
		return this.expireTime;
	}

    /**
     * Sets expire time.
     *
     * @param expireTime the expire time
     */
    public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
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
     * Gets promo params.
     *
     * @return the promo params
     */
    public String getPromoParams() {
		return this.promoParams;
	}

    /**
     * Sets promo params.
     *
     * @param promoParams the promo params
     */
    public void setPromoParams(String promoParams) {
		this.promoParams = promoParams;
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
     * Gets total amount.
     *
     * @return the total amount
     */
    public String getTotalAmount() {
		return this.totalAmount;
	}

    /**
     * Sets total amount.
     *
     * @param totalAmount the total amount
     */
    public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
