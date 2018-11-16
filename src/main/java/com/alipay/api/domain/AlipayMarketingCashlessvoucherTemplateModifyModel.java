package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户券模板修改接口
 *
 * @author auto create
 * @since 1.0, 2018-09-17 11:06:03
 */
public class AlipayMarketingCashlessvoucherTemplateModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5879863623985199818L;

	/**
	 * 模板修改操作外部业务号，用于修改时的幂等控制，注意这里不是修改业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 发放结束时间，晚于该时间不能发券。券的发放结束时间和发放开始时间跨度不能大于90天。发放结束时间必须晚于发放开始时间。格式为：yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("publish_end_time")
	private Date publishEndTime;

	/**
	 * 规则配置，JSON字符串，{"PID": "2088512417841101,2088512417841102", "STORE": "123456,678901"}，其中PID表示可以核销该券的pid列表，多个值用英文逗号隔开，STORE表示可以核销该券的内部门店ID，多个值用英文逗号隔开，不传此参数则不修改规则，若有要修改规则那么必须包含PID，规则修改仅支持代金券
	 */
	@ApiField("rule_conf")
	private String ruleConf;

	/**
	 * 券模板ID ，参数值通过调用alipay.marketing.cashlessvoucher.template.create接口返回
	 */
	@ApiField("template_id")
	private String templateId;

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
     * Gets template id.
     *
     * @return the template id
     */
    public String getTemplateId() {
		return this.templateId;
	}

    /**
     * Sets template id.
     *
     * @param templateId the template id
     */
    public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
