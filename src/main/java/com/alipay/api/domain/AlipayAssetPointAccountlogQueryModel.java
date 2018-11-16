package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户集分宝流水明细查询
 *
 * @author auto create
 * @since 1.0, 2016-05-25 12:03:12
 */
public class AlipayAssetPointAccountlogQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3136714745664872836L;

	/**
	 * 用户流水查询起始时间
	 */
	@ApiField("account_date_begin")
	private Date accountDateBegin;

	/**
	 * 用户流水查询结束时间
	 */
	@ApiField("account_date_end")
	private Date accountDateEnd;

	/**
	 * 分页查询的当前页号,从1开始
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/**
	 * 分页查询的单页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 子交易代码，标记大业务下的子业务，例如充值－外部商户发放，可选参数可以不传
	 */
	@ApiListField("sub_trans_code")
	@ApiField("string")
	private List<String> subTransCode;

	/**
	 * 主交易代码,例如支付、充值等，标记业务大类，可选参数可以不传
	 */
	@ApiListField("trans_code")
	@ApiField("string")
	private List<String> transCode;

	/**
	 * 用户标识符，用于指定集分宝发放的用户，和user_symbol_type一起使用，确定一个唯一的支付宝用户
	 */
	@ApiField("user_symbol")
	private String userSymbol;

	/**
	 * 用户标识符类型，
现在支持ALIPAY_USER_ID:表示支付宝用户ID,
ALIPAY_LOGON_ID:表示支付宝登陆号,
	 */
	@ApiField("user_symbol_type")
	private String userSymbolType;

    /**
     * Gets account date begin.
     *
     * @return the account date begin
     */
    public Date getAccountDateBegin() {
		return this.accountDateBegin;
	}

    /**
     * Sets account date begin.
     *
     * @param accountDateBegin the account date begin
     */
    public void setAccountDateBegin(Date accountDateBegin) {
		this.accountDateBegin = accountDateBegin;
	}

    /**
     * Gets account date end.
     *
     * @return the account date end
     */
    public Date getAccountDateEnd() {
		return this.accountDateEnd;
	}

    /**
     * Sets account date end.
     *
     * @param accountDateEnd the account date end
     */
    public void setAccountDateEnd(Date accountDateEnd) {
		this.accountDateEnd = accountDateEnd;
	}

    /**
     * Gets page number.
     *
     * @return the page number
     */
    public Long getPageNumber() {
		return this.pageNumber;
	}

    /**
     * Sets page number.
     *
     * @param pageNumber the page number
     */
    public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

    /**
     * Gets page size.
     *
     * @return the page size
     */
    public Long getPageSize() {
		return this.pageSize;
	}

    /**
     * Sets page size.
     *
     * @param pageSize the page size
     */
    public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

    /**
     * Gets sub trans code.
     *
     * @return the sub trans code
     */
    public List<String> getSubTransCode() {
		return this.subTransCode;
	}

    /**
     * Sets sub trans code.
     *
     * @param subTransCode the sub trans code
     */
    public void setSubTransCode(List<String> subTransCode) {
		this.subTransCode = subTransCode;
	}

    /**
     * Gets trans code.
     *
     * @return the trans code
     */
    public List<String> getTransCode() {
		return this.transCode;
	}

    /**
     * Sets trans code.
     *
     * @param transCode the trans code
     */
    public void setTransCode(List<String> transCode) {
		this.transCode = transCode;
	}

    /**
     * Gets user symbol.
     *
     * @return the user symbol
     */
    public String getUserSymbol() {
		return this.userSymbol;
	}

    /**
     * Sets user symbol.
     *
     * @param userSymbol the user symbol
     */
    public void setUserSymbol(String userSymbol) {
		this.userSymbol = userSymbol;
	}

    /**
     * Gets user symbol type.
     *
     * @return the user symbol type
     */
    public String getUserSymbolType() {
		return this.userSymbolType;
	}

    /**
     * Sets user symbol type.
     *
     * @param userSymbolType the user symbol type
     */
    public void setUserSymbolType(String userSymbolType) {
		this.userSymbolType = userSymbolType;
	}

}
