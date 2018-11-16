package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.batch.createorder response.
 *
 * @author auto create
 * @since 1.0, 2017-02-22 15:58:25
 */
public class AlipayFundTransBatchCreateorderResponse extends AlipayResponse {

	private static final long serialVersionUID = 2828939115633416167L;

	/** 
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 扩展信息；创建付款单时传入的相关数据
	 */
	@ApiField("ext_param")
	private String extParam;

	/** 
	 * 单据号
	 */
	@ApiField("transfer_no")
	private String transferNo;

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType( ) {
		return this.bizType;
	}

    /**
     * Sets ext param.
     *
     * @param extParam the ext param
     */
    public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

    /**
     * Gets ext param.
     *
     * @return the ext param
     */
    public String getExtParam( ) {
		return this.extParam;
	}

    /**
     * Sets transfer no.
     *
     * @param transferNo the transfer no
     */
    public void setTransferNo(String transferNo) {
		this.transferNo = transferNo;
	}

    /**
     * Gets transfer no.
     *
     * @return the transfer no
     */
    public String getTransferNo( ) {
		return this.transferNo;
	}

}
