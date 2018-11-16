package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店摘要信息批量查询接口
 *
 * @author auto create
 * @since 1.0, 2018-07-11 16:20:25
 */
public class AlipayOfflineMarketShopSummaryBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8269481278135842697L;

	/**
	 * 表示接口业务的调用方身份：ISV、 服务商身份标识。传入ISV代表系统集成商身份。传入PROVIDER代表服务商。
	 */
	@ApiField("op_role")
	private String opRole;

	/**
	 * 页码，留空标示第一页，默认 20个结果为一页
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页记录数，默认20，最大 100
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 门店数据查询类型，根据类型可以返回指定的门店数据，目前支持的类型如下：
BRAND_RELATION ： 品牌商关联店铺
MALL_SELF ：MALL自己的门店
MALL_RELATION：MALL关联下的门店
MERCHANT_SELF:商户自己的门店
KB_PROMOTER：口碑客推广者
	 */
	@ApiField("query_type")
	private String queryType;

	/**
	 * query_type查询类型下所关联的商户PID
	 */
	@ApiField("related_partner_id")
	private String relatedPartnerId;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 门店状态，传入多个状态，多个状态使用英文逗号隔开，例如：PAUSED,OPEN
店铺状态：OPEN（营业）、PAUSED（暂停）、INIT（初始）、FREEZE（冻结）、CLOSED（关店）
	 */
	@ApiField("shop_status")
	private String shopStatus;

    /**
     * Gets op role.
     *
     * @return the op role
     */
    public String getOpRole() {
		return this.opRole;
	}

    /**
     * Sets op role.
     *
     * @param opRole the op role
     */
    public void setOpRole(String opRole) {
		this.opRole = opRole;
	}

    /**
     * Gets page no.
     *
     * @return the page no
     */
    public Long getPageNo() {
		return this.pageNo;
	}

    /**
     * Sets page no.
     *
     * @param pageNo the page no
     */
    public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

    /**
     * Gets page size.
     *
     * @return the page size
     */
    public Long getPageSize() {
		return this.pageSize;
	}

    /**
     * Sets page size.
     *
     * @param pageSize the page size
     */
    public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

    /**
     * Gets query type.
     *
     * @return the query type
     */
    public String getQueryType() {
		return this.queryType;
	}

    /**
     * Sets query type.
     *
     * @param queryType the query type
     */
    public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

    /**
     * Gets related partner id.
     *
     * @return the related partner id
     */
    public String getRelatedPartnerId() {
		return this.relatedPartnerId;
	}

    /**
     * Sets related partner id.
     *
     * @param relatedPartnerId the related partner id
     */
    public void setRelatedPartnerId(String relatedPartnerId) {
		this.relatedPartnerId = relatedPartnerId;
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
     * Gets shop status.
     *
     * @return the shop status
     */
    public String getShopStatus() {
		return this.shopStatus;
	}

    /**
     * Sets shop status.
     *
     * @param shopStatus the shop status
     */
    public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

}
