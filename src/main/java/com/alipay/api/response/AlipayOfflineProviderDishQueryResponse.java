package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IsvShopDishModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.dish.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayOfflineProviderDishQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8332892546215922736L;

	/** 
	 * 总共有多少条菜品信息。可用于计算分页。
	 */
	@ApiField("items")
	private Long items;

	/** 
	 * 菜品列表信息
	 */
	@ApiListField("list")
	@ApiField("isv_shop_dish_model")
	private List<IsvShopDishModel> list;

	/** 
	 * 当前数据所在的页码数
	 */
	@ApiField("page")
	private Long page;

	/** 
	 * 当前查询结果分页的条数，可用于计算分页
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 当前条件下查询结果总的页码数
	 */
	@ApiField("pages")
	private Long pages;

    /**
     * Sets items.
     *
     * @param items the items
     */
    public void setItems(Long items) {
		this.items = items;
	}

    /**
     * Gets items.
     *
     * @return the items
     */
    public Long getItems( ) {
		return this.items;
	}

    /**
     * Sets list.
     *
     * @param list the list
     */
    public void setList(List<IsvShopDishModel> list) {
		this.list = list;
	}

    /**
     * Gets list.
     *
     * @return the list
     */
    public List<IsvShopDishModel> getList( ) {
		return this.list;
	}

    /**
     * Sets page.
     *
     * @param page the page
     */
    public void setPage(Long page) {
		this.page = page;
	}

    /**
     * Gets page.
     *
     * @return the page
     */
    public Long getPage( ) {
		return this.page;
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
     * Gets page size.
     *
     * @return the page size
     */
    public Long getPageSize( ) {
		return this.pageSize;
	}

    /**
     * Sets pages.
     *
     * @param pages the pages
     */
    public void setPages(Long pages) {
		this.pages = pages;
	}

    /**
     * Gets pages.
     *
     * @return the pages
     */
    public Long getPages( ) {
		return this.pages;
	}

}
