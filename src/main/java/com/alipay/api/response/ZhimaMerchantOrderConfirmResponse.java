package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.order.confirm response.
 *
 * @author auto create
 * @since 1.0, 2018-01-24 15:44:19
 */
public class ZhimaMerchantOrderConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 7551796766391344378L;

	/** 
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 渠道来源
	 */
	@ApiField("channel_id")
	private String channelId;

	/** 
	 * 本次订单信用权益金额（如免押、极速付）
	 */
	@ApiField("credit_amout")
	private String creditAmout;

	/** 
	 * 民族
	 */
	@ApiField("ethnic_group")
	private String ethnicGroup;

	/** 
	 * 住宅地址，如：西湖区文三路168号
	 */
	@ApiField("house")
	private String house;

	/** 
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/** 
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 蚂蚁开放平台商户不在使用此字段
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 支付宝userid
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 人脸核身结果
	 */
	@ApiField("zm_face")
	private String zmFace;

	/** 
	 * 较差、中等、良好、优秀、极好5个级别
	 */
	@ApiField("zm_grade")
	private String zmGrade;

	/** 
	 * 芝麻风控产品集联合结果,Y/N
	 */
	@ApiField("zm_risk")
	private String zmRisk;

	/** 
	 * 芝麻分
	 */
	@ApiField("zm_score")
	private String zmScore;

    /**
     * Sets cert no.
     *
     * @param certNo the cert no
     */
    public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

    /**
     * Gets cert no.
     *
     * @return the cert no
     */
    public String getCertNo( ) {
		return this.certNo;
	}

    /**
     * Sets channel id.
     *
     * @param channelId the channel id
     */
    public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

    /**
     * Gets channel id.
     *
     * @return the channel id
     */
    public String getChannelId( ) {
		return this.channelId;
	}

    /**
     * Sets credit amout.
     *
     * @param creditAmout the credit amout
     */
    public void setCreditAmout(String creditAmout) {
		this.creditAmout = creditAmout;
	}

    /**
     * Gets credit amout.
     *
     * @return the credit amout
     */
    public String getCreditAmout( ) {
		return this.creditAmout;
	}

    /**
     * Sets ethnic group.
     *
     * @param ethnicGroup the ethnic group
     */
    public void setEthnicGroup(String ethnicGroup) {
		this.ethnicGroup = ethnicGroup;
	}

    /**
     * Gets ethnic group.
     *
     * @return the ethnic group
     */
    public String getEthnicGroup( ) {
		return this.ethnicGroup;
	}

    /**
     * Sets house.
     *
     * @param house the house
     */
    public void setHouse(String house) {
		this.house = house;
	}

    /**
     * Gets house.
     *
     * @return the house
     */
    public String getHouse( ) {
		return this.house;
	}

    /**
     * Sets mobile.
     *
     * @param mobile the mobile
     */
    public void setMobile(String mobile) {
		this.mobile = mobile;
	}

    /**
     * Gets mobile.
     *
     * @return the mobile
     */
    public String getMobile( ) {
		return this.mobile;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName( ) {
		return this.name;
	}

    /**
     * Sets open id.
     *
     * @param openId the open id
     */
    public void setOpenId(String openId) {
		this.openId = openId;
	}

    /**
     * Gets open id.
     *
     * @return the open id
     */
    public String getOpenId( ) {
		return this.openId;
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

    /**
     * Sets zm face.
     *
     * @param zmFace the zm face
     */
    public void setZmFace(String zmFace) {
		this.zmFace = zmFace;
	}

    /**
     * Gets zm face.
     *
     * @return the zm face
     */
    public String getZmFace( ) {
		return this.zmFace;
	}

    /**
     * Sets zm grade.
     *
     * @param zmGrade the zm grade
     */
    public void setZmGrade(String zmGrade) {
		this.zmGrade = zmGrade;
	}

    /**
     * Gets zm grade.
     *
     * @return the zm grade
     */
    public String getZmGrade( ) {
		return this.zmGrade;
	}

    /**
     * Sets zm risk.
     *
     * @param zmRisk the zm risk
     */
    public void setZmRisk(String zmRisk) {
		this.zmRisk = zmRisk;
	}

    /**
     * Gets zm risk.
     *
     * @return the zm risk
     */
    public String getZmRisk( ) {
		return this.zmRisk;
	}

    /**
     * Sets zm score.
     *
     * @param zmScore the zm score
     */
    public void setZmScore(String zmScore) {
		this.zmScore = zmScore;
	}

    /**
     * Gets zm score.
     *
     * @return the zm score
     */
    public String getZmScore( ) {
		return this.zmScore;
	}

}
