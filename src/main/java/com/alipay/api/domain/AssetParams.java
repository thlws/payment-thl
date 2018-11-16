package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资产信息
 *
 * @author auto create
 * @since 1.0, 2017-07-11 14:32:14
 */
public class AssetParams extends AlipayObject {

	private static final long serialVersionUID = 5337296564364371117L;

	/**
	 * 资产类型：
1. BANK（银行卡）
2. ACCOUNT（账号模式）
	 */
	@ApiField("asset_type")
	private String assetType;

	/**
	 * 银行卡号。
assetType为BANK时，必填。
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 机构ID。
assetType为BANK时，必填。
	 */
	@ApiField("inst_id")
	private String instId;

    /**
     * Gets asset type.
     *
     * @return the asset type
     */
    public String getAssetType() {
		return this.assetType;
	}

    /**
     * Sets asset type.
     *
     * @param assetType the asset type
     */
    public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

    /**
     * Gets card no.
     *
     * @return the card no
     */
    public String getCardNo() {
		return this.cardNo;
	}

    /**
     * Sets card no.
     *
     * @param cardNo the card no
     */
    public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

    /**
     * Gets inst id.
     *
     * @return the inst id
     */
    public String getInstId() {
		return this.instId;
	}

    /**
     * Sets inst id.
     *
     * @param instId the inst id
     */
    public void setInstId(String instId) {
		this.instId = instId;
	}

}
