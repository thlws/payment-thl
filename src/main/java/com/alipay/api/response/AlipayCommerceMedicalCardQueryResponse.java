package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExtendMedicalCard;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.card.query response.
 *
 * @author auto create
 * @since 1.0, 2018-09-12 16:50:00
 */
public class AlipayCommerceMedicalCardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3382951957322192826L;

	/** 
	 * 签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 买家支付宝账号，将用＊号屏蔽部分内容
	 */
	@ApiField("buyer_logon_id")
	private String buyerLogonId;

	/** 
	 * 买家支付宝账号对应的支付宝唯一用户号。以2088开头的纯16位数字
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/** 
	 * 签约状态为成功绑定为不可空
卡颁发机构名称
	 */
	@ApiField("card_org_name")
	private String cardOrgName;

	/** 
	 * 签约状态为成功绑定为不可空
卡颁发机构编号
	 */
	@ApiField("card_org_no")
	private String cardOrgNo;

	/** 
	 * 城市编码(格式为：行政区域代码)
多个地市逗号分隔
	 */
	@ApiField("city")
	private String city;

	/** 
	 * 一个支付宝账号绑定了多张医保卡，除本人意外的卡信息
	 */
	@ApiListField("extend_cards")
	@ApiField("extend_medical_card")
	private List<ExtendMedicalCard> extendCards;

	/** 
	 * Json格式的业务扩展参数
	 */
	@ApiField("extend_params")
	private String extendParams;

	/** 
	 * 签约状态为成功绑定为不可空
签约成功时间。 格式为 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_sign")
	private String gmtSign;

	/** 
	 * 000102020011
	 */
	@ApiField("medical_card_id")
	private String medicalCardId;

	/** 
	 * 签约状态为成功绑定为不可空
医保卡号，敏感信息脱敏输出
	 */
	@ApiField("medical_card_no")
	private String medicalCardNo;

	/** 
	 * 市医保：CITY_INS
省医保:PROVINCE_INS
县医保:COUNTY_INS
	 */
	@ApiField("medical_card_type")
	private String medicalCardType;

	/** 
	 * 医保卡持卡人证件号码(脱敏)
	 */
	@ApiField("out_user_card_no")
	private String outUserCardNo;

	/** 
	 * 医保卡持有人姓名( 脱敏)
	 */
	@ApiField("out_user_name")
	private String outUserName;

	/** 
	 * 绑定状态
已激活:signed
已解绑:unsigned
	 */
	@ApiField("sign_status")
	private String signStatus;

    /**
     * Sets agreement no.
     *
     * @param agreementNo the agreement no
     */
    public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

    /**
     * Gets agreement no.
     *
     * @return the agreement no
     */
    public String getAgreementNo( ) {
		return this.agreementNo;
	}

    /**
     * Sets buyer logon id.
     *
     * @param buyerLogonId the buyer logon id
     */
    public void setBuyerLogonId(String buyerLogonId) {
		this.buyerLogonId = buyerLogonId;
	}

    /**
     * Gets buyer logon id.
     *
     * @return the buyer logon id
     */
    public String getBuyerLogonId( ) {
		return this.buyerLogonId;
	}

    /**
     * Sets buyer user id.
     *
     * @param buyerUserId the buyer user id
     */
    public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}

    /**
     * Gets buyer user id.
     *
     * @return the buyer user id
     */
    public String getBuyerUserId( ) {
		return this.buyerUserId;
	}

    /**
     * Sets card org name.
     *
     * @param cardOrgName the card org name
     */
    public void setCardOrgName(String cardOrgName) {
		this.cardOrgName = cardOrgName;
	}

    /**
     * Gets card org name.
     *
     * @return the card org name
     */
    public String getCardOrgName( ) {
		return this.cardOrgName;
	}

    /**
     * Sets card org no.
     *
     * @param cardOrgNo the card org no
     */
    public void setCardOrgNo(String cardOrgNo) {
		this.cardOrgNo = cardOrgNo;
	}

    /**
     * Gets card org no.
     *
     * @return the card org no
     */
    public String getCardOrgNo( ) {
		return this.cardOrgNo;
	}

    /**
     * Sets city.
     *
     * @param city the city
     */
    public void setCity(String city) {
		this.city = city;
	}

    /**
     * Gets city.
     *
     * @return the city
     */
    public String getCity( ) {
		return this.city;
	}

    /**
     * Sets extend cards.
     *
     * @param extendCards the extend cards
     */
    public void setExtendCards(List<ExtendMedicalCard> extendCards) {
		this.extendCards = extendCards;
	}

    /**
     * Gets extend cards.
     *
     * @return the extend cards
     */
    public List<ExtendMedicalCard> getExtendCards( ) {
		return this.extendCards;
	}

    /**
     * Sets extend params.
     *
     * @param extendParams the extend params
     */
    public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

    /**
     * Gets extend params.
     *
     * @return the extend params
     */
    public String getExtendParams( ) {
		return this.extendParams;
	}

    /**
     * Sets gmt sign.
     *
     * @param gmtSign the gmt sign
     */
    public void setGmtSign(String gmtSign) {
		this.gmtSign = gmtSign;
	}

    /**
     * Gets gmt sign.
     *
     * @return the gmt sign
     */
    public String getGmtSign( ) {
		return this.gmtSign;
	}

    /**
     * Sets medical card id.
     *
     * @param medicalCardId the medical card id
     */
    public void setMedicalCardId(String medicalCardId) {
		this.medicalCardId = medicalCardId;
	}

    /**
     * Gets medical card id.
     *
     * @return the medical card id
     */
    public String getMedicalCardId( ) {
		return this.medicalCardId;
	}

    /**
     * Sets medical card no.
     *
     * @param medicalCardNo the medical card no
     */
    public void setMedicalCardNo(String medicalCardNo) {
		this.medicalCardNo = medicalCardNo;
	}

    /**
     * Gets medical card no.
     *
     * @return the medical card no
     */
    public String getMedicalCardNo( ) {
		return this.medicalCardNo;
	}

    /**
     * Sets medical card type.
     *
     * @param medicalCardType the medical card type
     */
    public void setMedicalCardType(String medicalCardType) {
		this.medicalCardType = medicalCardType;
	}

    /**
     * Gets medical card type.
     *
     * @return the medical card type
     */
    public String getMedicalCardType( ) {
		return this.medicalCardType;
	}

    /**
     * Sets out user card no.
     *
     * @param outUserCardNo the out user card no
     */
    public void setOutUserCardNo(String outUserCardNo) {
		this.outUserCardNo = outUserCardNo;
	}

    /**
     * Gets out user card no.
     *
     * @return the out user card no
     */
    public String getOutUserCardNo( ) {
		return this.outUserCardNo;
	}

    /**
     * Sets out user name.
     *
     * @param outUserName the out user name
     */
    public void setOutUserName(String outUserName) {
		this.outUserName = outUserName;
	}

    /**
     * Gets out user name.
     *
     * @return the out user name
     */
    public String getOutUserName( ) {
		return this.outUserName;
	}

    /**
     * Sets sign status.
     *
     * @param signStatus the sign status
     */
    public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}

    /**
     * Gets sign status.
     *
     * @return the sign status
     */
    public String getSignStatus( ) {
		return this.signStatus;
	}

}
