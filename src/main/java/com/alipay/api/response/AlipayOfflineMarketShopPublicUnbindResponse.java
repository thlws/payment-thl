package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.shop.public.unbind response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayOfflineMarketShopPublicUnbindResponse extends AlipayResponse {

	private static final long serialVersionUID = 6111315636722464378L;

	/** 
	 * 绑定失败的店铺ID列表,绑定失败原因可能是：a)检测到shop_id不存在;b)检测到shop_id不属于当前商户；c）该门店ID已经绑定服务窗
	 */
	@ApiListField("error_un_binding_shop_ids")
	@ApiField("string")
	private List<String> errorUnBindingShopIds;

	/** 
	 * 总的基础绑定错误数
	 */
	@ApiField("total_error")
	private Long totalError;

	/** 
	 * 总的解除绑定成功数
	 */
	@ApiField("total_success")
	private Long totalSuccess;

    /**
     * Sets error un binding shop ids.
     *
     * @param errorUnBindingShopIds the error un binding shop ids
     */
    public void setErrorUnBindingShopIds(List<String> errorUnBindingShopIds) {
		this.errorUnBindingShopIds = errorUnBindingShopIds;
	}

    /**
     * Gets error un binding shop ids.
     *
     * @return the error un binding shop ids
     */
    public List<String> getErrorUnBindingShopIds( ) {
		return this.errorUnBindingShopIds;
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
