package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OrderItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.servicemarket.order.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-09 11:10:00
 */
public class AlipayOpenServicemarketOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1177578431286217549L;

	/** 
	 * 订购服务商品ID
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/** 
	 * 当前查询页（本接口支持最多查询100条记录）
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 订单明细列表
	 */
	@ApiListField("order_items")
	@ApiField("order_item")
	private List<OrderItem> orderItems;

	/** 
	 * 用于区分同一个服务的不同版本
	 */
	@ApiField("specifications")
	private String specifications;

	/** 
	 * MERCHANT_ORDED（待服务商接单）
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 总记录数
	 */
	@ApiField("total_size")
	private Long totalSize;

    /**
     * Sets commodity id.
     *
     * @param commodityId the commodity id
     */
    public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

    /**
     * Gets commodity id.
     *
     * @return the commodity id
     */
    public String getCommodityId( ) {
		return this.commodityId;
	}

    /**
     * Sets current page.
     *
     * @param currentPage the current page
     */
    public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

    /**
     * Gets current page.
     *
     * @return the current page
     */
    public Long getCurrentPage( ) {
		return this.currentPage;
	}

    /**
     * Sets order items.
     *
     * @param orderItems the order items
     */
    public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

    /**
     * Gets order items.
     *
     * @return the order items
     */
    public List<OrderItem> getOrderItems( ) {
		return this.orderItems;
	}

    /**
     * Sets specifications.
     *
     * @param specifications the specifications
     */
    public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}

    /**
     * Gets specifications.
     *
     * @return the specifications
     */
    public String getSpecifications( ) {
		return this.specifications;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus( ) {
		return this.status;
	}

    /**
     * Sets total size.
     *
     * @param totalSize the total size
     */
    public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}

    /**
     * Gets total size.
     *
     * @return the total size
     */
    public Long getTotalSize( ) {
		return this.totalSize;
	}

}
