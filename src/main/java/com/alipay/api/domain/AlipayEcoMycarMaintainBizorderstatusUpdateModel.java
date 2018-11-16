package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单状态变更通知接口
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:27:10
 */
public class AlipayEcoMycarMaintainBizorderstatusUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 2679733584846927566L;

	/**
	 * 支付宝交易流水号
如果保养订单变更状态为已支付，则必填
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/**
	 * ISV订单业务状态文案，车主平台状态和ISV订单状态存在差异时，记录ISV对应的业务状态。
	 */
	@ApiField("biz_status_txt")
	private String bizStatusTxt;

	/**
	 * 行业类目标识
洗车-015；保养-016；4S-020
	 */
	@ApiField("industry_code")
	private String industryCode;

	/**
	 * 物流公司编号。支付宝支持物流公司编号。具体查看 
支付宝支持物流公司编码.zip。
如果保养订单变更状态为已出库，则必填
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 物流公司名称。支付宝支付物流公司名称。具体查看 支付宝支持物流公司编码.zip。
如果保养订单变更状态为已出库，则必填
	 */
	@ApiField("logistics_company")
	private String logisticsCompany;

	/**
	 * 流单号， ISV上传商品物流单号，用于物流流水的查询。
如果保养订单变更状态为已出库，则必填
	 */
	@ApiField("logistics_no")
	private String logisticsNo;

	/**
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 车主平台业务订单状态
1-未支付；
4-已关闭；
6-支付完成；
7-已出库；
8-已收货； 
11-服务开始；
55-服务完成/已核销；
56-订单完成；
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 支付宝账号
如果保养订单变更状态为已支付，则必填
	 */
	@ApiField("pay_account")
	private String payAccount;

	/**
	 * 支付时间yyyy-MM-dd HH:mm:ss
如果保养订单变更状态为已支付，则必填
	 */
	@ApiField("pay_time")
	private String payTime;

	/**
	 * 订单发货地址。记录订单发货的详细地址。省^^^市^^^区^^^详细地址。
如果保养订单变更状态为已出库，则必填
	 */
	@ApiField("sender_addr")
	private String senderAddr;

    /**
     * Gets alipay trade no.
     *
     * @return the alipay trade no
     */
    public String getAlipayTradeNo() {
		return this.alipayTradeNo;
	}

    /**
     * Sets alipay trade no.
     *
     * @param alipayTradeNo the alipay trade no
     */
    public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}

    /**
     * Gets biz status txt.
     *
     * @return the biz status txt
     */
    public String getBizStatusTxt() {
		return this.bizStatusTxt;
	}

    /**
     * Sets biz status txt.
     *
     * @param bizStatusTxt the biz status txt
     */
    public void setBizStatusTxt(String bizStatusTxt) {
		this.bizStatusTxt = bizStatusTxt;
	}

    /**
     * Gets industry code.
     *
     * @return the industry code
     */
    public String getIndustryCode() {
		return this.industryCode;
	}

    /**
     * Sets industry code.
     *
     * @param industryCode the industry code
     */
    public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}

    /**
     * Gets logistics code.
     *
     * @return the logistics code
     */
    public String getLogisticsCode() {
		return this.logisticsCode;
	}

    /**
     * Sets logistics code.
     *
     * @param logisticsCode the logistics code
     */
    public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

    /**
     * Gets logistics company.
     *
     * @return the logistics company
     */
    public String getLogisticsCompany() {
		return this.logisticsCompany;
	}

    /**
     * Sets logistics company.
     *
     * @param logisticsCompany the logistics company
     */
    public void setLogisticsCompany(String logisticsCompany) {
		this.logisticsCompany = logisticsCompany;
	}

    /**
     * Gets logistics no.
     *
     * @return the logistics no
     */
    public String getLogisticsNo() {
		return this.logisticsNo;
	}

    /**
     * Sets logistics no.
     *
     * @param logisticsNo the logistics no
     */
    public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
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
     * Gets order status.
     *
     * @return the order status
     */
    public String getOrderStatus() {
		return this.orderStatus;
	}

    /**
     * Sets order status.
     *
     * @param orderStatus the order status
     */
    public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

    /**
     * Gets pay account.
     *
     * @return the pay account
     */
    public String getPayAccount() {
		return this.payAccount;
	}

    /**
     * Sets pay account.
     *
     * @param payAccount the pay account
     */
    public void setPayAccount(String payAccount) {
		this.payAccount = payAccount;
	}

    /**
     * Gets pay time.
     *
     * @return the pay time
     */
    public String getPayTime() {
		return this.payTime;
	}

    /**
     * Sets pay time.
     *
     * @param payTime the pay time
     */
    public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

    /**
     * Gets sender addr.
     *
     * @return the sender addr
     */
    public String getSenderAddr() {
		return this.senderAddr;
	}

    /**
     * Sets sender addr.
     *
     * @param senderAddr the sender addr
     */
    public void setSenderAddr(String senderAddr) {
		this.senderAddr = senderAddr;
	}

}
