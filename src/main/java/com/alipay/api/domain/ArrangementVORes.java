package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合约信息标准VO
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class ArrangementVORes extends AlipayObject {

	private static final long serialVersionUID = 6865731364157349957L;

	/**
	 * 合约基本信息
	 */
	@ApiField("ar_base")
	private ArrangementBaseVO arBase;

	/**
	 * 合约业务状态
	 */
	@ApiField("ar_bsn_status")
	private String arBsnStatus;

	/**
	 * 合约条件值,其格式为json，数据key因合约而存在差异。
	 */
	@ApiField("ar_condition")
	private String arCondition;

	/**
	 * 合约编号
	 */
	@ApiField("arrangement_no")
	private String arrangementNo;

    /**
     * Gets ar base.
     *
     * @return the ar base
     */
    public ArrangementBaseVO getArBase() {
		return this.arBase;
	}

    /**
     * Sets ar base.
     *
     * @param arBase the ar base
     */
    public void setArBase(ArrangementBaseVO arBase) {
		this.arBase = arBase;
	}

    /**
     * Gets ar bsn status.
     *
     * @return the ar bsn status
     */
    public String getArBsnStatus() {
		return this.arBsnStatus;
	}

    /**
     * Sets ar bsn status.
     *
     * @param arBsnStatus the ar bsn status
     */
    public void setArBsnStatus(String arBsnStatus) {
		this.arBsnStatus = arBsnStatus;
	}

    /**
     * Gets ar condition.
     *
     * @return the ar condition
     */
    public String getArCondition() {
		return this.arCondition;
	}

    /**
     * Sets ar condition.
     *
     * @param arCondition the ar condition
     */
    public void setArCondition(String arCondition) {
		this.arCondition = arCondition;
	}

    /**
     * Gets arrangement no.
     *
     * @return the arrangement no
     */
    public String getArrangementNo() {
		return this.arrangementNo;
	}

    /**
     * Sets arrangement no.
     *
     * @param arrangementNo the arrangement no
     */
    public void setArrangementNo(String arrangementNo) {
		this.arrangementNo = arrangementNo;
	}

}
