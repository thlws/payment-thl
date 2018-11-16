package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SubCertDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.subcert.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-25 15:30:00
 */
public class AlipayMarketingCampaignSubcertQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7559534178285992443L;

	/** 
	 * 子凭证详细信息
	 */
	@ApiListField("subcert_list")
	@ApiField("sub_cert_detail")
	private List<SubCertDetail> subcertList;

	/** 
	 * 有效子凭证条数
	 */
	@ApiField("total_num")
	private String totalNum;

    /**
     * Sets subcert list.
     *
     * @param subcertList the subcert list
     */
    public void setSubcertList(List<SubCertDetail> subcertList) {
		this.subcertList = subcertList;
	}

    /**
     * Gets subcert list.
     *
     * @return the subcert list
     */
    public List<SubCertDetail> getSubcertList( ) {
		return this.subcertList;
	}

    /**
     * Sets total num.
     *
     * @param totalNum the total num
     */
    public void setTotalNum(String totalNum) {
		this.totalNum = totalNum;
	}

    /**
     * Gets total num.
     *
     * @return the total num
     */
    public String getTotalNum( ) {
		return this.totalNum;
	}

}
