package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbCodeInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.kbcode.query response.
 *
 * @author auto create
 * @since 1.0, 2018-06-08 10:35:00
 */
public class KoubeiCateringKbcodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6752468916545583385L;

	/** 
	 * 口碑码信息列表
	 */
	@ApiListField("code_info_list")
	@ApiField("kb_code_info_v_o")
	private List<KbCodeInfoVO> codeInfoList;

	/** 
	 * 当前页码（大于0的整数）
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页返回的记录数（0~100的整数）
	 */
	@ApiField("page_size")
	private Long pageSize;

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
    public void setCodeInfoList(List<KbCodeInfoVO> codeInfoList) {
		this.codeInfoList = codeInfoList;
	}

    /**
     * Gets code info list.
     *
     * @return the code info list
     */
    public List<KbCodeInfoVO> getCodeInfoList( ) {
		return this.codeInfoList;
	}

    /**
     * Sets page num.
     *
     * @param pageNum the page num
     */
    public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

    /**
     * Gets page num.
     *
     * @return the page num
     */
    public Long getPageNum( ) {
		return this.pageNum;
	}

    /**
     * Sets page size.
     *
     * @param pageSize the page size
     */
    public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

    /**
     * Gets page size.
     *
     * @return the page size
     */
    public Long getPageSize( ) {
		return this.pageSize;
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
