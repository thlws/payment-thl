package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 快消行业口碑码创建接口
 *
 * @author auto create
 * @since 1.0, 2017-09-27 19:33:08
 */
public class KoubeiRetailKbcodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6645652973572393145L;

	/**
	 * 口碑码绑定的附加信息列表，最大数量150
	 */
	@ApiListField("code_info_list")
	@ApiField("retail_kbcode_create_vo")
	private List<RetailKbcodeCreateVo> codeInfoList;

	/**
	 * 物料模板（口碑码的背景图，目前仅支持：RETAIL_PASTER_296_320）
	 */
	@ApiField("code_template")
	private String codeTemplate;

	/**
	 * 生成码的类型（当前仅支持品牌商促销员码：KOUBEI_SALESMAN_CODEC）
	 */
	@ApiField("code_type")
	private String codeType;

	/**
	 * 请求流水ID，可用于幂等控制，建议使用UUID做幂等控制
	 */
	@ApiField("request_id")
	private String requestId;

    /**
     * Gets code info list.
     *
     * @return the code info list
     */
    public List<RetailKbcodeCreateVo> getCodeInfoList() {
		return this.codeInfoList;
	}

    /**
     * Sets code info list.
     *
     * @param codeInfoList the code info list
     */
    public void setCodeInfoList(List<RetailKbcodeCreateVo> codeInfoList) {
		this.codeInfoList = codeInfoList;
	}

    /**
     * Gets code template.
     *
     * @return the code template
     */
    public String getCodeTemplate() {
		return this.codeTemplate;
	}

    /**
     * Sets code template.
     *
     * @param codeTemplate the code template
     */
    public void setCodeTemplate(String codeTemplate) {
		this.codeTemplate = codeTemplate;
	}

    /**
     * Gets code type.
     *
     * @return the code type
     */
    public String getCodeType() {
		return this.codeType;
	}

    /**
     * Sets code type.
     *
     * @param codeType the code type
     */
    public void setCodeType(String codeType) {
		this.codeType = codeType;
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

}
