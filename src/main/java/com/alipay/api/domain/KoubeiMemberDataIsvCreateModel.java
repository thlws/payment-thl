package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv 会员CRM数据回流
 *
 * @author auto create
 * @since 1.0, 2018-02-05 16:36:58
 */
public class KoubeiMemberDataIsvCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3251954564624543279L;

	/**
	 * 会员卡最近一次激活时间，格式：yyyy-MM-dd HH:MM:ss
	 */
	@ApiField("gmt_member_card_last_active")
	private String gmtMemberCardLastActive;

	/**
	 * 会员卡领取时间（开卡时间），格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_merber_card_create")
	private String gmtMerberCardCreate;

	/**
	 * 会员卡卡号：唯一标识会员卡的ID，partner_id+member_card_id是唯一主键，若partner_id+member_card_id已存在，则做更新会员卡操作。
	 */
	@ApiField("member_card_id")
	private String memberCardId;

	/**
	 * 会员卡类型：
微卡、炫酷卡、儿童卡、璀璨卡、金卡银卡、白金卡等
	 */
	@ApiField("member_card_type")
	private String memberCardType;

	/**
	 * 会员用户身份识别ID
	 */
	@ApiField("member_ship")
	private MemberShip memberShip;

	/**
	 * 会员来源：
1：weixin（微信）；2：alipay（支付宝）；3：offline（线下会员卡）；4：other（其他）
	 */
	@ApiField("member_source")
	private String memberSource;

	/**
	 * 会员来源描述：如美团、饿了么等
	 */
	@ApiField("member_source_desc")
	private String memberSourceDesc;

	/**
	 * 会员状态：
1：生效；0：失效
	 */
	@ApiField("member_status")
	private String memberStatus;

	/**
	 * 外部记录
	 */
	@ApiField("outer_member_info")
	private OuterMemberInfo outerMemberInfo;

	/**
	 * 商户的PID
	 */
	@ApiField("parter_id")
	private String parterId;

	/**
	 * 会员卡领取的门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

    /**
     * Gets gmt member card last active.
     *
     * @return the gmt member card last active
     */
    public String getGmtMemberCardLastActive() {
		return this.gmtMemberCardLastActive;
	}

    /**
     * Sets gmt member card last active.
     *
     * @param gmtMemberCardLastActive the gmt member card last active
     */
    public void setGmtMemberCardLastActive(String gmtMemberCardLastActive) {
		this.gmtMemberCardLastActive = gmtMemberCardLastActive;
	}

    /**
     * Gets gmt merber card create.
     *
     * @return the gmt merber card create
     */
    public String getGmtMerberCardCreate() {
		return this.gmtMerberCardCreate;
	}

    /**
     * Sets gmt merber card create.
     *
     * @param gmtMerberCardCreate the gmt merber card create
     */
    public void setGmtMerberCardCreate(String gmtMerberCardCreate) {
		this.gmtMerberCardCreate = gmtMerberCardCreate;
	}

    /**
     * Gets member card id.
     *
     * @return the member card id
     */
    public String getMemberCardId() {
		return this.memberCardId;
	}

    /**
     * Sets member card id.
     *
     * @param memberCardId the member card id
     */
    public void setMemberCardId(String memberCardId) {
		this.memberCardId = memberCardId;
	}

    /**
     * Gets member card type.
     *
     * @return the member card type
     */
    public String getMemberCardType() {
		return this.memberCardType;
	}

    /**
     * Sets member card type.
     *
     * @param memberCardType the member card type
     */
    public void setMemberCardType(String memberCardType) {
		this.memberCardType = memberCardType;
	}

    /**
     * Gets member ship.
     *
     * @return the member ship
     */
    public MemberShip getMemberShip() {
		return this.memberShip;
	}

    /**
     * Sets member ship.
     *
     * @param memberShip the member ship
     */
    public void setMemberShip(MemberShip memberShip) {
		this.memberShip = memberShip;
	}

    /**
     * Gets member source.
     *
     * @return the member source
     */
    public String getMemberSource() {
		return this.memberSource;
	}

    /**
     * Sets member source.
     *
     * @param memberSource the member source
     */
    public void setMemberSource(String memberSource) {
		this.memberSource = memberSource;
	}

    /**
     * Gets member source desc.
     *
     * @return the member source desc
     */
    public String getMemberSourceDesc() {
		return this.memberSourceDesc;
	}

    /**
     * Sets member source desc.
     *
     * @param memberSourceDesc the member source desc
     */
    public void setMemberSourceDesc(String memberSourceDesc) {
		this.memberSourceDesc = memberSourceDesc;
	}

    /**
     * Gets member status.
     *
     * @return the member status
     */
    public String getMemberStatus() {
		return this.memberStatus;
	}

    /**
     * Sets member status.
     *
     * @param memberStatus the member status
     */
    public void setMemberStatus(String memberStatus) {
		this.memberStatus = memberStatus;
	}

    /**
     * Gets outer member info.
     *
     * @return the outer member info
     */
    public OuterMemberInfo getOuterMemberInfo() {
		return this.outerMemberInfo;
	}

    /**
     * Sets outer member info.
     *
     * @param outerMemberInfo the outer member info
     */
    public void setOuterMemberInfo(OuterMemberInfo outerMemberInfo) {
		this.outerMemberInfo = outerMemberInfo;
	}

    /**
     * Gets parter id.
     *
     * @return the parter id
     */
    public String getParterId() {
		return this.parterId;
	}

    /**
     * Sets parter id.
     *
     * @param parterId the parter id
     */
    public void setParterId(String parterId) {
		this.parterId = parterId;
	}

    /**
     * Gets shop id.
     *
     * @return the shop id
     */
    public String getShopId() {
		return this.shopId;
	}

    /**
     * Sets shop id.
     *
     * @param shopId the shop id
     */
    public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
