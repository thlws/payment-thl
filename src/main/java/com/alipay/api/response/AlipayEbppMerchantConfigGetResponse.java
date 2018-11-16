package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MerchantInstConfig;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.merchant.config.get response.
 *
 * @author auto create
 * @since 1.0, 2017-04-07 17:12:49
 */
public class AlipayEbppMerchantConfigGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8785789898478763938L;

	/** 
	 * 商户机构配置信息
	 */
	@ApiListField("inst_configs")
	@ApiField("merchant_inst_config")
	private List<MerchantInstConfig> instConfigs;

	/** 
	 * 商户的用户ID
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

    /**
     * Sets inst configs.
     *
     * @param instConfigs the inst configs
     */
    public void setInstConfigs(List<MerchantInstConfig> instConfigs) {
		this.instConfigs = instConfigs;
	}

    /**
     * Gets inst configs.
     *
     * @return the inst configs
     */
    public List<MerchantInstConfig> getInstConfigs( ) {
		return this.instConfigs;
	}

    /**
     * Sets merchant user id.
     *
     * @param merchantUserId the merchant user id
     */
    public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

    /**
     * Gets merchant user id.
     *
     * @return the merchant user id
     */
    public String getMerchantUserId( ) {
		return this.merchantUserId;
	}

}
