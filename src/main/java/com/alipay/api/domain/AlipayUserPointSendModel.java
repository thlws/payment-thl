package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户积分发放接口（需要授权）
 *
 * @author auto create
 * @since 1.0, 2018-04-10 17:25:06
 */
public class AlipayUserPointSendModel extends AlipayObject {

	private static final long serialVersionUID = 3791674397664462641L;

	/**
	 * 扩展信息，用于对该笔业务调用的补充说明
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 外部业务流水号，长度请务必保证28位，会用于幂等性校验，所以请保证每次请求的业务流水号的唯一性
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 需要给用户发放的积分数
	 */
	@ApiField("point")
	private String point;

	/**
	 * 调用方自己的业务场景类型标识，用户区分调用方和业务，请根据自己的业务来传
	 */
	@ApiField("scene_type")
	private String sceneType;

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
     * Gets point.
     *
     * @return the point
     */
    public String getPoint() {
		return this.point;
	}

    /**
     * Sets point.
     *
     * @param point the point
     */
    public void setPoint(String point) {
		this.point = point;
	}

    /**
     * Gets scene type.
     *
     * @return the scene type
     */
    public String getSceneType() {
		return this.sceneType;
	}

    /**
     * Sets scene type.
     *
     * @param sceneType the scene type
     */
    public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

}
