package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销抽奖活动凭证创建
 *
 * @author auto create
 * @since 1.0, 2017-03-23 14:21:57
 */
public class AlipayMarketingCampaignCertCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5625481939514765374L;

	/**
	 * 凭证批次名称
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 拓展信息
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 凭证有效次数，数值(最大为10000)
	 */
	@ApiField("valid_count")
	private String validCount;

    /**
     * Gets cert name.
     *
     * @return the cert name
     */
    public String getCertName() {
		return this.certName;
	}

    /**
     * Sets cert name.
     *
     * @param certName the cert name
     */
    public void setCertName(String certName) {
		this.certName = certName;
	}

    /**
     * Gets extend info.
     *
     * @return the extend info
     */
    public String getExtendInfo() {
		return this.extendInfo;
	}

    /**
     * Sets extend info.
     *
     * @param extendInfo the extend info
     */
    public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

    /**
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo() {
		return this.memo;
	}

    /**
     * Sets memo.
     *
     * @param memo the memo
     */
    public void setMemo(String memo) {
		this.memo = memo;
	}

    /**
     * Gets valid count.
     *
     * @return the valid count
     */
    public String getValidCount() {
		return this.validCount;
	}

    /**
     * Sets valid count.
     *
     * @param validCount the valid count
     */
    public void setValidCount(String validCount) {
		this.validCount = validCount;
	}

}
