package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.dteval.identitycheck.query response.
 *
 * @author auto create
 * @since 1.0, 2017-04-28 16:58:05
 */
public class SsdataDataserviceDtevalIdentitycheckQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4547252655754899436L;

	/** 
	 * evidence：关联人的手机号是否和该用户通话以及通话次数
	 */
	@ApiField("evidence")
	private String evidence;

	/** 
	 * ext_map:额外参数，预留
	 */
	@ApiField("ext_map")
	private String extMap;

	/** 
	 * id_card_no_match_flag:身份证号匹配结果标识，表示传入的身份证号是否匹配，含四种状态：完全匹配成功（MATCHSUCCESS），模糊匹配成功（FUZZYMATCHSUCCESS），匹配失败（MATCHFAIL），无数据（NODATA）
	 */
	@ApiField("id_card_no_match_flag")
	private String idCardNoMatchFlag;

	/** 
	 * name_match_flag:姓名匹配标识，表示传入的姓名是否匹配，含四种状态：完全匹配成功（MATCHSUCCESS），模糊匹配成功（FUZZYMATCHSUCCESS），匹配失败（MATCHFAIL），无数据（NODATA）
	 */
	@ApiField("name_match_flag")
	private String nameMatchFlag;

	/** 
	 * push_ant_data_flag:是否推送蚂蚁数据标志,推送成功返回true，失败返回false
	 */
	@ApiField("push_ant_data_flag")
	private String pushAntDataFlag;

    /**
     * Sets evidence.
     *
     * @param evidence the evidence
     */
    public void setEvidence(String evidence) {
		this.evidence = evidence;
	}

    /**
     * Gets evidence.
     *
     * @return the evidence
     */
    public String getEvidence( ) {
		return this.evidence;
	}

    /**
     * Sets ext map.
     *
     * @param extMap the ext map
     */
    public void setExtMap(String extMap) {
		this.extMap = extMap;
	}

    /**
     * Gets ext map.
     *
     * @return the ext map
     */
    public String getExtMap( ) {
		return this.extMap;
	}

    /**
     * Sets id card no match flag.
     *
     * @param idCardNoMatchFlag the id card no match flag
     */
    public void setIdCardNoMatchFlag(String idCardNoMatchFlag) {
		this.idCardNoMatchFlag = idCardNoMatchFlag;
	}

    /**
     * Gets id card no match flag.
     *
     * @return the id card no match flag
     */
    public String getIdCardNoMatchFlag( ) {
		return this.idCardNoMatchFlag;
	}

    /**
     * Sets name match flag.
     *
     * @param nameMatchFlag the name match flag
     */
    public void setNameMatchFlag(String nameMatchFlag) {
		this.nameMatchFlag = nameMatchFlag;
	}

    /**
     * Gets name match flag.
     *
     * @return the name match flag
     */
    public String getNameMatchFlag( ) {
		return this.nameMatchFlag;
	}

    /**
     * Sets push ant data flag.
     *
     * @param pushAntDataFlag the push ant data flag
     */
    public void setPushAntDataFlag(String pushAntDataFlag) {
		this.pushAntDataFlag = pushAntDataFlag;
	}

    /**
     * Gets push ant data flag.
     *
     * @return the push ant data flag
     */
    public String getPushAntDataFlag( ) {
		return this.pushAntDataFlag;
	}

}
