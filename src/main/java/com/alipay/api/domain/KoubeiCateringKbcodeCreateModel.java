package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑码创建接口
 *
 * @author auto create
 * @since 1.0, 2017-09-05 16:47:43
 */
public class KoubeiCateringKbcodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4612828194842924863L;

	/**
	 * 口碑码绑定的门店或者桌号信息列表
	 */
	@ApiListField("bind_info_list")
	@ApiField("kb_code_bind_info_v_o")
	private List<KbCodeBindInfoVO> bindInfoList;

	/**
	 * 请求流水ID，用于幂等控制
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 物料模板（可以不填，系统会根据码类型默认一个模板）
	 */
	@ApiField("stuff_template")
	private String stuffTemplate;

	/**
	 * 生成码的类型（桌码：TABLE_PASTER，门店码：DOOR_PASTER）
	 */
	@ApiField("stuff_type")
	private String stuffType;

    /**
     * Gets bind info list.
     *
     * @return the bind info list
     */
    public List<KbCodeBindInfoVO> getBindInfoList() {
		return this.bindInfoList;
	}

    /**
     * Sets bind info list.
     *
     * @param bindInfoList the bind info list
     */
    public void setBindInfoList(List<KbCodeBindInfoVO> bindInfoList) {
		this.bindInfoList = bindInfoList;
	}

    /**
     * Gets request id.
     *
     * @return the request id
     */
    public String getRequestId() {
		return this.requestId;
	}

    /**
     * Sets request id.
     *
     * @param requestId the request id
     */
    public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

    /**
     * Gets stuff template.
     *
     * @return the stuff template
     */
    public String getStuffTemplate() {
		return this.stuffTemplate;
	}

    /**
     * Sets stuff template.
     *
     * @param stuffTemplate the stuff template
     */
    public void setStuffTemplate(String stuffTemplate) {
		this.stuffTemplate = stuffTemplate;
	}

    /**
     * Gets stuff type.
     *
     * @return the stuff type
     */
    public String getStuffType() {
		return this.stuffType;
	}

    /**
     * Sets stuff type.
     *
     * @param stuffType the stuff type
     */
    public void setStuffType(String stuffType) {
		this.stuffType = stuffType;
	}

}
