package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑菜品估清数据同步
 *
 * @author auto create
 * @since 1.0, 2018-09-02 19:51:38
 */
public class KoubeiCateringDishEstimatedSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8416714483578124792L;

	/**
	 * 菜品估清类型,estimated表示菜品估清
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 菜品估清对象列表
	 */
	@ApiListField("kbdish_estimated_list")
	@ApiField("kbdish_estimated_info")
	private List<KbdishEstimatedInfo> kbdishEstimatedList;

	/**
	 * 同步类型,update会覆盖更新
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
     * Gets kbdish estimated list.
     *
     * @return the kbdish estimated list
     */
    public List<KbdishEstimatedInfo> getKbdishEstimatedList() {
		return this.kbdishEstimatedList;
	}

    /**
     * Sets kbdish estimated list.
     *
     * @param kbdishEstimatedList the kbdish estimated list
     */
    public void setKbdishEstimatedList(List<KbdishEstimatedInfo> kbdishEstimatedList) {
		this.kbdishEstimatedList = kbdishEstimatedList;
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
