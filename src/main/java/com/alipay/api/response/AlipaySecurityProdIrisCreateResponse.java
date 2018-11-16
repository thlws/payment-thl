package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.iris.create response.
 *
 * @author auto create
 * @since 1.0, 2017-07-17 10:14:58
 */
public class AlipaySecurityProdIrisCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6495411914693363135L;

	/** 
	 * 虹膜注册的关联token，用于关联跨设备分次注册
	 */
	@ApiField("biz_token")
	private String bizToken;

	/** 
	 * 虹膜扩展参数，用于后续扩展，目前没有内容
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 对此次插入虹膜库分组的虹膜id标识
	 */
	@ApiField("iris_id")
	private String irisId;

	/** 
	 * 用于标识本次虹膜注册是否已经完成，0：初始状态，1：有person_id，16：有iris_str，17：有person_id和iris_str
	 */
	@ApiField("status")
	private String status;

    /**
     * Sets biz token.
     *
     * @param bizToken the biz token
     */
    public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

    /**
     * Gets biz token.
     *
     * @return the biz token
     */
    public String getBizToken( ) {
		return this.bizToken;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo( ) {
		return this.extInfo;
	}

    /**
     * Sets iris id.
     *
     * @param irisId the iris id
     */
    public void setIrisId(String irisId) {
		this.irisId = irisId;
	}

    /**
     * Gets iris id.
     *
     * @return the iris id
     */
    public String getIrisId( ) {
		return this.irisId;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus( ) {
		return this.status;
	}

}
