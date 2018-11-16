package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝pass更新卡券实例接口
 *
 * @author auto create
 * @since 1.0, 2018-01-09 22:28:38
 */
public class AlipayPassInstanceUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 5874776317865718296L;

	/**
	 * 代理商代替商户发放卡券后，再代替商户更新卡券时，此值为商户的pid/appid
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 商户指定卡券唯一值，卡券JSON模板中fileInfo->serialNumber字段对应的值
	 */
	@ApiField("serial_number")
	private String serialNumber;

	/**
	 * 券状态，支持更新为USED、CLOSED两种状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 模版动态参数信息：对应模板中$变量名$的动态参数，见模板创建接口返回值中的tpl_params字段
	 */
	@ApiField("tpl_params")
	private String tplParams;

	/**
	 * 核销码串值【当状态变更为USED时，建议传】
	 */
	@ApiField("verify_code")
	private String verifyCode;

	/**
	 * 核销方式，目前支持：wave（声波方式）、qrcode（二维码方式）、barcode（条码方式）、input（文本方式，即手工输入方式）。verify_code和verify_type需同时传入
	 */
	@ApiField("verify_type")
	private String verifyType;

    /**
     * Gets channel id.
     *
     * @return the channel id
     */
    public String getChannelId() {
		return this.channelId;
	}

    /**
     * Sets channel id.
     *
     * @param channelId the channel id
     */
    public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

    /**
     * Gets serial number.
     *
     * @return the serial number
     */
    public String getSerialNumber() {
		return this.serialNumber;
	}

    /**
     * Sets serial number.
     *
     * @param serialNumber the serial number
     */
    public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
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

    /**
     * Gets verify code.
     *
     * @return the verify code
     */
    public String getVerifyCode() {
		return this.verifyCode;
	}

    /**
     * Sets verify code.
     *
     * @param verifyCode the verify code
     */
    public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

    /**
     * Gets verify type.
     *
     * @return the verify type
     */
    public String getVerifyType() {
		return this.verifyType;
	}

    /**
     * Sets verify type.
     *
     * @param verifyType the verify type
     */
    public void setVerifyType(String verifyType) {
		this.verifyType = verifyType;
	}

}
