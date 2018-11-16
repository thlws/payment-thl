package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbAdvertAdvChannelResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.commission.advchannel.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2017-01-17 10:33:52
 */
public class KoubeiAdvertCommissionAdvchannelBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6673472548252375846L;

	/** 
	 * 业务数据
	 */
	@ApiListField("data")
	@ApiField("kb_advert_adv_channel_response")
	private List<KbAdvertAdvChannelResponse> data;

	/** 
	 * 当前页码，默认1
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/** 
	 * 每页记录数，默认10，最大100
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总记录数
	 */
	@ApiField("total_count")
	private Long totalCount;

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(List<KbAdvertAdvChannelResponse> data) {
		this.data = data;
	}

    /**
     * Gets data.
     *
     * @return the data
     */
    public List<KbAdvertAdvChannelResponse> getData( ) {
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
