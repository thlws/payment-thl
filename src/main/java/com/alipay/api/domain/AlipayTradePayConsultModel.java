package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 统一收单支付能力咨询
 *
 * @author auto create
 * @since 1.0, 2018-02-06 19:29:12
 */
public class AlipayTradePayConsultModel extends AlipayObject {

	private static final long serialVersionUID = 2592229882465178327L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号。用户签约成功后时，协议号会返回给商户。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 商户申请额度，商户端根据实际需要来赋值。
	 */
	@ApiField("apply_amount")
	private String applyAmount;

	/**
	 * 业务场景，用于区分商户具体的咨询类型。ENJOY_CONSULT：兜底资金咨询；FUND_BILL_CONSULT资金渠道咨询
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 买家的支付宝用户id，用户签约成功后，会返回给商户。
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 支付咨询阶段。在支付过程中，用于区分商户发起咨询的阶段。BEFORE_PAY：支付前咨询；AFTER_PAY：支付后咨询
	 */
	@ApiField("consult_phase")
	private String consultPhase;

	/**
	 * 扩展参数，必须是json格式
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 此参数值取商户签约销售方案时的销售产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 商户端生成唯一标识，64个字符以内、可包含字母、数字、下划线；需保证在商户端不重复
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 订单标题，商户端描述该次咨询对应的基本订单信息。
	 */
	@ApiField("subject")
	private String subject;

    /**
     * Gets agreement no.
     *
     * @return the agreement no
     */
    public String getAgreementNo() {
		return this.agreementNo;
	}

    /**
     * Sets agreement no.
     *
     * @param agreementNo the agreement no
     */
    public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

    /**
     * Gets apply amount.
     *
     * @return the apply amount
     */
    public String getApplyAmount() {
		return this.applyAmount;
	}

    /**
     * Sets apply amount.
     *
     * @param applyAmount the apply amount
     */
    public void setApplyAmount(String applyAmount) {
		this.applyAmount = applyAmount;
	}

    /**
     * Gets biz scene.
     *
     * @return the biz scene
     */
    public String getBizScene() {
		return this.bizScene;
	}

    /**
     * Sets biz scene.
     *
     * @param bizScene the biz scene
     */
    public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
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
     * Gets consult phase.
     *
     * @return the consult phase
     */
    public String getConsultPhase() {
		return this.consultPhase;
	}

    /**
     * Sets consult phase.
     *
     * @param consultPhase the consult phase
     */
    public void setConsultPhase(String consultPhase) {
		this.consultPhase = consultPhase;
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
     * Gets product code.
     *
     * @return the product code
     */
    public String getProductCode() {
		return this.productCode;
	}

    /**
     * Sets product code.
     *
     * @param productCode the product code
     */
    public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

    /**
     * Gets request no.
     *
     * @return the request no
     */
    public String getRequestNo() {
		return this.requestNo;
	}

    /**
     * Sets request no.
     *
     * @param requestNo the request no
     */
    public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
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

}
