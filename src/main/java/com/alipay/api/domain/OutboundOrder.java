package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出库通知单
 *
 * @author auto create
 * @since 1.0, 2018-06-01 17:19:09
 */
public class OutboundOrder extends AlipayObject {

	private static final long serialVersionUID = 7243385655448371159L;

	/**
	 * 扩展字段，json格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 外部业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 出库业务类型，CGCK=采购出库，DDCK=订单出库，PDCK=盘点出库
	 */
	@ApiField("outbound_type")
	private String outboundType;

	/**
	 * 收货人信息（商家采购必须传，其他订单类型非必传）
	 */
	@ApiField("receiver_info_vo")
	private ReceiverInfoVO receiverInfoVo;

	/**
	 * 备注信息。
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 发货人信息
	 */
	@ApiField("sender_info_vo")
	private SenderInfoVO senderInfoVo;

	/**
	 * 仓库编号
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets outbound type.
     *
     * @return the outbound type
     */
    public String getOutboundType() {
		return this.outboundType;
	}

    /**
     * Sets outbound type.
     *
     * @param outboundType the outbound type
     */
    public void setOutboundType(String outboundType) {
		this.outboundType = outboundType;
	}

    /**
     * Gets receiver info vo.
     *
     * @return the receiver info vo
     */
    public ReceiverInfoVO getReceiverInfoVo() {
		return this.receiverInfoVo;
	}

    /**
     * Sets receiver info vo.
     *
     * @param receiverInfoVo the receiver info vo
     */
    public void setReceiverInfoVo(ReceiverInfoVO receiverInfoVo) {
		this.receiverInfoVo = receiverInfoVo;
	}

    /**
     * Gets remark.
     *
     * @return the remark
     */
    public String getRemark() {
		return this.remark;
	}

    /**
     * Sets remark.
     *
     * @param remark the remark
     */
    public void setRemark(String remark) {
		this.remark = remark;
	}

    /**
     * Gets sender info vo.
     *
     * @return the sender info vo
     */
    public SenderInfoVO getSenderInfoVo() {
		return this.senderInfoVo;
	}

    /**
     * Sets sender info vo.
     *
     * @param senderInfoVo the sender info vo
     */
    public void setSenderInfoVo(SenderInfoVO senderInfoVo) {
		this.senderInfoVo = senderInfoVo;
	}

    /**
     * Gets warehouse code.
     *
     * @return the warehouse code
     */
    public String getWarehouseCode() {
		return this.warehouseCode;
	}

    /**
     * Sets warehouse code.
     *
     * @param warehouseCode the warehouse code
     */
    public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

}
