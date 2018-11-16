package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗行业挂号报备接口
 *
 * @author auto create
 * @since 1.0, 2018-09-12 16:58:43
 */
public class AlipayCommerceMedicalInformationUploadModel extends AlipayObject {

	private static final long serialVersionUID = 4224158318433763175L;

	/**
	 * 支付授权码
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 支付场景（默认为条形码）
条码支付，取值：bar_code
声波支付，取值：wave_code
二维码支付，取值qr_code
	 */
	@ApiField("auth_type")
	private String authType;

	/**
	 * 上报明细：
挂号场景：挂号科室名
线下药店：药品名称
	 */
	@ApiField("body")
	private String body;

	/**
	 * 买家id
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 业务扩展参数
系统商编号:sys_service_provider_id
该参数作为系统商返佣数据提取的依据，请填写系统商签约协议的PID
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 外部生成时间。 格式为 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_out_create")
	private Date gmtOutCreate;

	/**
	 * 上报行业：
药店：STORE
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 是否医保业务
是：T
不是：F
	 */
	@ApiField("is_insurance")
	private String isInsurance;

	/**
	 * 医保卡卡机构内部ID号
	 */
	@ApiField("medical_card_id")
	private String medicalCardId;

	/**
	 * 医保机构的编号
	 */
	@ApiField("medical_card_inst_id")
	private String medicalCardInstId;

	/**
	 * 医疗机构名称
	 */
	@ApiField("org_name")
	private String orgName;

	/**
	 * 医疗机构编码(医保局分配)
	 */
	@ApiField("org_no")
	private String orgNo;

	/**
	 * 商户订单号，64个字符以内、可包含字母、数字、下划线；需保证在商户端不重复。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 患者证件号码
	 */
	@ApiField("patient_card_no")
	private String patientCardNo;

	/**
	 * 患者证件类型
	 */
	@ApiField("patient_card_type")
	private String patientCardType;

	/**
	 * 患者手机号
	 */
	@ApiField("patient_mobile")
	private String patientMobile;

	/**
	 * 患者姓名
患者姓名&患者证件和医保卡信息全部匹配才能使用医保，否则认为套保嫌疑不允许医保只能自费
	 */
	@ApiField("patient_name")
	private String patientName;

	/**
	 * 如果需要医保支付这个字段必传。业务报文，报文中可包含多条业务数据
	 */
	@ApiField("request_content")
	private String requestContent;

	/**
	 * 场景，取值：REGISTRATION(挂号)
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 卖家支付宝用户ID，如果该值为空，则默认为商户签约账号对应的支付宝用户ID
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 业务流水号
	 */
	@ApiField("serial_no")
	private String serialNo;

	/**
	 * 主题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 金额，单位元
	 */
	@ApiField("total_amount")
	private String totalAmount;

    /**
     * Gets auth code.
     *
     * @return the auth code
     */
    public String getAuthCode() {
		return this.authCode;
	}

    /**
     * Sets auth code.
     *
     * @param authCode the auth code
     */
    public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

    /**
     * Gets auth type.
     *
     * @return the auth type
     */
    public String getAuthType() {
		return this.authType;
	}

    /**
     * Sets auth type.
     *
     * @param authType the auth type
     */
    public void setAuthType(String authType) {
		this.authType = authType;
	}

    /**
     * Gets body.
     *
     * @return the body
     */
    public String getBody() {
		return this.body;
	}

    /**
     * Sets body.
     *
     * @param body the body
     */
    public void setBody(String body) {
		this.body = body;
	}

    /**
     * Gets buyer id.
     *
     * @return the buyer id
     */
    public String getBuyerId() {
		return this.buyerId;
	}

    /**
     * Sets buyer id.
     *
     * @param buyerId the buyer id
     */
    public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

