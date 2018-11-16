package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.gift.stock.query response.
 *
 * @author auto create
 * @since 1.0, 2018-09-04 16:32:37
 */
public class AlipaySocialGiftStockQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3553852614142217433L;

	/** 
	 * 可用库存总条数
	 */
	@ApiField("available_count")
	private Long availableCount;

	/** 
	 * 已存在券码列表, 已通过创建接口上传的列表
	 */
	@ApiListField("exist_list")
	@ApiField("string")
	private List<String> existList;

	/** 
	 * 不存券码列表，还未上传过的券码
	 */
	@ApiListField("not_exist_list")
	@ApiField("string")
	private List<String> notExistList;

	/** 
	 * 库存总条数
	 */
	@ApiField("total_count")
	private Long totalCount;

    /**
     * Sets available count.
     *
     * @param availableCount the available count
     */
    public void setAvailableCount(Long availableCount) {
		this.availableCount = availableCount;
	}

    /**
     * Gets available count.
     *
     * @return the available count
     */
    public Long getAvailableCount( ) {
		return this.availableCount;
	}

    /**
     * Sets exist list.
     *
     * @param existList the exist list
     */
    public void setExistList(List<String> existList) {
		this.existList = existList;
	}

    /**
     * Gets exist list.
     *
     * @return the exist list
     */
    public List<String> getExistList( ) {
		return this.existList;
	}

    /**
     * Sets not exist list.
     *
     * @param notExistList the not exist list
     */
    public void setNotExistList(List<String> notExistList) {
		this.notExistList = notExistList;
	}

    /**
     * Gets not exist list.
     *
     * @return the not exist list
     */
    public List<String> getNotExistList( ) {
		return this.notExistList;
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
