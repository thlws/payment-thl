package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 该API用于外部商户准入时的反洗钱风险分析。
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:13
 */
public class AlipaySecurityProdAmlriskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1822574989357386653L;

	/**
	 * 办公地址
	 */
	@ApiField("business_address")
	private String businessAddress;

	/**
	 * 标识该次反洗钱风险分析事件请求的id，商户应保证此id唯一。
	 */
	@ApiField("event_id")
	private String eventId;

	/**
	 * 与商户相关个体的信息列表，可以有0个到多个。
	 */
	@ApiListField("individual_list")
	@ApiField("individual_info")
	private List<IndividualInfo> individualList;

	/**
	 * 公司名称、类型、性质
	 */
	@ApiField("legal_name")
	private String legalName;

	/**
	 * 商户ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 该商户准入申请的id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 公司注册地址
	 */
	@ApiField("registered_address")
	private String registeredAddress;

	/**
	 * 公司注册号
	 */
	@ApiField("registration_number")
	private String registrationNumber;

    /**
     * Gets business address.
     *
     * @return the business address
     */
    public String getBusinessAddress() {
		return this.businessAddress;
	}

    /**
     * Sets business address.
     *
     * @param businessAddress the business address
     */
    public void setBusinessAddress(String businessAddress) {
		this.businessAddress = businessAddress;
	}

    /**
     * Gets event id.
     *
     * @return the event id
     */
    public String getEventId() {
		return this.eventId;
	}

    /**
     * Sets event id.
     *
     * @param eventId the event id
     */
    public void setEventId(String eventId) {
		this.eventId = eventId;
	}

    /**
     * Gets individual list.
     *
     * @return the individual list
     */
    public List<IndividualInfo> getIndividualList() {
		return this.individualList;
	}

    /**
     * Sets individual list.
     *
     * @param individualList the individual list
     */
    public void setIndividualList(List<IndividualInfo> individualList) {
		this.individualList = individualList;
	}

    /**
     * Gets legal name.
     *
     * @return the legal name
     */
    public String getLegalName() {
		return this.legalName;
	}

    /**
     * Sets legal name.
     *
     * @param legalName the legal name
     */
    public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

    /**
     * Gets merchant id.
     *
     * @return the merchant id
     */
    public String getMerchantId() {
		return this.merchantId;
	}

    /**
     * Sets merchant id.
     *
     * @param merchantId the merchant id
     */
    public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
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

    /**
     * Gets registered address.
     *
     * @return the registered address
     */
    public String getRegisteredAddress() {
		return this.registeredAddress;
	}

    /**
     * Sets registered address.
     *
     * @param registeredAddress the registered address
     */
    public void setRegisteredAddress(String registeredAddress) {
		this.registeredAddress = registeredAddress;
	}

    /**
     * Gets registration number.
     *
     * @return the registration number
     */
    public String getRegistrationNumber() {
		return this.registrationNumber;
	}

    /**
     * Sets registration number.
     *
     * @param registrationNumber the registration number
     */
    public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

}
