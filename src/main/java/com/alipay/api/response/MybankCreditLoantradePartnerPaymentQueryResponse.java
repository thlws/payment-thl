package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.partner.payment.query response.
 *
 * @author auto create
 * @since 1.0, 2017-08-25 10:19:04
 */
public class MybankCreditLoantradePartnerPaymentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5545764325386986687L;

	/** 
	 * 备注
	 */
	@ApiField("content")
	private String content;

	/** 
	 * 完成时间
	 */
	@ApiField("finish_time")
	private Date finishTime;

	/** 
	 * 网商内部申请单编号
	 */
	@ApiField("in_apply_no")
	private String inApplyNo;

	/** 
	 * 申请结果
	 */
	@ApiField("status")
	private String status;

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(String content) {
		this.content = content;
	}

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent( ) {
		return this.content;
	}

    /**
     * Sets finish time.
     *
     * @param finishTime the finish time
     */
    public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}

    /**
     * Gets finish time.
     *
     * @return the finish time
     */
    public Date getFinishTime( ) {
		return this.finishTime;
	}

    /**
     * Sets in apply no.
     *
     * @param inApplyNo the in apply no
     */
    public void setInApplyNo(String inApplyNo) {
		this.inApplyNo = inApplyNo;
	}

    /**
     * Gets in apply no.
     *
     * @return the in apply no
     */
    public String getInApplyNo( ) {
		return this.inApplyNo;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus( ) {
		return this.status;
	}

}
