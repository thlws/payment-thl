package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PromoteDetailModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.data.promotedetail.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2017-09-29 15:05:44
 */
public class KoubeiAdvertDataPromotedetailBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7364239751199589753L;

	/** 
	 * 业务数据
	 */
	@ApiListField("data")
	@ApiField("promote_detail_model")
	private List<PromoteDetailModel> data;

	/** 
	 * 当前页码
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/** 
	 * 每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total_count")
	private Long totalCount;

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(List<PromoteDetailModel> data) {
		this.data = data;
	}

    /**
     * Gets data.
     *
     * @return the data
     */
    public List<PromoteDetailModel> getData( ) {
		return this.data;
	}

    /**
     * Sets page index.
     *
     * @param pageIndex the page index
     */
    public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}

    /**
     * Gets page index.
     *
     * @return the page index
     */
    public Long getPageIndex( ) {
		return this.pageIndex;
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
     * Sets total count.
     *
     * @param totalCount the total count
     */
    public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

    /**
     * Gets total count.
     *
     * @return the total count
     */
    public Long getTotalCount( ) {
		return this.totalCount;
	}

}
