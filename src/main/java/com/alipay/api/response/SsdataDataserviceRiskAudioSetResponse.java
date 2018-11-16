package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.risk.audio.set response.
 *
 * @author auto create
 * @since 1.0, 2018-01-19 20:01:27
 */
public class SsdataDataserviceRiskAudioSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3382468919592787519L;

	/** 
	 * 查询出的关键词数量
	 */
	@ApiField("count")
	private String count;

	/** 
	 * 关键词结果
	 */
	@ApiListField("keyword_list")
	@ApiField("string")
	private List<String> keywordList;

	/** 
	 * 结果是否成功
	 */
	@ApiField("success")
	private Boolean success;

    /**
     * Sets count.
     *
     * @param count the count
     */
    public void setCount(String count) {
		this.count = count;
	}

    /**
     * Gets count.
     *
     * @return the count
     */
    public String getCount( ) {
		return this.count;
	}

    /**
     * Sets keyword list.
     *
     * @param keywordList the keyword list
     */
    public void setKeywordList(List<String> keywordList) {
		this.keywordList = keywordList;
	}

    /**
     * Gets keyword list.
     *
     * @return the keyword list
     */
    public List<String> getKeywordList( ) {
		return this.keywordList;
	}

    /**
     * Sets success.
     *
     * @param success the success
     */
    public void setSuccess(Boolean success) {
		this.success = success;
	}

    /**
     * Gets success.
     *
     * @return the success
     */
    public Boolean getSuccess( ) {
		return this.success;
	}

}
