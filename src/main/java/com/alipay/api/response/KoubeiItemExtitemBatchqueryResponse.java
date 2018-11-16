package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExtItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.item.extitem.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2016-07-06 10:48:09
 */
public class KoubeiItemExtitemBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7111434312311689743L;

	/** 
	 * 商品信息列表
	 */
	@ApiListField("model_list")
	@ApiField("ext_item")
	private List<ExtItem> modelList;

	/** 
	 * 当前页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 总记录数
	 */
	@ApiField("total_size")
	private String totalSize;

    /**
     * Sets entity list.
     *
     * @param modelList the entity list
     */
    public void setModelList(List<ExtItem> modelList) {
		this.modelList = modelList;
	}

    /**
     * Gets entity list.
     *
     * @return the entity list
     */
    public List<ExtItem> getModelList( ) {
		return this.modelList;
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
     * Gets page num.
     *
     * @return the page num
     */
    public String getPageNum( ) {
		return this.pageNum;
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
     * Gets page size.
     *
     * @return the page size
     */
    public String getPageSize( ) {
		return this.pageSize;
	}

    /**
     * Sets total size.
     *
     * @param totalSize the total size
     */
    public void setTotalSize(String totalSize) {
		this.totalSize = totalSize;
	}

    /**
     * Gets total size.
     *
     * @return the total size
     */
    public String getTotalSize( ) {
		return this.totalSize;
	}

}
