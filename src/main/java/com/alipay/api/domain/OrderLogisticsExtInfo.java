package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 到位服务物流信息的扩展字段，包含服务的开始时间和结束时间信息
 *
 * @author auto create
 * @since 1.0, 2017-01-16 11:29:56
 */
public class OrderLogisticsExtInfo extends AlipayObject {

	private static final long serialVersionUID = 4394659122921454989L;

	/**
	 * 服务结束时间，格式为yyyy-MM-dd HH:mm（到分）
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/**
	 * 服务开始时间，格式为yyyy-MM-dd HH:mm（到分）
	 */
	@ApiField("gmt_start")
	private String gmtStart;

    /**
     * Gets gmt end.
     *
     * @return the gmt end
     */
    public String getGmtEnd() {
		return this.gmtEnd;
	}

    /**
     * Sets gmt end.
     *
     * @param gmtEnd the gmt end
     */
    public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

    /**
     * Gets gmt start.
     *
     * @return the gmt start
     */
    public String getGmtStart() {
		return this.gmtStart;
	}

    /**
     * Sets gmt start.
     *
     * @param gmtStart the gmt start
     */
    public void setGmtStart(String gmtStart) {
		this.gmtStart = gmtStart;
	}

}
