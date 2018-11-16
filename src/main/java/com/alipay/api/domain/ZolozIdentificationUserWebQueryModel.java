package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * H5刷脸认证查询
 *
 * @author auto create
 * @since 1.0, 2018-07-31 12:02:42
 */
public class ZolozIdentificationUserWebQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7614528632742581276L;

	/**
	 * 商户请求的唯一标识，须与初始化传入的bizId保持一致
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 扩展参数
	 */
	@ApiField("extern_param")
	private String externParam;

	/**
	 * 刷脸认证的唯一标识，用于查询认证结果
	 */
	@ApiField("zim_id")
	private String zimId;

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
     * Gets zim id.
     *
     * @return the zim id
     */
    public String getZimId() {
		return this.zimId;
	}

    /**
     * Sets zim id.
     *
     * @param zimId the zim id
     */
    public void setZimId(String zimId) {
		this.zimId = zimId;
	}

}
