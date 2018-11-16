package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品项目组数据同步
 *
 * @author auto create
 * @since 1.0, 2018-09-14 16:53:12
 */
public class KoubeiCateringDishGroupSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2584742698457972853L;

	/**
	 * 口碑菜品套餐项目组
	 */
	@ApiField("kb_dish_group")
	private KbdishGroupInfo kbDishGroup;

	/**
	 * 同步类型: add 新增;update 修改;stateChange 状态变更,del 删除
	 */
	@ApiField("syn_type")
	private String synType;

    /**
     * Gets kb dish group.
     *
     * @return the kb dish group
     */
    public KbdishGroupInfo getKbDishGroup() {
		return this.kbDishGroup;
	}

    /**
     * Sets kb dish group.
     *
     * @param kbDishGroup the kb dish group
     */
    public void setKbDishGroup(KbdishGroupInfo kbDishGroup) {
		this.kbDishGroup = kbDishGroup;
	}

    /**
     * Gets syn type.
     *
     * @return the syn type
     */
    public String getSynType() {
		return this.synType;
	}

    /**
     * Sets syn type.
     *
     * @param synType the syn type
     */
    public void setSynType(String synType) {
		this.synType = synType;
	}

}
