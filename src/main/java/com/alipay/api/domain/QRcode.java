package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汽车超人，QRcode二元组类型
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:22:31
 */
public class QRcode extends AlipayObject {

	private static final long serialVersionUID = 8633414873714457766L;

	/**
	 * 用户ID
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * qrcode地址
	 */
	@ApiField("qrcode_url")
	private String qrcodeUrl;

    /**
     * Gets card id.
     *
     * @return the card id
     */
    public String getCardId() {
		return this.cardId;
	}

    /**
     * Sets card id.
     *
     * @param cardId the card id
     */
    public void setCardId(String cardId) {
		this.cardId = cardId;
	}

    /**
     * Gets qrcode url.
     *
     * @return the qrcode url
     */
    public String getQrcodeUrl() {
		return this.qrcodeUrl;
	}

    /**
     * Sets qrcode url.
     *
     * @param qrcodeUrl the qrcode url
     */
    public void setQrcodeUrl(String qrcodeUrl) {
		this.qrcodeUrl = qrcodeUrl;
	}

}
