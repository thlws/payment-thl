package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑订单预咨询
 *
 * @author auto create
 * @since 1.0, 2017-11-01 11:23:03
 */
public class KoubeiTradeOrderConsultModel extends AlipayObject {

	private static final long serialVersionUID = 6419461959655288927L;

	/**
	 * 用户设备信息,通过钱包容器提供的JSAPI接口获取，
一、接口使用方法：
AlipayJSBridge.call('getO2ODeviceToken', {
                appName: 'kb_isv_110229',
                appKey:'98y6VvdaDLpoqWZw'
            },
            function (result) {
                 }
        );
    });
二、result数据结构：
 1、调用失败： {"error":xxx,"errorMessage":"xxx"}  
 2、调用成功： {'appToken':'xxxssajkjkjkxdkwqkqwb'}
	 */
	@ApiField("apdid_token")
	private String apdidToken;

	/**
	 * 商品明细列表。注意：单品总金额不能大于订单金额
	 */
	@ApiListField("goods_info")
	@ApiField("goods_info")
	private List<GoodsInfo> goodsInfo;

	/**
	 * 唯一请求id，开放者请确保每次请求的唯一性
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 支付宝门店编号
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 订单总金额，单位元，精确到小数点后两位，取值范围[0.01,999999999]
如果同时传入了【不可打折金额】，【订单总金额】两者，则必须满足【不可打折金额】<=【订单总金额】
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 不可打折金额，单位为元，精确到小数点后两位，取值范围[0,999999999]
如果同时传入了【不可打折金额】、【订单总金额】，则必须满足【不可打折金额】<=【订单总金额】
	 */
	@ApiField("undiscountable_amount")
	private String undiscountableAmount;

	/**
	 * 支付宝用户Id
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets apdid token.
     *
     * @return the apdid token
     */
    public String getApdidToken() {
		return this.apdidToken;
	}

    /**
     * Sets apdid token.
     *
     * @param apdidToken the apdid token
     */
    public void setApdidToken(String apdidToken) {
		this.apdidToken = apdidToken;
	}

    /**
     * Gets goods info.
     *
     * @return the goods info
     */
    public List<GoodsInfo> getGoodsInfo() {
		return this.goodsInfo;
	}

    /**
     * Sets goods info.
     *
     * @param goodsInfo the goods info
     */
    public void setGoodsInfo(List<GoodsInfo> goodsInfo) {
		this.goodsInfo = goodsInfo;
	}

    /**
     * Gets request id.
     *
     * @return the request id
     */
    public String getRequestId() {
		return this.requestId;
	}

    /**
     * Sets request id.
     *
     * @param requestId the request id
     */
    public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

    /**
     * Gets shop id.
     *
     * @return the shop id
     */
    public String getShopId() {
		return this.shopId;
	}

    /**
     * Sets shop id.
     *
     * @param shopId the shop id
     */
    public void setShopId(String shopId) {
		this.shopId = shopId;
	}

    /**
     * Gets total amount.
     *
     * @return the total amount
     */
    public String getTotalAmount() {
		return this.totalAmount;
	}

    /**
     * Sets total amount.
     *
     * @param totalAmount the total amount
     */
    public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

    /**
     * Gets undiscountable amount.
     *
     * @return the undiscountable amount
     */
    public String getUndiscountableAmount() {
		return this.undiscountableAmount;
	}

    /**
     * Sets undiscountable amount.
     *
     * @param undiscountableAmount the undiscountable amount
     */
    public void setUndiscountableAmount(String undiscountableAmount) {
		this.undiscountableAmount = undiscountableAmount;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
