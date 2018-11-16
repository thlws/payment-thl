package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户批量入驻申请接口
 *
 * @author auto create
 * @since 1.0, 2018-07-20 14:21:27
 */
public class AlipayEbppInvoiceMerchantlistEnterApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2591416658512474667L;

	/**
	 * 商户品牌信息
	 */
	@ApiField("merchant_base")
	private MerchantBaseEnterOpenModel merchantBase;

	/**
	 * 商户门店入驻产品公共信息
	 */
	@ApiField("sub_merchant_common_info")
	private SubMerchantCommonEnterOpenModel subMerchantCommonInfo;

	/**
	 * 商户门店列表信息，最多传入30个门店信息
	 */
	@ApiListField("sub_merchant_list")
	@ApiField("sub_merchant_enter_open_model")
	private List<SubMerchantEnterOpenModel> subMerchantList;

    /**
     * Gets merchant base.
     *
     * @return the merchant base
     */
    public MerchantBaseEnterOpenModel getMerchantBase() {
		return this.merchantBase;
	}

    /**
     * Sets merchant base.
     *
     * @param merchantBase the merchant base
     */
    public void setMerchantBase(MerchantBaseEnterOpenModel merchantBase) {
		this.merchantBase = merchantBase;
	}

    /**
     * Gets sub merchant common info.
     *
     * @return the sub merchant common info
     */
    public SubMerchantCommonEnterOpenModel getSubMerchantCommonInfo() {
		return this.subMerchantCommonInfo;
	}

    /**
     * Sets sub merchant common info.
     *
     * @param subMerchantCommonInfo the sub merchant common info
     */
    public void setSubMerchantCommonInfo(SubMerchantCommonEnterOpenModel subMerchantCommonInfo) {
		this.subMerchantCommonInfo = subMerchantCommonInfo;
	}

    /**
     * Gets sub merchant list.
     *
     * @return the sub merchant list
     */
    public List<SubMerchantEnterOpenModel> getSubMerchantList() {
		return this.subMerchantList;
	}

    /**
     * Sets sub merchant list.
     *
     * @param subMerchantList the sub merchant list
     */
    public void setSubMerchantList(List<SubMerchantEnterOpenModel> subMerchantList) {
		this.subMerchantList = subMerchantList;
	}

}
