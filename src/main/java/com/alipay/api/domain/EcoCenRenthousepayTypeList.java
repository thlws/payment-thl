package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 付款方式列表，包括上述单独传递的付款方式。如果2种都传递，默认覆盖单独传递的付款方式。
 *
 * @author auto create
 * @since 1.0, 2018-06-20 10:37:58
 */
public class EcoCenRenthousepayTypeList extends AlipayObject {

	private static final long serialVersionUID = 2249775189472498252L;

	/**
	 * 集中式房源最小押金
	 */
	@ApiField("foregift_amount")
	private String foregiftAmount;

	/**
	 * 集中式最高价格，支持小数点后面2位。
	 */
	@ApiField("max_amount")
	private String maxAmount;

	/**
	 * 集中式房源最大押金
	 */
	@ApiField("max_deposit_amount")
	private String maxDepositAmount;

	/**
	 * 其它费用
	 */
	@ApiListField("other_amount")
	@ApiField("eco_renthouse_other_amount")
	private List<EcoRenthouseOtherAmount> otherAmount;

	/**
	 * 付款方式（1：付一，2：付二）
	 */
	@ApiField("pay_type")
	private Long payType;

	/**
	 * 租金
	 */
	@ApiField("room_amount")
	private String roomAmount;

    /**
     * Gets foregift amount.
     *
     * @return the foregift amount
     */
    public String getForegiftAmount() {
		return this.foregiftAmount;
	}

    /**
     * Sets foregift amount.
     *
     * @param foregiftAmount the foregift amount
     */
    public void setForegiftAmount(String foregiftAmount) {
		this.foregiftAmount = foregiftAmount;
	}

    /**
     * Gets max amount.
     *
     * @return the max amount
     */
    public String getMaxAmount() {
		return this.maxAmount;
	}

    /**
     * Sets max amount.
     *
     * @param maxAmount the max amount
     */
    public void setMaxAmount(String maxAmount) {
		this.maxAmount = maxAmount;
	}

    /**
     * Gets max deposit amount.
     *
     * @return the max deposit amount
     */
    public String getMaxDepositAmount() {
		return this.maxDepositAmount;
	}

    /**
     * Sets max deposit amount.
     *
     * @param maxDepositAmount the max deposit amount
     */
    public void setMaxDepositAmount(String maxDepositAmount) {
		this.maxDepositAmount = maxDepositAmount;
	}

    /**
     * Gets other amount.
     *
     * @return the other amount
     */
    public List<EcoRenthouseOtherAmount> getOtherAmount() {
		return this.otherAmount;
	}

    /**
     * Sets other amount.
     *
     * @param otherAmount the other amount
     */
    public void setOtherAmount(List<EcoRenthouseOtherAmount> otherAmount) {
		this.otherAmount = otherAmount;
	}

    /**
     * Gets pay type.
     *
     * @return the pay type
     */
    public Long getPayType() {
		return this.payType;
	}

    /**
     * Sets pay type.
     *
     * @param payType the pay type
     */
    public void setPayType(Long payType) {
		this.payType = payType;
	}

    /**
     * Gets room amount.
     *
     * @return the room amount
     */
    public String getRoomAmount() {
		return this.roomAmount;
	}

    /**
     * Sets room amount.
     *
     * @param roomAmount the room amount
     */
    public void setRoomAmount(String roomAmount) {
		this.roomAmount = roomAmount;
	}

}
