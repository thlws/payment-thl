package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合约基本信息
 *
 * @author auto create
 * @since 1.0, 2016-09-09 20:38:43
 */
public class ArrangementBaseVO extends AlipayObject {

	private static final long serialVersionUID = 3115659651289571124L;

	/**
	 * 应用id
	 */
	@ApiField("app_id")
	private String appId;

	/**
	 * 签约机构编码
	 */
	@ApiField("arrangement_institution_code")
	private String arrangementInstitutionCode;

	/**
	 * 合约名称
	 */
	@ApiField("arrangement_name")
	private String arrangementName;

	/**
	 * 合约编号
	 */
	@ApiField("arrangement_no")
	private String arrangementNo;

	/**
	 * 合约类型
	 */
	@ApiField("arrangement_type")
	private String arrangementType;

	/**
	 * 合约版
	 */
	@ApiField("arrangement_version")
	private String arrangementVersion;

	/**
	 * 签约渠道来源
	 */
	@ApiField("channel_code")
	private String channelCode;

	/**
	 * 合约失效时间
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/**
	 * 到期时间
	 */
	@ApiField("gmt_expired")
	private Date gmtExpired;

	/**
	 * 预计合约失效时间
	 */
	@ApiField("gmt_invalid_due")
	private String gmtInvalidDue;

	/**
	 * 合约签署时间
	 */
	@ApiField("gmt_sign")
	private Date gmtSign;

	/**
	 * 预计合约生效时间
	 */
	@ApiField("gmt_vald_due")
	private String gmtValdDue;

	/**
	 * 合约版本时间
	 */
	@ApiField("gmt_vrsn")
	private Date gmtVrsn;

	/**
	 * 参与者角色ID
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 修改人
	 */
	@ApiField("last_moder")
	private String lastModer;

	/**
	 * 外标类型
	 */
	@ApiField("mark_type")
	private String markType;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 修改人类型
	 */
	@ApiField("moder_type")
	private String moderType;

	/**
	 * 签约产品外标
	 */
	@ApiField("pd_mark")
	private String pdMark;

	/**
	 * 产品编码
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 产品名称
	 */
	@ApiField("prod_name")
	private String prodName;

	/**
	 * 产品版本
	 */
	@ApiField("prod_version")
	private String prodVersion;

	/**
	 * ps(产品销售)编码
	 */
	@ApiField("ps_code")
	private String psCode;

	/**
	 * ps(产品销售)id
	 */
	@ApiField("ps_id")
	private String psId;

	/**
	 * 产品销售名称
	 */
	@ApiField("ps_name")
	private String psName;

	/**
	 * 合约状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 签约模板产品编码
	 */
	@ApiField("template_prod_code")
	private String templateProdCode;

	/**
	 * 签约模板产品版本
	 */
	@ApiField("template_prod_version")
	private String templateProdVersion;

    /**
     * Gets app id.
     *
     * @return the app id
     */
    public String getAppId() {
		return this.appId;
	}

    /**
     * Sets app id.
     *
     * @param appId the app id
     */
    public void setAppId(String appId) {
		this.appId = appId;
	}

    /**
     * Gets arrangement institution code.
     *
     * @return the arrangement institution code
     */
    public String getArrangementInstitutionCode() {
		return this.arrangementInstitutionCode;
	}

    /**
     * Sets arrangement institution code.
     *
     * @param arrangementInstitutionCode the arrangement institution code
     */
    public void setArrangementInstitutionCode(String arrangementInstitutionCode) {
		this.arrangementInstitutionCode = arrangementInstitutionCode;
	}

    /**
     * Gets arrangement name.
     *
     * @return the arrangement name
     */
    public String getArrangementName() {
		return this.arrangementName;
	}

    /**
     * Sets arrangement name.
     *
     * @param arrangementName the arrangement name
     */
    public void setArrangementName(String arrangementName) {
		this.arrangementName = arrangementName;
	}

    /**
     * Gets arrangement no.
     *
     * @return the arrangement no
     */
    public String getArrangementNo() {
		return this.arrangementNo;
	}

    /**
     * Sets arrangement no.
     *
     * @param arrangementNo the arrangement no
     */
    public void setArrangementNo(String arrangementNo) {
		this.arrangementNo = arrangementNo;
	}

    /**
     * Gets arrangement type.
     *
     * @return the arrangement type
     */
    public String getArrangementType() {
		return this.arrangementType;
	}

    /**
     * Sets arrangement type.
     *
     * @param arrangementType the arrangement type
     */
    public void setArrangementType(String arrangementType) {
		this.arrangementType = arrangementType;
	}

    /**
     * Gets arrangement version.
     *
     * @return the arrangement version
     */
    public String getArrangementVersion() {
		return this.arrangementVersion;
	}

    /**
     * Sets arrangement version.
     *
     * @param arrangementVersion the arrangement version
     */
    public void setArrangementVersion(String arrangementVersion) {
		this.arrangementVersion = arrangementVersion;
	}

    /**
     * Gets channel code.
     *
     * @return the channel code
     */
    public String getChannelCode() {
		return this.channelCode;
	}

    /**
     * Sets channel code.
     *
     * @param channelCode the channel code
     */
    public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

    /**
     * Gets gmt end.
     *
     * @return the gmt end
     */
    public String getGmtEnd() {
		return this.gmtEnd;
	}

    /**
     * Sets gmt end.
     *
     * @param gmtEnd the gmt end
     */
    public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

    /**
     * Gets gmt expired.
     *
     * @return the gmt expired
     */
    public Date getGmtExpired() {
		return this.gmtExpired;
	}

