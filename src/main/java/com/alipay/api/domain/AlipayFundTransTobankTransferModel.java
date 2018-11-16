package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单笔转账到银行账户接口
 *
 * @author auto create
 * @since 1.0, 2017-01-18 21:54:25
 */
public class AlipayFundTransTobankTransferModel extends AlipayObject {

	private static final long serialVersionUID = 3865227274977149389L;

	/**
	 * 转账金额，单位：元。
只支持2位小数，小数点前最大支持13位，金额必须大于0。
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 用途信息。
当转账金额大于5万且银行卡账户类型为对私时，必须传递本参数。
当付款方为企业账户，且转账金额达到（大于等于）50000元，memo和remark不能同时为空。
	1：代发工资协议和收款人清单
	2：奖励
	3：新闻版、演出等相关劳动合同
	4：证券、期货、信托等退款
	5：债权或产权转让协议
	6：借款合同
	7：保险合同
	8：税收征管部门的
	9：农、副、矿产品购销合同
	10：其他合法款项的
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户转账唯一订单号：发起转账来源方定义的转账单据ID，用于将转账回执通知给来源方。
不同来源方给出的ID可以重复，同一个来源方必须保证其ID的唯一性。
只支持半角英文、数字，及“-”、“_”。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 收款方银行账户名，必须与收款方银行卡号所属账户信息一致。
	 */
	@ApiField("payee_account_name")
	private String payeeAccountName;

	/**
	 * 收款账户类型。
	1：对公（在金融机构开设的公司账户）
	2：对私（在金融机构开设的个人账户）
	 */
	@ApiField("payee_account_type")
	private String payeeAccountType;

	/**
	 * 收款支行联行号：收款银行支行联行号（支持32个英文/16个汉字）。
	 */
	@ApiField("payee_bank_code")
	private String payeeBankCode;

	/**
	 * 收款方银行卡号信息，只支持半角英文、数字及“-”。
目前只支持借记卡卡号。
	 */
	@ApiField("payee_card_no")
	private String payeeCardNo;

	/**
	 * 收款银行所属支行（支持100个英文/50个汉字）。
	 */
	@ApiField("payee_inst_branch_name")
	private String payeeInstBranchName;

	/**
	 * 收款银行所在市（支持40个英文/20个汉字）。
	 */
	@ApiField("payee_inst_city")
	private String payeeInstCity;

	/**
	 * 收款卡开户银行（支持30个英文/15个汉字）。
	 */
	@ApiField("payee_inst_name")
	private String payeeInstName;

	/**
	 * 收款银行所在省份（支持20个英文/10个汉字）。
	 */
	@ApiField("payee_inst_province")
	private String payeeInstProvince;

	/**
	 * 付款方真实姓名（支持100个英文/50个汉字）。
如果不为空，则会校验该账户在支付宝登入的实名是否与付款方真实姓名一致。
	 */
	@ApiField("payer_real_name")
	private String payerRealName;

	/**
	 * 银行备注（支持100个英文/50个汉字），该信息将通过银行渠道发送给收款方。
当付款方为企业账户，且转账金额达到（大于等于）50000元，memo和remark不能同时为空。
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 申请到账时效。
	T0：当日到账
	T1：次日到账
	 */
	@ApiField("time_liness")
	private String timeLiness;

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public String getAmount() {
		return this.amount;
	}

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(String amount) {
		this.amount = amount;
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
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets payee account name.
     *
     * @return the payee account name
     */
    public String getPayeeAccountName() {
		return this.payeeAccountName;
	}

    /**
     * Sets payee account name.
     *
     * @param payeeAccountName the payee account name
     */
    public void setPayeeAccountName(String payeeAccountName) {
		this.payeeAccountName = payeeAccountName;
	}

    /**
     * Gets payee account type.
     *
     * @return the payee account type
     */
    public String getPayeeAccountType() {
		return this.payeeAccountType;
	}

    /**
     * Sets payee account type.
     *
     * @param payeeAccountType the payee account type
     */
    public void setPayeeAccountType(String payeeAccountType) {
		this.payeeAccountType = payeeAccountType;
	}

    /**
     * Gets payee bank code.
     *
     * @return the payee bank code
     */
    public String getPayeeBankCode() {
		return this.payeeBankCode;
	}

    /**
     * Sets payee bank code.
     *
     * @param payeeBankCode the payee bank code
     */
    public void setPayeeBankCode(String payeeBankCode) {
		this.payeeBankCode = payeeBankCode;
	}

    /**
     * Gets payee card no.
     *
     * @return the payee card no
     */
    public String getPayeeCardNo() {
		return this.payeeCardNo;
	}

    /**
     * Sets payee card no.
     *
     * @param payeeCardNo the payee card no
     */
    public void setPayeeCardNo(String payeeCardNo) {
		this.payeeCardNo = payeeCardNo;
	}

    /**
     * Gets payee inst branch name.
     *
     * @return the payee inst branch name
     */
    public String getPayeeInstBranchName() {
		return this.payeeInstBranchName;
	}

    /**
     * Sets payee inst branch name.
     *
     * @param payeeInstBranchName the payee inst branch name
     */
    public void setPayeeInstBranchName(String payeeInstBranchName) {
		this.payeeInstBranchName = payeeInstBranchName;
	}

    /**
     * Gets payee inst city.
     *
     * @return the payee inst city
     */
    public String getPayeeInstCity() {
		return this.payeeInstCity;
	}

    /**
     * Sets payee inst city.
     *
     * @param payeeInstCity the payee inst city
     */
    public void setPayeeInstCity(String payeeInstCity) {
		this.payeeInstCity = payeeInstCity;
	}

    /**
     * Gets payee inst name.
     *
     * @return the payee inst name
     */
    public String getPayeeInstName() {
		return this.payeeInstName;
	}

    /**
     * Sets payee inst name.
     *
     * @param payeeInstName the payee inst name
     */
    public void setPayeeInstName(String payeeInstName) {
		this.payeeInstName = payeeInstName;
	}

    /**
     * Gets payee inst province.
     *
     * @return the payee inst province
     */
    public String getPayeeInstProvince() {
		return this.payeeInstProvince;
	}

    /**
     * Sets payee inst province.
     *
     * @param payeeInstProvince the payee inst province
     */
    public void setPayeeInstProvince(String payeeInstProvince) {
		this.payeeInstProvince = payeeInstProvince;
	}

    /**
     * Gets payer real name.
     *
     * @return the payer real name
     */
    public String getPayerRealName() {
		return this.payerRealName;
	}

    /**
     * Sets payer real name.
     *
     * @param payerRealName the payer real name
     */
    public void setPayerRealName(String payerRealName) {
		this.payerRealName = payerRealName;
	}

    /**
     * Gets remark.
     *
     * @return the remark
     */
    public String getRemark() {
		return this.remark;
	}

    /**
     * Sets remark.
     *
     * @param remark the remark
     */
    public void setRemark(String remark) {
		this.remark = remark;
	}

    /**
     * Gets time liness.
     *
     * @return the time liness
     */
    public String getTimeLiness() {
		return this.timeLiness;
	}

    /**
     * Sets time liness.
     *
     * @param timeLiness the time liness
     */
    public void setTimeLiness(String timeLiness) {
		this.timeLiness = timeLiness;
	}

}
