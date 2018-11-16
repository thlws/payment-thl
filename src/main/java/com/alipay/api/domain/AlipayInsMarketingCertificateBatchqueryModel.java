package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询凭证信息
 *
 * @author auto create
 * @since 1.0, 2016-10-13 19:51:03
 */
public class AlipayInsMarketingCertificateBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4561249373864229331L;

	/**
	 * 32
	 */
	@ApiField("certificate_no")
	private String certificateNo;

	/**
	 * 凭证类型
	 */
	@ApiField("certificate_type")
	private String certificateType;

	/**
	 * 当前页码
	 */
	@ApiField("current_page_no")
	private Long currentPageNo;

	/**
	 * 生效时间
	 */
	@ApiField("effect_time")
	private Date effectTime;

	/**
	 * 机构id
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 是否失效
	 */
	@ApiField("is_enabled")
	private String isEnabled;

	/**
	 * 订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单来源
	 */
	@ApiField("order_source")
	private String orderSource;

	/**
	 * 外部业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 拥有人uid
	 */
	@ApiField("owner_uid")
	private String ownerUid;

	/**
	 * 每页记录数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 凭证状态
	 */
	@ApiField("status")
	private Long status;

    /**
     * Gets certificate no.
     *
     * @return the certificate no
     */
    public String getCertificateNo() {
		return this.certificateNo;
	}

    /**
     * Sets certificate no.
     *
     * @param certificateNo the certificate no
     */
    public void setCertificateNo(String certificateNo) {
		this.certificateNo = certificateNo;
	}

    /**
     * Gets certificate type.
     *
     * @return the certificate type
     */
    public String getCertificateType() {
		return this.certificateType;
	}

    /**
     * Sets certificate type.
     *
     * @param certificateType the certificate type
     */
    public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}

    /**
     * Gets current page no.
     *
     * @return the current page no
     */
    public Long getCurrentPageNo() {
		return this.currentPageNo;
	}

    /**
     * Sets current page no.
     *
     * @param currentPageNo the current page no
     */
    public void setCurrentPageNo(Long currentPageNo) {
		this.currentPageNo = currentPageNo;
	}

    /**
     * Gets effect time.
     *
     * @return the effect time
     */
    public Date getEffectTime() {
		return this.effectTime;
	}

    /**
     * Sets effect time.
     *
     * @param effectTime the effect time
     */
    public void setEffectTime(Date effectTime) {
		this.effectTime = effectTime;
	}

    /**
     * Gets inst id.
     *
     * @return the inst id
     */
    public String getInstId() {
		return this.instId;
	}

    /**
     * Sets inst id.
     *
     * @param instId the inst id
     */
    public void setInstId(String instId) {
		this.instId = instId;
	}

    /**
     * Gets is enabled.
     *
     * @return the is enabled
     */
    public String getIsEnabled() {
		return this.isEnabled;
	}

    /**
     * Sets is enabled.
     *
     * @param isEnabled the is enabled
     */
    public void setIsEnabled(String isEnabled) {
		this.isEnabled = isEnabled;
	}

    /**
     * Gets order id.
     *
     * @return the order id
     */
    public String getOrderId() {
		return this.orderId;
	}

    /**
     * Sets order id.
     *
     * @param orderId the order id
     */
    public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

    /**
     * Gets order source.
     *
     * @return the order source
     */
    public String getOrderSource() {
		return this.orderSource;
	}

    /**
     * Sets order source.
     *
     * @param orderSource the order source
     */
    public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
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
     * Gets owner uid.
     *
     * @return the owner uid
     */
    public String getOwnerUid() {
		return this.ownerUid;
	}

    /**
     * Sets owner uid.
     *
     * @param ownerUid the owner uid
     */
    public void setOwnerUid(String ownerUid) {
		this.ownerUid = ownerUid;
	}

    /**
     * Gets page size.
     *
     * @return the page size
     */
    public Long getPageSize() {
		return this.pageSize;
	}

    /**
     * Sets page size.
     *
     * @param pageSize the page size
     */
    public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public Long getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(Long status) {
		this.status = status;
	}

}
