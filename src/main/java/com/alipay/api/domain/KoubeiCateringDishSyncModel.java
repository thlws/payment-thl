package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品库数据同步
 *
 * @author auto create
 * @since 1.0, 2018-09-02 19:51:14
 */
public class KoubeiCateringDishSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8721257489256989629L;

	/**
	 * dish：操作菜品模型 ;sku:操作关联sku
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 口碑菜品模型
	 */
	@ApiField("kb_dish_info")
	private KbdishInfo kbDishInfo;

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
     * Gets kb dish info.
     *
     * @return the kb dish info
     */
    public KbdishInfo getKbDishInfo() {
		return this.kbDishInfo;
	}

    /**
     * Sets kb dish info.
     *
     * @param kbDishInfo the kb dish info
     */
    public void setKbDishInfo(KbdishInfo kbDishInfo) {
		this.kbDishInfo = kbDishInfo;
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
