package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.tax.order.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-14 20:15:25
 */
public class AlipayOverseasTaxOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4296948634338854265L;

	/** 
	 * 用于识别用户支付宝账号的号码，由identify_account_type指定类型:
identify_account_type为barcode表示支付宝钱包付款码，退税公司通过扫描用户支付宝钱包付款码获取
	 */
	@ApiField("identify_account_no")
	private String identifyAccountNo;

	/** 
	 * 用于识别用户支付宝账号的类型
条码退税，取值：barcode
	 */
	@ApiField("identify_account_type")
	private String identifyAccountType;

	/** 
	 * 退税机构业务流水号，唯一，由退税机构生成，只能包含英字母、数字，长度不能小于3且不能大于64
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 退税状态，S 表示退税成功；F表示退税失败
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 退税成功时间，只有status为S时才有值，时间格式：YYYY-MM-DD HH:MM:SS，北京时间24小时制，时区东八区
	 */
	@ApiField("success_time")
	private Date successTime;

	/** 
	 * 支付宝的退税序列号
	 */
	@ApiField("tax_no")
	private String taxNo;

    /**
     * Sets identify account no.
     *
     * @param identifyAccountNo the identify account no
     */
    public void setIdentifyAccountNo(String identifyAccountNo) {
		this.identifyAccountNo = identifyAccountNo;
	}

    /**
     * Gets identify account no.
     *
     * @return the identify account no
     */
    public String getIdentifyAccountNo( ) {
		return this.identifyAccountNo;
	}

    /**
     * Sets identify account type.
     *
     * @param identifyAccountType the identify account type
     */
    public void setIdentifyAccountType(String identifyAccountType) {
		this.identifyAccountType = identifyAccountType;
	}

    /**
     * Gets identify account type.
     *
     * @return the identify account type
     */
    public String getIdentifyAccountType( ) {
		return this.identifyAccountType;
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
     * Gets out order no.
     *
     * @return the out order no
     */
    public String getOutOrderNo( ) {
		return this.outOrderNo;
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

    /**
     * Sets success time.
     *
     * @param successTime the success time
     */
    public void setSuccessTime(Date successTime) {
		this.successTime = successTime;
	}

    /**
     * Gets success time.
     *
     * @return the success time
     */
    public Date getSuccessTime( ) {
		return this.successTime;
	}

    /**
     * Sets tax no.
     *
     * @param taxNo the tax no
     */
    public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

    /**
     * Gets tax no.
     *
     * @return the tax no
     */
    public String getTaxNo( ) {
		return this.taxNo;
	}

}
