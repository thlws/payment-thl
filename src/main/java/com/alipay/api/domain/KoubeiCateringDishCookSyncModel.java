package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品中心菜谱同步api
 *
 * @author auto create
 * @since 1.0, 2018-08-03 17:44:51
 */
public class KoubeiCateringDishCookSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4767611433935915917L;

	/**
	 * cook：操作菜谱信息 ; shop:全量覆盖门店; detail;操作菜谱明细以及价格
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 口碑菜谱
	 */
	@ApiField("kb_dish_cook")
	private KbdishCookInfo kbDishCook;

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
     * Gets kb dish cook.
     *
     * @return the kb dish cook
     */
    public KbdishCookInfo getKbDishCook() {
		return this.kbDishCook;
	}

    /**
     * Sets kb dish cook.
     *
     * @param kbDishCook the kb dish cook
     */
    public void setKbDishCook(KbdishCookInfo kbDishCook) {
		this.kbDishCook = kbDishCook;
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
