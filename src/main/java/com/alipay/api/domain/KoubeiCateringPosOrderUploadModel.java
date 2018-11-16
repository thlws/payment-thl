package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * pos订单信息上传接口
 *
 * @author auto create
 * @since 1.0, 2018-05-13 11:23:21
 */
public class KoubeiCateringPosOrderUploadModel extends AlipayObject {

	private static final long serialVersionUID = 1312316593854816783L;

	/**
	 * 设备商回流的设备信息列表
	 */
	@ApiListField("pos_device_infos")
	@ApiField("pos_device_info_v_o")
	private List<PosDeviceInfoVO> posDeviceInfos;

	/**
	 * 回流pos订单信息列表
	 */
	@ApiListField("pos_order_infos")
	@ApiField("pos_order_info_v_o")
	private List<PosOrderInfoVO> posOrderInfos;

	/**
	 * source_type+pos订单设备信息来源类型枚举+(isv回流数据: ISV, 设备商数据: MEMA)
	 */
	@ApiField("source_type")
	private String sourceType;

    /**
     * Gets pos device infos.
     *
     * @return the pos device infos
     */
    public List<PosDeviceInfoVO> getPosDeviceInfos() {
		return this.posDeviceInfos;
	}

    /**
     * Sets pos device infos.
     *
     * @param posDeviceInfos the pos device infos
     */
    public void setPosDeviceInfos(List<PosDeviceInfoVO> posDeviceInfos) {
		this.posDeviceInfos = posDeviceInfos;
	}

    /**
     * Gets pos order infos.
     *
     * @return the pos order infos
     */
    public List<PosOrderInfoVO> getPosOrderInfos() {
		return this.posOrderInfos;
	}

    /**
     * Sets pos order infos.
     *
     * @param posOrderInfos the pos order infos
     */
    public void setPosOrderInfos(List<PosOrderInfoVO> posOrderInfos) {
		this.posOrderInfos = posOrderInfos;
	}

    /**
     * Gets source type.
     *
     * @return the source type
     */
    public String getSourceType() {
		return this.sourceType;
	}

    /**
     * Sets source type.
     *
     * @param sourceType the source type
     */
    public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

}
