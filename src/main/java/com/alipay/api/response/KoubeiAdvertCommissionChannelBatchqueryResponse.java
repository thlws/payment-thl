package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.KbAdvertChannelResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.commission.channel.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2017-03-03 10:41:12
 */
public class KoubeiAdvertCommissionChannelBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4812132468292756149L;

	/** 
	 * 渠道信息
	 */
	@ApiField("data")
	private KbAdvertChannelResponse data;

	/** 
	 * 页码
	 */
	@ApiField("page_index")
	private String pageIndex;

	/** 
	 * 每页页数
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 总页数
	 */
	@ApiField("total_count")
	private String totalCount;

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(KbAdvertChannelResponse data) {
		this.data = data;
	}

    /**
     * Gets data.
     *
     * @return the data
     */
    public KbAdvertChannelResponse getData( ) {
		return this.data;
	}

    /**
     * Sets page index.
     *
     * @param pageIndex the page index
     */
    public void setPageIndex(String pageIndex) {
		this.pageIndex = pageIndex;
	}

    /**
     * Gets page index.
     *
     * @return the page index
     */
    public String getPageIndex( ) {
		return this.pageIndex;
	}

    /**
     * Sets page size.
     *
     * @param pageSize the page size
     */
    public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

    /**
     * Gets page size.
     *
     * @return the page size
     */
    public String getPageSize( ) {
		return this.pageSize;
	}

    /**
     * Sets total count.
     *
     * @param totalCount the total count
     */
    public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

    /**
     * Gets total count.
     *
     * @return the total count
     */
    public String getTotalCount( ) {
		return this.totalCount;
	}

}
