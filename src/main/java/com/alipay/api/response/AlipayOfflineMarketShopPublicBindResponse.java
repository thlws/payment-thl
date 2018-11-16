package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.shop.public.bind response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayOfflineMarketShopPublicBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 1197198421257678527L;

	/** 
	 * 绑定失败的店铺ID列表
	 */
	@ApiListField("error_binding_shop_ids")
	@ApiField("string")
	private List<String> errorBindingShopIds;

	/** 
	 * 数字类型，标示总的绑定错误总数
	 */
	@ApiField("total_error")
	private Long totalError;

	/** 
	 * 绑定店铺总成功数
	 */
	@ApiField("total_success")
	private Long totalSuccess;

    /**
     * Sets error binding shop ids.
     *
     * @param errorBindingShopIds the error binding shop ids
     */
    public void setErrorBindingShopIds(List<String> errorBindingShopIds) {
		this.errorBindingShopIds = errorBindingShopIds;
	}

    /**
     * Gets error binding shop ids.
     *
     * @return the error binding shop ids
     */
    public List<String> getErrorBindingShopIds( ) {
		return this.errorBindingShopIds;
	}

    /**
     * Sets total error.
     *
     * @param totalError the total error
     */
    public void setTotalError(Long totalError) {
		this.totalError = totalError;
	}

    /**
     * Gets total error.
     *
     * @return the total error
     */
    public Long getTotalError( ) {
		return this.totalError;
	}

    /**
     * Sets total success.
     *
     * @param totalSuccess the total success
     */
    public void setTotalSuccess(Long totalSuccess) {
		this.totalSuccess = totalSuccess;
	}

    /**
     * Gets total success.
     *
     * @return the total success
     */
    public Long getTotalSuccess( ) {
		return this.totalSuccess;
	}

}
