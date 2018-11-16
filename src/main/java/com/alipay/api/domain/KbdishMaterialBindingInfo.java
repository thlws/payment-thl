package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品加料绑定菜品信息
 *
 * @author auto create
 * @since 1.0, 2018-09-11 15:26:51
 */
public class KbdishMaterialBindingInfo extends AlipayObject {

	private static final long serialVersionUID = 4531558381491585349L;

	/**
	 * 加料id
	 */
	@ApiField("material_id")
	private String materialId;

	/**
	 * 菜品加料排序字段，从1开始递增
	 */
	@ApiField("sort")
	private String sort;

    /**
     * Gets material id.
     *
     * @return the material id
     */
    public String getMaterialId() {
		return this.materialId;
	}

    /**
     * Sets material id.
     *
     * @param materialId the material id
     */
    public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}

    /**
     * Gets sort.
     *
     * @return the sort
     */
    public String getSort() {
		return this.sort;
	}

    /**
     * Sets sort.
     *
     * @param sort the sort
     */
    public void setSort(String sort) {
		this.sort = sort;
	}

}
