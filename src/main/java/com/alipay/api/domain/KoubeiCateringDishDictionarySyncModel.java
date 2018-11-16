package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品字典数据同步
 *
 * @author auto create
 * @since 1.0, 2018-09-14 14:30:53
 */
public class KoubeiCateringDishDictionarySyncModel extends AlipayObject {

	private static final long serialVersionUID = 3389899543138588924L;

	/**
	 * 业务字典类型. 定义如下: catetory 分类 ;unit 单位;spec 规格;group 套餐项目组
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 字典类
	 */
	@ApiField("kb_dish_dictionary")
	private KbdishDictionary kbDishDictionary;

	/**
	 * 同步类型: add 新增;update 修改;stateChange 状态变更;del删除
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
     * Gets kb dish dictionary.
     *
     * @return the kb dish dictionary
     */
    public KbdishDictionary getKbDishDictionary() {
		return this.kbDishDictionary;
	}

    /**
     * Sets kb dish dictionary.
     *
     * @param kbDishDictionary the kb dish dictionary
     */
    public void setKbDishDictionary(KbdishDictionary kbDishDictionary) {
		this.kbDishDictionary = kbDishDictionary;
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
