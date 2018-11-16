package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蚁盾音频内容识别结果
 *
 * @author auto create
 * @since 1.0, 2018-01-19 20:02:25
 */
public class SsdataDataserviceRiskAudioQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3265297379119593315L;

	/**
	 * 调用识别服务的用户id，与使用ssdata.dataservice.risk.audio.set的creator一致
	 */
	@ApiField("checker")
	private String checker;

	/**
	 * 用户音频请求唯一识别码
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 风险类型，1-涉政模型， 2-涉黄模型。与ssdata.dataservice.risk.audio.verify接口传数据时的参数保持一致。
	 */
	@ApiListField("risk_type")
	@ApiField("string")
	private List<String> riskType;

    /**
     * Gets checker.
     *
     * @return the checker
     */
    public String getChecker() {
		return this.checker;
	}

    /**
     * Sets checker.
     *
     * @param checker the checker
     */
    public void setChecker(String checker) {
		this.checker = checker;
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
     * Gets risk type.
     *
     * @return the risk type
     */
    public List<String> getRiskType() {
		return this.riskType;
	}

    /**
     * Sets risk type.
     *
     * @param riskType the risk type
     */
    public void setRiskType(List<String> riskType) {
		this.riskType = riskType;
	}

}
