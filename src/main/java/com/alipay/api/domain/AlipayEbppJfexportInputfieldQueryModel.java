package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询缴费输出的出账机构输入域
 *
 * @author auto create
 * @since 1.0, 2017-09-19 12:38:10
 */
public class AlipayEbppJfexportInputfieldQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8158997928969458172L;

	/**
	 * 业务类型，固定传JF，表示缴费
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 出账机构英文简称
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 拓展字段
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 获取场景:load，加载展示，渲染初始页面时的场景，例如户号的输入规则；query，查询展示，查询成功后确认页面的场景，例如缴费金额的输入规则；all，返回包含load和query两中场景。
	 */
	@ApiField("field_scene")
	private String fieldScene;

	/**
	 * 子业务类型：ELECTRIC-电费，WATER-水费，GAS-燃气费
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType() {
		return this.bizType;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets charge inst.
     *
     * @return the charge inst
     */
    public String getChargeInst() {
		return this.chargeInst;
	}

    /**
     * Sets charge inst.
     *
     * @param chargeInst the charge inst
     */
    public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

    /**
     * Gets extend field.
     *
     * @return the extend field
     */
    public String getExtendField() {
		return this.extendField;
	}

    /**
     * Sets extend field.
     *
     * @param extendField the extend field
     */
    public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

    /**
     * Gets field scene.
     *
     * @return the field scene
     */
    public String getFieldScene() {
		return this.fieldScene;
	}

    /**
     * Sets field scene.
     *
     * @param fieldScene the field scene
     */
    public void setFieldScene(String fieldScene) {
		this.fieldScene = fieldScene;
	}

    /**
     * Gets sub biz type.
     *
     * @return the sub biz type
     */
    public String getSubBizType() {
		return this.subBizType;
	}

    /**
     * Sets sub biz type.
     *
     * @param subBizType the sub biz type
     */
    public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

}
