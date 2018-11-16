package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.prodmode.reconconf.query response.
 *
 * @author auto create
 * @since 1.0, 2018-04-26 13:56:32
 */
public class AlipayEbppProdmodeReconconfQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1113458854146159159L;

	/** 
	 * 对账基准（以支付宝为准/以机构为准）
	 */
	@ApiField("check_depend")
	private String checkDepend;

	/** 
	 * 对账粒度（以主机构为粒度对账/以子机构为粒度对账）
	 */
	@ApiField("check_grade")
	private String checkGrade;

	/** 
	 * 清算粒度（以主机构为粒度清算/以子机构为粒度清算）
	 */
	@ApiField("clear_grade")
	private String clearGrade;

	/** 
	 * 日切时间:小时
	 */
	@ApiField("cut_hour")
	private String cutHour;

	/** 
	 * 日切时间:分钟
	 */
	@ApiField("cut_min")
	private String cutMin;

	/** 
	 * 日切时间:秒
	 */
	@ApiField("cut_sec")
	private String cutSec;

	/** 
	 * 是否有对账配置内容
	 */
	@ApiField("has_recon_conf")
	private String hasReconConf;

	/** 
	 * 无对账内容配置原因
	 */
	@ApiField("no_conf_reason")
	private String noConfReason;

	/** 
	 * 生成文件时间（以支付时间为准/以销账时间为准）
	 */
	@ApiField("recon_time")
	private String reconTime;

	/** 
	 * T+N退款规则（以机构为准）
	 */
	@ApiField("refund_rule")
	private String refundRule;

    /**
     * Sets check depend.
     *
     * @param checkDepend the check depend
     */
    public void setCheckDepend(String checkDepend) {
		this.checkDepend = checkDepend;
	}

    /**
     * Gets check depend.
     *
     * @return the check depend
     */
    public String getCheckDepend( ) {
		return this.checkDepend;
	}

    /**
     * Sets check grade.
     *
     * @param checkGrade the check grade
     */
    public void setCheckGrade(String checkGrade) {
		this.checkGrade = checkGrade;
	}

    /**
     * Gets check grade.
     *
     * @return the check grade
     */
    public String getCheckGrade( ) {
		return this.checkGrade;
	}

    /**
     * Sets clear grade.
     *
     * @param clearGrade the clear grade
     */
    public void setClearGrade(String clearGrade) {
		this.clearGrade = clearGrade;
	}

    /**
     * Gets clear grade.
     *
     * @return the clear grade
     */
    public String getClearGrade( ) {
		return this.clearGrade;
	}

    /**
     * Sets cut hour.
     *
     * @param cutHour the cut hour
     */
    public void setCutHour(String cutHour) {
		this.cutHour = cutHour;
	}

    /**
     * Gets cut hour.
     *
     * @return the cut hour
     */
    public String getCutHour( ) {
		return this.cutHour;
	}

    /**
     * Sets cut min.
     *
     * @param cutMin the cut min
     */
    public void setCutMin(String cutMin) {
		this.cutMin = cutMin;
	}

    /**
     * Gets cut min.
     *
     * @return the cut min
     */
    public String getCutMin( ) {
		return this.cutMin;
	}

    /**
     * Sets cut sec.
     *
     * @param cutSec the cut sec
     */
    public void setCutSec(String cutSec) {
		this.cutSec = cutSec;
	}

    /**
     * Gets cut sec.
     *
     * @return the cut sec
     */
    public String getCutSec( ) {
		return this.cutSec;
	}

    /**
     * Sets has recon conf.
     *
     * @param hasReconConf the has recon conf
     */
    public void setHasReconConf(String hasReconConf) {
		this.hasReconConf = hasReconConf;
	}

    /**
     * Gets has recon conf.
     *
     * @return the has recon conf
     */
    public String getHasReconConf( ) {
		return this.hasReconConf;
	}

    /**
     * Sets no conf reason.
     *
     * @param noConfReason the no conf reason
     */
    public void setNoConfReason(String noConfReason) {
		this.noConfReason = noConfReason;
	}

    /**
     * Gets no conf reason.
     *
     * @return the no conf reason
     */
    public String getNoConfReason( ) {
		return this.noConfReason;
	}

    /**
     * Sets recon time.
     *
     * @param reconTime the recon time
     */
    public void setReconTime(String reconTime) {
		this.reconTime = reconTime;
	}

    /**
     * Gets recon time.
     *
     * @return the recon time
     */
    public String getReconTime( ) {
		return this.reconTime;
	}

    /**
     * Sets refund rule.
     *
     * @param refundRule the refund rule
     */
    public void setRefundRule(String refundRule) {
		this.refundRule = refundRule;
	}

    /**
     * Gets refund rule.
     *
     * @return the refund rule
     */
    public String getRefundRule( ) {
		return this.refundRule;
	}

}
