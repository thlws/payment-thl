package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询流程实例
 *
 * @author auto create
 * @since 1.0, 2017-09-19 20:53:07
 */
public class AlipayBossBaseProcessInstanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4297618379986242279L;

	/**
	 * 流程全局唯一ID
	 */
	@ApiField("puid")
	private String puid;

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
