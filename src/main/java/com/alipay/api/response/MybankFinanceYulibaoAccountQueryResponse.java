package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.YLBProfitDetailInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.finance.yulibao.account.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-08 17:32:11
 */
public class MybankFinanceYulibaoAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8679259968918148917L;

	/** 
	 * 可用份额，单位为元
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/** 
	 * 业务冻结份额，单位为元
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

	/** 
	 * 系统冻结份额，单位为元（建议不展示给用户）
	 */
	@ApiField("sys_freeze_amount")
	private String sysFreezeAmount;

	/** 
	 * 余利宝总余额，单位为元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 余利宝收益详情
	 */
	@ApiField("ylb_profit_detail_info")
	private YLBProfitDetailInfo ylbProfitDetailInfo;

    /**
     * Sets available amount.
     *
     * @param availableAmount the available amount
     */
    public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}

    /**
     * Gets available amount.
     *
     * @return the available amount
     */
    public String getAvailableAmount( ) {
		return this.availableAmount;
	}

    /**
     * Sets freeze amount.
     *
     * @param freezeAmount the freeze amount
     */
    public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
	}

    /**
     * Gets freeze amount.
     *
     * @return the freeze amount
     */
    public String getFreezeAmount( ) {
		return this.freezeAmount;
	}

    /**
     * Sets sys freeze amount.
     *
     * @param sysFreezeAmount the sys freeze amount
     */
    public void setSysFreezeAmount(String sysFreezeAmount) {
		this.sysFreezeAmount = sysFreezeAmount;
	}

    /**
     * Gets sys freeze amount.
     *
     * @return the sys freeze amount
     */
    public String getSysFreezeAmount( ) {
		return this.sysFreezeAmount;
	}

    /**
     * Sets total amount.
     *
     * @param totalAmount the total amount
     */
    public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

    /**
     * Gets total amount.
     *
     * @return the total amount
     */
    public String getTotalAmount( ) {
		return this.totalAmount;
	}

    /**
     * Sets ylb profit detail info.
     *
     * @param ylbProfitDetailInfo the ylb profit detail info
     */
    public void setYlbProfitDetailInfo(YLBProfitDetailInfo ylbProfitDetailInfo) {
		this.ylbProfitDetailInfo = ylbProfitDetailInfo;
	}

    /**
     * Gets ylb profit detail info.
     *
     * @return the ylb profit detail info
     */
    public YLBProfitDetailInfo getYlbProfitDetailInfo( ) {
		return this.ylbProfitDetailInfo;
	}

}
