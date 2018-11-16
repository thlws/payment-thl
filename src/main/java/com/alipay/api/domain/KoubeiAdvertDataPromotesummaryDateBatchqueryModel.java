package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑客日期维度汇总数据查询
 *
 * @author auto create
 * @since 1.0, 2017-09-29 15:06:26
 */
public class KoubeiAdvertDataPromotesummaryDateBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3834936465529433292L;

	/**
	 * 广告id  
如果有这个参数默认搜索这个广告标的的汇总信息并忽略voucher_name参数
	 */
	@ApiField("adv_id")
	private String advId;

	/**
	 * 结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 券名称 支持模糊搜索
	 */
	@ApiField("voucher_name")
	private String voucherName;

    /**
     * Gets adv id.
     *
     * @return the adv id
     */
    public String getAdvId() {
		return this.advId;
	}

    /**
     * Sets adv id.
     *
     * @param advId the adv id
     */
    public void setAdvId(String advId) {
		this.advId = advId;
	}

    /**
     * Gets end date.
     *
     * @return the end date
     */
    public Date getEndDate() {
		return this.endDate;
	}

    /**
     * Sets end date.
     *
     * @param endDate the end date
     */
    public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets start date.
     *
     * @return the start date
     */
    public Date getStartDate() {
		return this.startDate;
	}

    /**
     * Sets start date.
     *
     * @param startDate the start date
     */
    public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

    /**
     * Gets voucher name.
     *
     * @return the voucher name
     */
    public String getVoucherName() {
		return this.voucherName;
	}

    /**
     * Sets voucher name.
     *
     * @param voucherName the voucher name
     */
    public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

}
