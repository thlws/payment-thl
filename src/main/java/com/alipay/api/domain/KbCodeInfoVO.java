package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑码信息对象
 *
 * @author auto create
 * @since 1.0, 2017-04-14 10:36:36
 */
public class KbCodeInfoVO extends AlipayObject {

	private static final long serialVersionUID = 3283222363566247699L;

	/**
	 * 创建口碑码的批次号
	 */
	@ApiField("batch_id")
	private Long batchId;

	/**
	 * 口碑码图片(不带背景图)
	 */
	@ApiField("code_url")
	private String codeUrl;

	/**
	 * 口碑码创建时间
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 口碑码ID
	 */
	@ApiField("qr_code")
	private String qrCode;

	/**
	 * 口碑码物料图（带背景）
	 */
	@ApiField("resource_url")
	private String resourceUrl;

	/**
	 * 口碑店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 口碑门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 物料模板
	 */
	@ApiField("stuff_template")
	private String stuffTemplate;

	/**
	 * 物料模板描述
	 */
	@ApiField("stuff_template_desc")
	private String stuffTemplateDesc;

	/**
	 * 口碑码类型描述
	 */
	@ApiField("stuff_type_desc")
	private String stuffTypeDesc;

	/**
	 * 桌号
	 */
	@ApiField("table_no")
	private String tableNo;

    /**
     * Gets batch id.
     *
     * @return the batch id
     */
    public Long getBatchId() {
		return this.batchId;
	}

    /**
     * Sets batch id.
     *
     * @param batchId the batch id
     */
    public void setBatchId(Long batchId) {
		this.batchId = batchId;
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
    public String getCreateTime() {
		return this.createTime;
	}

    /**
     * Sets create time.
     *
     * @param createTime the create time
     */
    public void setCreateTime(String createTime) {
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
     * Gets shop id.
     *
     * @return the shop id
     */
    public String getShopId() {
		return this.shopId;
	}

    /**
     * Sets shop id.
     *
     * @param shopId the shop id
     */
    public void setShopId(String shopId) {
		this.shopId = shopId;
	}

    /**
     * Gets shop name.
     *
     * @return the shop name
     */
    public String getShopName() {
		return this.shopName;
	}

    /**
     * Sets shop name.
     *
     * @param shopName the shop name
     */
    public void setShopName(String shopName) {
		this.shopName = shopName;
	}

    /**
     * Gets stuff template.
     *
     * @return the stuff template
     */
    public String getStuffTemplate() {
		return this.stuffTemplate;
	}

    /**
     * Sets stuff template.
     *
     * @param stuffTemplate the stuff template
     */
    public void setStuffTemplate(String stuffTemplate) {
		this.stuffTemplate = stuffTemplate;
	}

    /**
     * Gets stuff template desc.
     *
     * @return the stuff template desc
     */
    public String getStuffTemplateDesc() {
		return this.stuffTemplateDesc;
	}

    /**
     * Sets stuff template desc.
     *
     * @param stuffTemplateDesc the stuff template desc
     */
    public void setStuffTemplateDesc(String stuffTemplateDesc) {
		this.stuffTemplateDesc = stuffTemplateDesc;
	}

    /**
     * Gets stuff type desc.
     *
     * @return the stuff type desc
     */
    public String getStuffTypeDesc() {
		return this.stuffTypeDesc;
	}

    /**
     * Sets stuff type desc.
     *
     * @param stuffTypeDesc the stuff type desc
     */
    public void setStuffTypeDesc(String stuffTypeDesc) {
		this.stuffTypeDesc = stuffTypeDesc;
	}

    /**
     * Gets table no.
     *
     * @return the table no
     */
    public String getTableNo() {
		return this.tableNo;
	}

    /**
     * Sets table no.
     *
     * @param tableNo the table no
     */
    public void setTableNo(String tableNo) {
		this.tableNo = tableNo;
	}

}
