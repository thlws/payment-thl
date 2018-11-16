package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 跨境游汇率批量查询
 *
 * @author auto create
 * @since 1.0, 2018-06-14 11:21:50
 */
public class AlipayOverseasTravelExchangerateBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2658668384844938335L;

	/**
	 * 货币代码列表，货币代码遵循ISO标准alpha- 3币种代码，用英文半角逗号分隔，支持的币种可以联系支付宝技术支持获取
	 */
	@ApiListField("currencies")
	@ApiField("string")
	private List<String> currencies;

	/**
	 * 业务扩展参数,用于商户的特 定业务信息的传递,json格式
	 */
	@ApiField("extend_param")
	private String extendParam;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets currencies.
     *
     * @return the currencies
     */
    public List<String> getCurrencies() {
		return this.currencies;
	}

    /**
     * Sets currencies.
     *
     * @param currencies the currencies
     */
    public void setCurrencies(List<String> currencies) {
		this.currencies = currencies;
	}

    /**
     * Gets extend param.
     *
     * @return the extend param
     */
    public String getExtendParam() {
		return this.extendParam;
	}

    /**
     * Sets extend param.
     *
     * @param extendParam the extend param
     */
    public void setExtendParam(String extendParam) {
		this.extendParam = extendParam;
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
