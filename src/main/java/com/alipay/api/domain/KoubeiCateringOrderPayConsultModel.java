package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 餐饮pos业务订单优惠咨询
 *
 * @author auto create
 * @since 1.0, 2018-05-28 13:31:03
 */
public class KoubeiCateringOrderPayConsultModel extends AlipayObject {

	private static final long serialVersionUID = 6535185367511694887L;

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
	 * 菜明细列表，size>=1 && size <=100
	 */
	@ApiListField("dish_details")
	@ApiField("kb_pos_order_dish_detail")
	private List<KbPosOrderDishDetail> dishDetails;

	/**
	 * 是否享受会员价。如果为true，菜明细里面会按照会员价（没有改价情况下）作为单品价格咨询单品券优惠
	 */
	@ApiField("member_flag")
	private Boolean memberFlag;

	/**
	 * 其他费用
	 */
	@ApiField("other_amount")
	private String otherAmount;

	/**
	 * 打包费
	 */
	@ApiField("packing_amount")
	private String packingAmount;

	/**
	 * 唯一请求id，开放者请确保每次请求的唯一性
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 服务费
	 */
	@ApiField("service_amount")
	private String serviceAmount;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 付款总金额。需要确保：
1、付款总金额≤菜明细需付款金额总和+服务费+打包费+其他费用；
2、付款总金额≥菜明细需付款金额总和。
注：如果存在整单优惠场景，付款总金额不满足上述2条件，建议走单品改价优惠模式，修改单个菜品的金额达到优惠目的。
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 蚂蚁统一会员ID
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
     * Gets dish details.
     *
     * @return the dish details
     */
    public List<KbPosOrderDishDetail> getDishDetails() {
		return this.dishDetails;
	}

    /**
     * Sets dish details.
     *
     * @param dishDetails the dish details
     */
    public void setDishDetails(List<KbPosOrderDishDetail> dishDetails) {
		this.dishDetails = dishDetails;
	}

    /**
     * Gets member flag.
     *
     * @return the member flag
     */
    public Boolean getMemberFlag() {
		return this.memberFlag;
	}

    /**
     * Sets member flag.
     *
     * @param memberFlag the member flag
     */
    public void setMemberFlag(Boolean memberFlag) {
		this.memberFlag = memberFlag;
	}

    /**
     * Gets other amount.
     *
     * @return the other amount
     */
    public String getOtherAmount() {
		return this.otherAmount;
	}

    /**
     * Sets other amount.
     *
     * @param otherAmount the other amount
     */
    public void setOtherAmount(String otherAmount) {
		this.otherAmount = otherAmount;
	}

    /**
     * Gets packing amount.
     *
     * @return the packing amount
     */
    public String getPackingAmount() {
		return this.packingAmount;
	}

    /**
     * Sets packing amount.
     *
     * @param packingAmount the packing amount
     */
    public void setPackingAmount(String packingAmount) {
		this.packingAmount = packingAmount;
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
     * Gets service amount.
     *
     * @return the service amount
     */
    public String getServiceAmount() {
		return this.serviceAmount;
	}

    /**
     * Sets service amount.
     *
     * @param serviceAmount the service amount
     */
    public void setServiceAmount(String serviceAmount) {
		this.serviceAmount = serviceAmount;
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
