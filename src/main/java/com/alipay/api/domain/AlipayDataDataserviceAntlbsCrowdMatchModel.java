package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询用户匹配的客群信息
 *
 * @author auto create
 * @since 1.0, 2018-07-16 17:26:10
 */
public class AlipayDataDataserviceAntlbsCrowdMatchModel extends AlipayObject {

	private static final long serialVersionUID = 6862986121171182548L;

	/**
	 * crowd_code ＋ 客群匹配接口 ＋ 客群码，创建客群时可获取
	 */
	@ApiListField("crowd_code")
	@ApiField("string")
	private List<String> crowdCode;

	/**
	 * scene_code ＋ 客群匹配接口 ＋ 客群归属的场景，在icrowd平台上可以看到
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * uid ＋ 客群匹配接口 ＋ 用户唯一ID，目前只支持支付宝账号，其他ID类型请联系接口负责人确认是否支持
	 */
	@ApiField("uid")
	private String uid;

	/**
	 * uid_type ＋ 客群匹配接口 ＋ ID类型，目前只支持支付宝账号（USER_ID），其他ID类型请联系接口负责人确认是否支持
	 */
	@ApiField("uid_type")
	private String uidType;

    /**
     * Gets crowd code.
     *
     * @return the crowd code
     */
    public List<String> getCrowdCode() {
		return this.crowdCode;
	}

    /**
     * Sets crowd code.
     *
     * @param crowdCode the crowd code
     */
    public void setCrowdCode(List<String> crowdCode) {
		this.crowdCode = crowdCode;
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
     * Gets uid.
     *
     * @return the uid
     */
    public String getUid() {
		return this.uid;
	}

    /**
     * Sets uid.
     *
     * @param uid the uid
     */
    public void setUid(String uid) {
		this.uid = uid;
	}

    /**
     * Gets uid type.
     *
     * @return the uid type
     */
    public String getUidType() {
		return this.uidType;
	}

    /**
     * Sets uid type.
     *
     * @param uidType the uid type
     */
    public void setUidType(String uidType) {
		this.uidType = uidType;
	}

}
