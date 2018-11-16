package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业代理收单接口
 *
 * @author auto create
 * @since 1.0, 2017-05-10 11:09:03
 */
public class AlipayCommerceTradeApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7114455934541183213L;

	/**
	 * 订单费用详情，用于在订单确认页面展示
	 */
	@ApiField("amount_detail")
	private String amountDetail;

	/**
	 * 接口请求渠道编码，由支付宝提供
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 接口版本号
	 */
	@ApiField("interface_version")
	private String interfaceVersion;

	/**
	 * 用于标识操作模型，由支付宝配置提供
	 */
	@ApiField("op_code")
	private String opCode;

	/**
	 * 场景的数据表示. json 数组格式，根据场景不同的模型传入不同参数，由支付宝负责提供参数集合
	 */
	@ApiField("order_detail")
	private String orderDetail;

	/**
	 * 用于标识数据模型，由支付宝配置提供
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 场景覆盖的目标人群标识，支持支付宝userId、身份证号、支付宝登录号、支付宝绑定手机号；
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 场景覆盖人群id类型
	 */
	@ApiField("target_id_type")
	private String targetIdType;

	/**
	 * 交易请求参数
	 */
	@ApiField("trade_apply_params")
	private TradeApplyParams tradeApplyParams;

    /**
     * Gets amount detail.
     *
     * @return the amount detail
     */
    public String getAmountDetail() {
		return this.amountDetail;
	}

    /**
     * Sets amount detail.
     *
     * @param amountDetail the amount detail
     */
    public void setAmountDetail(String amountDetail) {
		this.amountDetail = amountDetail;
	}

    /**
     * Gets channel.
     *
     * @return the channel
     */
    public String getChannel() {
		return this.channel;
	}

    /**
     * Sets channel.
     *
     * @param channel the channel
     */
    public void setChannel(String channel) {
		this.channel = channel;
	}

    /**
     * Gets interface version.
     *
     * @return the interface version
     */
    public String getInterfaceVersion() {
		return this.interfaceVersion;
	}

    /**
     * Sets interface version.
     *
     * @param interfaceVersion the interface version
     */
    public void setInterfaceVersion(String interfaceVersion) {
		this.interfaceVersion = interfaceVersion;
	}

    /**
     * Gets op code.
     *
     * @return the op code
     */
    public String getOpCode() {
		return this.opCode;
	}

    /**
     * Sets op code.
     *
     * @param opCode the op code
     */
    public void setOpCode(String opCode) {
		this.opCode = opCode;
	}

    /**
     * Gets order detail.
     *
     * @return the order detail
     */
    public String getOrderDetail() {
		return this.orderDetail;
	}

    /**
     * Sets order detail.
     *
     * @param orderDetail the order detail
     */
    public void setOrderDetail(String orderDetail) {
		this.orderDetail = orderDetail;
	}

    /**
     * Gets scene code.
     *
     * @return the scene code
     */
    public String getSceneCode() {
		return this.sceneCode;
	}

    /**
     * Sets scene code.
     *
     * @param sceneCode the scene code
     */
    public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

    /**
     * Gets target id.
     *
     * @return the target id
     */
    public String getTargetId() {
		return this.targetId;
	}

    /**
     * Sets target id.
     *
     * @param targetId the target id
     */
    public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

    /**
     * Gets target id type.
     *
     * @return the target id type
     */
    public String getTargetIdType() {
		return this.targetIdType;
	}

    /**
     * Sets target id type.
     *
     * @param targetIdType the target id type
     */
    public void setTargetIdType(String targetIdType) {
		this.targetIdType = targetIdType;
	}

    /**
     * Gets trade apply params.
     *
     * @return the trade apply params
     */
    public TradeApplyParams getTradeApplyParams() {
		return this.tradeApplyParams;
	}

    /**
     * Sets trade apply params.
     *
     * @param tradeApplyParams the trade apply params
     */
    public void setTradeApplyParams(TradeApplyParams tradeApplyParams) {
		this.tradeApplyParams = tradeApplyParams;
	}

}
