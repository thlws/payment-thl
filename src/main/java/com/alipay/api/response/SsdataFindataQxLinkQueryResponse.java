package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.findata.qx.link.query response.
 *
 * @author auto create
 * @since 1.0, 2017-10-30 20:09:26
 */
public class SsdataFindataQxLinkQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1421247554128651783L;

	/** 
	 * 系统生成的业务唯一标识，用于标识商户的一笔业务
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 商户业务流水号，如果商户有传入，则原样返回。如果商户没有传入，则有系统生成返回
	 */
	@ApiField("org_biz_no")
	private String orgBizNo;

	/** 
	 * 返回的url地址
http://bd.openapi.shulidata.com/gateway.do?api=slops.authcoll.channel.page&bizContent=B2oqkKrdw299TSHGfdDDUnMuLVSz4b%2FgRDjCrYaRuHJwDTCR9PFdI%2B4p%2BvZXDP%2FK%2BmktLmSDWbXxluVzTSDKu1Mqf8UxAltYrWuG757lJCi5SnU0296h2SQR56YP%2FiQD&bizType=123&charset=UTF-8&encKey=KQ4WfsIexjNavPFanUNasHVH1hda01B3vkRlIk6FXhDSJb0m7ppw7%2BDrfKQ6ORxlGnwu42QK2wTITd651mt5OQ%3D%3D&encType=AES&orgCode=sl2016112510103701&sdkVersion=1.4&sign=0GskfR11zs3A1Sda2apsyN8SjOq6nSijMJsa4UPefXnXMN6F%2FUwBQnARJCA6mdjoyrYF%2FYlgQNw4PtXBECmH%2FzWLbiF2Ap0551z7kklA0mnmHPXTQERLqpkE5eOcozFzEq5zhni3luVIGNoaMXNi7d12SeKtArP24v5kpmUrnMo%3D&signType=RSA&timestamp=1507515730325&version=1.0
	 */
	@ApiField("url")
	private String url;

    /**
     * Sets biz no.
     *
     * @param bizNo the biz no
     */
    public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

    /**
     * Gets biz no.
     *
     * @return the biz no
     */
    public String getBizNo( ) {
		return this.bizNo;
	}

    /**
     * Sets org biz no.
     *
     * @param orgBizNo the org biz no
     */
    public void setOrgBizNo(String orgBizNo) {
		this.orgBizNo = orgBizNo;
	}

    /**
     * Gets org biz no.
     *
     * @return the org biz no
     */
    public String getOrgBizNo( ) {
		return this.orgBizNo;
	}

    /**
     * Sets url.
     *
     * @param url the url
     */
    public void setUrl(String url) {
		this.url = url;
	}

    /**
     * Gets url.
     *
     * @return the url
     */
    public String getUrl( ) {
		return this.url;
	}

}
