package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 免押订单风控查询
 *
 * @author auto create
 * @since 1.0, 2018-03-16 13:48:06
 */
public class ZhimaCreditEpFreedepositOrderriskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2121154322346282993L;

	/**
	 * 本次使用免押金额，分
	 */
	@ApiField("current_use_limit")
	private Long currentUseLimit;

	/**
	 * 企业证件号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 企业证件类型
	 */
	@ApiField("ep_cert_type")
	private String epCertType;

	/**
	 * 企业名称
	 */
	@ApiField("ep_name")
	private String epName;

	/**
	 * 首笔租金金额，分
	 */
	@ApiField("first_rent_amount")
	private Long firstRentAmount;

	/**
	 * 租期期数
	 */
	@ApiField("lease_periods")
	private Long leasePeriods;

	/**
	 * 租赁设备信息列表
	 */
	@ApiListField("machine_info_list")
	@ApiField("machine_info")
	private List<MachineInfo> machineInfoList;

	/**
	 * 订单风控业务流水号，商户生成，每次业务保证唯一
	 */
	@ApiField("merchant_lease_order_no")
	private String merchantLeaseOrderNo;

	/**
	 * 超出免押额度部分的应交押金(人民币分)
	 */
	@ApiField("need_pay_deposit_amount")
	private Long needPayDepositAmount;

	/**
	 * 芝麻企业免押额度申请业务流水号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 付款日
	 */
	@ApiField("pay_date")
	private String payDate;

	/**
	 * 每期租金金额，分
	 */
	@ApiField("period_lease_amount")
	private Long periodLeaseAmount;

	/**
	 * 产品ID
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 收货地址
	 */
	@ApiField("rec_address")
	private String recAddress;

	/**
	 * 收货人手机号
	 */
	@ApiField("rec_mobile")
	private String recMobile;

	/**
	 * 收货人姓名
	 */
	@ApiField("rec_name")
	private String recName;

	/**
	 * 剩余可用免押金额，分
	 */
	@ApiField("remain_limit")
	private Long remainLimit;

	/**
	 * 租赁总金额，分
	 */
	@ApiField("total_amount")
	private Long totalAmount;

    /**
     * Gets current use limit.
     *
     * @return the current use limit
     */
    public Long getCurrentUseLimit() {
		return this.currentUseLimit;
	}

    /**
     * Sets current use limit.
     *
     * @param currentUseLimit the current use limit
     */
    public void setCurrentUseLimit(Long currentUseLimit) {
		this.currentUseLimit = currentUseLimit;
	}

    /**
     * Gets ep cert no.
     *
     * @return the ep cert no
     */
    public String getEpCertNo() {
		return this.epCertNo;
	}

    /**
     * Sets ep cert no.
     *
     * @param epCertNo the ep cert no
     */
    public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

    /**
     * Gets ep cert type.
     *
     * @return the ep cert type
     */
    public String getEpCertType() {
		return this.epCertType;
	}

    /**
     * Sets ep cert type.
     *
     * @param epCertType the ep cert type
     */
    public void setEpCertType(String epCertType) {
		this.epCertType = epCertType;
	}

    /**
     * Gets ep name.
     *
     * @return the ep name
     */
    public String getEpName() {
		return this.epName;
	}

    /**
     * Sets ep name.
     *
     * @param epName the ep name
     */
    public void setEpName(String epName) {
		this.epName = epName;
	}

    /**
     * Gets first rent amount.
     *
     * @return the first rent amount
     */
    public Long getFirstRentAmount() {
		return this.firstRentAmount;
	}

    /**
     * Sets first rent amount.
     *
     * @param firstRentAmount the first rent amount
     */
    public void setFirstRentAmount(Long firstRentAmount) {
		this.firstRentAmount = firstRentAmount;
	}

    /**
     * Gets lease periods.
     *
     * @return the lease periods
     */
    public Long getLeasePeriods() {
		return this.leasePeriods;
	}

    /**
     * Sets lease periods.
     *
     * @param leasePeriods the lease periods
     */
    public void setLeasePeriods(Long leasePeriods) {
		this.leasePeriods = leasePeriods;
	}

    /**
     * Gets machine info list.
     *
     * @return the machine info list
     */
    public List<MachineInfo> getMachineInfoList() {
		return this.machineInfoList;
	}

    /**
     * Sets machine info list.
     *
     * @param machineInfoList the machine info list
     */
    public void setMachineInfoList(List<MachineInfo> machineInfoList) {
		this.machineInfoList = machineInfoList;
	}

    /**
     * Gets merchant lease order no.
     *
     * @return the merchant lease order no
     */
    public String getMerchantLeaseOrderNo() {
		return this.merchantLeaseOrderNo;
	}

    /**
     * Sets merchant lease order no.
     *
     * @param merchantLeaseOrderNo the merchant lease order no
     */
    public void setMerchantLeaseOrderNo(String merchantLeaseOrderNo) {
		this.merchantLeaseOrderNo = merchantLeaseOrderNo;
	}

    /**
     * Gets need pay deposit amount.
     *
     * @return the need pay deposit amount
     */
    public Long getNeedPayDepositAmount() {
		return this.needPayDepositAmount;
	}

    /**
     * Sets need pay deposit amount.
     *
     * @param needPayDepositAmount the need pay deposit amount
     */
    public void setNeedPayDepositAmount(Long needPayDepositAmount) {
		this.needPayDepositAmount = needPayDepositAmount;
	}

    /**
     * Gets order no.
     *
     * @return the order no
     */
    public String getOrderNo() {
		return this.orderNo;
	}

    /**
     * Sets order no.
     *
     * @param orderNo the order no
     */
    public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

    /**
     * Gets pay date.
     *
     * @return the pay date
     */
    public String getPayDate() {
		return this.payDate;
	}

    /**
     * Sets pay date.
     *
     * @param payDate the pay date
     */
    public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

    /**
     * Gets period lease amount.
     *
     * @return the period lease amount
     */
    public Long getPeriodLeaseAmount() {
		return this.periodLeaseAmount;
	}

    /**
     * Sets period lease amount.
     *
     * @param periodLeaseAmount the period lease amount
     */
    public void setPeriodLeaseAmount(Long periodLeaseAmount) {
		this.periodLeaseAmount = periodLeaseAmount;
	}

    /**
     * Gets product code.
     *
     * @return the product code
     */
    public String getProductCode() {
		return this.productCode;
	}

    /**
     * Sets product code.
     *
     * @param productCode the product code
     */
    public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

    /**
     * Gets rec address.
     *
     * @return the rec address
     */
    public String getRecAddress() {
		return this.recAddress;
	}

    /**
     * Sets rec address.
     *
     * @param recAddress the rec address
     */
    public void setRecAddress(String recAddress) {
		this.recAddress = recAddress;
	}

    /**
     * Gets rec mobile.
     *
     * @return the rec mobile
     */
    public String getRecMobile() {
		return this.recMobile;
	}

    /**
     * Sets rec mobile.
     *
     * @param recMobile the rec mobile
     */
    public void setRecMobile(String recMobile) {
		this.recMobile = recMobile;
	}

    /**
     * Gets rec name.
     *
     * @return the rec name
     */
    public String getRecName() {
		return this.recName;
	}

    /**
     * Sets rec name.
     *
     * @param recName the rec name
     */
    public void setRecName(String recName) {
		this.recName = recName;
	}

    /**
     * Gets remain limit.
     *
     * @return the remain limit
     */
    public Long getRemainLimit() {
		return this.remainLimit;
	}

    /**
     * Sets remain limit.
     *
     * @param remainLimit the remain limit
     */
    public void setRemainLimit(Long remainLimit) {
		this.remainLimit = remainLimit;
	}

    /**
     * Gets total amount.
     *
     * @return the total amount
     */
    public Long getTotalAmount() {
		return this.totalAmount;
	}

    /**
     * Sets total amount.
     *
     * @param totalAmount the total amount
     */
    public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

}
