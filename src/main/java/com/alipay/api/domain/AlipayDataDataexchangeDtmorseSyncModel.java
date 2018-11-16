package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 摩斯平台外部商户数据反馈接口
 *
 * @author auto create
 * @since 1.0, 2018-07-23 21:11:10
 */
public class AlipayDataDataexchangeDtmorseSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4619237923212791826L;

	/**
	 * 外部商户发送给域内系统的信息
	 */
	@ApiField("data")
	private String data;

	/**
	 * 扩展字段，用于补充
	 */
	@ApiField("extent_info")
	private String extentInfo;

	/**
	 * 多方安全计算分配给商户的唯一id，由管理员分配给商户的唯一识别号；
	 */
	@ApiField("mid")
	private String mid;

	/**
	 * 服务操作类型，商户同步信息到域内，类型枚举：modeling_back；根据不同场景管理员分配；
	 */
	@ApiField("operate_type")
	private String operateType;

    /**
     * Gets data.
     *
     * @return the data
     */
    public String getData() {
		return this.data;
	}

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(String data) {
		this.data = data;
	}

    /**
     * Gets extent info.
     *
     * @return the extent info
     */
    public String getExtentInfo() {
		return this.extentInfo;
	}

    /**
     * Sets extent info.
     *
     * @param extentInfo the extent info
     */
    public void setExtentInfo(String extentInfo) {
		this.extentInfo = extentInfo;
	}

    /**
     * Gets mid.
     *
     * @return the mid
     */
    public String getMid() {
		return this.mid;
	}

    /**
     * Sets mid.
     *
     * @param mid the mid
     */
    public void setMid(String mid) {
		this.mid = mid;
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

}
