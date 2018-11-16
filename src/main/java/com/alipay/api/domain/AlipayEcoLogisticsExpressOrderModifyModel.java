package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单更新接口
 *
 * @author auto create
 * @since 1.0, 2017-04-06 18:04:24
 */
public class AlipayEcoLogisticsExpressOrderModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3561689834354283385L;

	/**
	 * 接单类型，已接单状态时必填
courier_accept：快递员接单，
site_accept：快递站接单
	 */
	@ApiField("accept_type")
	private String acceptType;

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
	 * 接单快递员头像文件二进制内容的BASE64编码串
头像格式为100X100的PNG图片
	 */
	@ApiField("courier_head_img")
	private String courierHeadImg;

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
	 * 物品重量（克），已取件状态时必填
	 */
	@ApiField("goods_weight")
	private Long goodsWeight;

	/**
	 * 物流机构编码，参照物流机构编码文档，<a href="https://expressprod.oss-cn-hangzhou.aliyuncs.com/docs/%E5%AF%84%E4%BB%B6%E5%B9%B3%E5%8F%B0-%E7%89%A9%E6%B5%81%E6%9C%BA%E6%9E%84%E7%BC%96%E7%A0%81%E6%96%87%E6%A1%A3.xlsx">点此下载</a>。
	 */
	@ApiField("logis_merch_code")
	private String logisMerchCode;

	/**
	 * 订单金额（元），已取件状态时必填
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
collected:已取件
accepted:已接单
canceled:已取消
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 产品类型变更原因，产品类型变更时选填。
	 */
	@ApiField("product_type_change_reason")
	private String productTypeChangeReason;

	/**
	 * 产品类型编码，如果快递公司变更了产品类型，则需要将变更后的产品类型编码回传。取值如下：
STANDARD：标准快递。这是寄件平台默认支持的产品分类，如有其他产品分类的支持需求，可以发送邮件至xxx@alipay.com联系。
	 */
	@ApiField("product_type_code")
	private String productTypeCode;

	/**
	 * 快递公司拒绝接单原因编码，已取消状态时必填，取值如下：
R01  揽收地超服务范围
R02  派送地超服务范围
R03  揽收预约时间超范围，无法协商
R04  虚假揽货电话（客户电话与联系人不符）
R05  托寄物品为禁限寄品
R06  用户恶意下单
R07  用户取消订单
R08  其他原因，需自定义描述
	 */
	@ApiField("refuse_code")
	private String refuseCode;

	/**
	 * 快递公司拒绝接单原因描述，快递公司拒绝接单原因编码取值为R08时必填
	 */
	@ApiField("refuse_desc")
	private String refuseDesc;

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
	 * 运单号，已取件状态时必填
	 */
	@ApiField("way_bill_no")
	private String wayBillNo;

    /**
     * Gets accept type.
     *
     * @return the accept type
     */
    public String getAcceptType() {
		return this.acceptType;
	}

    /**
     * Sets accept type.
     *
     * @param acceptType the accept type
     */
    public void setAcceptType(String acceptType) {
		this.acceptType = acceptType;
	}

    /**
     * Gets courier alipay account.
     *
     * @return the courier alipay account
     */
    public String getCourierAlipayAccount() {
		return this.courierAlipayAccount;
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
     * Gets courier emp num.
     *
     * @return the courier emp num
     */
    public String getCourierEmpNum() {
		return this.courierEmpNum;
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
     * Gets courier head img.
     *
     * @return the courier head img
     */
    public String getCourierHeadImg() {
		return this.courierHeadImg;
	}

    /**
     * Sets courier head img.
     *
     * @param courierHeadImg the courier head img
     */
    public void setCourierHeadImg(String courierHeadImg) {
		this.courierHeadImg = courierHeadImg;
	}

    /**
     * Gets courier id card.
     *
     * @return the courier id card
     */
    public String getCourierIdCard() {
		return this.courierIdCard;
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
     * Gets courier mobile.
     *
     * @return the courier mobile
     */
    public String getCourierMobile() {
		return this.courierMobile;
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
     * Gets courier name.
     *
     * @return the courier name
     */
    public String getCourierName() {
		return this.courierName;
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
     * Gets goods weight.
     *
     * @return the goods weight
     */
    public Long getGoodsWeight() {
		return this.goodsWeight;
	}

    /**
     * Sets goods weight.
     *
     * @param goodsWeight the goods weight
     */
    public void setGoodsWeight(Long goodsWeight) {
		this.goodsWeight = goodsWeight;
	}

    /**
     * Gets logis merch code.
     *
     * @return the logis merch code
     */
    public String getLogisMerchCode() {
		return this.logisMerchCode;
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
     * Gets order amount.
     *
     * @return the order amount
     */
    public String getOrderAmount() {
		return this.orderAmount;
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
     * Gets product type change reason.
     *
     * @return the product type change reason
     */
    public String getProductTypeChangeReason() {
		return this.productTypeChangeReason;
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
     * Gets product type code.
     *
     * @return the product type code
     */
    public String getProductTypeCode() {
		return this.productTypeCode;
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
     * Gets refuse code.
     *
     * @return the refuse code
     */
    public String getRefuseCode() {
		return this.refuseCode;
	}

    /**
     * Sets refuse code.
     *
     * @param refuseCode the refuse code
     */
    public void setRefuseCode(String refuseCode) {
		this.refuseCode = refuseCode;
	}

    /**
     * Gets refuse desc.
     *
     * @return the refuse desc
     */
    public String getRefuseDesc() {
		return this.refuseDesc;
	}

    /**
     * Sets refuse desc.
     *
     * @param refuseDesc the refuse desc
     */
    public void setRefuseDesc(String refuseDesc) {
		this.refuseDesc = refuseDesc;
	}

    /**
     * Gets site area code.
     *
     * @return the site area code
     */
    public String getSiteAreaCode() {
		return this.siteAreaCode;
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
     * Gets site code.
     *
     * @return the site code
     */
    public String getSiteCode() {
		return this.siteCode;
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
     * Gets site complain tel.
     *
     * @return the site complain tel
     */
    public String getSiteComplainTel() {
		return this.siteComplainTel;
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
     * Gets site detail addr.
     *
     * @return the site detail addr
     */
    public String getSiteDetailAddr() {
		return this.siteDetailAddr;
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
     * Gets site leader mobile.
     *
     * @return the site leader mobile
     */
    public String getSiteLeaderMobile() {
		return this.siteLeaderMobile;
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
     * Gets site leader name.
     *
     * @return the site leader name
     */
    public String getSiteLeaderName() {
		return this.siteLeaderName;
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
     * Gets site name.
     *
     * @return the site name
     */
    public String getSiteName() {
		return this.siteName;
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
     * Gets way bill no.
     *
     * @return the way bill no
     */
    public String getWayBillNo() {
		return this.wayBillNo;
	}

    /**
     * Sets way bill no.
     *
     * @param wayBillNo the way bill no
     */
    public void setWayBillNo(String wayBillNo) {
		this.wayBillNo = wayBillNo;
	}

}
