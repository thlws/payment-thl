package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CraftsmanWorkOpenModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.craftsman.data.work.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class KoubeiCraftsmanDataWorkBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2244655153467938284L;

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
	 * 总页码数目
	 */
	@ApiField("total_page_no")
	private Long totalPageNo;

	/** 
	 * 总共手艺人作品数目
	 */
	@ApiField("total_works")
	private Long totalWorks;

	/** 
	 * 作品信息列表
	 */
	@ApiListField("works")
	@ApiField("craftsman_work_open_model")
	private List<CraftsmanWorkOpenModel> works;

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

    /**
     * Sets total works.
     *
     * @param totalWorks the total works
     */
    public void setTotalWorks(Long totalWorks) {
		this.totalWorks = totalWorks;
	}

    /**
     * Gets total works.
     *
     * @return the total works
     */
    public Long getTotalWorks( ) {
		return this.totalWorks;
	}

    /**
     * Sets works.
     *
     * @param works the works
     */
    public void setWorks(List<CraftsmanWorkOpenModel> works) {
		this.works = works;
	}

    /**
     * Gets works.
     *
     * @return the works
     */
    public List<CraftsmanWorkOpenModel> getWorks( ) {
		return this.works;
	}

}
