package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生产单对象实体
 *
 * @author auto create
 * @since 1.0, 2017-07-27 19:58:29
 */
public class AccessProduceOrder extends AlipayObject {

	private static final long serialVersionUID = 2372284298734978732L;

	/**
	 * 口碑码批次号
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 生产单标识
	 */
	@ApiField("produce_order_id")
	private String produceOrderId;

	/**
	 * 生产数量
	 */
	@ApiField("produce_quantity")
	private Long produceQuantity;

	/**
	 * 物料属性名称
	 */
	@ApiField("stuff_attr_name")
	private String stuffAttrName;

	/**
	 * 物料材质
	 */
	@ApiField("stuff_material")
	private String stuffMaterial;

	/**
	 * 物料尺寸
	 */
	@ApiField("stuff_size")
	private String stuffSize;

	/**
	 * 物料类型
	 */
	@ApiField("stuff_type")
	private String stuffType;

	/**
	 * 模板唯一标识
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 模板名称
	 */
	@ApiField("template_name")
	private String templateName;

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
     * Gets produce order id.
     *
     * @return the produce order id
     */
    public String getProduceOrderId() {
		return this.produceOrderId;
	}

    /**
     * Sets produce order id.
     *
     * @param produceOrderId the produce order id
     */
    public void setProduceOrderId(String produceOrderId) {
		this.produceOrderId = produceOrderId;
	}

    /**
     * Gets produce quantity.
     *
     * @return the produce quantity
     */
    public Long getProduceQuantity() {
		return this.produceQuantity;
	}

    /**
     * Sets produce quantity.
     *
     * @param produceQuantity the produce quantity
     */
    public void setProduceQuantity(Long produceQuantity) {
		this.produceQuantity = produceQuantity;
	}

    /**
     * Gets stuff attr name.
     *
     * @return the stuff attr name
     */
    public String getStuffAttrName() {
		return this.stuffAttrName;
	}

    /**
     * Sets stuff attr name.
     *
     * @param stuffAttrName the stuff attr name
     */
    public void setStuffAttrName(String stuffAttrName) {
		this.stuffAttrName = stuffAttrName;
	}

    /**
     * Gets stuff material.
     *
     * @return the stuff material
     */
    public String getStuffMaterial() {
		return this.stuffMaterial;
	}

    /**
     * Sets stuff material.
     *
     * @param stuffMaterial the stuff material
     */
    public void setStuffMaterial(String stuffMaterial) {
		this.stuffMaterial = stuffMaterial;
	}

    /**
     * Gets stuff size.
     *
     * @return the stuff size
     */
    public String getStuffSize() {
		return this.stuffSize;
	}

    /**
     * Sets stuff size.
     *
     * @param stuffSize the stuff size
     */
    public void setStuffSize(String stuffSize) {
		this.stuffSize = stuffSize;
	}

    /**
     * Gets stuff type.
     *
     * @return the stuff type
     */
    public String getStuffType() {
		return this.stuffType;
	}

    /**
     * Sets stuff type.
     *
     * @param stuffType the stuff type
     */
    public void setStuffType(String stuffType) {
		this.stuffType = stuffType;
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
     * Gets template name.
     *
     * @return the template name
     */
    public String getTemplateName() {
		return this.templateName;
	}

    /**
     * Sets template name.
     *
     * @param templateName the template name
     */
    public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

}