    /**
     * Gets extend params.
     *
     * @return the extend params
     */
    public String getExtendParams() {
		return this.extendParams;
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
     * Gets gmt out create.
     *
     * @return the gmt out create
     */
    public Date getGmtOutCreate() {
		return this.gmtOutCreate;
	}

    /**
     * Sets gmt out create.
     *
     * @param gmtOutCreate the gmt out create
     */
    public void setGmtOutCreate(Date gmtOutCreate) {
		this.gmtOutCreate = gmtOutCreate;
	}

    /**
     * Gets industry.
     *
     * @return the industry
     */
    public String getIndustry() {
		return this.industry;
	}

    /**
     * Sets industry.
     *
     * @param industry the industry
     */
    public void setIndustry(String industry) {
		this.industry = industry;
	}

    /**
     * Gets is insurance.
     *
     * @return the is insurance
     */
    public String getIsInsurance() {
		return this.isInsurance;
	}

    /**
     * Sets is insurance.
     *
     * @param isInsurance the is insurance
     */
    public void setIsInsurance(String isInsurance) {
		this.isInsurance = isInsurance;
	}

    /**
     * Gets medical card id.
     *
     * @return the medical card id
     */
    public String getMedicalCardId() {
		return this.medicalCardId;
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
     * Gets medical card inst id.
     *
     * @return the medical card inst id
     */
    public String getMedicalCardInstId() {
		return this.medicalCardInstId;
	}

    /**
     * Sets medical card inst id.
     *
     * @param medicalCardInstId the medical card inst id
     */
    public void setMedicalCardInstId(String medicalCardInstId) {
		this.medicalCardInstId = medicalCardInstId;
	}

    /**
     * Gets org name.
     *
     * @return the org name
     */
    public String getOrgName() {
		return this.orgName;
	}

    /**
     * Sets org name.
     *
     * @param orgName the org name
     */
    public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

    /**
     * Gets org no.
     *
     * @return the org no
     */
    public String getOrgNo() {
		return this.orgNo;
	}

    /**
     * Sets org no.
     *
     * @param orgNo the org no
     */
    public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}

    /**
     * Gets out trade no.
     *
     * @return the out trade no
     */
    public String getOutTradeNo() {
		return this.outTradeNo;
	}

    /**
     * Sets out trade no.
     *
     * @param outTradeNo the out trade no
     */
    public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

    /**
     * Gets patient card no.
     *
     * @return the patient card no
     */
    public String getPatientCardNo() {
		return this.patientCardNo;
	}

    /**
     * Sets patient card no.
     *
     * @param patientCardNo the patient card no
     */
    public void setPatientCardNo(String patientCardNo) {
		this.patientCardNo = patientCardNo;
	}

    /**
     * Gets patient card type.
     *
     * @return the patient card type
     */
    public String getPatientCardType() {
		return this.patientCardType;
	}

    /**
     * Sets patient card type.
     *
     * @param patientCardType the patient card type
     */
    public void setPatientCardType(String patientCardType) {
		this.patientCardType = patientCardType;
	}

    /**
     * Gets patient mobile.
     *
     * @return the patient mobile
     */
    public String getPatientMobile() {
		return this.patientMobile;
	}

    /**
     * Sets patient mobile.
     *
     * @param patientMobile the patient mobile
     */
    public void setPatientMobile(String patientMobile) {
		this.patientMobile = patientMobile;
	}

    /**
     * Gets patient name.
     *
     * @return the patient name
     */
    public String getPatientName() {
		return this.patientName;
	}

    /**
     * Sets patient name.
     *
     * @param patientName the patient name
     */
    public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

    /**
     * Gets request content.
     *
     * @return the request content
     */
    public String getRequestContent() {
		return this.requestContent;
	}

    /**
     * Sets request content.
     *
     * @param requestContent the request content
     */
    public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
	}

    /**
     * Gets scene.
     *
     * @return the scene
     */
    public String getScene() {
		return this.scene;
	}

    /**
     * Sets scene.
     *
     * @param scene the scene
     */
    public void setScene(String scene) {
		this.scene = scene;
	}

    /**
     * Gets seller id.
     *
     * @return the seller id
     */
    public String getSellerId() {
		return this.sellerId;
	}

    /**
     * Sets seller id.
     *
     * @param sellerId the seller id
     */
    public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

    /**
     * Gets serial no.
     *
     * @return the serial no
     */
    public String getSerialNo() {
		return this.serialNo;
	}

    /**
     * Sets serial no.
     *
     * @param serialNo the serial no
     */
    public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

    /**
     * Gets subject.
     *
     * @return the subject
     */
    public String getSubject() {
		return this.subject;
	}

    /**
     * Sets subject.
     *
     * @param subject the subject
     */
    public void setSubject(String subject) {
		this.subject = subject;
	}

    /**
     * Gets total amount.
     *
     * @return the total amount
     */
    public String getTotalAmount() {
		return this.totalAmount;
	}

    /**
     * Sets total amount.
     *
     * @param totalAmount the total amount
     */
    public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
