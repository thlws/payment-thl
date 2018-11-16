package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝pass新建卡券实例接口
 *
 * @author auto create
 * @since 1.0, 2018-07-23 15:36:44
 */
public class AlipayPassInstanceAddModel extends AlipayObject {

	private static final long serialVersionUID = 2358739642712936361L;

	/**
	 * 支付宝用户识别信息：
包括partner_id（商户的签约账号）和out_trade_no（某笔订单号）
	 */
	@ApiField("recognition_info")
	private String recognitionInfo;

	/**
	 * Alipass添加对象识别类型：1–订单信息
	 */
	@ApiField("recognition_type")
	private String recognitionType;

	/**
	 * 支付宝pass模版ID
	 */
	@ApiField("tpl_id")
	private String tplId;

	/**
	 * 模版动态参数信息：对应模板中$变量名$的动态参数，见模板创建接口返回值中的tpl_params字段
	 */
	@ApiField("tpl_params")
	private String tplParams;

    /**
     * Gets recognition info.
     *
     * @return the recognition info
     */
    public String getRecognitionInfo() {
		return this.recognitionInfo;
	}

    /**
     * Sets recognition info.
     *
     * @param recognitionInfo the recognition info
     */
    public void setRecognitionInfo(String recognitionInfo) {
		this.recognitionInfo = recognitionInfo;
	}

    /**
     * Gets recognition type.
     *
     * @return the recognition type
     */
    public String getRecognitionType() {
		return this.recognitionType;
	}

    /**
     * Sets recognition type.
     *
     * @param recognitionType the recognition type
     */
    public void setRecognitionType(String recognitionType) {
		this.recognitionType = recognitionType;
	}

    /**
     * Gets tpl id.
     *
     * @return the tpl id
     */
    public String getTplId() {
		return this.tplId;
	}

    /**
     * Sets tpl id.
     *
     * @param tplId the tpl id
     */
    public void setTplId(String tplId) {
		this.tplId = tplId;
	}

    /**
     * Gets tpl params.
     *
     * @return the tpl params
     */
    public String getTplParams() {
		return this.tplParams;
	}

    /**
     * Sets tpl params.
     *
     * @param tplParams the tpl params
     */
    public void setTplParams(String tplParams) {
		this.tplParams = tplParams;
	}

}
