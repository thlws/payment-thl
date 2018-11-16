package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保险营销标的活动列表查询
 *
 * @author auto create
 * @since 1.0, 2017-07-19 16:56:29
 */
public class AlipayInsMarketingCampaignDecisionModel extends AlipayObject {

	private static final long serialVersionUID = 8871869427395917985L;

	/**
	 * 描述营销活动涉及的业务类型
1：平台险业务
	 */
	@ApiField("business_type")
	private Long businessType;

	/**
	 * 营销市场列表
	 */
	@ApiListField("market_types")
	@ApiField("number")
	private List<Long> marketTypes;

	/**
	 * 保险营销平台营销标的标识
	 */
	@ApiField("mkt_obj_id")
	private String mktObjId;

	/**
	 * 保险营销平台的营销标的类型
1：淘宝商品
	 */
	@ApiField("mkt_obj_type")
	private Long mktObjType;

	/**
	 * 请求流水id
	 */
	@ApiField("request_id")
	private String requestId;

    /**
     * Gets business type.
     *
     * @return the business type
     */
    public Long getBusinessType() {
		return this.businessType;
	}

    /**
     * Sets business type.
     *
     * @param businessType the business type
     */
    public void setBusinessType(Long businessType) {
		this.businessType = businessType;
	}

    /**
     * Gets market types.
     *
     * @return the market types
     */
    public List<Long> getMarketTypes() {
		return this.marketTypes;
	}

    /**
     * Sets market types.
     *
     * @param marketTypes the market types
     */
    public void setMarketTypes(List<Long> marketTypes) {
		this.marketTypes = marketTypes;
	}

    /**
     * Gets mkt obj id.
     *
     * @return the mkt obj id
     */
    public String getMktObjId() {
		return this.mktObjId;
	}

    /**
     * Sets mkt obj id.
     *
     * @param mktObjId the mkt obj id
     */
    public void setMktObjId(String mktObjId) {
		this.mktObjId = mktObjId;
	}

    /**
     * Gets mkt obj type.
     *
     * @return the mkt obj type
     */
    public Long getMktObjType() {
		return this.mktObjType;
	}

    /**
     * Sets mkt obj type.
     *
     * @param mktObjType the mkt obj type
     */
    public void setMktObjType(Long mktObjType) {
		this.mktObjType = mktObjType;
	}

    /**
     * Gets request id.
     *
     * @return the request id
     */
    public String getRequestId() {
		return this.requestId;
	}

    /**
     * Sets request id.
     *
     * @param requestId the request id
     */
    public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
