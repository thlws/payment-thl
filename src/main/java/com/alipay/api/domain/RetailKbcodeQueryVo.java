package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 快消行业口碑码查询信息
 *
 * @author auto create
 * @since 1.0, 2017-09-13 10:34:04
 */
public class RetailKbcodeQueryVo extends AlipayObject {

	private static final long serialVersionUID = 7859987946686342428L;

	/**
	 * 创建口碑码的批次号
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 码的物料模板
	 */
	@ApiField("code_template")
	private String codeTemplate;

	/**
	 * 商户名称，生成码的时候码图片上的提示文案
	 */
	@ApiField("code_tip")
	private String codeTip;

	/**
	 * 口碑码(不带背景)
	 */
	@ApiField("code_url")
	private String codeUrl;

	/**
	 * 口碑码创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 口碑码id
	 */
	@ApiField("qr_code")
	private String qrCode;

	/**
	 * 口碑码（带背景）
	 */
	@ApiField("resource_url")
	private String resourceUrl;

	/**
	 * 促销员信息
	 */
	@ApiField("salesman")
	private String salesman;

    /**
     * Gets batch id.
     *
     * @return the batch id
     */
    public String getBatchId() {
		return this.batchId;
	}

    /**
     * Sets batch id.
     *
     * @param batchId the batch id
     */
    public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

    /**
     * Gets code template.
     *
     * @return the code template
     */
    public String getCodeTemplate() {
		return this.codeTemplate;
	}

    /**
     * Sets code template.
     *
     * @param codeTemplate the code template
     */
    public void setCodeTemplate(String codeTemplate) {
		this.codeTemplate = codeTemplate;
	}

    /**
     * Gets code tip.
     *
     * @return the code tip
     */
    public String getCodeTip() {
		return this.codeTip;
	}

    /**
     * Sets code tip.
     *
     * @param codeTip the code tip
     */
    public void setCodeTip(String codeTip) {
		this.codeTip = codeTip;
	}

    /**
     * Gets code url.
     *
     * @return the code url
     */
    public String getCodeUrl() {
		return this.codeUrl;
	}

    /**
     * Sets code url.
     *
     * @param codeUrl the code url
     */
    public void setCodeUrl(String codeUrl) {
		this.codeUrl = codeUrl;
	}

    /**
     * Gets create time.
     *
     * @return the create time
     */
    public Date getCreateTime() {
		return this.createTime;
	}

    /**
     * Sets create time.
     *
     * @param createTime the create time
     */
    public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

    /**
     * Gets qr code.
     *
     * @return the qr code
     */
    public String getQrCode() {
		return this.qrCode;
	}

    /**
     * Sets qr code.
     *
     * @param qrCode the qr code
     */
    public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

    /**
     * Gets resource url.
     *
     * @return the resource url
     */
    public String getResourceUrl() {
		return this.resourceUrl;
	}

    /**
     * Sets resource url.
     *
     * @param resourceUrl the resource url
     */
    public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}

    /**
     * Gets salesman.
     *
     * @return the salesman
     */
    public String getSalesman() {
		return this.salesman;
	}

    /**
     * Sets salesman.
     *
     * @param salesman the salesman
     */
    public void setSalesman(String salesman) {
		this.salesman = salesman;
	}

}
