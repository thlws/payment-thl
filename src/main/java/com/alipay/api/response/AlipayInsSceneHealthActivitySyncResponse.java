package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.health.activity.sync response.
 *
 * @author auto create
 * @since 1.0, 2017-09-13 10:12:33
 */
public class AlipayInsSceneHealthActivitySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8745537168934454962L;

	/** 
	 * 申请编号，成功返回原申请编号，失败为空
	 */
	@ApiField("apply_no")
	private String applyNo;

    /**
     * Sets apply no.
     *
     * @param applyNo the apply no
     */
    public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

    /**
     * Gets apply no.
     *
     * @return the apply no
     */
    public String getApplyNo( ) {
		return this.applyNo;
	}

}
