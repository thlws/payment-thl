package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈会员交易信息订阅申请
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:33:06
 */
public class KoubeiMarketingMallTradeSubscribeModel extends AlipayObject {

	private static final long serialVersionUID = 2647836278493717712L;

	/**
	 * 会员卡模版id
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/**
	 * 商圈id
	 */
	@ApiField("mall_id")
	private String mallId;

    /**
     * Gets card template id.
     *
     * @return the card template id
     */
    public String getCardTemplateId() {
		return this.cardTemplateId;
	}

    /**
     * Sets card template id.
     *
     * @param cardTemplateId the card template id
     */
    public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}

    /**
     * Gets mall id.
     *
     * @return the mall id
     */
    public String getMallId() {
		return this.mallId;
	}

    /**
     * Sets mall id.
     *
     * @param mallId the mall id
     */
    public void setMallId(String mallId) {
		this.mallId = mallId;
	}

}
