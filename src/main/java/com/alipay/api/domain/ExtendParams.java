package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务扩展参数
 *
 * @author auto create
 * @since 1.0, 2018-02-07 12:58:26
 */
public class ExtendParams extends AlipayObject {

	private static final long serialVersionUID = 4666654986258833297L;

	/**
	 * 卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 使用花呗分期要进行的分期数
	 */
	@ApiField("hb_fq_num")
	private String hbFqNum;

	/**
	 * 使用花呗分期需要卖家承担的手续费比例的百分值，传入100代表100%
	 */
	@ApiField("hb_fq_seller_percent")
	private String hbFqSellerPercent;

	/**
	 * 行业数据回流信息, 详见：地铁支付接口参数补充说明
	 */
	@ApiField("industry_reflux_info")
	private String industryRefluxInfo;

	/**
	 * 系统商编号
该参数作为系统商返佣数据提取的依据，请填写系统商签约协议的PID
	 */
	@ApiField("sys_service_provider_id")
	private String sysServiceProviderId;

    /**
     * Gets card type.
     *
     * @return the card type
     */
    public String getCardType() {
		return this.cardType;
	}

    /**
     * Sets card type.
     *
     * @param cardType the card type
     */
    public void setCardType(String cardType) {
		this.cardType = cardType;
	}

    /**
     * Gets hb fq num.
     *
     * @return the hb fq num
     */
    public String getHbFqNum() {
		return this.hbFqNum;
	}

    /**
     * Sets hb fq num.
     *
     * @param hbFqNum the hb fq num
     */
    public void setHbFqNum(String hbFqNum) {
		this.hbFqNum = hbFqNum;
	}

    /**
     * Gets hb fq seller percent.
     *
     * @return the hb fq seller percent
     */
    public String getHbFqSellerPercent() {
		return this.hbFqSellerPercent;
	}

    /**
     * Sets hb fq seller percent.
     *
     * @param hbFqSellerPercent the hb fq seller percent
     */
    public void setHbFqSellerPercent(String hbFqSellerPercent) {
		this.hbFqSellerPercent = hbFqSellerPercent;
	}

    /**
     * Gets industry reflux info.
     *
     * @return the industry reflux info
     */
    public String getIndustryRefluxInfo() {
		return this.industryRefluxInfo;
	}

    /**
     * Sets industry reflux info.
     *
     * @param industryRefluxInfo the industry reflux info
     */
    public void setIndustryRefluxInfo(String industryRefluxInfo) {
		this.industryRefluxInfo = industryRefluxInfo;
	}

    /**
     * Gets sys service provider id.
     *
     * @return the sys service provider id
     */
    public String getSysServiceProviderId() {
		return this.sysServiceProviderId;
	}

    /**
     * Sets sys service provider id.
     *
     * @param sysServiceProviderId the sys service provider id
     */
    public void setSysServiceProviderId(String sysServiceProviderId) {
		this.sysServiceProviderId = sysServiceProviderId;
	}

}
