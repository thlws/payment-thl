package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蚁盾音频内容识别
 *
 * @author auto create
 * @since 1.0, 2018-01-19 20:03:52
 */
public class SsdataDataserviceRiskAudioVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 8762986142258874127L;

	/**
	 * 需要识别的音频转换后的数据，不要包含特殊字符以及双引号等可能引起json格式化错误问题的字符.
	 */
	@ApiField("audio_content")
	private String audioContent;

	/**
	 * 表明用户上传的音频数据格式
	 */
	@ApiField("audio_type")
	private String audioType;

	/**
	 * 调用识别服务的用户id，与使用ssdata.dataservice.risk.audio.set的creator一致
	 */
	@ApiField("checker")
	private String checker;

	/**
	 * 风险类型， 1-涉政模型， 2-涉黄模型
	 */
	@ApiListField("risk_type")
	@ApiField("string")
	private List<String> riskType;

	/**
	 * 表明用户上传的音频数据采样率
	 */
	@ApiField("sample_rate")
	private String sampleRate;

    /**
     * Gets audio content.
     *
     * @return the audio content
     */
    public String getAudioContent() {
		return this.audioContent;
	}

    /**
     * Sets audio content.
     *
     * @param audioContent the audio content
     */
    public void setAudioContent(String audioContent) {
		this.audioContent = audioContent;
	}

    /**
     * Gets audio type.
     *
     * @return the audio type
     */
    public String getAudioType() {
		return this.audioType;
	}

    /**
     * Sets audio type.
     *
     * @param audioType the audio type
     */
    public void setAudioType(String audioType) {
		this.audioType = audioType;
	}

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

    /**
     * Gets sample rate.
     *
     * @return the sample rate
     */
    public String getSampleRate() {
		return this.sampleRate;
	}

    /**
     * Sets sample rate.
     *
     * @param sampleRate the sample rate
     */
    public void setSampleRate(String sampleRate) {
		this.sampleRate = sampleRate;
	}

}
