package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 单品信息列表（数据）
 *
 * @author auto create
 * @since 1.0, 2016-05-26 13:26:04
 */
public class AlipayDataItemGoodsList extends AlipayObject {

	private static final long serialVersionUID = 7534682828175914622L;

	/**
	 * 单品的描述信息
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 单品id列表
	 */
	@ApiListField("goods_list")
	@ApiField("string")
	private List<String> goodsList;

    /**
     * Gets desc.
     *
     * @return the desc
     */
    public String getDesc() {
		return this.desc;
	}

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String desc) {
		this.desc = desc;
	}

    /**
     * Gets goods list.
     *
     * @return the goods list
     */
    public List<String> getGoodsList() {
		return this.goodsList;
	}

    /**
     * Sets goods list.
     *
     * @param goodsList the goods list
     */
    public void setGoodsList(List<String> goodsList) {
		this.goodsList = goodsList;
	}

}
