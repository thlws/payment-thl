package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑餐区餐台同步api
 *
 * @author auto create
 * @since 1.0, 2018-08-03 17:51:30
 */
public class KoubeiCateringDishAreaSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7148639666825612938L;

	/**
	 * area:操作餐区模型 ;  tab:餐台列表; dish:操作开台菜列表    说明 修改全字段修改,设置为空则更新为空
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 口碑餐区模型。包含了餐台以及开台菜
	 */
	@ApiField("kb_dish_area")
	private KbdishAreaInfo kbDishArea;

	/**
	 * 同步类型: add 新增;update 修改;stateChange 状态变更,del 删除
	 */
	@ApiField("syn_type")
	private String synType;

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
     * Gets kb dish area.
     *
     * @return the kb dish area
     */
    public KbdishAreaInfo getKbDishArea() {
		return this.kbDishArea;
	}

    /**
     * Sets kb dish area.
     *
     * @param kbDishArea the kb dish area
     */
    public void setKbDishArea(KbdishAreaInfo kbDishArea) {
		this.kbDishArea = kbDishArea;
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
