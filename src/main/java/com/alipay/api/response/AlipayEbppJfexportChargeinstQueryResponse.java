package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.JfExportChargeInstModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.jfexport.chargeinst.query response.
 *
 * @author auto create
 * @since 1.0, 2017-09-19 12:38:02
 */
public class AlipayEbppJfexportChargeinstQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8261386429588257528L;

	/** 
	 * 输出的机构列表
	 */
	@ApiListField("charge_insts")
	@ApiField("jf_export_charge_inst_model")
	private List<JfExportChargeInstModel> chargeInsts;

	/** 
	 * 开通的出账机构总数
	 */
	@ApiField("total_count")
	private Long totalCount;

    /**
     * Sets charge insts.
     *
     * @param chargeInsts the charge insts
     */
    public void setChargeInsts(List<JfExportChargeInstModel> chargeInsts) {
		this.chargeInsts = chargeInsts;
	}

    /**
     * Gets charge insts.
     *
     * @return the charge insts
     */
    public List<JfExportChargeInstModel> getChargeInsts( ) {
		return this.chargeInsts;
	}

    /**
     * Sets total count.
     *
     * @param totalCount the total count
     */
    public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

    /**
     * Gets total count.
     *
     * @return the total count
     */
    public Long getTotalCount( ) {
		return this.totalCount;
	}

}
