package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店产品通知接口
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:28:50
 */
public class AlipayEcoMycarMaintainOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4684411649195416144L;

	/**
	 * 业务订单状态
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/**
	 * 状态描述
	 */
	@ApiField("biz_status_txt")
	private String bizStatusTxt;

	/**
	 * 拓展参数，区分4S厂商
{”remark”:”DFRC”}
日产- DFRC,  北现- BJXD
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 业务订单编号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 交易主题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 交易摘要
	 */
	@ApiField("summary")
	private String summary;

	/**
	 * 交易金额，单位：分
	 */
	@ApiField("total_fee")
	private String totalFee;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets biz status.
     *
     * @return the biz status
     */
    public String getBizStatus() {
		return this.bizStatus;
	}

    /**
     * Sets biz status.
     *
     * @param bizStatus the biz status
     */
    public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
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
     * Gets ext param.
     *
     * @return the ext param
     */
    public String getExtParam() {
		return this.extParam;
	}

    /**
     * Sets ext param.
     *
     * @param extParam the ext param
     */
    public void setExtParam(String extParam) {
		this.extParam = extParam;
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
     * Gets subject.
     *
     * @return the subject
     */
    public String getSubject() {
		return this.subject;
	}

    /**
     * Sets subject.
     *
     * @param subject the subject
     */
    public void setSubject(String subject) {
		this.subject = subject;
	}

    /**
     * Gets summary.
     *
     * @return the summary
     */
    public String getSummary() {
		return this.summary;
	}

    /**
     * Sets summary.
     *
     * @param summary the summary
     */
    public void setSummary(String summary) {
		this.summary = summary;
	}

    /**
     * Gets total fee.
     *
     * @return the total fee
     */
    public String getTotalFee() {
		return this.totalFee;
	}

    /**
     * Sets total fee.
     *
     * @param totalFee the total fee
     */
    public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
