package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑菜谱明细
 *
 * @author auto create
 * @since 1.0, 2018-09-11 14:28:14
 */
public class KbdishCookDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 7249617647398463162L;

	/**
	 * 菜谱大类
	 */
	@ApiField("catetory_big_id")
	private String catetoryBigId;

	/**
	 * 菜谱小类
	 */
	@ApiField("catetory_small_id")
	private String catetorySmallId;

	/**
	 * 菜谱id
	 */
	@ApiField("cook_id")
	private String cookId;

	/**
	 * 菜品id
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 打标
	 */
	@ApiField("flag")
	private String flag;

	/**
	 * 价格明细
	 */
	@ApiListField("kb_cook_sku_price_list")
	@ApiField("kbdish_cook_price_info")
	private List<KbdishCookPriceInfo> kbCookSkuPriceList;

	/**
	 * 排序值
	 */
	@ApiField("sort")
	private String sort;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

    /**
     * Gets catetory big id.
     *
     * @return the catetory big id
     */
    public String getCatetoryBigId() {
		return this.catetoryBigId;
	}

    /**
     * Sets catetory big id.
     *
     * @param catetoryBigId the catetory big id
     */
    public void setCatetoryBigId(String catetoryBigId) {
		this.catetoryBigId = catetoryBigId;
	}

    /**
     * Gets catetory small id.
     *
     * @return the catetory small id
     */
    public String getCatetorySmallId() {
		return this.catetorySmallId;
	}

    /**
     * Sets catetory small id.
     *
     * @param catetorySmallId the catetory small id
     */
    public void setCatetorySmallId(String catetorySmallId) {
		this.catetorySmallId = catetorySmallId;
	}

    /**
     * Gets cook id.
     *
     * @return the cook id
     */
    public String getCookId() {
		return this.cookId;
	}

    /**
     * Sets cook id.
     *
     * @param cookId the cook id
     */
    public void setCookId(String cookId) {
		this.cookId = cookId;
	}

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
     * Gets flag.
     *
     * @return the flag
     */
    public String getFlag() {
		return this.flag;
	}

    /**
     * Sets flag.
     *
     * @param flag the flag
     */
    public void setFlag(String flag) {
		this.flag = flag;
	}

    /**
     * Gets kb cook sku price list.
     *
     * @return the kb cook sku price list
     */
    public List<KbdishCookPriceInfo> getKbCookSkuPriceList() {
		return this.kbCookSkuPriceList;
	}

    /**
     * Sets kb cook sku price list.
     *
     * @param kbCookSkuPriceList the kb cook sku price list
     */
    public void setKbCookSkuPriceList(List<KbdishCookPriceInfo> kbCookSkuPriceList) {
		this.kbCookSkuPriceList = kbCookSkuPriceList;
	}

    /**
     * Gets sort.
     *
     * @return the sort
     */
    public String getSort() {
		return this.sort;
	}

    /**
     * Sets sort.
     *
     * @param sort the sort
     */
    public void setSort(String sort) {
		this.sort = sort;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

}
