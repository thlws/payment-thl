package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建红包模板
 *
 * @author auto create
 * @since 1.0, 2018-07-04 18:35:12
 */
public class AlipayMarketingCouponTemplateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2117196447285995855L;

	/**
	 * 创建红包模板时录入的品牌信息，由商户自定义，在通用模板中展示在红包LOGO下方。根据红包使用场景的不同，该信息的展示位置可能会有不同。
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 扩展字段,JSON字符串。目前支持使用模式扩展：{"coupon_AppActiveUrl":"http://www.yourdomain.com"},yourdomain.com需要添加白名单
	 */
	@ApiField("extension_info")
	private String extensionInfo;

	/**
	 * 最低额度。设置红包使用门槛，只有订单金额大于等于最低额度时红包才能使用。币种为人民币，单位为元。该数值不能小于等于0，小数点以后最多保留两位，没有则设置为0。
	 */
	@ApiField("floor_amount")
	private String floorAmount;

	/**
	 * 出资人登录账号。用于发红包的资金会从该账号划拨到发红包专用账户上。当调用创建接口成功后，会返回付款订单页面，仅当前传入资金账号可进行付款，付款完成后红包变更为激活状态，可进行发放。
	 */
	@ApiField("fund_account")
	private String fundAccount;

	/**
	 * 红包变动异步通知地址，传入此字段后，红包的核销将会进行异步通知，通知具体内容见下方触发异步通知字段描述
	 */
	@ApiField("notify_uri")
	private String notifyUri;

	/**
	 * 外部业务单号。用作幂等控制。同一个pid下相同的外部业务单号作唯一键，参数不变的情况下，再次请求返回同样的模板id。请求成功后，修改参数再次提交，需要更换订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 发放结束时间，晚于该时间不能发红包。红包的发放结束时间和发放开始时间跨度不能大于90天。发放结束时间必须晚于发放开始时间。格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_end_time")
	private Date publishEndTime;

	/**
	 * 发放开始时间，早于该时间不能发红包。发放开始时间不能大于当前时间15天。格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_start_time")
	private Date publishStartTime;

	/**
	 * 重定向地址。支付成功后需要重定向的地址，如果为空则不做重定向。
	 */
	@ApiField("redirect_uri")
	private String redirectUri;

	/**
	 * 规则配置，JSON字符串，格式为K-V模式，当同一个KEY下规则为多个值时，用英文逗号进行分隔。目前支持的规则KEY有：核销商户ID(PID),核销内部门店ID(STORE),指定收款账户(payeeUserId),子产品交易码(bizProduct),缴费机构/类型(CUSTOMBUSINESS),缴费户号(EBPPUSERNUM)。一旦商户设置了规则，当前红包实例必须满足指定规则才能进行核销。
	 */
	@ApiField("rule_conf")
	private String ruleConf;

	/**
	 * 模板总金额。本次发放模板设置的总金额。币种为人民币，单位为元。该数值不能小于1.00元，小数点以后最多保留两位。
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 红包使用说明。JSON数组字符串，最多可以有10条，每条最多50字。如果未传入该字段，将填充为默认描述
	 */
	@ApiField("voucher_description")
	private String voucherDescription;

	/**
	 * 类型。可枚举，暂时只支持"红包"(COUPON)，使用示例voucher_type=COUPON。红包可以拆分多次使用，比如：1元红包，可以先用掉0.5元，剩余的0.5元可以继续使用；可以多个红包叠加使用，一笔支付最多叠加10个红包；红包被使用后发生退款，如果红包有效期还在，会退还给用户红包，如果有效期已过，就会将资金退回原红包模板出资账户。
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/**
	 * 红包使用场景。可枚举，目前支持“支付宝通用全场红包”(ALIPAY_COUPON_ALL) ，该场景设置后，使用规则字段允许为空，只要支付宝支付产品支持核销此类型的红包，用户红包就可以核销。“花呗还款红包”(HUABEI_COUPON_REPAYMENT) ，该场景设置后，会自动填充花呗还款对应的规则，无需填入rule_conf，代表仅花呗还款场景可以核销此红包。“支付宝普通红包”(ALIPAY_COUPON_COMMON) 该场景下必须设置一条规则rule_conf。场景值会关联当前红包的展示模板，默认描述等信息。
	 */
	@ApiField("voucher_use_scene")
	private String voucherUseScene;

	/**
	 * "ABSOLUTE", "start": "2017-01-10 00:00:00", "end": "2017-01-13 23:59:59"}。相对时间有3个key：type、duration、unit，type取值固定为"RELATIVE"，duration表示从发红包时间开始到往后推duration个单位时间为止作为红包的使用有效期，unit表示有效时间单位，有效时间单位可枚举：MINUTE, HOUR, DAY。示例：{"type": "RELATIVE", "duration": 1 , "unit": "DAY" }，如果此刻发红包，那么该红包从现在开始生效1(duration)天(unit)后失效。
	 */
	@ApiField("voucher_valid_period")
	private String voucherValidPeriod;

    /**
     * Gets brand name.
     *
     * @return the brand name
     */
    public String getBrandName() {
		return this.brandName;
	}

    /**
     * Sets brand name.
     *
     * @param brandName the brand name
     */
    public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

    /**
     * Gets extension info.
     *
     * @return the extension info
     */
    public String getExtensionInfo() {
		return this.extensionInfo;
	}

    /**
     * Sets extension info.
     *
     * @param extensionInfo the extension info
     */
    public void setExtensionInfo(String extensionInfo) {
		this.extensionInfo = extensionInfo;
	}

    /**
     * Gets floor amount.
     *
     * @return the floor amount
     */
    public String getFloorAmount() {
		return this.floorAmount;
	}

    /**
     * Sets floor amount.
     *
     * @param floorAmount the floor amount
     */
    public void setFloorAmount(String floorAmount) {
		this.floorAmount = floorAmount;
	}

    /**
     * Gets fund account.
     *
     * @return the fund account
     */
    public String getFundAccount() {
		return this.fundAccount;
	}

    /**
     * Sets fund account.
     *
     * @param fundAccount the fund account
     */
    public void setFundAccount(String fundAccount) {
		this.fundAccount = fundAccount;
	}

    /**
     * Gets notify uri.
     *
     * @return the notify uri
     */
    public String getNotifyUri() {
		return this.notifyUri;
	}

    /**
     * Sets notify uri.
     *
     * @param notifyUri the notify uri
     */
    public void setNotifyUri(String notifyUri) {
		this.notifyUri = notifyUri;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets publish end time.
     *
     * @return the publish end time
     */
    public Date getPublishEndTime() {
		return this.publishEndTime;
	}

    /**
     * Sets publish end time.
     *
     * @param publishEndTime the publish end time
     */
    public void setPublishEndTime(Date publishEndTime) {
		this.publishEndTime = publishEndTime;
	}

    /**
     * Gets publish start time.
     *
     * @return the publish start time
     */
    public Date getPublishStartTime() {
		return this.publishStartTime;
	}

    /**
     * Sets publish start time.
     *
     * @param publishStartTime the publish start time
     */
    public void setPublishStartTime(Date publishStartTime) {
		this.publishStartTime = publishStartTime;
	}

    /**
     * Gets redirect uri.
     *
     * @return the redirect uri
     */
    public String getRedirectUri() {
		return this.redirectUri;
	}

    /**
     * Sets redirect uri.
     *
     * @param redirectUri the redirect uri
     */
    public void setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
	}

    /**
     * Gets rule conf.
     *
     * @return the rule conf
     */
    public String getRuleConf() {
		return this.ruleConf;
	}

    /**
     * Sets rule conf.
     *
     * @param ruleConf the rule conf
     */
    public void setRuleConf(String ruleConf) {
		this.ruleConf = ruleConf;
	}

    /**
     * Gets total amount.
     *
     * @return the total amount
     */
    public String getTotalAmount() {
		return this.totalAmount;
	}

    /**
     * Sets total amount.
     *
     * @param totalAmount the total amount
     */
    public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

    /**
     * Gets voucher description.
     *
     * @return the voucher description
     */
    public String getVoucherDescription() {
		return this.voucherDescription;
	}

    /**
     * Sets voucher description.
     *
     * @param voucherDescription the voucher description
     */
    public void setVoucherDescription(String voucherDescription) {
		this.voucherDescription = voucherDescription;
	}

    /**
     * Gets voucher type.
     *
     * @return the voucher type
     */
    public String getVoucherType() {
		return this.voucherType;
	}

    /**
     * Sets voucher type.
     *
     * @param voucherType the voucher type
     */
    public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

    /**
     * Gets voucher use scene.
     *
     * @return the voucher use scene
     */
    public String getVoucherUseScene() {
		return this.voucherUseScene;
	}

    /**
     * Sets voucher use scene.
     *
     * @param voucherUseScene the voucher use scene
     */
    public void setVoucherUseScene(String voucherUseScene) {
		this.voucherUseScene = voucherUseScene;
	}

    /**
     * Gets voucher valid period.
     *
     * @return the voucher valid period
     */
    public String getVoucherValidPeriod() {
		return this.voucherValidPeriod;
	}

    /**
     * Sets voucher valid period.
     *
     * @param voucherValidPeriod the voucher valid period
     */
    public void setVoucherValidPeriod(String voucherValidPeriod) {
		this.voucherValidPeriod = voucherValidPeriod;
	}

}
