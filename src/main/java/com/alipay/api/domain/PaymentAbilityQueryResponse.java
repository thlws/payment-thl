package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付能力返回结果
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class PaymentAbilityQueryResponse extends AlipayObject {

	private static final long serialVersionUID = 4529628739495693225L;

	/**
	 * 附加信息，json格式字符串。暂时包含信息：是否是支付宝钱包用户，是否是数字娱乐行业活跃用户。
	 */
	@ApiField("extra_infos")
	private String extraInfos;

	/**
	 * 接口返回的支付能力等级
	 */
	@ApiField("level")
	private String level;

	/**
	 * 返回的单据号
	 */
	@ApiField("order_id")
	private String orderId;

    /**
     * Gets extra infos.
     *
     * @return the extra infos
     */
    public String getExtraInfos() {
		return this.extraInfos;
	}

    /**
     * Sets extra infos.
     *
     * @param extraInfos the extra infos
     */
    public void setExtraInfos(String extraInfos) {
		this.extraInfos = extraInfos;
	}

    /**
     * Gets level.
     *
     * @return the level
     */
    public String getLevel() {
		return this.level;
	}

    /**
     * Sets level.
     *
     * @param level the level
     */
    public void setLevel(String level) {
		this.level = level;
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
