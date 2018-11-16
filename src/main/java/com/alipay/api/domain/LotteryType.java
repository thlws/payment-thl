package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 彩种类型
 *
 * @author auto create
 * @since 1.0, 2017-07-24 14:38:00
 */
public class LotteryType extends AlipayObject {

	private static final long serialVersionUID = 3693343154188481789L;

	/**
	 * 彩种ID
	 */
	@ApiField("lottery_type_id")
	private Long lotteryTypeId;

	/**
	 * 彩种名称
	 */
	@ApiField("lottery_type_name")
	private String lotteryTypeName;

    /**
     * Gets lottery type id.
     *
     * @return the lottery type id
     */
    public Long getLotteryTypeId() {
		return this.lotteryTypeId;
	}

    /**
     * Sets lottery type id.
     *
     * @param lotteryTypeId the lottery type id
     */
    public void setLotteryTypeId(Long lotteryTypeId) {
		this.lotteryTypeId = lotteryTypeId;
	}

    /**
     * Gets lottery type name.
     *
     * @return the lottery type name
     */
    public String getLotteryTypeName() {
		return this.lotteryTypeName;
	}

    /**
     * Sets lottery type name.
     *
     * @param lotteryTypeName the lottery type name
     */
    public void setLotteryTypeName(String lotteryTypeName) {
		this.lotteryTypeName = lotteryTypeName;
	}

}
