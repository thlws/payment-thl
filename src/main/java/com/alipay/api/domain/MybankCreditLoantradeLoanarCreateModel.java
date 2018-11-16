package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 机构代客户签署合约并放款
 *
 * @author auto create
 * @since 1.0, 2018-07-26 14:23:16
 */
public class MybankCreditLoantradeLoanarCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4628352152151851214L;

	/**
	 * 收款账号外标
对于支付宝账户，支付宝loginId；
对于网商银行账户，是虚拟卡号；
对于外部银行卡，是银行卡号
	 */
	@ApiField("account_ext_no")
	private String accountExtNo;

	/**
	 * 收款方参与机构码，当收款账户为网商银行或外部银行时填充，即银行联行号（总行）
	 */
	@ApiField("account_fin_code")
	private String accountFinCode;

	/**
	 * 收款方机构名称
	 */
	@ApiField("account_fin_name")
	private String accountFinName;

	/**
	 * 帐户类别，对公/对私，枚举值如下：
1：对私 
2：对公
	 */
	@ApiField("account_fin_type")
	private String accountFinType;

	/**
	 * 收款方名称
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 收款方账户号
对于支付宝账户，是支付宝会员id；
对于网商银行账户，是资金账号id；
对于外部银行卡，是银行卡号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 收款方账户类型，枚举值有：
ALIPAY（支付宝）
MY_BANK（网商银行）
OUT_BANK（外部银行）
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 本次发起支用的客户支付宝会员id，客户登录系统后由外部机构传入
	 */
	@ApiField("alipay_id")
	private String alipayId;

	/**
	 * 支用金额，默认人民币，精确到小数点两位，单位元
	 */
	@ApiField("apply_amt")
	private String applyAmt;

	/**
	 * 外部业务单据号，在外部机构上发生的交易编号，如在菜鸟供销平台上发生的采购单的业务编号
	 */
	@ApiField("bsn_no")
	private String bsnNo;

	/**
	 * 此字段主要是为了兼容新老逻辑，原来的签约并放款是由bkloanfront自己做了两阶段提交事务一致性处理，后面统一交给bkloantrade系统，如果为NEW则代表走bkloantrade去签约并放款，为空或者其他则保持原来逻辑不变
	 */
	@ApiField("bsn_type")
	private String bsnType;

	/**
	 * 本次支用的授信编号，网商银行审批通过后回传给外部机构，然后由外部机构传入
	 */
	@ApiField("credit_no")
	private String creditNo;

	/**
	 * 客户群体，由网商银行事先分配给客户机构
	 */
	@ApiField("cust_group")
	private String custGroup;

	/**
	 * 放款账户渠道，从贷款方案查询接口获取
DEFAULT_ALIPAY 默认支付宝
ASSIGNED_ACCOUNT 定向支付账户
MYBANK_ACCOUNT 网商银行二类户
	 */
	@ApiField("grant_channel")
	private String grantChannel;

	/**
	 * 经营行业，枚举值如下：
F5199：零售
H6190：餐饮住宿
L7299：商业服务
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 网商银行参与者id，外部机构调用创建网商会员接口获取，参见接口：mybank.credit.user.role.create
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 网商银行参与者会员角色ID，外部机构调用创建网商会员接口获取，参见接口：mybank.credit.user.role.create
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 本次支用的授信对应的BC政策码，由网商银行事先分配给外部机构
	 */
	@ApiField("loan_policy_code")
	private String loanPolicyCode;

	/**
	 * 贷款期限
	 */
	@ApiField("loan_term")
	private Long loanTerm;

	/**
	 * 贷款期限单位，枚举值：
Y：年
M：月
D：日
	 */
	@ApiField("loan_term_unit")
	private String loanTermUnit;

	/**
	 * 是否需要校验同名账户，默认是校验
	 */
	@ApiField("need_check_account_same_name")
	private Boolean needCheckAccountSameName;

	/**
	 * 是否需要签署合同，默认是签署
	 */
	@ApiField("need_sign_contract")
	private Boolean needSignContract;

	/**
	 * 客户签约的销售产品编码，由网商银行事先分配给外部机构
	 */
	@ApiField("pd_code")
	private String pdCode;

	/**
	 * 客户签约的销售产品版本号，通过调用完整贷款方案（mybank.credit.loantrade.loanscheme.full.query）查询接口获取
	 */
	@ApiField("pd_version")
	private String pdVersion;

	/**
	 * 放款用的营销工具ID列表，例如打折卡ID列表
	 */
	@ApiListField("promo_tools")
	@ApiField("string")
	private List<String> promoTools;

	/**
	 * 还款账户
	 */
	@ApiField("repay_account")
	private MyBkAccountVO repayAccount;

	/**
	 * 还款方式，枚举值如下：
1：等额本息
2：等额本金
3：按期付息到期还本
4：组合还款
6：一次性到期还本付息
7：固定利息等额分期
	 */
	@ApiField("repay_mode")
	private String repayMode;

	/**
	 * 单次请求唯一流水号，用于幂等控制
结构为：客户机构ipRoleId_时间（日期、时分秒）_外部系统流水号
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 签名值
	 */
	@ApiField("sign")
	private String sign;

	/**
	 * 交易备注
	 */
	@ApiField("trans_memo")
	private String transMemo;

    /**
     * Gets account ext no.
     *
     * @return the account ext no
     */
    public String getAccountExtNo() {
		return this.accountExtNo;
	}

    /**
     * Sets account ext no.
     *
     * @param accountExtNo the account ext no
     */
    public void setAccountExtNo(String accountExtNo) {
		this.accountExtNo = accountExtNo;
	}

    /**
     * Gets account fin code.
     *
     * @return the account fin code
     */
    public String getAccountFinCode() {
		return this.accountFinCode;
	}

    /**
     * Sets account fin code.
     *
     * @param accountFinCode the account fin code
     */
    public void setAccountFinCode(String accountFinCode) {
		this.accountFinCode = accountFinCode;
	}

    /**
     * Gets account fin name.
     *
     * @return the account fin name
     */
    public String getAccountFinName() {
		return this.accountFinName;
	}

    /**
     * Sets account fin name.
     *
     * @param accountFinName the account fin name
     */
    public void setAccountFinName(String accountFinName) {
		this.accountFinName = accountFinName;
	}

    /**
     * Gets account fin type.
     *
     * @return the account fin type
     */
    public String getAccountFinType() {
		return this.accountFinType;
	}

    /**
     * Sets account fin type.
     *
     * @param accountFinType the account fin type
     */
    public void setAccountFinType(String accountFinType) {
		this.accountFinType = accountFinType;
	}

    /**
     * Gets account name.
     *
     * @return the account name
     */
    public String getAccountName() {
		return this.accountName;
	}

    /**
     * Sets account name.
     *
     * @param accountName the account name
     */
    public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

    /**
     * Gets account no.
     *
     * @return the account no
     */
    public String getAccountNo() {
		return this.accountNo;
	}

    /**
     * Sets account no.
     *
     * @param accountNo the account no
     */
    public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

    /**
     * Gets account type.
     *
     * @return the account type
     */
    public String getAccountType() {
		return this.accountType;
	}

    /**
     * Sets account type.
     *
     * @param accountType the account type
     */
    public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

    /**
     * Gets alipay id.
     *
     * @return the alipay id
     */
    public String getAlipayId() {
		return this.alipayId;
	}

    /**
     * Sets alipay id.
     *
     * @param alipayId the alipay id
     */
    public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}

    /**
     * Gets apply amt.
     *
     * @return the apply amt
     */
    public String getApplyAmt() {
		return this.applyAmt;
	}

    /**
     * Sets apply amt.
     *
     * @param applyAmt the apply amt
     */
    public void setApplyAmt(String applyAmt) {
		this.applyAmt = applyAmt;
	}

    /**
     * Gets bsn no.
     *
     * @return the bsn no
     */
    public String getBsnNo() {
		return this.bsnNo;
	}

    /**
     * Sets bsn no.
     *
     * @param bsnNo the bsn no
     */
    public void setBsnNo(String bsnNo) {
		this.bsnNo = bsnNo;
	}

    /**
     * Gets bsn type.
     *
     * @return the bsn type
     */
    public String getBsnType() {
		return this.bsnType;
	}

    /**
     * Sets bsn type.
     *
     * @param bsnType the bsn type
     */
    public void setBsnType(String bsnType) {
		this.bsnType = bsnType;
	}

    /**
     * Gets credit no.
     *
     * @return the credit no
     */
    public String getCreditNo() {
		return this.creditNo;
	}

    /**
     * Sets credit no.
     *
     * @param creditNo the credit no
     */
    public void setCreditNo(String creditNo) {
		this.creditNo = creditNo;
	}

    /**
     * Gets cust group.
     *
     * @return the cust group
     */
    public String getCustGroup() {
		return this.custGroup;
	}

    /**
     * Sets cust group.
     *
     * @param custGroup the cust group
     */
    public void setCustGroup(String custGroup) {
		this.custGroup = custGroup;
	}

    /**
     * Gets grant channel.
     *
     * @return the grant channel
     */
    public String getGrantChannel() {
		return this.grantChannel;
	}

    /**
     * Sets grant channel.
     *
     * @param grantChannel the grant channel
     */
    public void setGrantChannel(String grantChannel) {
		this.grantChannel = grantChannel;
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
     * Gets ip id.
     *
     * @return the ip id
     */
    public String getIpId() {
		return this.ipId;
	}

    /**
     * Sets ip id.
     *
     * @param ipId the ip id
     */
    public void setIpId(String ipId) {
		this.ipId = ipId;
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
     * Gets loan policy code.
     *
     * @return the loan policy code
     */
    public String getLoanPolicyCode() {
		return this.loanPolicyCode;
	}

    /**
     * Sets loan policy code.
     *
     * @param loanPolicyCode the loan policy code
     */
    public void setLoanPolicyCode(String loanPolicyCode) {
		this.loanPolicyCode = loanPolicyCode;
	}

    /**
     * Gets loan term.
     *
     * @return the loan term
     */
    public Long getLoanTerm() {
		return this.loanTerm;
	}

    /**
     * Sets loan term.
     *
     * @param loanTerm the loan term
     */
    public void setLoanTerm(Long loanTerm) {
		this.loanTerm = loanTerm;
	}

    /**
     * Gets loan term unit.
     *
     * @return the loan term unit
     */
    public String getLoanTermUnit() {
		return this.loanTermUnit;
	}

    /**
     * Sets loan term unit.
     *
     * @param loanTermUnit the loan term unit
     */
    public void setLoanTermUnit(String loanTermUnit) {
		this.loanTermUnit = loanTermUnit;
	}

    /**
     * Gets need check account same name.
     *
     * @return the need check account same name
     */
    public Boolean getNeedCheckAccountSameName() {
		return this.needCheckAccountSameName;
	}

    /**
     * Sets need check account same name.
     *
     * @param needCheckAccountSameName the need check account same name
     */
    public void setNeedCheckAccountSameName(Boolean needCheckAccountSameName) {
		this.needCheckAccountSameName = needCheckAccountSameName;
	}

    /**
     * Gets need sign contract.
     *
     * @return the need sign contract
     */
    public Boolean getNeedSignContract() {
		return this.needSignContract;
	}

    /**
     * Sets need sign contract.
     *
     * @param needSignContract the need sign contract
     */
    public void setNeedSignContract(Boolean needSignContract) {
		this.needSignContract = needSignContract;
	}

    /**
     * Gets pd code.
     *
     * @return the pd code
     */
    public String getPdCode() {
		return this.pdCode;
	}

    /**
     * Sets pd code.
     *
     * @param pdCode the pd code
     */
    public void setPdCode(String pdCode) {
		this.pdCode = pdCode;
	}

    /**
     * Gets pd version.
     *
     * @return the pd version
     */
    public String getPdVersion() {
		return this.pdVersion;
	}

    /**
     * Sets pd version.
     *
     * @param pdVersion the pd version
     */
    public void setPdVersion(String pdVersion) {
		this.pdVersion = pdVersion;
	}

    /**
     * Gets promo tools.
     *
     * @return the promo tools
     */
    public List<String> getPromoTools() {
		return this.promoTools;
	}

    /**
     * Sets promo tools.
     *
     * @param promoTools the promo tools
     */
    public void setPromoTools(List<String> promoTools) {
		this.promoTools = promoTools;
	}

    /**
     * Gets repay account.
     *
     * @return the repay account
     */
    public MyBkAccountVO getRepayAccount() {
		return this.repayAccount;
	}

    /**
     * Sets repay account.
     *
     * @param repayAccount the repay account
     */
    public void setRepayAccount(MyBkAccountVO repayAccount) {
		this.repayAccount = repayAccount;
	}

    /**
     * Gets repay mode.
     *
     * @return the repay mode
     */
    public String getRepayMode() {
		return this.repayMode;
	}

    /**
     * Sets repay mode.
     *
     * @param repayMode the repay mode
     */
    public void setRepayMode(String repayMode) {
		this.repayMode = repayMode;
	}

    /**
     * Gets request id.
     *
     * @return the request id
     */
    public String getRequestId() {
		return this.requestId;
	}

    /**
     * Sets request id.
     *
     * @param requestId the request id
     */
    public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

    /**
     * Gets sign.
     *
     * @return the sign
     */
    public String getSign() {
		return this.sign;
	}

    /**
     * Sets sign.
     *
     * @param sign the sign
     */
    public void setSign(String sign) {
		this.sign = sign;
	}

    /**
     * Gets trans memo.
     *
     * @return the trans memo
     */
    public String getTransMemo() {
		return this.transMemo;
	}

    /**
     * Sets trans memo.
     *
     * @param transMemo the trans memo
     */
    public void setTransMemo(String transMemo) {
		this.transMemo = transMemo;
	}

}
