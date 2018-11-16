package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户券模板创建接口
 *
 * @author auto create
 * @since 1.0, 2018-09-17 11:06:38
 */
public class AlipayMarketingCashlessvoucherTemplateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6838648898229134226L;

	/**
	 * 面额。每张代金券可以抵扣的金额。币种为人民币，单位为元。该数值有效范围为1~999，小数点以后最多保留两位。代金券必填，兑换券不能填
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 品牌名。用于在卡包中展示，长度不能超过12个字符，voucher_type值为代金券时：券名称=券面额+’元代金券’，voucher_type值为兑换券时：券名称=品牌名+“兑换券”组成 ，券名称最终用于卡包展示
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 扩展字段,JSON字符串。目前支持使用模式扩展：{"useMode":"H5","useModeData":{"url":"http://www.yourdomian.com/yourusepage.htm","signKeys":"voucherId,userId,tag","charset":"UTF-8","signType":"RSA2","tag":"this is my tag"}}
其中如果useMode表示自定义的使用模式类型，目前仅支持"H5",表示在券详情页按钮跳转至自定义H5页面，当传入useMode参数后，将会检查useModeData对象数据，其中的url为必传参数;url字段表示客制化使用按钮跳转链接，传入该字段后在券详情使用时点击效果将会跳转此链接，链接将进行白名单过滤，如果无法接入成功请联系技术支持;signKeys字段表示跳转至客制链接时的加签字段，如果不传默认为voucherId,userId,tag;signType为加签类型，目前支持RSA及RSA2,如果不传则不会加签;charset为链接编码格式，不传默认为UTF-8;tag为自定义参数，会直接透传回使用链接;当传入合法加签信息后，券使用链接将为http://www.yourdomain.com/yourusepage.htm?voucherId=当前券id&userId=当前用户id&tag=传入tag&sign=对应算法及key生成的加签数据
	 */
	@ApiField("extension_info")
	private String extensionInfo;

	/**
	 * 最低额度。设置券使用门槛，只有订单金额大于等于最低额度时券才能使用。币种为人民币，单位为元。该数值不能小于0，小数点以后最多保留两位。 代金券必填，兑换券不能填
	 */
	@ApiField("floor_amount")
	private String floorAmount;

	/**
	 * 券变动异步通知地址
	 */
	@ApiField("notify_uri")
	private String notifyUri;

	/**
	 * 外部业务单号。用作幂等控制。同一个pid下相同的外部业务单号作唯一键
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 发放结束时间，晚于该时间不能发券。券的发放结束时间和发放开始时间跨度不能大于90天。发放结束时间必须晚于发放开始时间。格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_end_time")
	private Date publishEndTime;

	/**
	 * 发放开始时间，早于该时间不能发券。发放开始时间不能大于当前时间15天。格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_start_time")
	private Date publishStartTime;

	/**
	 * 规则配置，JSON字符串，{"PID": "2088512417841101,2088512417841102", "STORE": "123456,678901"}，其中PID表示可以核销该券的pid列表，多个值用英文逗号隔开，PID为必传且需与接口调用PID同属一个商家，STORE表示可以核销该券的内部门店ID，多个值用英文逗号隔开 ， 兑换券不能指定规则配置
	 */
	@ApiField("rule_conf")
	private String ruleConf;

	/**
	 * 券总金额（仅用于不定额券）。币种为人民币，单位为元。该数值需大于等于1，小于等于10,000,000，小数点以后最多保留两位。voucher_type为CASHLESS_RANDOM_VOUCHER时必填。
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 券可用时段，JSON数组字符串，空数组即[]，表示不限制，指定每周时间段示例：[{"day_rule": "1,2,3,4,5", "time_begin": "09:00:00", "time_end": "22:00:00"}, {"day_rule": "6,7", "time_begin": "08:00:00", "time_end": "23:00:00"}]，数组中每个元素都包含三个key：day_rule, time_begin, time_end，其中day_rule表示周几，取值范围[1, 2, 3, 4, 5, 6, 7]（周7表示星期日），多个值使用英文逗号隔开；time_begin和time_end分别表示生效起始时间和结束时间，格式为HH:mm:ss。另外，数组中各个时间规则是或关系。例如，[{"day_rule": "1,2,3,4,5", "time_begin": "09:00:00", "time_end": "22:00:00"}, {"day_rule": "6,7", "time_begin": "08:00:00", "time_end": "23:00:00"}]表示在每周的一，二，三，四，五的早上9点到晚上10点券可用或者每周的星期六和星期日的早上8点到晚上11点券可用。 仅支持代金券
	 */
	@ApiField("voucher_available_time")
	private String voucherAvailableTime;

	/**
	 * 券使用说明。JSON数组字符串，最多可以有10条，每条最多50字。不采用时输入"[]"
	 */
	@ApiField("voucher_description")
	private String voucherDescription;

	/**
	 * 拟发行券的数量。单位为张。该数值必须是大于0的整数。voucher_type为CASHLESS_FIX_VOUCHER时必填。
	 */
	@ApiField("voucher_quantity")
	private Long voucherQuantity;

	/**
	 * 券类型，取值范围为：
1. 定额代金券：CASHLESS_FIX_VOUCHER；
2. 不定额代金券 CASHLESS_RANDOM_VOUCHER；
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/**
	 * 券有效期。有两种类型：绝对时间和相对时间。使用JSON字符串表示。绝对时间有3个key：type、start、end，type取值固定为"ABSOLUTE"，start和end分别表示券生效时间和失效时间，格式为yyyy-MM-dd HH:mm:ss。绝对时间示例：{"type": "ABSOLUTE", "start": "2017-01-10 00:00:00", "end": "2017-01-13 23:59:59"}。相对时间有3个key：type、duration、unit，type取值固定为"RELATIVE"，duration表示从发券时间开始到往后推duration个单位时间为止作为券的使用有效期，unit表示有效时间单位，有效时间单位可枚举：MINUTE, HOUR, DAY。示例：{"type": "RELATIVE", "duration": 1 , "unit": "DAY" }，如果此刻发券，那么该券从现在开始生效1(duration)天(unit)后失效。
	 */
	@ApiField("voucher_valid_period")
	private String voucherValidPeriod;

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public String getAmount() {
		return this.amount;
	}

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(String amount) {
		this.amount = amount;
	}

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
     * Gets voucher available time.
     *
     * @return the voucher available time
     */
    public String getVoucherAvailableTime() {
		return this.voucherAvailableTime;
	}

    /**
     * Sets voucher available time.
     *
     * @param voucherAvailableTime the voucher available time
     */
    public void setVoucherAvailableTime(String voucherAvailableTime) {
		this.voucherAvailableTime = voucherAvailableTime;
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
     * Gets voucher quantity.
     *
     * @return the voucher quantity
     */
    public Long getVoucherQuantity() {
		return this.voucherQuantity;
	}

    /**
     * Sets voucher quantity.
     *
     * @param voucherQuantity the voucher quantity
     */
    public void setVoucherQuantity(Long voucherQuantity) {
		this.voucherQuantity = voucherQuantity;
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
