package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ISV有新的卡券信息同步到车主服务平台
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:29:40
 */
public class AlipayEcoMycarPromoTicketSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8895864862744464528L;

	/**
	 * 营销活动ID
	 */
	@ApiField("active_id")
	private String activeId;

	/**
	 * 需要同步的卡券信息
	 */
	@ApiListField("code_no_list")
	@ApiField("code_n_o_list")
	private List<CodeNOList> codeNoList;

	/**
	 * 卡券来源
	 */
	@ApiField("source_type")
	private String sourceType;

    /**
     * Gets active id.
     *
     * @return the active id
     */
    public String getActiveId() {
		return this.activeId;
	}

    /**
     * Sets active id.
     *
     * @param activeId the active id
     */
    public void setActiveId(String activeId) {
		this.activeId = activeId;
	}

    /**
     * Gets code no list.
     *
     * @return the code no list
     */
    public List<CodeNOList> getCodeNoList() {
		return this.codeNoList;
	}

    /**
     * Sets code no list.
     *
     * @param codeNoList the code no list
     */
    public void setCodeNoList(List<CodeNOList> codeNoList) {
		this.codeNoList = codeNoList;
	}

    /**
     * Gets source type.
     *
     * @return the source type
     */
    public String getSourceType() {
		return this.sourceType;
	}

    /**
     * Sets source type.
     *
     * @param sourceType the source type
     */
    public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

}
