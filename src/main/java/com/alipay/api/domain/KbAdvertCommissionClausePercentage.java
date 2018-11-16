package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑广告系统分佣规则(比例)
 *
 * @author auto create
 * @since 1.0, 2016-11-21 17:14:39
 */
public class KbAdvertCommissionClausePercentage extends AlipayObject {

	private static final long serialVersionUID = 1485542321711679471L;

	/**
	 * 分佣比例结束范围(100以内精度2位的非负小数)
	 */
	@ApiField("commission_rate_end")
	private String commissionRateEnd;

	/**
	 * 分佣比例开始范围(100以内精度2位的非负小数)
	 */
	@ApiField("commission_rate_start")
	private String commissionRateStart;

	/**
	 * 封顶金额结束范围(精度2位的非负小数)
	 */
	@ApiField("max_limit_end")
	private String maxLimitEnd;

	/**
	 * 封顶金额开始范围(精度2位的非负小数)
	 */
	@ApiField("max_limit_start")
	private String maxLimitStart;

    /**
     * Gets commission rate end.
     *
     * @return the commission rate end
     */
    public String getCommissionRateEnd() {
		return this.commissionRateEnd;
	}

    /**
     * Sets commission rate end.
     *
     * @param commissionRateEnd the commission rate end
     */
    public void setCommissionRateEnd(String commissionRateEnd) {
		this.commissionRateEnd = commissionRateEnd;
	}

    /**
     * Gets commission rate start.
     *
     * @return the commission rate start
     */
    public String getCommissionRateStart() {
		return this.commissionRateStart;
	}

    /**
     * Sets commission rate start.
     *
     * @param commissionRateStart the commission rate start
     */
    public void setCommissionRateStart(String commissionRateStart) {
		this.commissionRateStart = commissionRateStart;
	}

    /**
     * Gets max limit end.
     *
     * @return the max limit end
     */
    public String getMaxLimitEnd() {
		return this.maxLimitEnd;
	}

    /**
     * Sets max limit end.
     *
     * @param maxLimitEnd the max limit end
     */
    public void setMaxLimitEnd(String maxLimitEnd) {
		this.maxLimitEnd = maxLimitEnd;
	}

    /**
     * Gets max limit start.
     *
     * @return the max limit start
     */
    public String getMaxLimitStart() {
		return this.maxLimitStart;
	}

    /**
     * Sets max limit start.
     *
     * @param maxLimitStart the max limit start
     */
    public void setMaxLimitStart(String maxLimitStart) {
		this.maxLimitStart = maxLimitStart;
	}

}
