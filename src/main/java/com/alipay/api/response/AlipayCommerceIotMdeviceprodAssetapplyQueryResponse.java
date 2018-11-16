package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.mdeviceprod.assetapply.query response.
 *
 * @author auto create
 * @since 1.0, 2018-09-11 15:30:21
 */
public class AlipayCommerceIotMdeviceprodAssetapplyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6454165736152927371L;

	/** 
	 * 申请的服务商名称；
内部接口，给供应商系统调用
	 */
	@ApiField("apply_isv_name")
	private String applyIsvName;

	/** 
	 * 申请的服务商的PID
	 */
	@ApiField("apply_isv_pid")
	private String applyIsvPid;

	/** 
	 * 申请商户的手机
内部接口，给供应商系统使用
	 */
	@ApiField("apply_merchant_mobile")
	private String applyMerchantMobile;

	/** 
	 * 申请商户的名称;
内部接口，给供应商系统调用
	 */
	@ApiField("apply_merchant_name")
	private String applyMerchantName;

	/** 
	 * 申请商户的PID
	 */
	@ApiField("apply_merchant_pid")
	private String applyMerchantPid;

	/** 
	 * 物料申请人手机号；
内部接口，给供应商使用；
	 */
	@ApiField("apply_person_mobile")
	private String applyPersonMobile;

	/** 
	 * 物料申请人的名字；
内部使用接口，给供应商平台调用，需要展示申请人姓名
	 */
	@ApiField("apply_person_name")
	private String applyPersonName;

    /**
     * Sets apply isv name.
     *
     * @param applyIsvName the apply isv name
     */
    public void setApplyIsvName(String applyIsvName) {
		this.applyIsvName = applyIsvName;
	}

    /**
     * Gets apply isv name.
     *
     * @return the apply isv name
     */
    public String getApplyIsvName( ) {
		return this.applyIsvName;
	}

    /**
     * Sets apply isv pid.
     *
     * @param applyIsvPid the apply isv pid
     */
    public void setApplyIsvPid(String applyIsvPid) {
		this.applyIsvPid = applyIsvPid;
	}

    /**
     * Gets apply isv pid.
     *
     * @return the apply isv pid
     */
    public String getApplyIsvPid( ) {
		return this.applyIsvPid;
	}

    /**
     * Sets apply merchant mobile.
     *
     * @param applyMerchantMobile the apply merchant mobile
     */
    public void setApplyMerchantMobile(String applyMerchantMobile) {
		this.applyMerchantMobile = applyMerchantMobile;
	}

    /**
     * Gets apply merchant mobile.
     *
     * @return the apply merchant mobile
     */
    public String getApplyMerchantMobile( ) {
		return this.applyMerchantMobile;
	}

    /**
     * Sets apply merchant name.
     *
     * @param applyMerchantName the apply merchant name
     */
    public void setApplyMerchantName(String applyMerchantName) {
		this.applyMerchantName = applyMerchantName;
	}

    /**
     * Gets apply merchant name.
     *
     * @return the apply merchant name
     */
    public String getApplyMerchantName( ) {
		return this.applyMerchantName;
	}

    /**
     * Sets apply merchant pid.
     *
     * @param applyMerchantPid the apply merchant pid
     */
    public void setApplyMerchantPid(String applyMerchantPid) {
		this.applyMerchantPid = applyMerchantPid;
	}

    /**
     * Gets apply merchant pid.
     *
     * @return the apply merchant pid
     */
    public String getApplyMerchantPid( ) {
		return this.applyMerchantPid;
	}

    /**
     * Sets apply person mobile.
     *
     * @param applyPersonMobile the apply person mobile
     */
    public void setApplyPersonMobile(String applyPersonMobile) {
		this.applyPersonMobile = applyPersonMobile;
	}

    /**
     * Gets apply person mobile.
     *
     * @return the apply person mobile
     */
    public String getApplyPersonMobile( ) {
		return this.applyPersonMobile;
	}

    /**
     * Sets apply person name.
     *
     * @param applyPersonName the apply person name
     */
    public void setApplyPersonName(String applyPersonName) {
		this.applyPersonName = applyPersonName;
	}

    /**
     * Gets apply person name.
     *
     * @return the apply person name
     */
    public String getApplyPersonName( ) {
		return this.applyPersonName;
	}

}
