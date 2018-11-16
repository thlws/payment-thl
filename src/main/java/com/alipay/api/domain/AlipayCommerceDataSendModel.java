package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业数据发送接口
 *
 * @author auto create
 * @since 1.0, 2018-01-03 12:12:19
 */
public class AlipayCommerceDataSendModel extends AlipayObject {

	private static final long serialVersionUID = 5137161897858441222L;

	/**
	 * 场景的来源渠道，比如场景
在阿里旅行触发，就用alitrip
接入时和支付宝共同确认
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 操作码,由支付宝分配
	 */
	@ApiField("op_code")
	private String opCode;

	/**
	 * 操作数据，如果只需要支付宝这边利用
数据直接完成某个功能（通知），则使
用此参数传输数据.，根据不同的scene_code,
op_code,channel,version共同确定参数是否
可以为空，接入时由支付宝确定参数格式。
	 */
	@ApiField("op_data")
	private String opData;

	/**
	 * 场景标识,由支付宝分配
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 场景的数据表示. json 数组
格式，根据不同的scene_code,
op_code,channel,version共同确定
参数是否可以为空，接入时由支付宝确定
参数格式。
	 */
	@ApiField("scene_data")
	private String sceneData;

	/**
	 * 场景覆盖的目标人群标识，
单个用户是支付宝的userId,
多个用户userId 使用英文半
角逗号隔开,最多200个
如果是群组,使用支付宝分配
的群组ID.
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 取值范围：
IDENTITY_CARD_NO ：身份证
ALIPAY_LOGON_ID:支付宝登录账号
BINDING_MOBILE_NO:支付宝账号绑定的手机号
 ALIPAY_USER_ID：支付宝user_id
标明target_id对应的类型，此参数为空时，
默认为支付宝账号的user_id。
注意：类型为身份证、支付宝绑定的手机号时，
可能对应多个支付宝账号，此时只会选择列表
第一个支付宝账号的userId作为targetId使用。
	 */
	@ApiField("target_id_type")
	private String targetIdType;

	/**
	 * 场景数据的类型的版本,由支付宝分配
	 */
	@ApiField("version")
	private String version;

    /**
     * Gets channel.
     *
     * @return the channel
     */
    public String getChannel() {
		return this.channel;
	}

    /**
     * Sets channel.
     *
     * @param channel the channel
     */
    public void setChannel(String channel) {
		this.channel = channel;
	}

    /**
     * Gets op code.
     *
     * @return the op code
     */
    public String getOpCode() {
		return this.opCode;
	}

    /**
     * Sets op code.
     *
     * @param opCode the op code
     */
    public void setOpCode(String opCode) {
		this.opCode = opCode;
	}

    /**
     * Gets op data.
     *
     * @return the op data
     */
    public String getOpData() {
		return this.opData;
	}

    /**
     * Sets op data.
     *
     * @param opData the op data
     */
    public void setOpData(String opData) {
		this.opData = opData;
	}

    /**
     * Gets scene code.
     *
     * @return the scene code
     */
    public String getSceneCode() {
		return this.sceneCode;
	}

    /**
     * Sets scene code.
     *
     * @param sceneCode the scene code
     */
    public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

    /**
     * Gets scene data.
     *
     * @return the scene data
     */
    public String getSceneData() {
		return this.sceneData;
	}

    /**
     * Sets scene data.
     *
     * @param sceneData the scene data
     */
    public void setSceneData(String sceneData) {
		this.sceneData = sceneData;
	}

    /**
     * Gets target id.
     *
     * @return the target id
     */
    public String getTargetId() {
		return this.targetId;
	}

    /**
     * Sets target id.
     *
     * @param targetId the target id
     */
    public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

    /**
     * Gets target id type.
     *
     * @return the target id type
     */
    public String getTargetIdType() {
		return this.targetIdType;
	}

    /**
     * Sets target id type.
     *
     * @param targetIdType the target id type
     */
    public void setTargetIdType(String targetIdType) {
		this.targetIdType = targetIdType;
	}

    /**
     * Gets version.
     *
     * @return the version
     */
    public String getVersion() {
		return this.version;
	}

    /**
     * Sets version.
     *
     * @param version the version
     */
    public void setVersion(String version) {
		this.version = version;
	}

}
