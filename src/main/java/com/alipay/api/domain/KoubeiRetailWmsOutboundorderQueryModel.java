package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出库通知单查询接口
 *
 * @author auto create
 * @since 1.0, 2018-06-01 17:19:51
 */
public class KoubeiRetailWmsOutboundorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7882939817414254943L;

	/**
	 * 是否需要通知单明细，true则返回明细
	 */
	@ApiField("need_detail")
	private Boolean needDetail;

	/**
	 * 外部业务单号（出库通知单id二选一，必填一个）
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 通知单id（与业务单号二选一，必选一个）
	 */
	@ApiField("outbound_order_id")
	private String outboundOrderId;

    /**
     * Gets need detail.
     *
     * @return the need detail
     */
    public Boolean getNeedDetail() {
		return this.needDetail;
	}

    /**
     * Sets need detail.
     *
     * @param needDetail the need detail
     */
    public void setNeedDetail(Boolean needDetail) {
		this.needDetail = needDetail;
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
     * Gets outbound order id.
     *
     * @return the outbound order id
     */
    public String getOutboundOrderId() {
		return this.outboundOrderId;
	}

    /**
     * Sets outbound order id.
     *
     * @param outboundOrderId the outbound order id
     */
    public void setOutboundOrderId(String outboundOrderId) {
		this.outboundOrderId = outboundOrderId;
	}

}
