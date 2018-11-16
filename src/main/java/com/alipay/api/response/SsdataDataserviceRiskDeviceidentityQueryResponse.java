package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.risk.deviceidentity.query response.
 *
 * @author auto create
 * @since 1.0, 2017-12-14 10:15:49
 */
public class SsdataDataserviceRiskDeviceidentityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7411114497277413953L;

	/** 
	 * 盗卡盗账户概率，用于识别账号被盗的风险，数值越大风险概率越大，范围0~1，小数点后保留6有效数
	 */
	@ApiField("ato_score")
	private String atoScore;

	/** 
	 * 身份被冒用概率，用于识别账号被冒用风险，数值越大风险概率越大，范围0~1，小数点后保留6有效数
	 */
	@ApiField("fake_score")
	private String fakeScore;

	/** 
	 * 垃圾账户概率，用于识别垃圾账户的风险，数值越大风险概率越大，范围0~1，小数点后保留6有效数
	 */
	@ApiField("rub_score")
	private String rubScore;

	/** 
	 * 设备ID，设备的唯一识别号
	 */
	@ApiField("umid")
	private String umid;

	/** 
	 * 调用订单号，服务端唯一个识别号
	 */
	@ApiField("unique_id")
	private String uniqueId;

    /**
     * Sets ato score.
     *
     * @param atoScore the ato score
     */
    public void setAtoScore(String atoScore) {
		this.atoScore = atoScore;
	}

    /**
     * Gets ato score.
     *
     * @return the ato score
     */
    public String getAtoScore( ) {
		return this.atoScore;
	}

    /**
     * Sets fake score.
     *
     * @param fakeScore the fake score
     */
    public void setFakeScore(String fakeScore) {
		this.fakeScore = fakeScore;
	}

    /**
     * Gets fake score.
     *
     * @return the fake score
     */
    public String getFakeScore( ) {
		return this.fakeScore;
	}

    /**
     * Sets rub score.
     *
     * @param rubScore the rub score
     */
    public void setRubScore(String rubScore) {
		this.rubScore = rubScore;
	}

    /**
     * Gets rub score.
     *
     * @return the rub score
     */
    public String getRubScore( ) {
		return this.rubScore;
	}

    /**
     * Sets umid.
     *
     * @param umid the umid
     */
    public void setUmid(String umid) {
		this.umid = umid;
	}

    /**
     * Gets umid.
     *
     * @return the umid
     */
    public String getUmid( ) {
		return this.umid;
	}

    /**
     * Sets unique id.
     *
     * @param uniqueId the unique id
     */
    public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

    /**
     * Gets unique id.
     *
     * @return the unique id
     */
    public String getUniqueId( ) {
		return this.uniqueId;
	}

}
