package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能营销方案批量查询
 *
 * @author auto create
 * @since 1.0, 2017-11-17 06:02:33
 */
public class KoubeiMarketingCampaignIntelligentPromoBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5755154827989756733L;

	/**
	 * 操作员上下文信息
	 */
	@ApiField("operator_context")
	private PromoOperatorInfo operatorContext;

	/**
	 * 外部业务id，请保持足够的复杂，方便定位数据来源
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 活动拥有者信息
	 */
	@ApiField("owner_info")
	private PromoOperatorInfo ownerInfo;

	/**
	 * 分页信息
	 */
	@ApiField("page_info")
	private PromoPageInfo pageInfo;

    /**
     * Gets operator context.
     *
     * @return the operator context
     */
    public PromoOperatorInfo getOperatorContext() {
		return this.operatorContext;
	}

    /**
     * Sets operator context.
     *
     * @param operatorContext the operator context
     */
    public void setOperatorContext(PromoOperatorInfo operatorContext) {
		this.operatorContext = operatorContext;
	}

    /**
     * Gets out request no.
     *
     * @return the out request no
     */
    public String getOutRequestNo() {
		return this.outRequestNo;
	}

    /**
     * Sets out request no.
     *
     * @param outRequestNo the out request no
     */
    public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

    /**
     * Gets owner info.
     *
     * @return the owner info
     */
    public PromoOperatorInfo getOwnerInfo() {
		return this.ownerInfo;
	}

    /**
     * Sets owner info.
     *
     * @param ownerInfo the owner info
     */
    public void setOwnerInfo(PromoOperatorInfo ownerInfo) {
		this.ownerInfo = ownerInfo;
	}

    /**
     * Gets page info.
     *
     * @return the page info
     */
    public PromoPageInfo getPageInfo() {
		return this.pageInfo;
	}

    /**
     * Sets page info.
     *
     * @param pageInfo the page info
     */
    public void setPageInfo(PromoPageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

}
