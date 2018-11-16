package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 蚁盾音频内容识别关键词管理
 *
 * @author auto create
 * @since 1.0, 2018-01-19 20:00:47
 */
public class SsdataDataserviceRiskAudioSetModel extends AlipayObject {

	private static final long serialVersionUID = 4184835196823516867L;

	/**
	 * 关键词创建人，也即使用者
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 要删除的关键词id
	 */
	@ApiListField("id_list")
	@ApiField("string")
	private List<String> idList;

	/**
	 * 新增或查询的关键词。新增时，可以传多个用以批量新增；查询时候，可以不传或只传一个。
	 */
	@ApiListField("keyword_list")
	@ApiField("string")
	private List<String> keywordList;

	/**
	 * 修改人，一般的修改指的是删除
	 */
	@ApiField("modifier")
	private String modifier;

	/**
	 * add 表示新增；delete 表示删除；query 表示查询；
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 页数
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 一页展示数量
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 关键词风险类型，批量增加时候，该批关键词为同一风险类型。1-涉政，2-涉黄
	 */
	@ApiField("risk_type")
	private String riskType;

    /**
     * Gets creator.
     *
     * @return the creator
     */
    public String getCreator() {
		return this.creator;
	}

    /**
     * Sets creator.
     *
     * @param creator the creator
     */
    public void setCreator(String creator) {
		this.creator = creator;
	}

    /**
     * Gets id list.
     *
     * @return the id list
     */
    public List<String> getIdList() {
		return this.idList;
	}

    /**
     * Sets id list.
     *
     * @param idList the id list
     */
    public void setIdList(List<String> idList) {
		this.idList = idList;
	}

    /**
     * Gets keyword list.
     *
     * @return the keyword list
     */
    public List<String> getKeywordList() {
		return this.keywordList;
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
     * Gets modifier.
     *
     * @return the modifier
     */
    public String getModifier() {
		return this.modifier;
	}

    /**
     * Sets modifier.
     *
     * @param modifier the modifier
     */
    public void setModifier(String modifier) {
		this.modifier = modifier;
	}

    /**
     * Gets operate type.
     *
     * @return the operate type
     */
    public String getOperateType() {
		return this.operateType;
	}

    /**
     * Sets operate type.
     *
     * @param operateType the operate type
     */
    public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

    /**
     * Gets page num.
     *
     * @return the page num
     */
    public String getPageNum() {
		return this.pageNum;
	}

    /**
     * Sets page num.
     *
     * @param pageNum the page num
     */
    public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

    /**
     * Gets page size.
     *
     * @return the page size
     */
    public String getPageSize() {
		return this.pageSize;
	}

    /**
     * Sets page size.
     *
     * @param pageSize the page size
     */
    public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

    /**
     * Gets risk type.
     *
     * @return the risk type
     */
    public String getRiskType() {
		return this.riskType;
	}

    /**
     * Sets risk type.
     *
     * @param riskType the risk type
     */
    public void setRiskType(String riskType) {
		this.riskType = riskType;
	}

}
