package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.pdeduct.sign.add response.
 *
 * @author auto create
 * @since 1.0, 2018-05-16 11:50:00
 */
public class AlipayEbppPdeductSignAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 5116888497659993793L;

	/** 
	 * 支付宝代扣协议ID
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/** 
	 * 支付宝协议状态。签约成功则返回success
	 */
	@ApiField("agreement_status")
	private String agreementStatus;

	/** 
	 * 扩展参数，可为空
	 */
	@ApiField("extend_field")
	private String extendField;

	/** 
	 * 通知方式设置。
	 */
	@ApiField("notify_config")
	private String notifyConfig;

	/** 
	 * 商户生成的代扣协议ID
	 */
	@ApiField("out_agreement_id")
	private String outAgreementId;

	/** 
	 * 支付方式设置
	 */
	@ApiListField("pay_config")
	@ApiField("string")
	private List<String> payConfig;

	/** 
	 * 签约时间
	 */
	@ApiField("sign_date")
	private String signDate;

    /**
     * Sets agreement id.
     *
     * @param agreementId the agreement id
     */
    public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

    /**
     * Gets agreement id.
     *
     * @return the agreement id
     */
    public String getAgreementId( ) {
		return this.agreementId;
	}

    /**
     * Sets agreement status.
     *
     * @param agreementStatus the agreement status
     */
    public void setAgreementStatus(String agreementStatus) {
		this.agreementStatus = agreementStatus;
	}

    /**
     * Gets agreement status.
     *
     * @return the agreement status
     */
    public String getAgreementStatus( ) {
		return this.agreementStatus;
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
     * Gets extend field.
     *
     * @return the extend field
     */
    public String getExtendField( ) {
		return this.extendField;
	}

    /**
     * Sets notify config.
     *
     * @param notifyConfig the notify config
     */
    public void setNotifyConfig(String notifyConfig) {
		this.notifyConfig = notifyConfig;
	}

    /**
     * Gets notify config.
     *
     * @return the notify config
     */
    public String getNotifyConfig( ) {
		return this.notifyConfig;
	}

    /**
     * Sets out agreement id.
     *
     * @param outAgreementId the out agreement id
     */
    public void setOutAgreementId(String outAgreementId) {
		this.outAgreementId = outAgreementId;
	}

    /**
     * Gets out agreement id.
     *
     * @return the out agreement id
     */
    public String getOutAgreementId( ) {
		return this.outAgreementId;
	}

    /**
     * Sets pay config.
     *
     * @param payConfig the pay config
     */
    public void setPayConfig(List<String> payConfig) {
		this.payConfig = payConfig;
	}

    /**
     * Gets pay config.
     *
     * @return the pay config
     */
    public List<String> getPayConfig( ) {
		return this.payConfig;
	}

    /**
     * Sets sign date.
     *
     * @param signDate the sign date
     */
    public void setSignDate(String signDate) {
		this.signDate = signDate;
	}

    /**
     * Gets sign date.
     *
     * @return the sign date
     */
    public String getSignDate( ) {
		return this.signDate;
	}

}
