package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RetailKbcodeQueryVo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.kbcode.query response.
 *
 * @author auto create
 * @since 1.0, 2017-09-13 10:34:04
 */
public class KoubeiRetailKbcodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5267394839636627652L;

	/** 
	 * 口碑码信息列表
	 */
	@ApiListField("code_info_list")
	@ApiField("retail_kbcode_query_vo")
	private List<RetailKbcodeQueryVo> codeInfoList;

	/** 
	 * 口碑码总记录数
	 */
	@ApiField("total_count")
	private Long totalCount;

    /**
     * Sets code info list.
     *
     * @param codeInfoList the code info list
     */
    public void setCodeInfoList(List<RetailKbcodeQueryVo> codeInfoList) {
		this.codeInfoList = codeInfoList;
	}

    /**
     * Gets code info list.
     *
     * @return the code info list
     */
    public List<RetailKbcodeQueryVo> getCodeInfoList( ) {
		return this.codeInfoList;
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
