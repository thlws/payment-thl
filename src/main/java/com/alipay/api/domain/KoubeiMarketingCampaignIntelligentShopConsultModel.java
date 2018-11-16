package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能营销门店咨询
 *
 * @author auto create
 * @since 1.0, 2018-01-29 11:03:17
 */
public class KoubeiMarketingCampaignIntelligentShopConsultModel extends AlipayObject {

	private static final long serialVersionUID = 4456345172689452477L;

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
	 * 外部业务id，请尽量保持足够的复杂，方便定位数据来源
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 当前页码，默认：“1”
	 */
	@ApiField("page_index")
	private String pageIndex;

	/**
	 * 每页项数[1, 500]， 默认500
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 商户和支付宝交互时，用于代表支付宝分配给商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 智能营销方案的方案id（template_code替代该值，无需传递）
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 结合biz_scene一起使用,值为RENEWAL_OLD:原方案续期、RENEWAL_NEW:新方案续期,要求必传
	 */
	@ApiField("promo_id")
	private String promoId;

	/**
	 * 营销模板的编号，默认GENERAL_EXPERIENCE（不传值）
可选枚举：
GENERAL_EXPERIENCE：全场体验；
GENERAL_NORMAL：全场普通；
GENERAL_20171212：全场2017双12版；
CROWD_EXPERIENCE：千人千券体验；
CROWD_NORMAL：千人千券普通；
CROWD_20171212：千人千券2017双12版；
	 */
	@ApiField("template_code")
	private String templateCode;

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
     * Gets page index.
     *
     * @return the page index
     */
    public String getPageIndex() {
		return this.pageIndex;
	}

    /**
     * Sets page index.
     *
     * @param pageIndex the page index
     */
    public void setPageIndex(String pageIndex) {
		this.pageIndex = pageIndex;
	}

    /**
     * Gets page size.
     *
     * @return the page size
     */
    public String getPageSize() {
		return this.pageSize;
	}

    /**
     * Sets page size.
     *
     * @param pageSize the page size
     */
    public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
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
     * Gets plan id.
     *
     * @return the plan id
     */
    public String getPlanId() {
		return this.planId;
	}

    /**
     * Sets plan id.
     *
     * @param planId the plan id
     */
    public void setPlanId(String planId) {
		this.planId = planId;
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
     * Gets template code.
     *
     * @return the template code
     */
    public String getTemplateCode() {
		return this.templateCode;
	}

    /**
     * Sets template code.
     *
     * @param templateCode the template code
     */
    public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

}
