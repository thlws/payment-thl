package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 菜品诊断类型列表对象
 *
 * @author auto create
 * @since 1.0, 2017-10-13 17:49:22
 */
public class ItemDiagnoseType extends AlipayObject {

	private static final long serialVersionUID = 1433455553134288139L;

	/**
	 * 001是明星菜品，002是潜力菜品，003是其他菜品（除明星菜品和潜力菜品之外的其他一律作为其他菜品 编号为003）。
2-	如果要查询所有的则传入999。具体的值可以通过koubei.marketing.data.dishdiagnosetype.batchquery来查询，同时会返回类型与说明
	 */
	@ApiField("item_diagnose")
	private String itemDiagnose;

	/**
	 * 对类型的描述
	 */
	@ApiField("item_diagnose_desc")
	private String itemDiagnoseDesc;

    /**
     * Gets item diagnose.
     *
     * @return the item diagnose
     */
    public String getItemDiagnose() {
		return this.itemDiagnose;
	}

    /**
     * Sets item diagnose.
     *
     * @param itemDiagnose the item diagnose
     */
    public void setItemDiagnose(String itemDiagnose) {
		this.itemDiagnose = itemDiagnose;
	}

    /**
     * Gets item diagnose desc.
     *
     * @return the item diagnose desc
     */
    public String getItemDiagnoseDesc() {
		return this.itemDiagnoseDesc;
	}

    /**
     * Sets item diagnose desc.
     *
     * @param itemDiagnoseDesc the item diagnose desc
     */
    public void setItemDiagnoseDesc(String itemDiagnoseDesc) {
		this.itemDiagnoseDesc = itemDiagnoseDesc;
	}

}
