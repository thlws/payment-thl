package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.iris.verify response.
 *
 * @author auto create
 * @since 1.0, 2017-07-17 10:14:45
 */
public class AlipaySecurityProdIrisVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5312496418958327428L;

	/** 
	 * 虹膜校验关联token，用于二次校验
	 */
	@ApiField("biz_token")
	private String bizToken;

	/** 
	 * 虹膜扩展参数，用于后续扩展，目前没有内容
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 对此次搜索虹膜库分组的虹膜id标识
	 */
	@ApiField("iris_id")
	private String irisId;

	/** 
	 * 用于标识虹膜对应的注册人的id，如支付宝的uid、信用id等等，此处返回虹膜注册时候传入的person_id
	 */
	@ApiField("person_id")
	private String personId;

	/** 
	 * 用于标识本次虹膜校验状态，虹膜校验需要将服务端的校验状态细节同时返回给业务方，-1冻结，-2多个虹膜匹配，17匹配到虹膜
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
     * Sets person id.
     *
     * @param personId the person id
     */
    public void setPersonId(String personId) {
		this.personId = personId;
	}

    /**
     * Gets person id.
     *
     * @return the person id
     */
    public String getPersonId( ) {
		return this.personId;
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
