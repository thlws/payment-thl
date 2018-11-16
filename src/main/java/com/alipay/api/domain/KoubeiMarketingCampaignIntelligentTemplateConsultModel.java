package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 智能营销模板咨询
 *
 * @author auto create
 * @since 1.0, 2018-01-29 11:01:25
 */
public class KoubeiMarketingCampaignIntelligentTemplateConsultModel extends AlipayObject {

	private static final long serialVersionUID = 2697147635548328861L;

	/**
	 * 根据不同场景,过滤不同的门店数据,可参考值:CREATE_NORMAL:正常创建;RENEWAL_OLD:原方案续期;RENEWAL_NEW:新方案续期
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 操作上下文
	 */
	@ApiField("operator_context")
	private PromoOperatorInfo operatorContext;

	/**
	 * 代表了一次请求，作为业务幂等性控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 商户和支付宝交互时，用于代表支付宝分配给商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 结合biz_scene一起使用,值为RENEWAL_OLD:原方案续期、RENEWAL_NEW:新方案续期,要求必传
	 */
	@ApiField("promo_id")
	private String promoId;

	/**
	 * 默认(不传shop_ids门店)使用待体验门店匹配适用模板，指定门店列表(shop_ids)后根据入参匹配适用模板
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

    /**
     * Gets biz scene.
     *
     * @return the biz scene
     */
    public String getBizScene() {
		return this.bizScene;
	}

    /**
     * Sets biz scene.
     *
     * @param bizScene the biz scene
     */
    public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

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
     * Gets partner id.
     *
     * @return the partner id
     */
    public String getPartnerId() {
		return this.partnerId;
	}

    /**
     * Sets partner id.
     *
     * @param partnerId the partner id
     */
    public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

    /**
     * Gets promo id.
     *
     * @return the promo id
     */
    public String getPromoId() {
		return this.promoId;
	}

    /**
     * Sets promo id.
     *
     * @param promoId the promo id
     */
    public void setPromoId(String promoId) {
		this.promoId = promoId;
	}

    /**
     * Gets shop ids.
     *
     * @return the shop ids
     */
    public List<String> getShopIds() {
		return this.shopIds;
	}

    /**
     * Sets shop ids.
     *
     * @param shopIds the shop ids
     */
    public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

}
