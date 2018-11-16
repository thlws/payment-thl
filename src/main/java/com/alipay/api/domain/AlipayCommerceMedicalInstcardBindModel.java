package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于支付宝用户通过医院服务窗绑定当地社保卡
 *
 * @author auto create
 * @since 1.0, 2017-09-27 13:28:10
 */
public class AlipayCommerceMedicalInstcardBindModel extends AlipayObject {

	private static final long serialVersionUID = 4561331933824493941L;

	/**
	 * 区域编码，使用国家行政区划代码，可参看
http://www.stats.gov.cn/tjsj/tjbz/xzqhdm
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 业务扩展参数
sys_service_provider_id:返佣商户标记
serial_no:商户业务序列号
return_params:外部商户提交给支付宝处理的请求参数,支付宝在整个处理过程中携带此参数。
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 支付宝处理完请求后，如验证成功，当前页面自动跳转到商户网站里指定页面的http路径。
	 */
	@ApiField("return_url")
	private String returnUrl;

    /**
     * Gets city code.
     *
     * @return the city code
     */
    public String getCityCode() {
		return this.cityCode;
	}

    /**
     * Sets city code.
     *
     * @param cityCode the city code
     */
    public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

    /**
     * Gets extend params.
     *
     * @return the extend params
     */
    public String getExtendParams() {
		return this.extendParams;
	}

    /**
     * Sets extend params.
     *
     * @param extendParams the extend params
     */
    public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

    /**
     * Gets return url.
     *
     * @return the return url
     */
    public String getReturnUrl() {
		return this.returnUrl;
	}

    /**
     * Sets return url.
     *
     * @param returnUrl the return url
     */
    public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

}
