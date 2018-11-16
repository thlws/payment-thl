package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 多媒体afts平台视觉付交易初始化接口
 *
 * @author auto create
 * @since 1.0, 2018-07-13 10:34:44
 */
public class AlipayMsaasMediarecogAftscvpayTransactionInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 3854178246761182767L;

	/**
	 * 商品信息,列表
	 */
	@ApiListField("goods_infos")
	@ApiField("good_info")
	private List<GoodInfo> goodsInfos;

	/**
	 * 标识是什么场景下的视觉识别请求
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 售卖设备编号
	 */
	@ApiField("terminal_id")
	private String terminalId;

	/**
	 * 云平台请求唯一标示,保证用户请求的幂等性.
	 */
	@ApiField("transaction_id")
	private String transactionId;

    /**
     * Gets goods infos.
     *
     * @return the goods infos
     */
    public List<GoodInfo> getGoodsInfos() {
		return this.goodsInfos;
	}

    /**
     * Sets goods infos.
     *
     * @param goodsInfos the goods infos
     */
    public void setGoodsInfos(List<GoodInfo> goodsInfos) {
		this.goodsInfos = goodsInfos;
	}

    /**
     * Gets scene.
     *
     * @return the scene
     */
    public String getScene() {
		return this.scene;
	}

    /**
     * Sets scene.
     *
     * @param scene the scene
     */
    public void setScene(String scene) {
		this.scene = scene;
	}

    /**
     * Gets terminal id.
     *
     * @return the terminal id
     */
    public String getTerminalId() {
		return this.terminalId;
	}

    /**
     * Sets terminal id.
     *
     * @param terminalId the terminal id
     */
    public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

    /**
     * Gets transaction id.
     *
     * @return the transaction id
     */
    public String getTransactionId() {
		return this.transactionId;
	}

    /**
     * Sets transaction id.
     *
     * @param transactionId the transaction id
     */
    public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

}
