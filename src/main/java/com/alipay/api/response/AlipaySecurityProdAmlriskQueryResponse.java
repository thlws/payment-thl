package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MerchantScreenHit;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.amlrisk.query response.
 *
 * @author auto create
 * @since 1.0, 2016-02-02 15:48:33
 */
public class AlipaySecurityProdAmlriskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6254453553533556642L;

	/** 
	 * 事件ID，由入参得来
	 */
	@ApiField("event_id")
	private String eventId;

	/** 
	 * 根据反洗钱风险检查，该商户是否有风险，有风险则为Yes，无风险则为No
	 */
	@ApiField("has_risk")
	private String hasRisk;

	/** 
	 * 商户ID，由入参得来
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/** 
	 * 当发现有风险时，以列表形式表示风险详情，风险点可以有0个至多个。
	 */
	@ApiListField("risks")
	@ApiField("merchant_screen_hit")
	private List<MerchantScreenHit> risks;

    /**
     * Sets event id.
     *
     * @param eventId the event id
     */
    public void setEventId(String eventId) {
		this.eventId = eventId;
	}

    /**
     * Gets event id.
     *
     * @return the event id
     */
    public String getEventId( ) {
		return this.eventId;
	}

    /**
     * Sets has risk.
     *
     * @param hasRisk the has risk
     */
    public void setHasRisk(String hasRisk) {
		this.hasRisk = hasRisk;
	}

    /**
     * Gets has risk.
     *
     * @return the has risk
     */
    public String getHasRisk( ) {
		return this.hasRisk;
	}

    /**
     * Sets merchant id.
     *
     * @param merchantId the merchant id
     */
    public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

    /**
     * Gets merchant id.
     *
     * @return the merchant id
     */
    public String getMerchantId( ) {
		return this.merchantId;
	}

    /**
     * Sets risks.
     *
     * @param risks the risks
     */
    public void setRisks(List<MerchantScreenHit> risks) {
		this.risks = risks;
	}

    /**
     * Gets risks.
     *
     * @return the risks
     */
    public List<MerchantScreenHit> getRisks( ) {
		return this.risks;
	}

}
