package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VoucherDetailInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.user.asset.query response.
 *
 * @author auto create
 * @since 1.0, 2018-03-21 15:19:49
 */
public class KoubeiMarketingCampaignUserAssetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6234362376274481523L;

	/** 
	 * 券资产详情信息
	 */
	@ApiListField("voucher_asset_list")
	@ApiField("voucher_detail_info")
	private List<VoucherDetailInfo> voucherAssetList;

	/** 
	 * 券资产数量
	 */
	@ApiField("voucher_asset_num")
	private Long voucherAssetNum;

    /**
     * Sets voucher asset list.
     *
     * @param voucherAssetList the voucher asset list
     */
    public void setVoucherAssetList(List<VoucherDetailInfo> voucherAssetList) {
		this.voucherAssetList = voucherAssetList;
	}

    /**
     * Gets voucher asset list.
     *
     * @return the voucher asset list
     */
    public List<VoucherDetailInfo> getVoucherAssetList( ) {
		return this.voucherAssetList;
	}

    /**
     * Sets voucher asset num.
     *
     * @param voucherAssetNum the voucher asset num
     */
    public void setVoucherAssetNum(Long voucherAssetNum) {
		this.voucherAssetNum = voucherAssetNum;
	}

    /**
     * Gets voucher asset num.
     *
     * @return the voucher asset num
     */
    public Long getVoucherAssetNum( ) {
		return this.voucherAssetNum;
	}

}
