package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * H5刷脸认证初始化
 *
 * @author auto create
 * @since 1.0, 2018-07-31 12:02:23
 */
public class ZolozIdentificationUserWebInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 6666855729581922162L;

	/**
	 * 商户请求的唯一标识，该标识作为对账的关键信息，商户要保证其唯一性
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 预留扩展业务参数
	 */
	@ApiField("extern_param")
	private String externParam;

	/**
	 * 用户身份信息
	 */
	@ApiField("identity_param")
	private IdentityParam identityParam;

	/**
	 * 环境参数
	 */
	@ApiField("metainfo")
	private String metainfo;

    /**
     * Gets biz id.
     *
     * @return the biz id
     */
    public String getBizId() {
		return this.bizId;
	}

    /**
     * Sets biz id.
     *
     * @param bizId the biz id
     */
    public void setBizId(String bizId) {
		this.bizId = bizId;
	}

    /**
     * Gets extern param.
     *
     * @return the extern param
     */
    public String getExternParam() {
		return this.externParam;
	}

    /**
     * Sets extern param.
     *
     * @param externParam the extern param
     */
    public void setExternParam(String externParam) {
		this.externParam = externParam;
	}

    /**
     * Gets identity param.
     *
     * @return the identity param
     */
    public IdentityParam getIdentityParam() {
		return this.identityParam;
	}

    /**
     * Sets identity param.
     *
     * @param identityParam the identity param
     */
    public void setIdentityParam(IdentityParam identityParam) {
		this.identityParam = identityParam;
	}

    /**
     * Gets metainfo.
     *
     * @return the metainfo
     */
    public String getMetainfo() {
		return this.metainfo;
	}

    /**
     * Sets metainfo.
     *
     * @param metainfo the metainfo
     */
    public void setMetainfo(String metainfo) {
		this.metainfo = metainfo;
	}

}
