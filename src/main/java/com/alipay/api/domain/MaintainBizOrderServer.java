package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 洗车保养服务订单
 *
 * @author auto create
 * @since 1.0, 2017-04-12 11:48:53
 */
public class MaintainBizOrderServer extends AlipayObject {

	private static final long serialVersionUID = 1488158913892471866L;

	/**
	 * 车主平台服务子订单id
	 */
	@ApiField("order_server_id")
	private String orderServerId;

	/**
	 * 原始金额。服务对应原始价格。对应划掉的服务价格。金额单位(元)，保留两位小数。
	 */
	@ApiField("origin_cost")
	private String originCost;

	/**
	 * 外部服务商品编码。下单时记录ISV服务商品唯一标示。用于区分不同商品
	 */
	@ApiField("out_product_id")
	private String outProductId;

	/**
	 * 销售金额。服务真实售卖单价。金额单位(元)，保留两位小数。
	 */
	@ApiField("real_cost")
	private String realCost;

	/**
	 * 数量
	 */
	@ApiField("sale_num")
	private Long saleNum;

	/**
	 * 车主平台服务类目编号。  
洗车类：
4:普通洗车-5座
5:普通洗车-7座
6:精细洗车-5座
7:精细洗车-7座
保养类：
12:更换机油、机滤
4S保养类：
401001:更换机油(4S)  
401001:更换机油滤清器(4S)  
401001:更换油塞密封垫片(4S)
401001:更换空气滤清器(4S)  
401001:更换空调滤清器(4S)  
401001:更换燃油滤清器(4S)  
401001:更换制动液(4S)  
401001:更换火花塞(4S)  
401001:更换手动变速器油(4S)  
401001:更换自动变速箱油(4S)
401001:更换冷却液(4S)  
401001:更换转向油(4S)
401001:更换助力油(4S)
401001:发送机正时套件(4S)  
401001:碳罐(4S)  
401001:轮胎换位(4S)  
401001:离合器油(4S)  
401001:传动皮带套件(4S)  
401001:冷媒（4S） 
4S养护类：
402001:清洗节气门(4S)
402001:清洗喷油嘴(4S)
402001:清洗三元催化(4S)
402001:清洗进气道(4S)
402001:添加新车保护剂(4S)
402001:发动机润滑系统清洗(4S)
402001:发动机内部保护(4S)
	 */
	@ApiField("service_category_id")
	private Long serviceCategoryId;

    /**
     * Gets order server id.
     *
     * @return the order server id
     */
    public String getOrderServerId() {
		return this.orderServerId;
	}

    /**
     * Sets order server id.
     *
     * @param orderServerId the order server id
     */
    public void setOrderServerId(String orderServerId) {
		this.orderServerId = orderServerId;
	}

    /**
     * Gets origin cost.
     *
     * @return the origin cost
     */
    public String getOriginCost() {
		return this.originCost;
	}

    /**
     * Sets origin cost.
     *
     * @param originCost the origin cost
     */
    public void setOriginCost(String originCost) {
		this.originCost = originCost;
	}

    /**
     * Gets out product id.
     *
     * @return the out product id
     */
    public String getOutProductId() {
		return this.outProductId;
	}

    /**
     * Sets out product id.
     *
     * @param outProductId the out product id
     */
    public void setOutProductId(String outProductId) {
		this.outProductId = outProductId;
	}

    /**
     * Gets real cost.
     *
     * @return the real cost
     */
    public String getRealCost() {
		return this.realCost;
	}

    /**
     * Sets real cost.
     *
     * @param realCost the real cost
     */
    public void setRealCost(String realCost) {
		this.realCost = realCost;
	}

    /**
     * Gets sale num.
     *
     * @return the sale num
     */
    public Long getSaleNum() {
		return this.saleNum;
	}

    /**
     * Sets sale num.
     *
     * @param saleNum the sale num
     */
    public void setSaleNum(Long saleNum) {
		this.saleNum = saleNum;
	}

    /**
     * Gets service category id.
     *
     * @return the service category id
     */
    public Long getServiceCategoryId() {
		return this.serviceCategoryId;
	}

    /**
     * Sets service category id.
     *
     * @param serviceCategoryId the service category id
     */
    public void setServiceCategoryId(Long serviceCategoryId) {
		this.serviceCategoryId = serviceCategoryId;
	}

}
