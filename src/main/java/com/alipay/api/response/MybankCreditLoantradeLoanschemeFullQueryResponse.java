package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Contract;
import com.alipay.api.domain.LoanScheme;
import com.alipay.api.domain.MyBkAccountVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.loanscheme.full.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-26 14:22:36
 */
public class MybankCreditLoantradeLoanschemeFullQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6758117169189278456L;

	/** 
	 * 贷款支用时涉及的合约列表
	 */
	@ApiListField("contract_list")
	@ApiField("contract")
	private List<Contract> contractList;

	/** 
	 * 对于返回的贷款方案、合约列表、收款信息等数字签名，防篡改，并确保用户看到的和系统后端处理的保持一致
	 */
	@ApiField("data_sign")
	private String dataSign;

	/** 
	 * 贷款方案，包含可贷额度、利率、期限、还款方式等贷款要素，在客户签署贷款协议时，展示这些信息给客户
	 */
	@ApiField("loan_scheme")
	private LoanScheme loanScheme;

	/** 
	 * 还款账户
	 */
	@ApiField("repay_account")
	private MyBkAccountVO repayAccount;

	/** 
	 * 收款账号信息
	 */
	@ApiField("trans_in_account")
	private MyBkAccountVO transInAccount;

    /**
     * Sets contract list.
     *
     * @param contractList the contract list
     */
    public void setContractList(List<Contract> contractList) {
		this.contractList = contractList;
	}

    /**
     * Gets contract list.
     *
     * @return the contract list
     */
    public List<Contract> getContractList( ) {
		return this.contractList;
	}

    /**
     * Sets data sign.
     *
     * @param dataSign the data sign
     */
    public void setDataSign(String dataSign) {
		this.dataSign = dataSign;
	}

    /**
     * Gets data sign.
     *
     * @return the data sign
     */
    public String getDataSign( ) {
		return this.dataSign;
	}

    /**
     * Sets loan scheme.
     *
     * @param loanScheme the loan scheme
     */
    public void setLoanScheme(LoanScheme loanScheme) {
		this.loanScheme = loanScheme;
	}

    /**
     * Gets loan scheme.
     *
     * @return the loan scheme
     */
    public LoanScheme getLoanScheme( ) {
		return this.loanScheme;
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
     * Gets repay account.
     *
     * @return the repay account
     */
    public MyBkAccountVO getRepayAccount( ) {
		return this.repayAccount;
	}

    /**
     * Sets trans in account.
     *
     * @param transInAccount the trans in account
     */
    public void setTransInAccount(MyBkAccountVO transInAccount) {
		this.transInAccount = transInAccount;
	}

    /**
     * Gets trans in account.
     *
     * @return the trans in account
     */
    public MyBkAccountVO getTransInAccount( ) {
		return this.transInAccount;
	}

}
