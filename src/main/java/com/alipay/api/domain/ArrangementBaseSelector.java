package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 合约基本信息选择器，根据产品编码，合约状态编码来过滤合约
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class ArrangementBaseSelector extends AlipayObject {

	private static final long serialVersionUID = 4114515395157646133L;

	/**
	 * 合约状态列表.01 待生效，02 生效，03失效，04 取消
	 */
	@ApiListField("ar_statuses")
	@ApiField("string")
	private List<String> arStatuses;

	/**
	 * 产品外标类型:01：机构产品 02：借款人信息 03：主站产品 04： 标准机构产品  05：内部业务平台标准产品
	 */
	@ApiField("mark_type")
	private String markType;

	/**
	 * 产品编码列表
	 */
	@ApiListField("pd_codes")
	@ApiField("string")
	private List<String> pdCodes;

	/**
	 * 产品外标列表
	 */
	@ApiListField("pd_marks")
	@ApiField("string")
	private List<String> pdMarks;

	/**
	 * 是否查询出产品外标
	 */
	@ApiField("select_pd_mark")
	private Boolean selectPdMark;

	/**
	 * 是否查询出产品名称
	 */
	@ApiField("select_pd_name")
	private Boolean selectPdName;

    /**
     * Gets ar statuses.
     *
     * @return the ar statuses
     */
    public List<String> getArStatuses() {
		return this.arStatuses;
	}

    /**
     * Sets ar statuses.
     *
     * @param arStatuses the ar statuses
     */
    public void setArStatuses(List<String> arStatuses) {
		this.arStatuses = arStatuses;
	}

    /**
     * Gets mark type.
     *
     * @return the mark type
     */
    public String getMarkType() {
		return this.markType;
	}

    /**
     * Sets mark type.
     *
     * @param markType the mark type
     */
    public void setMarkType(String markType) {
		this.markType = markType;
	}

    /**
     * Gets pd codes.
     *
     * @return the pd codes
     */
    public List<String> getPdCodes() {
		return this.pdCodes;
	}

    /**
     * Sets pd codes.
     *
     * @param pdCodes the pd codes
     */
    public void setPdCodes(List<String> pdCodes) {
		this.pdCodes = pdCodes;
	}

    /**
     * Gets pd marks.
     *
     * @return the pd marks
     */
    public List<String> getPdMarks() {
		return this.pdMarks;
	}

    /**
     * Sets pd marks.
     *
     * @param pdMarks the pd marks
     */
    public void setPdMarks(List<String> pdMarks) {
		this.pdMarks = pdMarks;
	}

    /**
     * Gets select pd mark.
     *
     * @return the select pd mark
     */
    public Boolean getSelectPdMark() {
		return this.selectPdMark;
	}

    /**
     * Sets select pd mark.
     *
     * @param selectPdMark the select pd mark
     */
    public void setSelectPdMark(Boolean selectPdMark) {
		this.selectPdMark = selectPdMark;
	}

    /**
     * Gets select pd name.
     *
     * @return the select pd name
     */
    public Boolean getSelectPdName() {
		return this.selectPdName;
	}

    /**
     * Sets select pd name.
     *
     * @param selectPdName the select pd name
     */
    public void setSelectPdName(Boolean selectPdName) {
		this.selectPdName = selectPdName;
	}

}
