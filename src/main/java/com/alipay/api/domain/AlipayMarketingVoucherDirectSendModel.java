package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券平台直发券接口
 *
 * @author auto create
 * @since 1.0, 2018-09-18 11:04:42
 */
public class AlipayMarketingVoucherDirectSendModel extends AlipayObject {

	private static final long serialVersionUID = 3442644421988246717L;

	/**
	 * 券金额(单位:分)
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 业务发生时间，格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("biz_date")
	private Date bizDate;

	/**
	 * {"LEHUA_IS_ALGO_MONEY":"F","LEHUA_IS_MULTIPLIED":"F","LEHUA_MULTIPLIED_PRICE":"0.08","LEHUA_MULTIPLY_TIMES":"1.0","LEHUA_ORIGIN_PRICE":"0.08","camp_id":"1332546","camp_type":"PLATFORM_CAMP"}
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 业务订单号，每次操作不可重复。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 模板编码，创建模板后生成。
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * USERID(支付宝用户2088账号)
	 */
	@ApiField("user_id")
	private String userId;

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
     * Gets biz date.
     *
     * @return the biz date
     */
    public Date getBizDate() {
		return this.bizDate;
	}

    /**
     * Sets biz date.
     *
     * @param bizDate the biz date
     */
    public void setBizDate(Date bizDate) {
		this.bizDate = bizDate;
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
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo() {
		return this.memo;
	}

    /**
     * Sets memo.
     *
     * @param memo the memo
     */
    public void setMemo(String memo) {
		this.memo = memo;
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
