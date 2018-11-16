package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.logistics.express.order.query response.
 *
 * @author auto create
 * @since 1.0, 2017-04-06 18:05:24
 */
public class AlipayEcoLogisticsExpressOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4713254875329811662L;

	/** 
	 * 接单类型，已接单状态时必填
courier_accept：快递员接单，
site_accept：快递站接单
	 */
	@ApiField("accept_type")
	private String acceptType;

	/** 
	 * 取消原因，已取消状态时必填
	 */
	@ApiField("cancel_cause")
	private String cancelCause;

	/** 
	 * 快递员支付宝帐号，快递员接单时选填
	 */
	@ApiField("courier_alipay_account")
	private String courierAlipayAccount;

	/** 
	 * 员工号，快递员接单时必填
	 */
	@ApiField("courier_emp_num")
	private String courierEmpNum;

	/** 
	 * 身份证，快递员接单时选填
	 */
	@ApiField("courier_id_card")
	private String courierIdCard;

	/** 
	 * 快递员手机号，快递员接单时必填
	 */
	@ApiField("courier_mobile")
	private String courierMobile;

	/** 
	 * 快递员姓名，快递员接单时必填
	 */
	@ApiField("courier_name")
	private String courierName;

	/** 
	 * 订单创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/** 
	 * 运费险理赔金额（元）
	 */
	@ApiField("fare_claims_amount")
	private String fareClaimsAmount;

	/** 
	 * 订单最后更新时间
	 */
	@ApiField("last_modified_time")
	private Date lastModifiedTime;

	/** 
	 * 物流机构编码，参照物流机构编码文档，<a href="https://expressprod.oss-cn-hangzhou.aliyuncs.com/docs/%E5%AF%84%E4%BB%B6%E5%B9%B3%E5%8F%B0-%E7%89%A9%E6%B5%81%E6%9C%BA%E6%9E%84%E7%BC%96%E7%A0%81%E6%96%87%E6%A1%A3.xlsx">点此下载</a>。
	 */
	@ApiField("logis_merch_code")
	private String logisMerchCode;

	/** 
	 * 订单总金额（元）
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/** 
	 * 寄件平台订单号，系统唯一
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 订单状态
waiting_accept:待接单，
accepted:已接单，待取件，
collected:已取件
canceled:已取消
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 支付状态
non_pay:未支付
payed:已支付
pay_failed:支付失败
	 */
	@ApiField("pay_status")
	private String payStatus;

	/** 
	 * 产品类型变更原因。
	 */
	@ApiField("product_type_change_reason")
	private String productTypeChangeReason;

	/** 
	 * 产品类型编码，取值如下：
STANDARD：标准快递。这是寄件平台默认支持的产品分类，如有其他产品分类的支持需求，可以发送邮件至xxx@alipay.com联系。
	 */
	@ApiField("product_type_code")
	private String productTypeCode;

	/** 
	 * 站点所在区县编码，快递站点接单时必填。采用国家标准编码，详见国家统计局数据，<a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/2016.xls?spm=a219a.7395905.0.0.IwSSLe&file=2016.xls">点此下载</a>。
	 */
	@ApiField("site_area_code")
	private String siteAreaCode;

	/** 
	 * 快递站点编号，快递站点接单时必填
	 */
	@ApiField("site_code")
	private String siteCode;

	/** 
	 * 站点投诉电话，快递站点接单时选填
	 */
	@ApiField("site_complain_tel")
	private String siteComplainTel;

	/** 
	 * 站点所在详细地址，快递站点接单时必填
	 */
	@ApiField("site_detail_addr")
	private String siteDetailAddr;

	/** 
	 * 站点负责人手机号，快递站点接单时必填
	 */
	@ApiField("site_leader_mobile")
	private String siteLeaderMobile;

	/** 
	 * 站点负责人，快递站点接单时必填
	 */
	@ApiField("site_leader_name")
	private String siteLeaderName;

	/** 
	 * 快递站点名称，快递站点接单时必填
	 */
	@ApiField("site_name")
	private String siteName;

	/** 
	 * 支付宝交易金额（元）
	 */
	@ApiField("trade_amount")
	private String tradeAmount;

	/** 
	 * 支付宝交易号，已支付状态必填
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 运单号，已取件状态时必填
	 */
	@ApiField("way_bill_no")
	private String wayBillNo;

    /**
     * Sets accept type.
     *
     * @param acceptType the accept type
     */
    public void setAcceptType(String acceptType) {
		this.acceptType = acceptType;
	}

    /**
     * Gets accept type.
     *
     * @return the accept type
     */
    public String getAcceptType( ) {
		return this.acceptType;
	}

    /**
     * Sets cancel cause.
     *
     * @param cancelCause the cancel cause
     */
    public void setCancelCause(String cancelCause) {
		this.cancelCause = cancelCause;
	}

    /**
     * Gets cancel cause.
     *
     * @return the cancel cause
     */
    public String getCancelCause( ) {
		return this.cancelCause;
	}

    /**
     * Sets courier alipay account.
     *
     * @param courierAlipayAccount the courier alipay account
     */
    public void setCourierAlipayAccount(String courierAlipayAccount) {
		this.courierAlipayAccount = courierAlipayAccount;
	}

    /**
     * Gets courier alipay account.
     *
     * @return the courier alipay account
     */
    public String getCourierAlipayAccount( ) {
		return this.courierAlipayAccount;
	}

    /**
     * Sets courier emp num.
     *
     * @param courierEmpNum the courier emp num
     */
    public void setCourierEmpNum(String courierEmpNum) {
		this.courierEmpNum = courierEmpNum;
	}

    /**
     * Gets courier emp num.
     *
     * @return the courier emp num
     */
    public String getCourierEmpNum( ) {
		return this.courierEmpNum;
	}

    /**
     * Sets courier id card.
     *
     * @param courierIdCard the courier id card
     */
    public void setCourierIdCard(String courierIdCard) {
		this.courierIdCard = courierIdCard;
	}

    /**
     * Gets courier id card.
     *
     * @return the courier id card
     */
    public String getCourierIdCard( ) {
		return this.courierIdCard;
	}

    /**
     * Sets courier mobile.
     *
     * @param courierMobile the courier mobile
     */
    public void setCourierMobile(String courierMobile) {
		this.courierMobile = courierMobile;
	}

    /**
     * Gets courier mobile.
     *
     * @return the courier mobile
     */
    public String getCourierMobile( ) {
		return this.courierMobile;
	}

    /**
     * Sets courier name.
     *
     * @param courierName the courier name
     */
    public void setCourierName(String courierName) {
		this.courierName = courierName;
	}

    /**
     * Gets courier name.
     *
     * @return the courier name
     */
    public String getCourierName( ) {
		return this.courierName;
	}

    /**
     * Sets create time.
     *
     * @param createTime the create time
     */
    public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

    /**
     * Gets create time.
     *
     * @return the create time
     */
    public Date getCreateTime( ) {
		return this.createTime;
	}

    /**
     * Sets fare claims amount.
     *
     * @param fareClaimsAmount the fare claims amount
     */
    public void setFareClaimsAmount(String fareClaimsAmount) {
		this.fareClaimsAmount = fareClaimsAmount;
	}

    /**
     * Gets fare claims amount.
     *
     * @return the fare claims amount
     */
    public String getFareClaimsAmount( ) {
		return this.fareClaimsAmount;
	}

    /**
     * Sets last modified time.
     *
     * @param lastModifiedTime the last modified time
     */
    public void setLastModifiedTime(Date lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}

    /**
     * Gets last modified time.
     *
     * @return the last modified time
     */
    public Date getLastModifiedTime( ) {
		return this.lastModifiedTime;
	}

    /**
     * Sets logis merch code.
     *
     * @param logisMerchCode the logis merch code
     */
    public void setLogisMerchCode(String logisMerchCode) {
		this.logisMerchCode = logisMerchCode;
	}

    /**
     * Gets logis merch code.
     *
     * @return the logis merch code
     */
    public String getLogisMerchCode( ) {
		return this.logisMerchCode;
	}

    /**
     * Sets order amount.
     *
     * @param orderAmount the order amount
     */
    public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

    /**
     * Gets order amount.
     *
     * @return the order amount
     */
    public String getOrderAmount( ) {
		return this.orderAmount;
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
     * Gets order no.
     *
     * @return the order no
     */
    public String getOrderNo( ) {
		return this.orderNo;
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
     * Gets order status.
     *
     * @return the order status
     */
    public String getOrderStatus( ) {
		return this.orderStatus;
	}

    /**
     * Sets pay status.
     *
     * @param payStatus the pay status
     */
    public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

    /**
     * Gets pay status.
     *
     * @return the pay status
     */
    public String getPayStatus( ) {
		return this.payStatus;
	}

    /**
     * Sets product type change reason.
     *
     * @param productTypeChangeReason the product type change reason
     */
    public void setProductTypeChangeReason(String productTypeChangeReason) {
		this.productTypeChangeReason = productTypeChangeReason;
	}

    /**
     * Gets product type change reason.
     *
     * @return the product type change reason
     */
    public String getProductTypeChangeReason( ) {
		return this.productTypeChangeReason;
	}

    /**
     * Sets product type code.
     *
     * @param productTypeCode the product type code
     */
    public void setProductTypeCode(String productTypeCode) {
		this.productTypeCode = productTypeCode;
	}

    /**
     * Gets product type code.
     *
     * @return the product type code
     */
    public String getProductTypeCode( ) {
		return this.productTypeCode;
	}

    /**
     * Sets site area code.
     *
     * @param siteAreaCode the site area code
     */
    public void setSiteAreaCode(String siteAreaCode) {
		this.siteAreaCode = siteAreaCode;
	}

    /**
     * Gets site area code.
     *
     * @return the site area code
     */
    public String getSiteAreaCode( ) {
		return this.siteAreaCode;
	}

    /**
     * Sets site code.
     *
     * @param siteCode the site code
     */
    public void setSiteCode(String siteCode) {
		this.siteCode = siteCode;
	}

    /**
     * Gets site code.
     *
     * @return the site code
     */
    public String getSiteCode( ) {
		return this.siteCode;
	}

    /**
     * Sets site complain tel.
     *
     * @param siteComplainTel the site complain tel
     */
    public void setSiteComplainTel(String siteComplainTel) {
		this.siteComplainTel = siteComplainTel;
	}

    /**
     * Gets site complain tel.
     *
     * @return the site complain tel
     */
    public String getSiteComplainTel( ) {
		return this.siteComplainTel;
	}

    /**
     * Sets site detail addr.
     *
     * @param siteDetailAddr the site detail addr
     */
    public void setSiteDetailAddr(String siteDetailAddr) {
		this.siteDetailAddr = siteDetailAddr;
	}

    /**
     * Gets site detail addr.
     *
     * @return the site detail addr
     */
    public String getSiteDetailAddr( ) {
		return this.siteDetailAddr;
	}

    /**
     * Sets site leader mobile.
     *
     * @param siteLeaderMobile the site leader mobile
     */
    public void setSiteLeaderMobile(String siteLeaderMobile) {
		this.siteLeaderMobile = siteLeaderMobile;
	}

    /**
     * Gets site leader mobile.
     *
     * @return the site leader mobile
     */
    public String getSiteLeaderMobile( ) {
		return this.siteLeaderMobile;
	}

    /**
     * Sets site leader name.
     *
     * @param siteLeaderName the site leader name
     */
    public void setSiteLeaderName(String siteLeaderName) {
		this.siteLeaderName = siteLeaderName;
	}

    /**
     * Gets site leader name.
     *
     * @return the site leader name
     */
    public String getSiteLeaderName( ) {
		return this.siteLeaderName;
	}

    /**
     * Sets site name.
     *
     * @param siteName the site name
     */
    public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

    /**
     * Gets site name.
     *
     * @return the site name
     */
    public String getSiteName( ) {
		return this.siteName;
	}

    /**
     * Sets trade amount.
     *
     * @param tradeAmount the trade amount
     */
    public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

    /**
     * Gets trade amount.
     *
     * @return the trade amount
     */
    public String getTradeAmount( ) {
		return this.tradeAmount;
	}

    /**
     * Sets trade no.
     *
     * @param tradeNo the trade no
     */
    public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

    /**
     * Gets trade no.
     *
     * @return the trade no
     */
    public String getTradeNo( ) {
		return this.tradeNo;
	}

    /**
     * Sets way bill no.
     *
     * @param wayBillNo the way bill no
     */
    public void setWayBillNo(String wayBillNo) {
		this.wayBillNo = wayBillNo;
	}

    /**
     * Gets way bill no.
     *
     * @return the way bill no
     */
    public String getWayBillNo( ) {
		return this.wayBillNo;
	}

}
