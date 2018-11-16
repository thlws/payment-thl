package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DishonorOrder;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.dishonor.query response.
 *
 * @author auto create
 * @since 1.0, 2016-07-19 22:59:10
 */
public class AlipayFundTransDishonorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2119347749486597494L;

	/** 
	 * 退票订单详细列表：可能包含多个退票订单信息。如items值为0,则此参数不返回。
	 */
	@ApiListField("dishonor_order_list")
	@ApiField("dishonor_order")
	private List<DishonorOrder> dishonorOrderList;

	/** 
	 * 符合条件总记录数：大于等于0。
	 */
	@ApiField("items")
	private String items;

	/** 
	 * 每页记录数：大于等于1
	 */
	@ApiField("items_per_page")
	private String itemsPerPage;

	/** 
	 * 查询页号：大于等于1
	 */
	@ApiField("page")
	private String page;

    /**
     * Sets dishonor order list.
     *
     * @param dishonorOrderList the dishonor order list
     */
    public void setDishonorOrderList(List<DishonorOrder> dishonorOrderList) {
		this.dishonorOrderList = dishonorOrderList;
	}

    /**
     * Gets dishonor order list.
     *
     * @return the dishonor order list
     */
    public List<DishonorOrder> getDishonorOrderList( ) {
		return this.dishonorOrderList;
	}

    /**
     * Sets items.
     *
     * @param items the items
     */
    public void setItems(String items) {
		this.items = items;
	}

    /**
     * Gets items.
     *
     * @return the items
     */
    public String getItems( ) {
		return this.items;
	}

    /**
     * Sets items per page.
     *
     * @param itemsPerPage the items per page
     */
    public void setItemsPerPage(String itemsPerPage) {
		this.itemsPerPage = itemsPerPage;
	}

    /**
     * Gets items per page.
     *
     * @return the items per page
     */
    public String getItemsPerPage( ) {
		return this.itemsPerPage;
	}

    /**
     * Sets page.
     *
     * @param page the page
     */
    public void setPage(String page) {
		this.page = page;
	}

    /**
     * Gets page.
     *
     * @return the page
     */
    public String getPage( ) {
		return this.page;
	}

}
