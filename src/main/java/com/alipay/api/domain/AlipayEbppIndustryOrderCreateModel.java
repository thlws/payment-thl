package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业业务订单创建
 *
 * @author auto create
 * @since 1.0, 2018-07-17 15:13:37
 */
public class AlipayEbppIndustryOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1748133422639575115L;

	/**
	 * 能力码是由支付宝分配的标识code
	 */
	@ApiField("ability_code")
	private String abilityCode;

	/**
	 * 账单的账期，例如201703表示2017年3月的账单。
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 业务账户号，例如水费单号，手机号，电费号，信用卡卡号。没有唯一性要求。
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 用户创建订单时涉及到的业务总金额。单位为：RMB Yuan。取值范围为[0.01，100000000.00)，精确到小数点后两位。
	 */
	@ApiField("biz_amount")
	private String bizAmount;

	/**
	 * 机构简称例如杭州电力HZELECTRIC
	 */
	@ApiField("biz_inst_short_name")
	private String bizInstShortName;

	/**
	 * 业务类型，缴费业务为JF，还款业务HK，公服行业为IND。
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 城市编码，国标码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 扩展属性，json串(key-value对)
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 滞纳金额，单位：元
	 */
	@ApiField("fine_amount")
	private String fineAmount;

	/**
	 * 身份标识号，例如身份证号、纳税人识别号等。
	 */
	@ApiField("identity_no")
	private String identityNo;

	/**
	 * 用户的手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * ISV流水号，用于控制幂等，须确保全局唯一
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 拥有该订单的用户姓名
	 */
	@ApiField("owner_name")
	private String ownerName;

	/**
	 * 省份编码，国标码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 子业务类型，水费为WATER，燃气费为GAS，社保为SI，公积金为HF，社保+公积金为SIHF
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

    /**
     * Gets ability code.
     *
     * @return the ability code
     */
    public String getAbilityCode() {
		return this.abilityCode;
	}

    /**
     * Sets ability code.
     *
     * @param abilityCode the ability code
     */
    public void setAbilityCode(String abilityCode) {
		this.abilityCode = abilityCode;
	}

    /**
     * Gets bill date.
     *
     * @return the bill date
     */
    public String getBillDate() {
		return this.billDate;
	}

    /**
     * Sets bill date.
     *
     * @param billDate the bill date
     */
    public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

    /**
     * Gets bill key.
     *
     * @return the bill key
     */
    public String getBillKey() {
		return this.billKey;
	}

    /**
     * Sets bill key.
     *
     * @param billKey the bill key
     */
    public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

    /**
     * Gets biz amount.
     *
     * @return the biz amount
     */
    public String getBizAmount() {
		return this.bizAmount;
	}

    /**
     * Sets biz amount.
     *
     * @param bizAmount the biz amount
     */
    public void setBizAmount(String bizAmount) {
		this.bizAmount = bizAmount;
	}

    /**
     * Gets biz inst short name.
     *
     * @return the biz inst short name
     */
    public String getBizInstShortName() {
		return this.bizInstShortName;
	}

    /**
     * Sets biz inst short name.
     *
     * @param bizInstShortName the biz inst short name
     */
    public void setBizInstShortName(String bizInstShortName) {
		this.bizInstShortName = bizInstShortName;
	}

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType() {
		return this.bizType;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets city code.
     *
     * @return the city code
     */
    public String getCityCode() {
		return this.cityCode;
	}

    /**
     * Sets city code.
     *
     * @param cityCode the city code
     */
    public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

    /**
     * Gets extend field.
     *
     * @return the extend field
     */
    public String getExtendField() {
		return this.extendField;
	}

    /**
     * Sets extend field.
     *
     * @param extendField the extend field
     */
    public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

    /**
     * Gets fine amount.
     *
     * @return the fine amount
     */
    public String getFineAmount() {
		return this.fineAmount;
	}

    /**
     * Sets fine amount.
     *
     * @param fineAmount the fine amount
     */
    public void setFineAmount(String fineAmount) {
		this.fineAmount = fineAmount;
	}

    /**
     * Gets identity no.
     *
     * @return the identity no
     */
    public String getIdentityNo() {
		return this.identityNo;
	}

    /**
     * Sets identity no.
     *
     * @param identityNo the identity no
     */
    public void setIdentityNo(String identityNo) {
		this.identityNo = identityNo;
	}

    /**
     * Gets mobile.
     *
     * @return the mobile
     */
    public String getMobile() {
		return this.mobile;
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
     * Gets out order no.
     *
     * @return the out order no
     */
    public String getOutOrderNo() {
		return this.outOrderNo;
	}

    /**
     * Sets out order no.
     *
     * @param outOrderNo the out order no
     */
    public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

    /**
     * Gets owner name.
     *
     * @return the owner name
     */
    public String getOwnerName() {
		return this.ownerName;
	}

    /**
     * Sets owner name.
     *
     * @param ownerName the owner name
     */
    public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

    /**
     * Gets province code.
     *
     * @return the province code
     */
    public String getProvinceCode() {
		return this.provinceCode;
	}

    /**
     * Sets province code.
     *
     * @param provinceCode the province code
     */
    public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

    /**
     * Gets sub biz type.
     *
     * @return the sub biz type
     */
    public String getSubBizType() {
		return this.subBizType;
	}

    /**
     * Sets sub biz type.
     *
     * @param subBizType the sub biz type
     */
    public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

}
