package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.indicator.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class KoubeiMarketingDataIndicatorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5834151285829143257L;

	/** 
	 * JSON格式数组，每个对象表示一个门店某个具体日期的指标信息，KEY为指标代码，VALUE为该指标对应的值,各biz_type入参以及返回值的详细信息参见<a href="https://doc.open.alipay.com/docs/doc.htm?spm=a219a.7629140.0.0.1AZ2QH&treeId=193&articleId=106028&docType=1">快速接入</a>
	 */
	@ApiField("indicator_infos")
	private String indicatorInfos;

	/** 
	 * 总条目数,供计算分页信息使用
	 */
	@ApiField("total_size")
	private String totalSize;

    /**
     * Sets indicator infos.
     *
     * @param indicatorInfos the indicator infos
     */
    public void setIndicatorInfos(String indicatorInfos) {
		this.indicatorInfos = indicatorInfos;
	}

    /**
     * Gets indicator infos.
     *
     * @return the indicator infos
     */
    public String getIndicatorInfos( ) {
		return this.indicatorInfos;
	}

    /**
     * Sets total size.
     *
     * @param totalSize the total size
     */
    public void setTotalSize(String totalSize) {
		this.totalSize = totalSize;
	}

    /**
     * Gets total size.
     *
     * @return the total size
     */
    public String getTotalSize( ) {
		return this.totalSize;
	}

}
