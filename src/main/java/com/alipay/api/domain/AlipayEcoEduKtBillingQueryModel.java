package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 缴费账单查询
 *
 * @author auto create
 * @since 1.0, 2017-11-06 11:47:53
 */
public class AlipayEcoEduKtBillingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8728161524143134926L;

	/**
	 * Isv pid
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * ISV调用发送账单接口，返回给商户的order_no
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 学校支付宝pid
	 */
	@ApiField("school_pid")
	private String schoolPid;

    /**
     * Gets isv pid.
     *
     * @return the isv pid
     */
    public String getIsvPid() {
		return this.isvPid;
	}

    /**
     * Sets isv pid.
     *
     * @param isvPid the isv pid
     */
    public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

    /**
     * Gets out trade no.
     *
     * @return the out trade no
     */
    public String getOutTradeNo() {
		return this.outTradeNo;
	}

    /**
     * Sets out trade no.
     *
     * @param outTradeNo the out trade no
     */
    public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

    /**
     * Gets school pid.
     *
     * @return the school pid
     */
    public String getSchoolPid() {
		return this.schoolPid;
	}

    /**
     * Sets school pid.
     *
     * @param schoolPid the school pid
     */
    public void setSchoolPid(String schoolPid) {
		this.schoolPid = schoolPid;
	}

}
