package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.afts.car.identify response.
 *
 * @author auto create
 * @since 1.0, 2017-08-22 16:23:52
 */
public class AlipayMsaasMediarecogAftsCarIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6649181246665913274L;

	/** 
	 * 浮点数； 欺诈概率，取值范围0-1，0表示非欺诈，1表示欺诈
	 */
	@ApiField("cheat_probability")
	private Long cheatProbability;

	/** 
	 * 欺诈类型
	 */
	@ApiField("cheat_type")
	private String cheatType;

	/** 
	 * 识别出的里程数
	 */
	@ApiField("ocr_kilometres")
	private Long ocrKilometres;

	/** 
	 * 浮点数;ocr识别出的里程数和用户输入的相似度，取值范围0-1，1表示一致，0表示完全不一样。
	 */
	@ApiField("ocr_probability")
	private Long ocrProbability;

    /**
     * Sets cheat probability.
     *
     * @param cheatProbability the cheat probability
     */
    public void setCheatProbability(Long cheatProbability) {
		this.cheatProbability = cheatProbability;
	}

    /**
     * Gets cheat probability.
     *
     * @return the cheat probability
     */
    public Long getCheatProbability( ) {
		return this.cheatProbability;
	}

    /**
     * Sets cheat type.
     *
     * @param cheatType the cheat type
     */
    public void setCheatType(String cheatType) {
		this.cheatType = cheatType;
	}

    /**
     * Gets cheat type.
     *
     * @return the cheat type
     */
    public String getCheatType( ) {
		return this.cheatType;
	}

    /**
     * Sets ocr kilometres.
     *
     * @param ocrKilometres the ocr kilometres
     */
    public void setOcrKilometres(Long ocrKilometres) {
		this.ocrKilometres = ocrKilometres;
	}

    /**
     * Gets ocr kilometres.
     *
     * @return the ocr kilometres
     */
    public Long getOcrKilometres( ) {
		return this.ocrKilometres;
	}

    /**
     * Sets ocr probability.
     *
     * @param ocrProbability the ocr probability
     */
    public void setOcrProbability(Long ocrProbability) {
		this.ocrProbability = ocrProbability;
	}

    /**
     * Gets ocr probability.
     *
     * @return the ocr probability
     */
    public Long getOcrProbability( ) {
		return this.ocrProbability;
	}

}
