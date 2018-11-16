package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CraftsmanOpenModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.craftsman.data.provider.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-07-10 11:00:54
 */
public class KoubeiCraftsmanDataProviderBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7719523478128276767L;

	/** 
	 * craftsmans:手艺人信息
	 */
	@ApiListField("craftsmans")
	@ApiField("craftsman_open_model")
	private List<CraftsmanOpenModel> craftsmans;

	/** 
	 * 当前页码
	 */
	@ApiField("current_page_no")
	private Long currentPageNo;

	/** 
	 * 每页记录数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 门店下共手艺人数目
	 */
	@ApiField("total_craftsmans")
	private Long totalCraftsmans;

	/** 
	 * 总页码数目
	 */
	@ApiField("total_page_no")
	private Long totalPageNo;

    /**
     * Sets craftsmans.
     *
     * @param craftsmans the craftsmans
     */
    public void setCraftsmans(List<CraftsmanOpenModel> craftsmans) {
		this.craftsmans = craftsmans;
	}

    /**
     * Gets craftsmans.
     *
     * @return the craftsmans
     */
    public List<CraftsmanOpenModel> getCraftsmans( ) {
		return this.craftsmans;
	}

    /**
     * Sets current page no.
     *
     * @param currentPageNo the current page no
     */
    public void setCurrentPageNo(Long currentPageNo) {
		this.currentPageNo = currentPageNo;
	}

    /**
     * Gets current page no.
     *
     * @return the current page no
     */
    public Long getCurrentPageNo( ) {
		return this.currentPageNo;
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
     * Sets total craftsmans.
     *
     * @param totalCraftsmans the total craftsmans
     */
    public void setTotalCraftsmans(Long totalCraftsmans) {
		this.totalCraftsmans = totalCraftsmans;
	}

    /**
     * Gets total craftsmans.
     *
     * @return the total craftsmans
     */
    public Long getTotalCraftsmans( ) {
		return this.totalCraftsmans;
	}

    /**
     * Sets total page no.
     *
     * @param totalPageNo the total page no
     */
    public void setTotalPageNo(Long totalPageNo) {
		this.totalPageNo = totalPageNo;
	}

    /**
     * Gets total page no.
     *
     * @return the total page no
     */
    public Long getTotalPageNo( ) {
		return this.totalPageNo;
	}

}
