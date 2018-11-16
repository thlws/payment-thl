package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 点餐菜品推荐
 *
 * @author auto create
 * @since 1.0, 2017-12-22 14:47:14
 */
public class KoubeiCateringDishRecommendQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7299659881583359687L;

	/**
	 * 【已废弃】用户已点的主菜品ID，传入时作为推荐菜品参考。
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 当dish_list[]不为空的时候，dish_id是必填字段。
若type=QUICK_ORDER or DESIGN_FOR_YOU；则 dish_list内容为空。
若type=ASSOCIATION_RECOMAND；则dish_List为关联推荐的主菜品；
若type=CART_RECOMAND；则dish_list为购物车的已点菜品。
	 */
	@ApiListField("dish_list")
	@ApiField("dishes")
	private List<Dishes> dishList;

	/**
	 * 点餐门店所属的商家PID
	 */
	@ApiField("merchent_pid")
	private String merchentPid;

	/**
	 * 用餐人数（当type=QUICK_ORDER时，该字段必填）
	 */
	@ApiField("people")
	private String people;

	/**
	 * 门店客单价（单位分）
	 */
	@ApiField("per_price")
	private String perPrice;

	/**
	 * 点餐的门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * QUICK_ORDER:一键下单
DESIGN_FOR_YOU:为你定制
ASSOCIATION_RECOMAND:关联推荐
CART_RECOMAND:购物车菜品推荐
type为空默认设置为：DESIGN_FOR_YOU（为你定制）
	 */
	@ApiField("type")
	private String type;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets dish id.
     *
     * @return the dish id
     */
    public String getDishId() {
		return this.dishId;
	}

    /**
     * Sets dish id.
     *
     * @param dishId the dish id
     */
    public void setDishId(String dishId) {
		this.dishId = dishId;
	}

    /**
     * Gets dish list.
     *
     * @return the dish list
     */
    public List<Dishes> getDishList() {
		return this.dishList;
	}

    /**
     * Sets dish list.
     *
     * @param dishList the dish list
     */
    public void setDishList(List<Dishes> dishList) {
		this.dishList = dishList;
	}

    /**
     * Gets merchent pid.
     *
     * @return the merchent pid
     */
    public String getMerchentPid() {
		return this.merchentPid;
	}

    /**
     * Sets merchent pid.
     *
     * @param merchentPid the merchent pid
     */
    public void setMerchentPid(String merchentPid) {
		this.merchentPid = merchentPid;
	}

    /**
     * Gets people.
     *
     * @return the people
     */
    public String getPeople() {
		return this.people;
	}

    /**
     * Sets people.
     *
     * @param people the people
     */
    public void setPeople(String people) {
		this.people = people;
	}

    /**
     * Gets per price.
     *
     * @return the per price
     */
    public String getPerPrice() {
		return this.perPrice;
	}

    /**
     * Sets per price.
     *
     * @param perPrice the per price
     */
    public void setPerPrice(String perPrice) {
		this.perPrice = perPrice;
	}

    /**
     * Gets shop id.
     *
     * @return the shop id
     */
    public String getShopId() {
		return this.shopId;
	}

    /**
     * Sets shop id.
     *
     * @param shopId the shop id
     */
    public void setShopId(String shopId) {
		this.shopId = shopId;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
