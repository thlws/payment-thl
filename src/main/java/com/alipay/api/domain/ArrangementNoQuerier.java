package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 合约号查询器，直接获得合约号
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class ArrangementNoQuerier extends AlipayObject {

	private static final long serialVersionUID = 2822931498774149824L;

	/**
	 * 合约编号列表
	 */
	@ApiListField("ar_nos")
	@ApiField("string")
	private List<String> arNos;

    /**
     * Gets ar nos.
     *
     * @return the ar nos
     */
    public List<String> getArNos() {
		return this.arNos;
	}

    /**
     * Sets ar nos.
     *
     * @param arNos the ar nos
     */
    public void setArNos(List<String> arNos) {
		this.arNos = arNos;
	}

}
