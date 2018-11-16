package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑码绑定的门店和桌号信息
 *
 * @author auto create
 * @since 1.0, 2017-09-05 16:47:43
 */
public class KbCodeBindInfoVO extends AlipayObject {

	private static final long serialVersionUID = 4529278517332142544L;

	/**
	 * 商家餐桌摆放的区域名称（预留字段，暂不使用）
	 */
	@ApiField("area_name")
	private String areaName;

	/**
	 * 餐桌最大就餐人数（预留字段，暂不使用）
	 */
	@ApiField("max_pepole_num")
	private Long maxPepoleNum;

	/**
	 * 餐桌就餐的最少人数（预留字段，暂不使用）
	 */
	@ApiField("min_pepole_num")
	private String minPepoleNum;

	/**
	 * 口碑店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * table_no对应的中文名称。（预留字段，暂不使用）
	 */
	@ApiField("table_name")
	private String tableName;

	/**
	 * 商家收银系统录入的点菜桌号（生成桌码时，必填）
	 */
	@ApiField("table_no")
	private String tableNo;

    /**
     * Gets area name.
     *
     * @return the area name
     */
    public String getAreaName() {
		return this.areaName;
	}

    /**
     * Sets area name.
     *
     * @param areaName the area name
     */
    public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

    /**
     * Gets max pepole num.
     *
     * @return the max pepole num
     */
    public Long getMaxPepoleNum() {
		return this.maxPepoleNum;
	}

    /**
     * Sets max pepole num.
     *
     * @param maxPepoleNum the max pepole num
     */
    public void setMaxPepoleNum(Long maxPepoleNum) {
		this.maxPepoleNum = maxPepoleNum;
	}

    /**
     * Gets min pepole num.
     *
     * @return the min pepole num
     */
    public String getMinPepoleNum() {
		return this.minPepoleNum;
	}

    /**
     * Sets min pepole num.
     *
     * @param minPepoleNum the min pepole num
     */
    public void setMinPepoleNum(String minPepoleNum) {
		this.minPepoleNum = minPepoleNum;
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
     * Gets table name.
     *
     * @return the table name
     */
    public String getTableName() {
		return this.tableName;
	}

    /**
     * Sets table name.
     *
     * @param tableName the table name
     */
    public void setTableName(String tableName) {
		this.tableName = tableName;
	}

    /**
     * Gets table no.
     *
     * @return the table no
     */
    public String getTableNo() {
		return this.tableNo;
	}

    /**
     * Sets table no.
     *
     * @param tableNo the table no
     */
    public void setTableNo(String tableNo) {
		this.tableNo = tableNo;
	}

}
