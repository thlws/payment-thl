package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CdpDisplayContent;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.mall.cdp.query response.
 *
 * @author auto create
 * @since 1.0, 2018-05-10 13:53:17
 */
public class KoubeiRetailMallCdpQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5846573792554669333L;

	/** 
	 * 投放内容列表
	 */
	@ApiListField("cdp_content_list")
	@ApiField("cdp_display_content")
	private List<CdpDisplayContent> cdpContentList;

    /**
     * Sets cdp content list.
     *
     * @param cdpContentList the cdp content list
     */
    public void setCdpContentList(List<CdpDisplayContent> cdpContentList) {
		this.cdpContentList = cdpContentList;
	}

    /**
     * Gets cdp content list.
     *
     * @return the cdp content list
     */
    public List<CdpDisplayContent> getCdpContentList( ) {
		return this.cdpContentList;
	}

}
