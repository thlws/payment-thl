package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VoucherBillDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayMarketingVoucherQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7371188416957168774L;

	/** 
	 * 券余额(元)
	 */
	@ApiField("available_amount")
	private Long availableAmount;

	/** 
	 * 券交易账单信息(核销交易信息、交易退款信息等可能存在多条)
	 */
	@ApiListField("bill_details")
	@ApiField("voucher_bill_detail")
	private List<VoucherBillDetail> billDetails;

	/** 
	 * 扩展信息,JSON格式
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/** 
	 * 券激活时间(券可以使用起始时间)
	 */
	@ApiField("gmt_active")
	private Date gmtActive;

	/** 
	 * 券创建时间(券发券时间)
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 券过期时间(券可以使用截止时间)
	 */
	@ApiField("gmt_expired")
	private Date gmtExpired;

	/** 
	 * 券名称(用户看到券名称)
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 券状态(ENABLED:可用,DISABLED:不可用,DELETE:删除状态,TRANS:发放中,TRANSFER:已转增,UNC:未领取,USED:已使用,USING:使用中,REFUNDED:已退款,REFUNDING:使用中,UNACTIVE:未激活,EXPIRED:已过期)
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 券模板ID(模板唯一标识,创建模板返回)
	 */
	@ApiField("template_id")
	private String templateId;

	/** 
	 * 券面额(元)
	 */
	@ApiField("total_amount")
	private Long totalAmount;

	/** 
	 * 券所属用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 券ID(同入参券ID)
	 */
	@ApiField("voucher_id")
	private String voucherId;

    /**
     * Sets available amount.
     *
     * @param availableAmount the available amount
     */
    public void setAvailableAmount(Long availableAmount) {
		this.availableAmount = availableAmount;
	}

    /**
     * Gets available amount.
     *
     * @return the available amount
     */
    public Long getAvailableAmount( ) {
		return this.availableAmount;
	}

    /**
     * Sets bill details.
     *
     * @param billDetails the bill details
     */
    public void setBillDetails(List<VoucherBillDetail> billDetails) {
		this.billDetails = billDetails;
	}

    /**
     * Gets bill details.
     *
     * @return the bill details
     */
    public List<VoucherBillDetail> getBillDetails( ) {
		return this.billDetails;
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
     * Gets extend info.
     *
     * @return the extend info
     */
    public String getExtendInfo( ) {
		return this.extendInfo;
	}

    /**
     * Sets gmt active.
     *
     * @param gmtActive the gmt active
     */
    public void setGmtActive(Date gmtActive) {
		this.gmtActive = gmtActive;
	}

    /**
     * Gets gmt active.
     *
     * @return the gmt active
     */
    public Date getGmtActive( ) {
		return this.gmtActive;
	}

    /**
     * Sets gmt create.
     *
     * @param gmtCreate the gmt create
     */
    public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

    /**
     * Gets gmt create.
     *
     * @return the gmt create
     */
    public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

    /**
     * Sets gmt expired.
     *
     * @param gmtExpired the gmt expired
     */
    public void setGmtExpired(Date gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

    /**
     * Gets gmt expired.
     *
     * @return the gmt expired
     */
    public Date getGmtExpired( ) {
		return this.gmtExpired;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName( ) {
		return this.name;
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
     * Sets template id.
     *
     * @param templateId the template id
     */
    public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

    /**
     * Gets template id.
     *
     * @return the template id
     */
    public String getTemplateId( ) {
		return this.templateId;
	}

    /**
     * Sets total amount.
     *
     * @param totalAmount the total amount
     */
    public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

    /**
     * Gets total amount.
     *
     * @return the total amount
     */
    public Long getTotalAmount( ) {
		return this.totalAmount;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId( ) {
		return this.userId;
	}

    /**
     * Sets voucher id.
     *
     * @param voucherId the voucher id
     */
    public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

    /**
     * Gets voucher id.
     *
     * @return the voucher id
     */
    public String getVoucherId( ) {
		return this.voucherId;
	}

}
