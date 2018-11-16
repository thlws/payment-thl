package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.member.data.tag.query response.
 *
 * @author auto create
 * @since 1.0, 2018-04-25 14:30:00
 */
public class KoubeiMemberDataTagQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1878376121855973888L;

	/** 
	 * 是否是会员
	 */
	@ApiField("card_member")
	private Boolean cardMember;

	/** 
	 * 类目标签
	 */
	@ApiField("cate_prefer_label")
	private String catePreferLabel;

	/** 
	 * 潮标签
	 */
	@ApiField("fashion_label")
	private String fashionLabel;

	/** 
	 * 口味标签
	 */
	@ApiField("taste_prefer_label")
	private String tastePreferLabel;

	/** 
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Sets card member.
     *
     * @param cardMember the card member
     */
    public void setCardMember(Boolean cardMember) {
		this.cardMember = cardMember;
	}

    /**
     * Gets card member.
     *
     * @return the card member
     */
    public Boolean getCardMember( ) {
		return this.cardMember;
	}

    /**
     * Sets cate prefer label.
     *
     * @param catePreferLabel the cate prefer label
     */
    public void setCatePreferLabel(String catePreferLabel) {
		this.catePreferLabel = catePreferLabel;
	}

    /**
     * Gets cate prefer label.
     *
     * @return the cate prefer label
     */
    public String getCatePreferLabel( ) {
		return this.catePreferLabel;
	}

    /**
     * Sets fashion label.
     *
     * @param fashionLabel the fashion label
     */
    public void setFashionLabel(String fashionLabel) {
		this.fashionLabel = fashionLabel;
	}

    /**
     * Gets fashion label.
     *
     * @return the fashion label
     */
    public String getFashionLabel( ) {
		return this.fashionLabel;
	}

    /**
     * Sets taste prefer label.
     *
     * @param tastePreferLabel the taste prefer label
     */
    public void setTastePreferLabel(String tastePreferLabel) {
		this.tastePreferLabel = tastePreferLabel;
	}

    /**
     * Gets taste prefer label.
     *
     * @return the taste prefer label
     */
    public String getTastePreferLabel( ) {
		return this.tastePreferLabel;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId( ) {
		return this.userId;
	}

}
