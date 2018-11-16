package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线下场景虹膜信息注册
 *
 * @author auto create
 * @since 1.0, 2017-07-17 10:14:45
 */
public class AlipaySecurityProdIrisVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 6461777637693415476L;

	/**
	 * 虹膜校验的关联token，用于二次校验
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 虹膜扩展参数，用于后续扩展，格式为json格式，目前传入参数为iris_vendor，虹膜厂商
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 虹膜库分组。每个商户可以使用多个虹膜库分组，虹膜搜索时会在指定的虹膜库分组中搜索
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 虹膜特征字节数组进行Base64编码后的字符串
	 */
	@ApiField("iris_str")
	private String irisStr;

	/**
	 * 虹膜校验操作类型，方便后续扩展，目前传入固定irisVerify
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 外部应用标识，用于标识使用虹膜的应用来源
	 */
	@ApiField("out_app_flag")
	private String outAppFlag;

	/**
	 * 外部业务号，商户的业务单据号，用于核对与问题排查
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 用于标识虹膜对应的注册人的id，如支付宝的uid、信用id等等，此处只需要业务方传入唯一可以标识的身份的id即可，虹膜系统不使用此id反查任何内容。用途是在校验的时候返回业务可以识别的唯一id。校验的时候传入此id，则虹膜系统会认为是1:1比对请求。如果是1：N请求，该值需要传空。
	 */
	@ApiField("person_id")
	private String personId;

    /**
     * Gets biz token.
     *
     * @return the biz token
     */
    public String getBizToken() {
		return this.bizToken;
	}

    /**
     * Sets biz token.
     *
     * @param bizToken the biz token
     */
    public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
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
     * Gets group id.
     *
     * @return the group id
     */
    public String getGroupId() {
		return this.groupId;
	}

    /**
     * Sets group id.
     *
     * @param groupId the group id
     */
    public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

    /**
     * Gets iris str.
     *
     * @return the iris str
     */
    public String getIrisStr() {
		return this.irisStr;
	}

    /**
     * Sets iris str.
     *
     * @param irisStr the iris str
     */
    public void setIrisStr(String irisStr) {
		this.irisStr = irisStr;
	}

    /**
     * Gets operate type.
     *
     * @return the operate type
     */
    public String getOperateType() {
		return this.operateType;
	}

    /**
     * Sets operate type.
     *
     * @param operateType the operate type
     */
    public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

    /**
     * Gets out app flag.
     *
     * @return the out app flag
     */
    public String getOutAppFlag() {
		return this.outAppFlag;
	}

    /**
     * Sets out app flag.
     *
     * @param outAppFlag the out app flag
     */
    public void setOutAppFlag(String outAppFlag) {
		this.outAppFlag = outAppFlag;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets person id.
     *
     * @return the person id
     */
    public String getPersonId() {
		return this.personId;
	}

    /**
     * Sets person id.
     *
     * @param personId the person id
     */
    public void setPersonId(String personId) {
		this.personId = personId;
	}

}
