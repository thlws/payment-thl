package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.NetValueVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.fund.fundnetvalues.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-03-02 18:06:11
 */
public class AlipayFinanceFundFundnetvaluesBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6183323216717284223L;

	/** 
	 * 基金代码
	 */
	@ApiField("fund_code")
	private String fundCode;

	/** 
	 * 基金类型，如：STOCK，BLEND，INDEX，BOND，CURRENCY，QDII，SHORTDATED，FOF
	 */
	@ApiField("fund_type")
	private String fundType;

	/** 
	 * 基金净值列表
	 */
	@ApiListField("net_values")
	@ApiField("net_value_v_o")
	private List<NetValueVO> netValues;

    /**
     * Sets fund code.
     *
     * @param fundCode the fund code
     */
    public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}

    /**
     * Gets fund code.
     *
     * @return the fund code
     */
    public String getFundCode( ) {
		return this.fundCode;
	}

    /**
     * Sets fund type.
     *
     * @param fundType the fund type
     */
    public void setFundType(String fundType) {
		this.fundType = fundType;
	}

    /**
     * Gets fund type.
     *
     * @return the fund type
     */
    public String getFundType( ) {
		return this.fundType;
	}

    /**
     * Sets net values.
     *
     * @param netValues the net values
     */
    public void setNetValues(List<NetValueVO> netValues) {
		this.netValues = netValues;
	}

    /**
     * Gets net values.
     *
     * @return the net values
     */
    public List<NetValueVO> getNetValues( ) {
		return this.netValues;
	}

}
