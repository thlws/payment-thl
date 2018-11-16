package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 代收付-申请接口
 *
 * @author auto create
 * @since 1.0, 2017-08-25 10:18:52
 */
public class MybankCreditLoantradePartnerPaymentApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1634222835693868369L;

	/**
	 * 业务金额，单位分
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 业务产品编码，64个字符以内
	 */
	@ApiField("biz_product_code")
	private String bizProductCode;

	/**
	 * 业务类型，目前只支持两种：REPAY（还款）,ENCASH（放款）
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 客户支付宝账户，与UID字段不能同时为空
	 */
	@ApiField("login_account")
	private String loginAccount;

	/**
	 * 网商业务订单号,64个字符以内、只能包含字母、数字、下划线；需保证在外部网商端不重复
	 */
	@ApiField("mybk_order_no")
	private String mybkOrderNo;

	/**
	 * 外部平台订单号,64个字符以内、只能包含字母、数字、下划线；需保证在外部平台端不重复
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 扩展参数，JSON格式，100个字符以内，在代收请求时需要附带期数信息在扩展参数中，代付的场景下是没有的,具体参数：tenor:期次
	 */
	@ApiField("out_param")
	private String outParam;

	/**
	 * 外部请求流水号,32个字符以内、只能包含字母、数字、下划线；需保证在外部平台端不重复
	 */
	@ApiField("out_seq_no")
	private String outSeqNo;

	/**
	 * 收款方列表
	 */
	@ApiListField("payee_account_list")
	@ApiField("payment_account_info")
	private List<PaymentAccountInfo> payeeAccountList;

	/**
	 * 付款方列表
	 */
	@ApiListField("payer_account_list")
	@ApiField("payment_account_info")
	private List<PaymentAccountInfo> payerAccountList;

	/**
	 * 代收付产品编码，64个字符以内
	 */
	@ApiField("payment_product_code")
	private String paymentProductCode;

	/**
	 * 客户支付宝账号数字ID，与支付宝账户字段不能同时为空
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public Long getAmount() {
		return this.amount;
	}

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(Long amount) {
		this.amount = amount;
	}

    /**
     * Gets biz product code.
     *
     * @return the biz product code
     */
    public String getBizProductCode() {
		return this.bizProductCode;
	}

    /**
     * Sets biz product code.
     *
     * @param bizProductCode the biz product code
     */
    public void setBizProductCode(String bizProductCode) {
		this.bizProductCode = bizProductCode;
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
     * Gets login account.
     *
     * @return the login account
     */
    public String getLoginAccount() {
		return this.loginAccount;
	}

    /**
     * Sets login account.
     *
     * @param loginAccount the login account
     */
    public void setLoginAccount(String loginAccount) {
		this.loginAccount = loginAccount;
	}

    /**
     * Gets mybk order no.
     *
     * @return the mybk order no
     */
    public String getMybkOrderNo() {
		return this.mybkOrderNo;
	}

    /**
     * Sets mybk order no.
     *
     * @param mybkOrderNo the mybk order no
     */
    public void setMybkOrderNo(String mybkOrderNo) {
		this.mybkOrderNo = mybkOrderNo;
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
     * Gets out param.
     *
     * @return the out param
     */
    public String getOutParam() {
		return this.outParam;
	}

    /**
     * Sets out param.
     *
     * @param outParam the out param
     */
    public void setOutParam(String outParam) {
		this.outParam = outParam;
	}

    /**
     * Gets out seq no.
     *
     * @return the out seq no
     */
    public String getOutSeqNo() {
		return this.outSeqNo;
	}

    /**
     * Sets out seq no.
     *
     * @param outSeqNo the out seq no
     */
    public void setOutSeqNo(String outSeqNo) {
		this.outSeqNo = outSeqNo;
	}

    /**
     * Gets payee account list.
     *
     * @return the payee account list
     */
    public List<PaymentAccountInfo> getPayeeAccountList() {
		return this.payeeAccountList;
	}

    /**
     * Sets payee account list.
     *
     * @param payeeAccountList the payee account list
     */
    public void setPayeeAccountList(List<PaymentAccountInfo> payeeAccountList) {
		this.payeeAccountList = payeeAccountList;
	}

    /**
     * Gets payer account list.
     *
     * @return the payer account list
     */
    public List<PaymentAccountInfo> getPayerAccountList() {
		return this.payerAccountList;
	}

    /**
     * Sets payer account list.
     *
     * @param payerAccountList the payer account list
     */
    public void setPayerAccountList(List<PaymentAccountInfo> payerAccountList) {
		this.payerAccountList = payerAccountList;
	}

    /**
     * Gets payment product code.
     *
     * @return the payment product code
     */
    public String getPaymentProductCode() {
		return this.paymentProductCode;
	}

    /**
     * Sets payment product code.
     *
     * @param paymentProductCode the payment product code
     */
    public void setPaymentProductCode(String paymentProductCode) {
		this.paymentProductCode = paymentProductCode;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
