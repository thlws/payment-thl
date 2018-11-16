package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IpAddrLbsInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.data.info.ipaddrinfo.query response.
 *
 * @author auto create
 * @since 1.0, 2018-09-18 21:15:00
 */
public class AlipaySecurityDataInfoIpaddrinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5215857587357228185L;

	/** 
	 * ip_addr_lbs_info:IP地址归属地对象。其中province为IP地址归属地的省，city为IP地址归属地的城市
	 */
	@ApiField("ip_addr_lbs_info")
	private IpAddrLbsInfo ipAddrLbsInfo;

    /**
     * Sets ip addr lbs info.
     *
     * @param ipAddrLbsInfo the ip addr lbs info
     */
    public void setIpAddrLbsInfo(IpAddrLbsInfo ipAddrLbsInfo) {
		this.ipAddrLbsInfo = ipAddrLbsInfo;
	}

    /**
     * Gets ip addr lbs info.
     *
     * @return the ip addr lbs info
     */
    public IpAddrLbsInfo getIpAddrLbsInfo( ) {
		return this.ipAddrLbsInfo;
	}

}
