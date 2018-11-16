package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PartnerVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.partner.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:17:29
 */
public class KoubeiRetailWmsPartnerQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5117374129519281127L;

	/** 
	 * 商户档案信息
	 */
	@ApiListField("partners")
	@ApiField("partner_v_o")
	private List<PartnerVO> partners;

	/** 
	 * 记录总数
	 */
	@ApiField("total_count")
	private String totalCount;

    /**
     * Sets partners.
     *
     * @param partners the partners
     */
    public void setPartners(List<PartnerVO> partners) {
		this.partners = partners;
	}

    /**
     * Gets partners.
     *
     * @return the partners
     */
    public List<PartnerVO> getPartners( ) {
		return this.partners;
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