    /**
     * Sets gmt expired.
     *
     * @param gmtExpired the gmt expired
     */
    public void setGmtExpired(Date gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

    /**
     * Gets gmt invalid due.
     *
     * @return the gmt invalid due
     */
    public String getGmtInvalidDue() {
		return this.gmtInvalidDue;
	}

    /**
     * Sets gmt invalid due.
     *
     * @param gmtInvalidDue the gmt invalid due
     */
    public void setGmtInvalidDue(String gmtInvalidDue) {
		this.gmtInvalidDue = gmtInvalidDue;
	}

    /**
     * Gets gmt sign.
     *
     * @return the gmt sign
     */
    public Date getGmtSign() {
		return this.gmtSign;
	}

    /**
     * Sets gmt sign.
     *
     * @param gmtSign the gmt sign
     */
    public void setGmtSign(Date gmtSign) {
		this.gmtSign = gmtSign;
	}

    /**
     * Gets gmt vald due.
     *
     * @return the gmt vald due
     */
    public String getGmtValdDue() {
		return this.gmtValdDue;
	}

    /**
     * Sets gmt vald due.
     *
     * @param gmtValdDue the gmt vald due
     */
    public void setGmtValdDue(String gmtValdDue) {
		this.gmtValdDue = gmtValdDue;
	}

    /**
     * Gets gmt vrsn.
     *
     * @return the gmt vrsn
     */
    public Date getGmtVrsn() {
		return this.gmtVrsn;
	}

    /**
     * Sets gmt vrsn.
     *
     * @param gmtVrsn the gmt vrsn
     */
    public void setGmtVrsn(Date gmtVrsn) {
		this.gmtVrsn = gmtVrsn;
	}

    /**
     * Gets ip role id.
     *
     * @return the ip role id
     */
    public String getIpRoleId() {
		return this.ipRoleId;
	}

    /**
     * Sets ip role id.
     *
     * @param ipRoleId the ip role id
     */
    public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

    /**
     * Gets last moder.
     *
     * @return the last moder
     */
    public String getLastModer() {
		return this.lastModer;
	}

    /**
     * Sets last moder.
     *
     * @param lastModer the last moder
     */
    public void setLastModer(String lastModer) {
		this.lastModer = lastModer;
	}

    /**
     * Gets mark type.
     *
     * @return the mark type
     */
    public String getMarkType() {
		return this.markType;
	}

    /**
     * Sets mark type.
     *
     * @param markType the mark type
     */
    public void setMarkType(String markType) {
		this.markType = markType;
	}

    /**
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo() {
		return this.memo;
	}

    /**
     * Sets memo.
     *
     * @param memo the memo
     */
    public void setMemo(String memo) {
		this.memo = memo;
	}

    /**
     * Gets moder type.
     *
     * @return the moder type
     */
    public String getModerType() {
		return this.moderType;
	}

    /**
     * Sets moder type.
     *
     * @param moderType the moder type
     */
    public void setModerType(String moderType) {
		this.moderType = moderType;
	}

    /**
     * Gets pd mark.
     *
     * @return the pd mark
     */
    public String getPdMark() {
		return this.pdMark;
	}

    /**
     * Sets pd mark.
     *
     * @param pdMark the pd mark
     */
    public void setPdMark(String pdMark) {
		this.pdMark = pdMark;
	}

    /**
     * Gets prod code.
     *
     * @return the prod code
     */
    public String getProdCode() {
		return this.prodCode;
	}

    /**
     * Sets prod code.
     *
     * @param prodCode the prod code
     */
    public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

    /**
     * Gets prod name.
     *
     * @return the prod name
     */
    public String getProdName() {
		return this.prodName;
	}

    /**
     * Sets prod name.
     *
     * @param prodName the prod name
     */
    public void setProdName(String prodName) {
		this.prodName = prodName;
	}

    /**
     * Gets prod version.
     *
     * @return the prod version
     */
    public String getProdVersion() {
		return this.prodVersion;
	}

    /**
     * Sets prod version.
     *
     * @param prodVersion the prod version
     */
    public void setProdVersion(String prodVersion) {
		this.prodVersion = prodVersion;
	}

    /**
     * Gets ps code.
     *
     * @return the ps code
     */
    public String getPsCode() {
		return this.psCode;
	}

    /**
     * Sets ps code.
     *
     * @param psCode the ps code
     */
    public void setPsCode(String psCode) {
		this.psCode = psCode;
	}

    /**
     * Gets ps id.
     *
     * @return the ps id
     */
    public String getPsId() {
		return this.psId;
	}

    /**
     * Sets ps id.
     *
     * @param psId the ps id
     */
    public void setPsId(String psId) {
		this.psId = psId;
	}

    /**
     * Gets ps name.
     *
     * @return the ps name
     */
    public String getPsName() {
		return this.psName;
	}

    /**
     * Sets ps name.
     *
     * @param psName the ps name
     */
    public void setPsName(String psName) {
		this.psName = psName;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets template prod code.
     *
     * @return the template prod code
     */
    public String getTemplateProdCode() {
		return this.templateProdCode;
	}

    /**
     * Sets template prod code.
     *
     * @param templateProdCode the template prod code
     */
    public void setTemplateProdCode(String templateProdCode) {
		this.templateProdCode = templateProdCode;
	}

    /**
     * Gets template prod version.
     *
     * @return the template prod version
     */
    public String getTemplateProdVersion() {
		return this.templateProdVersion;
	}

    /**
     * Sets template prod version.
     *
     * @param templateProdVersion the template prod version
     */
    public void setTemplateProdVersion(String templateProdVersion) {
		this.templateProdVersion = templateProdVersion;
	}

}
