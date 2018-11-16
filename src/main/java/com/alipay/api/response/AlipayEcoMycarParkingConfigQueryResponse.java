package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InterfaceInfoList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.config.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayEcoMycarParkingConfigQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1182348823768779826L;

	/** 
	 * 签约支付宝账号，开发者通过ISV系统配置信息注册接口(alipay.eco.mycar.parking.config.set)传入的参数值
	 */
	@ApiField("account_no")
	private String accountNo;

	/** 
	 * 业务接口列表数据
Json格式数据
	 */
	@ApiField("interface_info_list")
	private InterfaceInfoList interfaceInfoList;

	/** 
	 * 商户在停车平台首页露出的LOGO链接地址，开发者通过ISV系统配置信息注册接口(alipay.eco.mycar.parking.config.set)调用自动生成该链接
	 */
	@ApiField("merchant_logo")
	private String merchantLogo;

	/** 
	 * 商户简称，开发者通过ISV系统配置信息注册接口(alipay.eco.mycar.parking.config.set)传入的参数值
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/** 
	 * 商户客服电话，开发者通过ISV系统配置信息注册接口(alipay.eco.mycar.parking.config.set)传入的参数值
	 */
	@ApiField("merchant_service_phone")
	private String merchantServicePhone;

    /**
     * Sets account no.
     *
     * @param accountNo the account no
     */
    public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

    /**
     * Gets account no.
     *
     * @return the account no
     */
    public String getAccountNo( ) {
		return this.accountNo;
	}

    /**
     * Sets interface info list.
     *
     * @param interfaceInfoList the interface info list
     */
    public void setInterfaceInfoList(InterfaceInfoList interfaceInfoList) {
		this.interfaceInfoList = interfaceInfoList;
	}

    /**
     * Gets interface info list.
     *
     * @return the interface info list
     */
    public InterfaceInfoList getInterfaceInfoList( ) {
		return this.interfaceInfoList;
	}

    /**
     * Sets merchant logo.
     *
     * @param merchantLogo the merchant logo
     */
    public void setMerchantLogo(String merchantLogo) {
		this.merchantLogo = merchantLogo;
	}

    /**
     * Gets merchant logo.
     *
     * @return the merchant logo
     */
    public String getMerchantLogo( ) {
		return this.merchantLogo;
	}

    /**
     * Sets merchant name.
     *
     * @param merchantName the merchant name
     */
    public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

    /**
     * Gets merchant name.
     *
     * @return the merchant name
     */
    public String getMerchantName( ) {
		return this.merchantName;
	}

    /**
     * Sets merchant service phone.
     *
     * @param merchantServicePhone the merchant service phone
     */
    public void setMerchantServicePhone(String merchantServicePhone) {
		this.merchantServicePhone = merchantServicePhone;
	}

    /**
     * Gets merchant service phone.
     *
     * @return the merchant service phone
     */
    public String getMerchantServicePhone( ) {
		return this.merchantServicePhone;
	}

}
