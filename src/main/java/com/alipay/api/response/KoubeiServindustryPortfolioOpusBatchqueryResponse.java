package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpusInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.servindustry.portfolio.opus.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2017-10-20 11:05:07
 */
public class KoubeiServindustryPortfolioOpusBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7843214384947347123L;

	/** 
	 * 素材列表
	 */
	@ApiListField("opuses")
	@ApiField("opus_info")
	private List<OpusInfo> opuses;

	/** 
	 * 总数
	 */
	@ApiField("total_size")
	private Long totalSize;

    /**
     * Sets opuses.
     *
     * @param opuses the opuses
     */
    public void setOpuses(List<OpusInfo> opuses) {
		this.opuses = opuses;
	}

    /**
     * Gets opuses.
     *
     * @return the opuses
     */
    public List<OpusInfo> getOpuses( ) {
		return this.opuses;
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
