package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 绑定卡券模板的适用门店
 *
 * @author auto create
 * @since 1.0, 2018-03-13 18:04:28
 */
public class AlipayMarketingPassShopBindModel extends AlipayObject {

	private static final long serialVersionUID = 7482876945889144521L;

	/**
	 * 当前操作是否为追加门店绑定，默认为true，代表为追加门店绑定，现有的门店列表不变，追加绑定本次传入的门店列表；
传值为false时，则为覆盖更新，先删除现有的门店列表，再绑定本次传入的门店列表；
	 */
	@ApiField("is_appending")
	private Boolean isAppending;

	/**
	 * 门店ID列表，1次请求最多传入500家门店，超过请设置is_appending为true分批传入绑定；
注意：若不传门店列表且is_appending为false，则表示清空当前绑定门店列表。
	 */
	@ApiListField("shop_list")
	@ApiField("string")
	private List<String> shopList;

	/**
	 * 模板ID（编号），创建模板接口返回的模板ID
	 */
	@ApiField("tpl_id")
	private String tplId;

    /**
     * Gets is appending.
     *
     * @return the is appending
     */
    public Boolean getIsAppending() {
		return this.isAppending;
	}

    /**
     * Sets is appending.
     *
     * @param isAppending the is appending
     */
    public void setIsAppending(Boolean isAppending) {
		this.isAppending = isAppending;
	}

    /**
     * Gets shop list.
     *
     * @return the shop list
     */
    public List<String> getShopList() {
		return this.shopList;
	}

    /**
     * Sets shop list.
     *
     * @param shopList the shop list
     */
    public void setShopList(List<String> shopList) {
		this.shopList = shopList;
	}

    /**
     * Gets tpl id.
     *
     * @return the tpl id
     */
    public String getTplId() {
		return this.tplId;
	}

    /**
     * Sets tpl id.
     *
     * @param tplId the tpl id
     */
    public void setTplId(String tplId) {
		this.tplId = tplId;
	}

}
