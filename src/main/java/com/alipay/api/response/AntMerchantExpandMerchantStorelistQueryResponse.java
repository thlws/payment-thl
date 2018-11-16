package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShopQueryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.merchant.storelist.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AntMerchantExpandMerchantStorelistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8336667345179424738L;

	/** 
	 * 商户门店列表
	 */
	@ApiListField("merchant_stores")
	@ApiField("shop_query_info")
	private List<ShopQueryInfo> merchantStores;

	/** 
	 * 当前页码,页码从1开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	/** 
	 * 总条数
	 */
	@ApiField("total_size")
	private Long totalSize;

    /**
     * Sets merchant stores.
     *
     * @param merchantStores the merchant stores
     */
    public void setMerchantStores(List<ShopQueryInfo> merchantStores) {
		this.merchantStores = merchantStores;
	}

    /**
     * Gets merchant stores.
     *
     * @return the merchant stores
     */
    public List<ShopQueryInfo> getMerchantStores( ) {
		return this.merchantStores;
	}

    /**
     * Sets page num.
     *
     * @param pageNum the page num
     */
    public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

    /**
     * Gets page num.
     *
     * @return the page num
     */
    public Long getPageNum( ) {
		return this.pageNum;
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
     * Sets total pages.
     *
     * @param totalPages the total pages
     */
    public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}

    /**
     * Gets total pages.
     *
     * @return the total pages
     */
    public Long getTotalPages( ) {
		return this.totalPages;
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
