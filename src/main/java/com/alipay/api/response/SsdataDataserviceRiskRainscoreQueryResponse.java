package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InfoCode;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.risk.rainscore.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-28 16:10:23
 */
public class SsdataDataserviceRiskRainscoreQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3314618152612676395L;

	/** 
	 * 风险解释，即本次风险评分中TOP 3风险因子的代码、名称、解释、风险倍数（JSON格式）。详情请参考<a href="https://doc.open.alipay.com/doc2/detail.htm?treeId=214&articleId=104588&docType=1">《风险解释与身份标签》</a>
	 */
	@ApiListField("infocode")
	@ApiField("info_code")
	private List<InfoCode> infocode;

	/** 
	 * 身份标签，即本次风险评分中评分主体（手机号）相关自然人的推测身份，例如：Scalper_3C（3C行业黄牛）等。没有与当前风险类型相关的推测身份时，身份标签可能为空。详情及申请方式请参考<a href="https://doc.open.alipay.com/doc2/detail.htm?treeId=214&articleId=104588&docType=1#s1">《风险解释及身份标签》</a>
	 */
	@ApiListField("label")
	@ApiField("string")
	private List<String> label;

	/** 
	 * 风险评分，范围为[0,100]，评分越高风险越大
	 */
	@ApiField("score")
	private String score;

	/** 
	 * 用户唯一请求id
	 */
	@ApiField("unique_id")
	private String uniqueId;

    /**
     * Sets infocode.
     *
     * @param infocode the infocode
     */
    public void setInfocode(List<InfoCode> infocode) {
		this.infocode = infocode;
	}

    /**
     * Gets infocode.
     *
     * @return the infocode
     */
    public List<InfoCode> getInfocode( ) {
		return this.infocode;
	}

    /**
     * Sets label.
     *
     * @param label the label
     */
    public void setLabel(List<String> label) {
		this.label = label;
	}

    /**
     * Gets label.
     *
     * @return the label
     */
    public List<String> getLabel( ) {
		return this.label;
	}

    /**
     * Sets score.
     *
     * @param score the score
     */
    public void setScore(String score) {
		this.score = score;
	}

    /**
     * Gets score.
     *
     * @return the score
     */
    public String getScore( ) {
		return this.score;
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
