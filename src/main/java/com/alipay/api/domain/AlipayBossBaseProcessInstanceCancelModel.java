package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 撤消流程实例
 *
 * @author auto create
 * @since 1.0, 2017-09-19 20:53:14
 */
public class AlipayBossBaseProcessInstanceCancelModel extends AlipayObject {

	private static final long serialVersionUID = 6529438471922849374L;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 处理人域账号
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 流程全局唯一ID
	 */
	@ApiField("puid")
	private String puid;

    /**
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo() {
		return this.memo;
	}

    /**
     * Sets memo.
     *
     * @param memo the memo
     */
    public void setMemo(String memo) {
		this.memo = memo;
	}

    /**
     * Gets operator.
     *
     * @return the operator
     */
    public String getOperator() {
		return this.operator;
	}

    /**
     * Sets operator.
     *
     * @param operator the operator
     */
    public void setOperator(String operator) {
		this.operator = operator;
	}

    /**
     * Gets puid.
     *
     * @return the puid
     */
    public String getPuid() {
		return this.puid;
	}

    /**
     * Sets puid.
     *
     * @param puid the puid
     */
    public void setPuid(String puid) {
		this.puid = puid;
	}

}
