package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保养订单状态更新
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:29:02
 */
public class AlipayEcoMycarMaintainOrderstatusUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 8875856664778172395L;

	/**
	 * 扩展参数
	 */
	@ApiField("ext_param")
	private MaintainOrderStatusExtParams extParam;

	/**
	 * 洗车-015；保养-016；4S-020
	 */
	@ApiField("industry_code")
	private String industryCode;

	/**
	 * 订单编号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 55-已核销；7-已出库；8-已收货
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 废弃
	 */
	@ApiField("type")
	private String type;

    /**
     * Gets ext param.
     *
     * @return the ext param
     */
    public MaintainOrderStatusExtParams getExtParam() {
		return this.extParam;
	}

    /**
     * Sets ext param.
     *
     * @param extParam the ext param
     */
    public void setExtParam(MaintainOrderStatusExtParams extParam) {
		this.extParam = extParam;
	}

    /**
     * Gets industry code.
     *
     * @return the industry code
     */
    public String getIndustryCode() {
		return this.industryCode;
	}

    /**
     * Sets industry code.
     *
     * @param industryCode the industry code
     */
    public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}

    /**
     * Gets order no.
     *
     * @return the order no
     */
    public String getOrderNo() {
		return this.orderNo;
	}

    /**
     * Sets order no.
     *
     * @param orderNo the order no
     */
    public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

    /**
     * Gets order status.
     *
     * @return the order status
     */
    public String getOrderStatus() {
		return this.orderStatus;
	}

    /**
     * Sets order status.
     *
     * @param orderStatus the order status
     */
    public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
	}

}
