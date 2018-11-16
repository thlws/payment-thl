package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票信息回传接口（新版）
 *
 * @author auto create
 * @since 1.0, 2018-09-18 19:58:01
 */
public class AlipayEbppInvoiceInfoSendModel extends AlipayObject {

	private static final long serialVersionUID = 8526179328432651728L;

	/**
	 * 发票信息列表
	 */
	@ApiListField("invoice_info_list")
	@ApiField("invoice_send_open_model")
	private List<InvoiceSendOpenModel> invoiceInfoList;

	/**
	 * 开票商户品牌简称，与商户入驻时的品牌简称保持一致。
	 */
	@ApiField("m_short_name")
	private String mShortName;

	/**
	 * 开票商户门店简称，与商户入驻时的门店简称保持一致。
	 */
	@ApiField("sub_m_short_name")
	private String subMShortName;

    /**
     * Gets invoice info list.
     *
     * @return the invoice info list
     */
    public List<InvoiceSendOpenModel> getInvoiceInfoList() {
		return this.invoiceInfoList;
	}

    /**
     * Sets invoice info list.
     *
     * @param invoiceInfoList the invoice info list
     */
    public void setInvoiceInfoList(List<InvoiceSendOpenModel> invoiceInfoList) {
		this.invoiceInfoList = invoiceInfoList;
	}

    /**
     * Gets short name.
     *
     * @return the short name
     */
    public String getmShortName() {
		return this.mShortName;
	}

    /**
     * Sets short name.
     *
     * @param mShortName the m short name
     */
    public void setmShortName(String mShortName) {
		this.mShortName = mShortName;
	}

    /**
     * Gets sub m short name.
     *
     * @return the sub m short name
     */
    public String getSubMShortName() {
		return this.subMShortName;
	}

    /**
     * Sets sub m short name.
     *
     * @param subMShortName the sub m short name
     */
    public void setSubMShortName(String subMShortName) {
		this.subMShortName = subMShortName;
	}

}
