package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 付款方式列表，包括上述单独传递的付款方式。如果2种都传递，默认覆盖单独传递的付款方式。
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:48:52
 */
public class EcoDisRenthousepayTypeList extends AlipayObject {

	private static final long serialVersionUID = 2568536279791929817L;

	/**
	 * 押金
	 */
	@ApiField("foregift_amount")
	private String foregiftAmount;

	/**
	 * 可租期（1：1个月，3：三个月，6：半年，12：一年及以上）
	 */
	@ApiField("lease_term")
	private Long leaseTerm;

	/**
	 * 其他费用
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
	 * 服务费
	 */
	@ApiField("service_amount")
	private String serviceAmount;

	/**
	 * 服务费单位（m：月, y：年）
	 */
	@ApiField("service_type")
	private String serviceType;

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
     * Gets lease term.
     *
     * @return the lease term
     */
    public Long getLeaseTerm() {
		return this.leaseTerm;
	}

    /**
     * Sets lease term.
     *
     * @param leaseTerm the lease term
     */
    public void setLeaseTerm(Long leaseTerm) {
		this.leaseTerm = leaseTerm;
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

    /**
     * Gets service amount.
     *
     * @return the service amount
     */
    public String getServiceAmount() {
		return this.serviceAmount;
	}

    /**
     * Sets service amount.
     *
     * @param serviceAmount the service amount
     */
    public void setServiceAmount(String serviceAmount) {
		this.serviceAmount = serviceAmount;
	}

    /**
     * Gets service type.
     *
     * @return the service type
     */
    public String getServiceType() {
		return this.serviceType;
	}

    /**
     * Sets service type.
     *
     * @param serviceType the service type
     */
    public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

}
