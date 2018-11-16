package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合约查询结果bean
 *
 * @author auto create
 * @since 1.0, 2017-03-10 17:03:54
 */
public class ArrangementOpenQueryResultVO extends AlipayObject {

	private static final long serialVersionUID = 8851934348586564123L;

	/**
	 * 合约编号
	 */
	@ApiField("ar_no")
	private String arNo;

	/**
	 * 合约状态
未生效：UN_INVALID
已取消：CANCEL
已生效：VALID
已失效：INVALID
	 */
	@ApiField("ar_status")
	private String arStatus;

	/**
	 * JSON结构的扩展字段，备用字段
	 */
	@ApiField("ext_data")
	private String extData;

	/**
	 * 有效期截止时间
	 */
	@ApiField("invalid_date")
	private Date invalidDate;

	/**
	 * 签约时间
	 */
	@ApiField("sign_date")
	private Date signDate;

	/**
	 * 有效期起始时间
	 */
	@ApiField("valid_date")
	private Date validDate;

    /**
     * Gets ar no.
     *
     * @return the ar no
     */
    public String getArNo() {
		return this.arNo;
	}

    /**
     * Sets ar no.
     *
     * @param arNo the ar no
     */
    public void setArNo(String arNo) {
		this.arNo = arNo;
	}

    /**
     * Gets ar status.
     *
     * @return the ar status
     */
    public String getArStatus() {
		return this.arStatus;
	}

    /**
     * Sets ar status.
     *
     * @param arStatus the ar status
     */
    public void setArStatus(String arStatus) {
		this.arStatus = arStatus;
	}

    /**
     * Gets ext data.
     *
     * @return the ext data
     */
    public String getExtData() {
		return this.extData;
	}

    /**
     * Sets ext data.
     *
     * @param extData the ext data
     */
    public void setExtData(String extData) {
		this.extData = extData;
	}

    /**
     * Gets invalid date.
     *
     * @return the invalid date
     */
    public Date getInvalidDate() {
		return this.invalidDate;
	}

    /**
     * Sets invalid date.
     *
     * @param invalidDate the invalid date
     */
    public void setInvalidDate(Date invalidDate) {
		this.invalidDate = invalidDate;
	}

    /**
     * Gets sign date.
     *
     * @return the sign date
     */
    public Date getSignDate() {
		return this.signDate;
	}

    /**
     * Sets sign date.
     *
     * @param signDate the sign date
     */
    public void setSignDate(Date signDate) {
		this.signDate = signDate;
	}

    /**
     * Gets valid date.
     *
     * @return the valid date
     */
    public Date getValidDate() {
		return this.validDate;
	}

    /**
     * Sets valid date.
     *
     * @param validDate the valid date
     */
    public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}

}
