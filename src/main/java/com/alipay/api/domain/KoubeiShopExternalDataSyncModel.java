package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺外部数据同步
 *
 * @author auto create
 * @since 1.0, 2018-07-11 16:21:02
 */
public class KoubeiShopExternalDataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5279659743756585119L;

	/**
	 * 操作类型：Bind:建立口碑门店和饿了么外卖关系
unBind：解除口碑门店和饿了么外卖关系
sync：同步门店营业时间、营业状态、店铺状态
	 */
	@ApiField("action")
	private String action;

	/**
	 * shop_status:OPEN（生效）||CLOSE（失效） ，饿了么签约状态
business_time：08：00-11：30,13：00-20：30，营业时间，多个逗号分隔
business_status：OPEN（营业）||CLOSE（歇业）  饿了么营业状态。
	 */
	@ApiField("content")
	private String content;

	/**
	 * 数据来源。固定值:elm
	 */
	@ApiField("data_source")
	private String dataSource;

	/**
	 * 数据版本（时间戳）。用于判断请求是否乱序。
	 */
	@ApiField("data_version")
	private Long dataVersion;

	/**
	 * 外部的门店id
	 */
	@ApiField("external_shop_id")
	private String externalShopId;

	/**
	 * 口碑店铺Id
	 */
	@ApiField("shop_id")
	private String shopId;

    /**
     * Gets action.
     *
     * @return the action
     */
    public String getAction() {
		return this.action;
	}

    /**
     * Sets action.
     *
     * @param action the action
     */
    public void setAction(String action) {
		this.action = action;
	}

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent() {
		return this.content;
	}

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(String content) {
		this.content = content;
	}

    /**
     * Gets data source.
     *
     * @return the data source
     */
    public String getDataSource() {
		return this.dataSource;
	}

    /**
     * Sets data source.
     *
     * @param dataSource the data source
     */
    public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

    /**
     * Gets data version.
     *
     * @return the data version
     */
    public Long getDataVersion() {
		return this.dataVersion;
	}

    /**
     * Sets data version.
     *
     * @param dataVersion the data version
     */
    public void setDataVersion(Long dataVersion) {
		this.dataVersion = dataVersion;
	}

    /**
     * Gets external shop id.
     *
     * @return the external shop id
     */
    public String getExternalShopId() {
		return this.externalShopId;
	}

    /**
     * Sets external shop id.
     *
     * @param externalShopId the external shop id
     */
    public void setExternalShopId(String externalShopId) {
		this.externalShopId = externalShopId;
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

}
