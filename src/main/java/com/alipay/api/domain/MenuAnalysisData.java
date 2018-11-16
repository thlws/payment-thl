package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 菜单分析数据
 *
 * @author auto create
 * @since 1.0, 2018-04-25 18:30:30
 */
public class MenuAnalysisData extends AlipayObject {

	private static final long serialVersionUID = 3423313169731292172L;

	/**
	 * 人均点击次数
	 */
	@ApiField("avg_click_user_cnt")
	private String avgClickUserCnt;

	/**
	 * 菜单点击次数
	 */
	@ApiField("click_cnt")
	private Long clickCnt;

	/**
	 * 菜单点击人数
	 */
	@ApiField("click_user_cnt")
	private Long clickUserCnt;

	/**
	 * 日期
	 */
	@ApiField("date")
	private String date;

	/**
	 * 菜单类型 ，iconDefault ：图标菜单、default：文字菜单
	 */
	@ApiField("menu_type")
	private String menuType;

	/**
	 * 菜单名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 子菜单名称，文字菜单才有
	 */
	@ApiField("sub_name")
	private String subName;

    /**
     * Gets avg click user cnt.
     *
     * @return the avg click user cnt
     */
    public String getAvgClickUserCnt() {
		return this.avgClickUserCnt;
	}

    /**
     * Sets avg click user cnt.
     *
     * @param avgClickUserCnt the avg click user cnt
     */
    public void setAvgClickUserCnt(String avgClickUserCnt) {
		this.avgClickUserCnt = avgClickUserCnt;
	}

    /**
     * Gets click cnt.
     *
     * @return the click cnt
     */
    public Long getClickCnt() {
		return this.clickCnt;
	}

    /**
     * Sets click cnt.
     *
     * @param clickCnt the click cnt
     */
    public void setClickCnt(Long clickCnt) {
		this.clickCnt = clickCnt;
	}

    /**
     * Gets click user cnt.
     *
     * @return the click user cnt
     */
    public Long getClickUserCnt() {
		return this.clickUserCnt;
	}

    /**
     * Sets click user cnt.
     *
     * @param clickUserCnt the click user cnt
     */
    public void setClickUserCnt(Long clickUserCnt) {
		this.clickUserCnt = clickUserCnt;
	}

    /**
     * Gets date.
     *
     * @return the date
     */
    public String getDate() {
		return this.date;
	}

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(String date) {
		this.date = date;
	}

    /**
     * Gets menu type.
     *
     * @return the menu type
     */
    public String getMenuType() {
		return this.menuType;
	}

    /**
     * Sets menu type.
     *
     * @param menuType the menu type
     */
    public void setMenuType(String menuType) {
		this.menuType = menuType;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets sub name.
     *
     * @return the sub name
     */
    public String getSubName() {
		return this.subName;
	}

    /**
     * Sets sub name.
     *
     * @param subName the sub name
     */
    public void setSubName(String subName) {
		this.subName = subName;
	}

}
