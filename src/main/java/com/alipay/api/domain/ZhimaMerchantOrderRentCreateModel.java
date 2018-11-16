package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用借还创建订单
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:32:24
 */
public class ZhimaMerchantOrderRentCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4853293444156446741L;

	/**
	 * 借用用户的收货地址，可选字段。推荐商户传入此值，会将此手机号码与用户身份信息进行匹配验证，防范欺诈风险。
	 */
	@ApiField("address")
	private String address;

	/**
	 * 此字段已废弃，请商户参考expiry_time字段。
借用周期，必须是正整数
	 */
	@ApiField("borrow_cycle")
	private String borrowCycle;

	/**
	 * 此字段已废弃，请商户参考expiry_time字段。
借用周期单位：
HOUR:小时
DAY:天
	 */
	@ApiField("borrow_cycle_unit")
	private String borrowCycleUnit;

	/**
	 * 物品借用地点的描述，便于用户知道物品是在哪里借的。可为空
	 */
	@ApiField("borrow_shop_name")
	private String borrowShopName;

	/**
	 * 商户订单创建的起始借用时间，格式：YYYY-MM-DD HH:MM:SS。如果不传入或者为空，则认为订单创建起始时间为调用此接口时的时间。
	 */
	@ApiField("borrow_time")
	private String borrowTime;

	/**
	 * 借用用户的真实身份证号，非必填字段。但name和cert_no必须同时非空，或者同时为空，一旦传入会对用户身份进行校验。
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 信用业务服务，默认为空，商户入驻信用借还时，特定场景下由芝麻信用借还分配后传入即可，商户自助接入流程里不需要传入该字段，否则会对该字段进行合法性校验
	 */
	@ApiField("credit_biz")
	private String creditBiz;

	/**
	 * 押金，金额单位：元。
注：不允许免押金的用户按此金额支付押金；当物品丢失时，赔偿金额不得高于该金额。
	 */
	@ApiField("deposit_amount")
	private String depositAmount;

	/**
	 * 是否支持当借用用户信用不够（不准入）时，可让用户支付押金借用: 
Y:支持
N:不支持
注：支付押金的金额等同于deposit_amount
	 */
	@ApiField("deposit_state")
	private String depositState;

	/**
	 * 到期时间，请根据实际业务合理设置该值，不允许为空，格式：YYYY-MM-DD HH:MM:SS，是指最晚归还时间，表示借用用户如果超过此时间还未完结订单（未归还物品或者未支付租金）将会进入逾期状态，芝麻会给借用用户发送催收提醒；需要晚于borrow_time。
	 */
	@ApiField("expiry_time")
	private String expiryTime;

	/**
	 * 扩展信息。商户发起借用服务时的扩展信息字段，格式：json，注意，如果字符串对应的json对象包含中文字符，需要对包含中文的字段进行编码
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 物品名称,最长不能超过14个汉字
	 */
	@ApiField("goods_name")
	private String goodsName;

	/**
	 * 回调到商户的url地址
	 */
	@ApiField("invoke_return_url")
	private String invokeReturnUrl;

	/**
	 * 商户请求状态上下文。商户发起借用服务时，需要在借用结束后返回给商户的参数，格式：json
	 */
	@ApiField("invoke_state")
	private String invokeState;

	/**
	 * 商户访问蚂蚁的对接模式：
WINDOWS：支付宝服务窗。
目前是固定值，有新增类型会同步到文档上
	 */
	@ApiField("invoke_type")
	private String invokeType;

	/**
	 * 借用用户的手机号码，可选字段。推荐商户传入此值，会将此手机号码与用户身份信息进行匹配验证，防范欺诈风险。
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 借用用户的真实姓名，非必填字段。但name和cert_no必须同时非空，或者同时为空，一旦传入会对用户身份进行校验。
	 */
	@ApiField("name")
	private String name;

	/**
	 * 废弃，使用蚂蚁开放平台应用中的网关地址
	 */
	@ApiField("notify_url")
	private String notifyUrl;

	/**
	 * 外部订单号，需要唯一，由商户传入，芝麻内部会做幂等控制，格式为：yyyyMMddHHmmss+随机数
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 信用借还的产品码，传入固定值：w1010100000000002858
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 租金，租金+租金单位组合才具备实际的租金意义。
>0.00元，代表有租金
=0.00元，代表无租金，免费借用
注：参数传值必须>=0，传入其他值会报错参数非法
	 */
	@ApiField("rent_amount")
	private String rentAmount;

	/**
	 * 租金信息描述 ,长度不超过14个汉字，只用于页面展示给C端用户，除此之外无其他意义。
	 */
	@ApiField("rent_info")
	private String rentInfo;

	/**
	 * 租金的结算方式，非必填字段，默认是支付宝租金结算支付
merchant：表示商户自行结算，信用借还不提供租金支付能力；
alipay：表示使用支付宝支付功能，给用户提供租金代扣及赔偿金支付能力；
	 */
	@ApiField("rent_settle_type")
	private String rentSettleType;

	/**
	 * 租金单位，租金+租金单位组合才具备实际的租金意义。
取值定义如下：
DAY_YUAN:元/天
HOUR_YUAN:元/小时
YUAN:元
YUAN_ONCE: 元/次
	 */
	@ApiField("rent_unit")
	private String rentUnit;

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
		return this.address;
	}

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
		this.address = address;
	}

    /**
     * Gets borrow cycle.
     *
     * @return the borrow cycle
     */
    public String getBorrowCycle() {
		return this.borrowCycle;
	}

    /**
     * Sets borrow cycle.
     *
     * @param borrowCycle the borrow cycle
     */
    public void setBorrowCycle(String borrowCycle) {
		this.borrowCycle = borrowCycle;
	}

    /**
     * Gets borrow cycle unit.
     *
     * @return the borrow cycle unit
     */
    public String getBorrowCycleUnit() {
		return this.borrowCycleUnit;
	}

    /**
     * Sets borrow cycle unit.
     *
     * @param borrowCycleUnit the borrow cycle unit
     */
    public void setBorrowCycleUnit(String borrowCycleUnit) {
		this.borrowCycleUnit = borrowCycleUnit;
	}

    /**
     * Gets borrow shop name.
     *
     * @return the borrow shop name
     */
    public String getBorrowShopName() {
		return this.borrowShopName;
	}

    /**
     * Sets borrow shop name.
     *
     * @param borrowShopName the borrow shop name
     */
    public void setBorrowShopName(String borrowShopName) {
		this.borrowShopName = borrowShopName;
	}

    /**
     * Gets borrow time.
     *
     * @return the borrow time
     */
    public String getBorrowTime() {
		return this.borrowTime;
	}

    /**
     * Sets borrow time.
     *
     * @param borrowTime the borrow time
     */
    public void setBorrowTime(String borrowTime) {
		this.borrowTime = borrowTime;
	}

    /**
     * Gets cert no.
     *
     * @return the cert no
     */
    public String getCertNo() {
		return this.certNo;
	}

    /**
     * Sets cert no.
     *
     * @param certNo the cert no
     */
    public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

    /**
     * Gets credit biz.
     *
     * @return the credit biz
     */
    public String getCreditBiz() {
		return this.creditBiz;
	}

    /**
     * Sets credit biz.
     *
     * @param creditBiz the credit biz
     */
    public void setCreditBiz(String creditBiz) {
		this.creditBiz = creditBiz;
	}

    /**
     * Gets deposit amount.
     *
     * @return the deposit amount
     */
    public String getDepositAmount() {
		return this.depositAmount;
	}

    /**
     * Sets deposit amount.
     *
     * @param depositAmount the deposit amount
     */
    public void setDepositAmount(String depositAmount) {
		this.depositAmount = depositAmount;
	}

    /**
     * Gets deposit state.
     *
     * @return the deposit state
     */
    public String getDepositState() {
		return this.depositState;
	}

    /**
     * Sets deposit state.
     *
     * @param depositState the deposit state
     */
    public void setDepositState(String depositState) {
		this.depositState = depositState;
	}

    /**
     * Gets expiry time.
     *
     * @return the expiry time
     */
    public String getExpiryTime() {
		return this.expiryTime;
	}

    /**
     * Sets expiry time.
     *
     * @param expiryTime the expiry time
     */
    public void setExpiryTime(String expiryTime) {
		this.expiryTime = expiryTime;
	}

    /**
     * Gets extend info.
     *
     * @return the extend info
     */
    public String getExtendInfo() {
		return this.extendInfo;
	}

    /**
     * Sets extend info.
     *
     * @param extendInfo the extend info
     */
    public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

    /**
     * Gets goods name.
     *
     * @return the goods name
     */
    public String getGoodsName() {
		return this.goodsName;
	}

    /**
     * Sets goods name.
     *
     * @param goodsName the goods name
     */
    public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

    /**
     * Gets invoke return url.
     *
     * @return the invoke return url
     */
    public String getInvokeReturnUrl() {
		return this.invokeReturnUrl;
	}

    /**
     * Sets invoke return url.
     *
     * @param invokeReturnUrl the invoke return url
     */
    public void setInvokeReturnUrl(String invokeReturnUrl) {
		this.invokeReturnUrl = invokeReturnUrl;
	}

    /**
     * Gets invoke state.
     *
     * @return the invoke state
     */
    public String getInvokeState() {
		return this.invokeState;
	}

    /**
     * Sets invoke state.
     *
     * @param invokeState the invoke state
     */
    public void setInvokeState(String invokeState) {
		this.invokeState = invokeState;
	}

    /**
     * Gets invoke type.
     *
     * @return the invoke type
     */
    public String getInvokeType() {
		return this.invokeType;
	}

    /**
     * Sets invoke type.
     *
     * @param invokeType the invoke type
     */
    public void setInvokeType(String invokeType) {
		this.invokeType = invokeType;
	}

    /**
     * Gets mobile no.
     *
     * @return the mobile no
     */
    public String getMobileNo() {
		return this.mobileNo;
	}

    /**
     * Sets mobile no.
     *
     * @param mobileNo the mobile no
     */
    public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets notify url.
     *
     * @return the notify url
     */
    public String getNotifyUrl() {
		return this.notifyUrl;
	}

    /**
     * Sets notify url.
     *
     * @param notifyUrl the notify url
     */
    public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

    /**
     * Gets out order no.
     *
     * @return the out order no
     */
    public String getOutOrderNo() {
		return this.outOrderNo;
	}

    /**
     * Sets out order no.
     *
     * @param outOrderNo the out order no
     */
    public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
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
     * Gets rent amount.
     *
     * @return the rent amount
     */
    public String getRentAmount() {
		return this.rentAmount;
	}

    /**
     * Sets rent amount.
     *
     * @param rentAmount the rent amount
     */
    public void setRentAmount(String rentAmount) {
		this.rentAmount = rentAmount;
	}

    /**
     * Gets rent info.
     *
     * @return the rent info
     */
    public String getRentInfo() {
		return this.rentInfo;
	}

    /**
     * Sets rent info.
     *
     * @param rentInfo the rent info
     */
    public void setRentInfo(String rentInfo) {
		this.rentInfo = rentInfo;
	}

    /**
     * Gets rent settle type.
     *
     * @return the rent settle type
     */
    public String getRentSettleType() {
		return this.rentSettleType;
	}

    /**
     * Sets rent settle type.
     *
     * @param rentSettleType the rent settle type
     */
    public void setRentSettleType(String rentSettleType) {
		this.rentSettleType = rentSettleType;
	}

    /**
     * Gets rent unit.
     *
     * @return the rent unit
     */
    public String getRentUnit() {
		return this.rentUnit;
	}

    /**
     * Sets rent unit.
     *
     * @param rentUnit the rent unit
     */
    public void setRentUnit(String rentUnit) {
		this.rentUnit = rentUnit;
	}

}
