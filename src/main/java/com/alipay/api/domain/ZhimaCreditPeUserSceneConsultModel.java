package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用受理评估接口（场景维度准入&盖帽额度咨询）
 *
 * @author auto create
 * @since 1.0, 2018-09-11 17:00:30
 */
public class ZhimaCreditPeUserSceneConsultModel extends AlipayObject {

	private static final long serialVersionUID = 4233362792296197423L;

	/**
	 * 买家的蚂蚁统一会员ID
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 芝麻信用类目码，由芝麻信用侧分配
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 芝麻信用场景，由芝麻信用侧分配，如：天猫信用购，淘宝租赁等
	 */
	@ApiField("credit_scene")
	private String creditScene;

	/**
	 * 业务扩展参数，json格式字符串，如果有需要，请提前联系开发人员沟通确定参数
	 */
	@ApiField("ext_params")
	private String extParams;

	/**
	 * 风险环境参数信息，json格式字符串，目前已知key如下：umid，设备指纹；imei，设备号；lbs，经纬度；ip，设备网络IP地址；wireless_mac，设备无线wifi mac；mac，设备网卡地址
	 */
	@ApiField("risk_info")
	private String riskInfo;

    /**
     * Gets buyer id.
     *
     * @return the buyer id
     */
    public String getBuyerId() {
		return this.buyerId;
	}

    /**
     * Sets buyer id.
     *
     * @param buyerId the buyer id
     */
    public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

    /**
     * Gets category code.
     *
     * @return the category code
     */
    public String getCategoryCode() {
		return this.categoryCode;
	}

    /**
     * Sets category code.
     *
     * @param categoryCode the category code
     */
    public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

    /**
     * Gets credit scene.
     *
     * @return the credit scene
     */
    public String getCreditScene() {
		return this.creditScene;
	}

    /**
     * Sets credit scene.
     *
     * @param creditScene the credit scene
     */
    public void setCreditScene(String creditScene) {
		this.creditScene = creditScene;
	}

    /**
     * Gets ext params.
     *
     * @return the ext params
     */
    public String getExtParams() {
		return this.extParams;
	}

    /**
     * Sets ext params.
     *
     * @param extParams the ext params
     */
    public void setExtParams(String extParams) {
		this.extParams = extParams;
	}

    /**
     * Gets risk info.
     *
     * @return the risk info
     */
    public String getRiskInfo() {
		return this.riskInfo;
	}

    /**
     * Sets risk info.
     *
     * @param riskInfo the risk info
     */
    public void setRiskInfo(String riskInfo) {
		this.riskInfo = riskInfo;
	}

}
