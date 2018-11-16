package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品套餐内容数据结构
 *
 * @author auto create
 * @since 1.0, 2017-09-21 12:59:25
 */
public class ItemPackageInfo extends AlipayObject {

	private static final long serialVersionUID = 8191922761436686852L;

	/**
	 * 商品详情-套餐内菜品信息列表
	 */
	@ApiListField("item_units")
	@ApiField("item_unit_info")
	private List<ItemUnitInfo> itemUnits;

	/**
	 * 商品详情-套餐标题。最多不超过15个汉字，30个字符
	 */
	@ApiField("title")
	private String title;

    /**
     * Gets item units.
     *
     * @return the item units
     */
    public List<ItemUnitInfo> getItemUnits() {
		return this.itemUnits;
	}

    /**
     * Sets item units.
     *
     * @param itemUnits the item units
     */
    public void setItemUnits(List<ItemUnitInfo> itemUnits) {
		this.itemUnits = itemUnits;
	}

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
		return this.title;
	}

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
		this.title = title;
	}

}
